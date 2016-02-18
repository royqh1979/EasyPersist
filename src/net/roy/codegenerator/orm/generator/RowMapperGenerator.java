package net.roy.codegenerator.orm.generator;

import net.roy.codegenerator.orm.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                content.append(String.format("%s.%s(rs.%s(\"%s\"));\n",
                        entity.getName(),
                        property.getSetter(),
                        JdbcUtils.getColumnGetter((SingleProperty)property),
                        ((SingleProperty) property).getColumnName()));

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
