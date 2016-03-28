package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;

import javax.persistence.EnumType;
import javax.persistence.TemporalType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Roy on 2016/2/18.
 */
public class JdbcUtils {
    private final static Map<String, String> resultSetColumnTypeMap = new HashMap<>();

    static {
        resultSetColumnTypeMap.put("boolean", "Boolean");
        resultSetColumnTypeMap.put("byte", "Byte");
        resultSetColumnTypeMap.put("double", "Double");
        resultSetColumnTypeMap.put("float", "Float");
        resultSetColumnTypeMap.put("int", "Int");
        resultSetColumnTypeMap.put("long", "Long");
        resultSetColumnTypeMap.put("short", "Short");
    }

    public static String getColumnGetter(SingleProperty property) {
        if (property.getType().equals("java.util.Date")) {
            switch (property.getTemporalType()) {
                case DATE:
                    return "getDate";
                case TIME:
                    return "getTime";
                case TIMESTAMP:
                    return "getTimestamp";
            }
        }
        String propertyType = TypeUtils.getShortTypeName(property.getType());
        if (resultSetColumnTypeMap.containsKey(propertyType)) {
            return "get" + resultSetColumnTypeMap.get(propertyType);
        }
        return "get" + propertyType;
    }

    public static String getColumnSetter(SingleProperty property) {
        if (property.getType().equals("java.util.Date")) {
            switch (property.getTemporalType()) {
                case DATE:
                    return "setDate";
                case TIME:
                    return "setTime";
                case TIMESTAMP:
                    return "setTimestamp";
            }
        }
        String propertyType = TypeUtils.getShortTypeName(property.getType());
        if (resultSetColumnTypeMap.containsKey(propertyType)) {
            return "set" + resultSetColumnTypeMap.get(propertyType);
        }
        return "set" + propertyType;
    }

    public static String generateStatementParameterSetter(String paramIndex, SingleProperty property, String paramVar) {
        String stmtSetter = "";
        if (property.getEnumType() != null) {
            String setter="";
            switch(property.getEnumType()) {
                case ORDINAL:
                    setter="setInt";
                    break;
                case STRING:
                    setter="setString";
                    break;
            }
            stmtSetter = String.format("stmt.%s(%s,%s);\n",
                    setter,
                    paramIndex,
                    generateEnumParameterVariable( paramVar , property.getEnumType()));
        } else if (property.getTemporalType() != null) {
            stmtSetter = String.format("stmt.%s(%s,%s);\n",
                    JdbcUtils.getColumnSetter(property),
                    paramIndex,
                    JdbcUtils.generateDateParameterVariable(paramVar, property.getTemporalType()));
        } else {
            stmtSetter = String.format("stmt.%s(%s,%s);\n",
                    JdbcUtils.getColumnSetter(property),
                    paramIndex,
                    paramVar);
        }
        return stmtSetter;
    }

    public static String generateStatementParameterSetter(String paramIndex, SingleProperty property, Entity entity) {
        String paramVar= entity.getName() + "." + property.getGetter() + "()";
        return generateStatementParameterSetter(paramIndex,property,paramVar);
    }

    public static String generateEnumParameterVariable(String varName, EnumType enumType) {
        switch (enumType) {
            case ORDINAL:
                return varName + ".ordinal()";
            case STRING:
                return varName + ".name()";
        }
        return varName;
    }

    public static String generateDateParameterVariable(String varName, TemporalType temporalType) {
        switch (temporalType) {
            case TIME:
                return "new java.sql.Time(" + varName + ".getTime())";
            case DATE:
                return "new java.sql.Date(" + varName + ".getTime())";
            case TIMESTAMP:
                return "new java.sql.Timestamp(" + varName + ".getTime())";
        }
        return varName;
    }

    public static String generateIndexName(List<SingleProperty> indexProperties) {
        StringBuilder builder = new StringBuilder();
        for (SingleProperty singleProperty : indexProperties) {
            builder.append(StringUtils.capitalize(singleProperty.getName()));
        }
        return builder.toString();
    }
}
