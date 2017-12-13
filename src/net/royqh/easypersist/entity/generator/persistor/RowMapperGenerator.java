package net.royqh.easypersist.entity.generator.persistor;

import freemarker.template.Template;
import net.royqh.easypersist.entity.generator.TemplateLoader;
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.utils.JdbcUtils;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.model.Property;
import net.royqh.easypersist.entity.model.PropertyType;
import net.royqh.easypersist.entity.model.SingleProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roy on 2016/2/18.
 */
public class RowMapperGenerator {
    private static Template MapRowMapperTemplate = TemplateLoader.loadTemplate("Persistor-Mapper-MapRowMapper.ftl");
    private static RowMapperGenerator RowMapperGenerator =new RowMapperGenerator();
    public static void createRowMapper(Entity entity, StringBuilder content) {
        createSimpleRowMapper(content,entity);
        createMapRowMapper(content,entity);
        //createTablePrefixedRowMapper(content,entity);
    }

    private static void createMapRowMapper(StringBuilder content, Entity entity) {
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        dataModel.put("rowMapperUtils", RowMapperGenerator);
        CodeUtils.generateContent(content, MapRowMapperTemplate, dataModel);
    }

    /**
     * used in freemarker templates
     * @param singleProperty
     * @return
     */
    public static String generateGetColumnValueStatement(SingleProperty singleProperty) {
        StringBuilder builder=new StringBuilder();
        generateGetColumnValueStatement(builder,singleProperty);
        return builder.toString();
    }

    public static void generateGetColumnValueStatement(StringBuilder content, SingleProperty singleProperty) {
        if (singleProperty.getEnumType()!=null) {
            switch(singleProperty.getEnumType()) {
                case ORDINAL:
                    content.append(String.format("int intVal=rs.getInt(\"%s\");\n",
                            singleProperty.getColumnName()));
                    content.append(String.format("%s val=%s.values()[intVal];\n",
                            singleProperty.getType(),
                            singleProperty.getType()));
                    break;
                case STRING:
                    content.append(String.format("String strVal=rs.getString(\"%s\");\n",
                            singleProperty.getColumnName()));
                    content.append(String.format("%s val=%s.valueOf(strVal);\n",
                            singleProperty.getType(),
                            singleProperty.getType()));
                    break;
            }

        }   else  if (singleProperty.isLob()) {
            content.append(String.format("%s val=%s;\n",
                    singleProperty.getType(),
                    JdbcUtils.getLobColumnGetter(singleProperty,singleProperty.getColumnName())
            ));
        }  else {
            content.append(String.format("%s val=rs.%s(\"%s\");\n",singleProperty.getType(),
                        JdbcUtils.getColumnGetter(singleProperty),
                        singleProperty.getColumnName()));
        }
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
                if (singleProperty.getColumn().isNullable()) {
                    content.append("if (rs.wasNull(\""+singleProperty.getColumnName()+"\")) {\n");
                    content.append(String.format("%s.%s(null);\n", entity.getName(),
                            singleProperty.getSetter()));
                    content.append("} else {\n");
                } else {
                    content.append("{\n");
                }
                generateGetColumnValueStatement(content,singleProperty);
                content.append(String.format("%s.%s(val);\n",
                        entity.getName(),
                        singleProperty.getSetter()
                ));
                content.append("}\n");
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
