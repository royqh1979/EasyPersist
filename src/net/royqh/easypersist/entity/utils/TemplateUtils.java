package net.royqh.easypersist.entity.utils;

import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.model.SingleProperty;

import java.util.List;

/**
 * Created by roy on 2017/9/7.
 */
public class TemplateUtils {
    public final static TemplateUtils templateUtils=new TemplateUtils();

    public String getObjectType(String type) {
        return TypeUtils.getObjectType(type);
    }

    public boolean isRangeTypeProperty(SingleProperty property){
        return TypeUtils.isRangeTypeProperty(property);
    }

    public List<SingleProperty> getIndexedProperties(Entity entity) {
        return CodeUtils.getAllIndexProperties(entity);
    }

    public boolean isIntProperty(SingleProperty property) {
        return TypeUtils.isIntProperty(property);

    }

    public boolean isNumberProperty(SingleProperty property) {
        return TypeUtils.isNumberProperty(property);
    }

    public boolean isBooleanProperty(SingleProperty property) {
        return TypeUtils.isBooleanProperty(property);
    }

    public boolean isDateProperty(SingleProperty property) {
        return TypeUtils.isDateProperty(property);
    }

    public boolean isBigDecimalProperty(SingleProperty property) {
        return TypeUtils.isBigDecimal(property);
    }

    public boolean isStringType(String type) {
        return TypeUtils.isStringType(type);
    }

    public boolean isDepartmentInfoType(Entity entity) {
        return TypeUtils.isDepartmentInfoType(entity.getClassInfo().getName());
    }

    public boolean isFileInfoType(Entity entity) {
        return TypeUtils.isDepartmentInfoType(entity.getClassInfo().getName());
    }

    public  void generateEntityPropertySetting(StringBuilder content, Entity entity, SingleProperty property) {
        String shortTypeName = TypeUtils.getShortTypeName(property.getType());

        content.append(String.format("if (StringUtils.isEmpty(%s)){\n",
                property.getName() + "Val"));
        if (property.getColumn().isNullable() && !TypeUtils.isPrimitiveType(property.getType())) {
            content.append(entity.getName());
            content.append(".");
            content.append(property.getSetter());
            content.append("(null);\n");
        } else {
            if ("Date".equals(shortTypeName)) {
                content.append("//if date is empty, let it be now.\n");
                content.append(entity.getName());
                content.append(".");
                content.append(property.getSetter());
                content.append("(");
                content.append("new Date()");
                content.append(");\n");
            } else if ("String".equals(shortTypeName)){
                content.append(entity.getName());
                content.append(".");
                content.append(property.getSetter());
                content.append("(\"\");\n");
            } else {
                content.append(" throw new RuntimeException(\"param for " + property.getName() + " is empty!\");\n");
            }
        }
        content.append("} else {\n");
        content.append(entity.getName());
        content.append(".");
        content.append(property.getSetter());
        content.append("(");
        generateConvertParameterStatement(property, content);
        content.append(");\n");
        content.append("}\n");
    }

    public String generateEntityPropertySetting(Entity entity, SingleProperty property) {
        StringBuilder builder=new StringBuilder();
        generateEntityPropertySetting(builder,entity, property);
        return builder.toString();
    }

    public String getConvertParameterStatement(SingleProperty property) {
        StringBuilder builder = new StringBuilder();
        generateConvertParameterStatement(property, builder);
        return builder.toString();
    }

    public void generateConvertParameterStatement(SingleProperty property, StringBuilder builder) {
        String shortTypeName = TypeUtils.getObjectType(property.getType());
        if (property.getEnumType() != null) {
            builder.append(String.format("%s.values()[%s]",
                    shortTypeName,
                    property.getName() + "Val"));
        } else {
            switch (shortTypeName) {
                case "Date":
                    builder.append("DateTools.parseDate(");
                    builder.append(property.getName() + "Val");
                    builder.append(")");
                    break;
                case "Boolean":
                    builder.append(String.format("\"y\".equals(%s)",
                            property.getName() + "Val"));
                    break;
                case "Integer":
                    builder.append(String.format("Integer.parseInt(%s)",
                            property.getName() + "Val"));
                    break;
                case "Byte":
                case "Long":
                case "Short":
                case "Double":
                case "Float":
                    builder.append(String.format("%s.parse%s(%s)",
                            shortTypeName, shortTypeName, property.getName() + "Val"));
                    break;
                case "BigDecimal":
                    builder.append(String.format("new BigDecimal(%s)",
                            property.getName() + "Val"));
                    break;
                default:
                    builder.append(property.getName() + "Val");
            }
        }
    }

    public String getDefaultJSValue(String type) {
        String shortTypeName = TypeUtils.getShortTypeName(type);
        switch (shortTypeName) {
            case "int":
            case "long":
            case "short":
                return "0";
            case "String":
                return "\"\"";
            case "Date":
                return "\"\"";
            case "boolean":
                return "\"n\"";
            case "BigDecimal":
            case "float":
            case "double":
                return "0";
            default:
                return "\"\"";
        }
    }

    public String generateStatementParameterSetter(String paramIndex, SingleProperty property, String paramVar) {
        return JdbcUtils.generateStatementParameterSetter(paramIndex, property, paramVar);
    }

}
