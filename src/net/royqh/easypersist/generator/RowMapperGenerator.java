package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.Property;
import net.royqh.easypersist.model.PropertyType;
import net.royqh.easypersist.model.SingleProperty;

/**
 * Created by Roy on 2016/2/18.
 */
public class RowMapperGenerator {
    public static StringBuilder createRowMapper(Entity entity) {
        StringBuilder content=new StringBuilder();
        createSimpleRowMapper(content,entity);
        //createTablePrefixedRowMapper(content,entity);
        return content;
    }

    private static void createTablePrefixedRowMapper(StringBuilder content, Entity entity) {
        content.append("public final static RowMapper<");
        content.append(entity.getClassInfo().getName());
        content.append("> TABLE_PREFIXED_ROW_MAPPER = new RowMapper<" + entity.getClassInfo().getName() + ">() {\n");
        content.append("@Override\n");
        content.append("public "+entity.getClassInfo().getName()+" mapRow(ResultSet rs, int rowNum) throws SQLException {\n");
        content.append(getNewEntityVarStatement(entity));
        for (Property property:entity.getProperties()) {
            if (property.getPropertyType()== PropertyType.Column) {
                content.append(String.format("%s.%s(rs.%s(\"%s\"));\n",
                        entity.getName(),
                        property.getSetter(),
                        JdbcUtils.getColumnGetter((SingleProperty)property),
                        CodeUtils.getPropertyVarName(entity,property)));

            }
            /*
            else if (property.getPropertyType() == PropertyType.ElementCollection ||
                    property.getPropertyType() == PropertyType.OneToMany ||
                    property.getPropertyType() == PropertyType.ManyToMany) {
                content.append(String.format("%s.%s(new %s());\n",
                        entity.getName(),
                        property.getSetter(),
                        CodeUtils.getCollectionImplementType((CollectionProperty)property)));
            }
            */
        }
        content.append("return "+entity.getName()+";\n");
        content.append("}\n");
        content.append("};\n");
    }

    private static void createSimpleRowMapper(StringBuilder content, Entity entity) {
        content.append("public final static RowMapper<");
        content.append(entity.getClassInfo().getName());
        content.append("> SIMPLE_ROW_MAPPER = new RowMapper<" + entity.getClassInfo().getName() + ">() {\n");
        content.append("@Override\n");
        content.append("public "+entity.getClassInfo().getName()+" mapRow(ResultSet rs, int rowNum) throws SQLException {\n");
        content.append(getNewEntityVarStatement(entity));
        for (Property property:entity.getProperties()) {
            if (property.getPropertyType()== PropertyType.Column) {
                SingleProperty singleProperty=(SingleProperty)property;
                if (singleProperty.getEnumType()!=null) {
                    switch(singleProperty.getEnumType()) {
                        case ORDINAL:
                            content.append(String.format("%s.%s(%s.values()[rs.getInt(\"%s\")]);\n",
                                    entity.getName(),
                                    property.getSetter(),
                                    ((SingleProperty) property).getColumnName()));
                            break;
                        case STRING:
                            content.append(String.format("%s.%s(%s.valueOf(rs.getString(\"%s\")));\n",
                                    entity.getName(),
                                    property.getSetter(),
                                    property.getType(),
                                    ((SingleProperty) property).getColumnName()));
                            break;
                    }

                }  else {
                    content.append(String.format("%s.%s(rs.%s(\"%s\"));\n",
                            entity.getName(),
                            property.getSetter(),
                            JdbcUtils.getColumnGetter((SingleProperty) property),
                            ((SingleProperty) property).getColumnName()));
                }

            }
            /*
            else if (property.getPropertyType() == PropertyType.ElementCollection ||
                                property.getPropertyType() == PropertyType.OneToMany ||
                    property.getPropertyType() == PropertyType.ManyToMany) {
                content.append(String.format("%s.%s(new %s());\n",
                        entity.getName(),
                        property.getSetter(),
                        CodeUtils.getCollectionImplementType((CollectionProperty)property)));
            }
            */
        }
        content.append("return "+entity.getName()+";\n");
        content.append("}\n");
        content.append("};\n");
    }


    private static String getNewEntityVarStatement(Entity entity) {
        return String.format("%s %s = new %s();\n",
                entity.getClassInfo().getName(),
                entity.getName(),
                entity.getClassInfo().getName());
    }
}
