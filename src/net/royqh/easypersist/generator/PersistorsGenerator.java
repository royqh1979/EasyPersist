package net.royqh.easypersist.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.royqh.easypersist.MappingRepository;
import net.royqh.easypersist.model.*;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.utils.TypeUtils;

import java.util.*;

/**
 * Created by Roy on 2016/2/15.
 */
public class PersistorsGenerator {
    public static void generate(Project project, MappingRepository mappingRepository) {
        PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(project);
        JavaPsiFacade facade = JavaPsiFacade.getInstance(project);
        CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(project);

        for (Entity entity : mappingRepository.getAllEntities()) {
            PsiPackage targetPackage = facade.findPackage(entity.getOutputPackagePath());
            PsiDirectory psiDirectory = targetPackage.getDirectories()[0];
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
        content.append("    private DataSource dataSource;\n");
        content.append("private SQLExceptionTranslator exceptionTranslator;\n");
        createSQLs(content, entity);

        createBasicMethods(entity, content);

        createSearchMethods(entity,content);

        createMappingListMethods(entity,content);

        createUtilMethods(content);


        content.append(RowMapperGenerator.createRowMapper(entity));

        //content.append(RowCallbackHandlerGenerator.createRowCallbackHandler(entity));

        content.append("}\n");

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                content.toString());
    }

    private static void createMappingListMethods(Entity entity, StringBuilder content) {
        for (MapRelationInfo relationInfo: entity.getMapRelationInfos()) {
            MethodGenerator.createCountXXXMappingMethod(entity,relationInfo,content);
            MethodGenerator.createFindXXXMappingMethod(entity,relationInfo,content);
        }
    }

    private static void createSearchMethods(Entity entity, StringBuilder content) {
        for (IndexInfo indexInfo:entity.getIndexes()) {
            if (indexInfo.isUnique()) {
                MethodGenerator.createRetrieveByXXXMethod(entity, indexInfo, content);
                if (canGenerateRangeQuery(entity,indexInfo)) {
                    MethodGenerator.createCountByXXXMethod(entity, indexInfo, content);
                    MethodGenerator.createFindByXXXMethod(entity, indexInfo, content);
                }
            } else {
                MethodGenerator.createCountByXXXMethod(entity, indexInfo, content);
                MethodGenerator.createFindByXXXMethod(entity, indexInfo, content);
            }
        }

        MethodGenerator.createCountAllMethod(entity,content);
        MethodGenerator.createFindAllMethod(entity,content);
    }

    private static boolean canGenerateRangeQuery(Entity entity, IndexInfo indexInfo) {
        List<SingleProperty> indexProperties = MethodGenerator.getIndexProperties(entity, indexInfo);
        if (indexInfo.isUnique()) {
            for (SingleProperty singleProperty : indexProperties) {
                if (!TypeUtils.isRangeType(singleProperty)) {
                    //unique and not range type, can't retrive many entity by this property
                    return false;
                }
            }
        }
        return true;
    }

    private static void createUtilMethods(StringBuilder content) {
        MethodGenerator.createExceptionTranslatorGetter(content);
        MethodGenerator.createDataSourceGetter(content);
        MethodGenerator.createDataSourceSetter(content);
    }

    private static void createBasicMethods(Entity entity, StringBuilder content) {
        MethodGenerator.createLoadByIdMethod(content, entity);
        MethodGenerator.createLoadAllMethod(content, entity);

        MethodGenerator.createCreateMethod(content, entity);
        MethodGenerator.createUpdateMethod(content, entity);
        MethodGenerator.createDeleteMethod(content,entity);

    }

    private static void generateImports(Entity entity, StringBuilder content) {
        content.append("import javax.sql.DataSource;\n");
        content.append("import java.sql.*;\n");
        content.append("import java.util.*;\n");

        content.append("import org.springframework.dao.EmptyResultDataAccessException;\n");
        content.append("import org.springframework.jdbc.core.RowCallbackHandler;\n");
        content.append("import org.springframework.jdbc.core.RowMapper;\n");
        content.append("import org.springframework.jdbc.datasource.DataSourceUtils;\n");
        content.append("import org.springframework.jdbc.support.JdbcUtils;\n");
        content.append("import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;\n");
        content.append("import org.springframework.jdbc.support.SQLExceptionTranslator;\n");
        content.append("import org.springframework.jdbc.support.SQLStateSQLExceptionTranslator;\n");
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
            content.append("import ");
            content.append(type);
            content.append(";\n");
        }
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
