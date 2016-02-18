package net.roy.codegenerator.orm.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.roy.codegenerator.orm.MappingRepository;
import net.roy.codegenerator.orm.model.*;
import net.roy.codegenerator.orm.model.config.EntitiesConfig;
import net.roy.codegenerator.orm.model.jpa.Constants;
import net.roy.codegenerator.orm.utils.TypeUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * Created by Roy on 2016/2/15.
 */
public class PersistorsGenerator {
    public static void generate(EntitiesConfig entitiesConfig, Project project, MappingRepository mappingRepository) {
        JavaPsiFacade facade = JavaPsiFacade.getInstance(project);
        PsiPackage targetPackage = facade.findPackage(entitiesConfig.getOutputPackage());
        generate(targetPackage, mappingRepository);
    }

    private static void generate(PsiPackage targetPackage, MappingRepository mappingRepository) {
        PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(targetPackage.getProject());
        CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(targetPackage.getProject());
        PsiDirectory psiDirectory = targetPackage.getDirectories()[0];
        for (Entity entity : mappingRepository.getAllEntities()) {
            PsiFile psiFile = generatePersistor(entity, targetPackage, psiFileFactory);
            psiFile=(PsiFile)codeStyleManager.reformat(psiFile);

            PsiFile oldFile = psiDirectory.findFile(psiFile.getName());
            if (oldFile != null) {
                oldFile.delete();
            }
            psiDirectory.add(psiFile);
        }
    }

    private static PsiFile generatePersistor(Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String className = "__" + Character.toUpperCase(entity.getName().charAt(0))
                + entity.getName().substring(1) + "Persistor";
        StringBuilder content = new StringBuilder();
        content.append("package " + targetPackage.getQualifiedName() + ";\n");

        generateImports(entity, content);


        content.append("public class " + className + "{\n");
        content.append("    private JdbcTemplate jdbcTemplate;\n");
        content.append("    public void setDataSource(DataSource dataSource) {\n");
        content.append("        jdbcTemplate=new JdbcTemplate(dataSource);\n");
        content.append("    }\n");
        createSQLs(content, entity);

        createLoadByIdMethod(content, entity);
        createLoadAllMethod(content, entity);

        createCreateMethod(content, entity);
        createUpdateMethod(content, entity);
        //createDeleteMethod(content,entity);

        content.append(RowMapperGenerator.createRowMapper(entity));

        //content.append(RowCallbackHandlerGenerator.createRowCallbackHandler(entity));

        content.append("}\n");

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                content.toString());
    }

    private static void createUpdateMethod(StringBuilder content, Entity entity) {
        List<String> updateColumns=new ArrayList<>();
        List<SingleProperty> updateProperties=new ArrayList<>();
        SingleProperty idProperty=entity.getIdProperty();
        for (Property property: entity.getProperties()) {
            if (idProperty==property)
                continue;
            if (property.getPropertyType()==PropertyType.Column) {
                SingleProperty singleProperty=(SingleProperty)property;
                updateColumns.add(singleProperty.getColumnName()+"=?");
                updateProperties.add(singleProperty);
            }
        }
        content.append(SQLGenerator.generateUpdateSQL(entity.getTableName(), updateColumns, idProperty.getColumnName()));

        content.append("public void update(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append("jdbcTemplate.update(UPDATE_SQL,\n");
        for(int i=0;i<updateProperties.size();i++) {
            SingleProperty property=updateProperties.get(i);
            content.append(String.format("%s.%s(),\n",
                    entity.getName(),property.getGetter()));
        }
        content.append(String.format("%s.%s());\n",
                entity.getName(), idProperty.getGetter()));
        content.append("}");
    }

    private static void createCreateMethod(StringBuilder content, Entity entity) {
        List<String> insertFields=new ArrayList<>();
        List<SingleProperty> insertProperties=new ArrayList<>();
        SingleProperty idProperty=entity.getIdProperty();
        for (Property property: entity.getProperties()) {
            if (entity.isAutoGenerateId() && idProperty==property)
                continue;
            if (property.getPropertyType()==PropertyType.Column) {
                SingleProperty singleProperty=(SingleProperty)property;
                insertFields.add(singleProperty.getColumnName());
                insertProperties.add(singleProperty);
            }
        }
        content.append(SQLGenerator.generateInsertSQL(entity.getTableName(), insertFields));

        if (entity.isAutoGenerateId()) {
            createCreateWithAutoGenerateIdMethod(content, entity, insertProperties);
        }else {
            createCreateWithoutAutoGenerateIdMethod(content, entity, insertProperties);
        }
    }

    private static void createCreateWithoutAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public ");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" create(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append("jdbcTemplate.update(INSERT_SQL, new PreparedStatementSetter() {\n");
        content.append("@Override\n");
        content.append("public void setValues(PreparedStatement ps) throws SQLException {\n");
        for(int i=0;i<insertProperties.size();i++) {
            SingleProperty property=insertProperties.get(i);
            content.append(String.format("ps.%s(%d,%s.%s());\n",
                    JdbcUtils.getColumnSetter(property),
                    i+1,entity.getName(), property.getGetter()));
        }
        content.append("    }\n");
        content.append("});\n");

        content.append(String.format("return %s.%s();\n",
                entity.getName(), idProperty.getGetter()));
        content.append("}\n");

    }

    private static void createCreateWithAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public ");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" create(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append("    KeyHolder keyHolder=new GeneratedKeyHolder();\n");
        content.append("    jdbcTemplate.update(new PreparedStatementCreator() {\n");
        content.append("    @Override\n");
        content.append("    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {\n");
        content.append("        PreparedStatement ps=con.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS);\n");
        for (int i=0;i<insertProperties.size();i++) {
            SingleProperty property=insertProperties.get(i);
            content.append(String.format("ps.%s(%d,%s.%s());\n",
                    JdbcUtils.getColumnSetter(property),
                    i+1,entity.getName(), property.getGetter()));
        }
        content.append("        return ps;\n");
        content.append("    }\n");
        content.append("    },keyHolder);\n");
        content.append(String.format("%s id=keyHolder.getKey().%sValue();\n",
                TypeUtils.getShortTypeName(idProperty.getType()),
                TypeUtils.getPrimitiveType(idProperty.getType())));
        content.append(String.format("%s.%s(id);\n",
                entity.getName(), idProperty.getSetter()));
        content.append("return id;\n");
        content.append("}\n");
    }


    private static void generateImports(Entity entity, StringBuilder content) {
        content.append("import org.springframework.jdbc.core.JdbcTemplate;\n");
        content.append("import javax.sql.*;\n");
        content.append("import java.sql.*;\n");
        content.append("import java.util.*;\n");

        content.append("import org.springframework.jdbc.core.PreparedStatementSetter;\n");
        content.append("import org.springframework.jdbc.core.PreparedStatementCreator;\n");
        content.append("import org.springframework.jdbc.core.RowMapper;\n");
        content.append("import org.springframework.jdbc.support.GeneratedKeyHolder;\n");
        content.append("import org.springframework.jdbc.support.KeyHolder;\n");
        content.append("import " + entity.getClassInfo().getQualifiedName() + ";\n");
        Set<String> types = new HashSet<>();
        for (Property property : entity.getProperties()) {
            PropertyType propertyType = property.getPropertyType();
            switch (propertyType) {
                case Column:
                    types.add(property.getType());
                    break;
                /*
                case OneToMany:
                    types.add(((OneToManyCollectionProperty) property)
                            .getOneToMany().getTargetEntity());
                    break;
                case ManyToMany:
                    types.add(((ManyToManyCollectionProperty) property)
                            .getManyToMany().getTargetEntity());
                    break;
                case OneToOne:
                    types.add(((OneToOneProperty) property)
                            .getOneToOne().getTargetEntity());
                    break;
                case ManyToOne:
                    types.add(((ManyToOneProperty) property)
                            .getManyToOne().getTargetEntity());
                    break;
                case ElementCollection:
                    types.add(((ElementCollectionProperty) property)
                            .getElementCollection().getTargetClassName());
                    break;
                    */
            }
        }
        types.removeAll(Constants.PRIMITIVE_TYPES);
        for (String type:types){
            System.out.println(type);
            content.append("import ");
            content.append(type);
            content.append(";\n");
        }
    }
    private static void createLoadByIdMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public " + entity.getClassInfo().getName()+" retrieve(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        content.append("return jdbcTemplate.queryForObject(SIMPLE_SELECT_SQL + ");
        content.append("\" where "+idProperty.getColumnName()+" = ?\",\n");
        content.append("new Object[]{id},SIMPLE_ROW_MAPPER);\n");
        content.append("}\n");
    }

    private static void createLoadAllMethod(StringBuilder content, Entity entity) {
        String rowCallbackHandlerClassName= CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append("public List<" + entity.getClassInfo().getName()+"> retrieveAll() {\n");
        content.append("return jdbcTemplate.query(SIMPLE_SELECT_SQL,\n");
        content.append("SIMPLE_ROW_MAPPER);\n");
        content.append("}\n");
    }
    /*
    private static void createLoadByIdMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public " + entity.getClassInfo().getName()+" retrieve(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        String rowCallbackHandlerName= CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append(rowCallbackHandlerName+" rowCallbackHandler = new ");
        content.append(rowCallbackHandlerName+"();\n");
        content.append("jdbcTemplate.query(FULL_JOIN_SELECT_SQL + \" where A.id = ?\",\n");
        content.append("new Object[]{id},rowCallbackHandler);\n");

        content.append(entity.getClassInfo().getName()+" value = rowCallbackHandler.getSingleResult();\n");
        content.append("return value;\n");
        content.append("}\n");
    }

    private static void createLoadAllMethod(StringBuilder content, Entity entity) {
        String rowCallbackHandlerClassName= CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append("public List<" + entity.getClassInfo().getName()+"> retrieveAll() {\n");
        content.append(rowCallbackHandlerClassName+" rowCallbackHandler = new ");
        content.append(rowCallbackHandlerClassName+"();\n");
        content.append("jdbcTemplate.query(FULL_JOIN_SELECT_SQL,\n");
        content.append("rowCallbackHandler);\n");

        content.append("List<"+entity.getClassInfo().getName()+"> values =" +
                "new ArrayList<>(rowCallbackHandler.getResults());\n");
        content.append("return values;\n");
        content.append("}\n");
    }
    */

    private static void createSQLs(StringBuilder content, Entity entity) {
        content.append(SQLGenerator.generateSimpleSelectSQL(entity));
       // content.append(SQLGenerator.generateFullJoinSelectSQL(entity));
        /*
        content.append(SQLGenerator.generateInsertSQL(entity));
        content.append(SQLGenerator.generateUpdateSQL(entity));
        content.append
        */


    }
}
