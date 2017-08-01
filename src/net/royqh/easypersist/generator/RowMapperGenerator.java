package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.Property;
import net.royqh.easypersist.model.PropertyType;
import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.utils.TypeUtils;

/**
 * Created by Roy on 2016/2/18.
 */
public class RowMapperGenerator {
    public static void createRowMapper(Entity entity, StringBuilder content) {
        createSimpleRowMapper(content,entity);
        //createTablePrefixedRowMapper(content,entity);
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
                            content.append("{\n");
                            content.append(String.format("int val=rs.getInt(\"%s\");\n",
                                    singleProperty.getColumnName()));
                            content.append("if (rs.wasNull()) {\n");
                            content.append(String.format("%s.%s(null);\n",entity.getName(),
                                    singleProperty.getSetter()));
                            content.append("} else {\n");
                            content.append(String.format("%s.%s(%s.values()[val]);\n",
                                    entity.getName(),
                                    singleProperty.getSetter(),
                                    singleProperty.getType()));
                            content.append("}\n}\n");
                            break;
                        case STRING:
                            content.append("{\n");
                            content.append(String.format("String val=rs.getString(\"%s\");\n",
                                    singleProperty.getColumnName()));
                            content.append("if (val==null) {\n");
                            content.append(String.format("%s.%s(null);\n",entity.getName(),
                                    singleProperty.getSetter()));
                            content.append("} else {\n");
                            content.append(String.format("%s.%s(%s.valueOf(val));\n",
                                    entity.getName(),
                                    singleProperty.getSetter(),
                                    singleProperty.getType()));
                            content.append("}\n}\n");

                            break;
                    }

                }   else  if (singleProperty.isLob()) {
                    content.append(String.format("%s.%s(%s);\n",
                            entity.getName(),
                            singleProperty.getSetter(),
                            JdbcUtils.getLobColumnGetter(singleProperty,singleProperty.getColumnName())
                    ));
                }  else {
                    if (TypeUtils.isWrapperType(singleProperty.getType())) {
                        content.append("{\n");
                        content.append(String.format("%s val=rs.%s(\"%s\");\n",singleProperty.getType(),
                                JdbcUtils.getColumnGetter(singleProperty),
                                singleProperty.getColumnName()));
                        content.append("if (rs.wasNull()) {\n");
                        content.append(String.format("%s.%s(null);\n",entity.getName(),
                                singleProperty.getSetter()));
                        content.append("} else {\n");
                        content.append(String.format("%s.%s(val);\n",entity.getName(),
                                singleProperty.getSetter()));
                        content.append("}\n}\n");
                    } else {
                        content.append(String.format("%s.%s(rs.%s(\"%s\"));\n",
                                entity.getName(),
                                singleProperty.getSetter(),
                                JdbcUtils.getColumnGetter(singleProperty),
                                singleProperty.getColumnName()));
                    }
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
