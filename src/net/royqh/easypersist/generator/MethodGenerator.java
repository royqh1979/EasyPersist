package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.Property;
import net.royqh.easypersist.model.PropertyType;
import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.utils.TypeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2016/2/24.
 */
public class MethodGenerator {
    public static void createDeleteMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty=entity.getIdProperty();
        content.append(SQLGenerator.generateDeleteSQL(entity));

        content.append("public void delete(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        content.append("jdbcTemplate.update(DELETE_SQL,id);\n");
        content.append("}\n");
    }

    public static void createUpdateMethod(StringBuilder content, Entity entity) {
        List<String> updateColumns=new ArrayList<>();
        List<SingleProperty> updateProperties=new ArrayList<>();
        SingleProperty idProperty=entity.getIdProperty();
        for (Property property: entity.getProperties()) {
            if (idProperty==property)
                continue;
            if (property.getPropertyType()== PropertyType.Column) {
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

    public static void createCreateMethod(StringBuilder content, Entity entity) {
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

    public static void createCreateWithoutAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
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

    public static void createCreateWithAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
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

    public static void createLoadByIdMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public " + entity.getClassInfo().getName()+" retrieve(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        content.append("return jdbcTemplate.queryForObject(SIMPLE_SELECT_SQL + ");
        content.append("\" where "+idProperty.getColumnName()+" = ?\",\n");
        content.append("new Object[]{id},SIMPLE_ROW_MAPPER);\n");
        content.append("}\n");
    }

    public static void createLoadAllMethod(StringBuilder content, Entity entity) {
        String rowCallbackHandlerClassName= CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append("public List<" + entity.getClassInfo().getName()+"> retrieveAll() {\n");
        content.append("return jdbcTemplate.query(SIMPLE_SELECT_SQL,\n");
        content.append("SIMPLE_ROW_MAPPER);\n");
        content.append("}\n");
    }
}
