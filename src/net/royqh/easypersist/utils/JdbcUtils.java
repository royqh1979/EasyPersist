package net.royqh.easypersist.utils;

import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.model.SingleProperty;
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
    public final static JdbcUtils jdbcUtils=new JdbcUtils();
    private final static Map<String, String> resultSetColumnTypeMap = new HashMap<>();
    private final static Map<String,String> WrapperTypeMap=new HashMap<>();

    static {
        resultSetColumnTypeMap.put("boolean", "Boolean");
        resultSetColumnTypeMap.put("byte", "Byte");
        resultSetColumnTypeMap.put("double", "Double");
        resultSetColumnTypeMap.put("float", "Float");
        resultSetColumnTypeMap.put("int", "Int");
        resultSetColumnTypeMap.put("long", "Long");
        resultSetColumnTypeMap.put("Integer","Int");
        resultSetColumnTypeMap.put("short", "Short");
    }

    static {
        WrapperTypeMap.put(Boolean.class.getName(),"Types.BOOLEAN");
        WrapperTypeMap.put(Byte.class.getName(),"Types.INTEGER");
        WrapperTypeMap.put(Short.class.getName(),"Types.INTEGER");
        WrapperTypeMap.put(Integer.class.getName(),"Types.INTEGER");
        WrapperTypeMap.put(Long.class.getName(),"Types.INTEGER");
        WrapperTypeMap.put(Float.class.getName(),"Types.FLOAT");
        WrapperTypeMap.put(Double.class.getName(),"Types.DOUBLE");

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

    public static String getLobColumnGetter(SingleProperty property, String propertyVarName) {
        if (property.getType().equals("java.sql.Clob") || property.getType().equals(String.class.getName())) {
            return "rs.getClob(\"" + propertyVarName + "\")";
        }
        if (property.getType().equals("java.sql.Blob")) {
            return "rs.getBlob(\"" + propertyVarName + "\")";
        }
        if (property.getType().equals("byte[]") || property.getType().equals("java.lang.Byte[]")) {
            return "rs.getBytes(\"" + propertyVarName + "\")";
        }
        return "SerializationUtils.deserialize(rs.getBytes(\"" + propertyVarName + "\"))";

    }

    public static String getColumnSetter(SingleProperty property) {
        if (TypeUtils.isGISType(property)) {
            return "setString";
        }
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
        StringBuilder builder=new StringBuilder();
        if (property.getEnumType() != null) {
            switch (property.getEnumType()) {
                case ORDINAL:
                    builder.append(String.format("if (null != %s) {\n",
                            paramVar));
                    builder.append(String.format("stmt.setInt(%s,%s);\n",
                            paramIndex,
                            generateEnumParameterVariable(paramVar, property.getEnumType())));
                    builder.append("} else {\n");
                    builder.append(String.format("stmt.setNull(%s,java.sql.Types.INTEGER);\n", paramIndex));
                    builder.append("}\n");
                    break;
                case STRING:
                    builder.append(String.format("if (null != %s) {\n",
                            paramVar));
                    builder.append(String.format("stmt.setString(%s,%s);\n",
                            paramIndex,
                            generateEnumParameterVariable(paramVar, property.getEnumType())));
                    builder.append("} else {\n");
                    builder.append(String.format("stmt.setString(%s,null);\n", paramIndex));
                    builder.append("}\n");
                    break;
            }
            return builder.toString();
        } else if (property.getTemporalType() != null) {
            builder.append(String.format("if (null != %s) {\n",
                    paramVar));
            builder.append(String.format("stmt.%s(%s,%s);\n",
                    JdbcUtils.getColumnSetter(property),
                    paramIndex,
                    JdbcUtils.generateDateParameterVariable(paramVar, property.getTemporalType())));
            builder.append("} else {\n");
            builder.append(String.format("stmt.%s(%s,null);\n", JdbcUtils.getColumnSetter(property),paramIndex));
            builder.append("}\n");
            return builder.toString();
        } else if (property.isLob()) {
            builder.append(String.format("if (null != %s) {\n",
                    paramVar));
            builder.append(String.format("stmt.%s(%s,%s);\n",
                    JdbcUtils.getLobColumnSetter(property),
                    paramIndex,
                    JdbcUtils.generateLobParameterVariable(property, paramVar)));
            builder.append("} else {\n");
            builder.append(String.format("stmt.%s(%s,null);\n", JdbcUtils.getLobColumnSetter(property),paramIndex));
            builder.append("}\n");
            return builder.toString();
        } else {
            if (TypeUtils.isWrapperType(property.getType())){
                builder.append(String.format("if (null != %s) {\n",
                        paramVar));
                builder.append(String.format("stmt.%s(%s,%s);\n",
                        JdbcUtils.getColumnSetter(property),
                        paramIndex,
                        paramVar));
                builder.append("} else {\n");
                builder.append(String.format("stmt.setNull(%s,%s);\n", paramIndex, JdbcUtils.getSQLDataType(property.getType())));
                builder.append("}\n");
                return builder.toString();
            }
            if (TypeUtils.isGISType(property)){
                builder.append(String.format("if (null != %s) {\n",
                        paramVar));
                builder.append(String.format("String wktStr=wktWriter.write(%s);\n",paramVar));
                builder.append(String.format("stmt.setString(%s,wktStr);\n",
                        paramIndex));
                builder.append("} else {\n");
                builder.append(String.format("stmt.setString(%s,null);\n", paramIndex));
                builder.append("}\n");
                return builder.toString();
            }
            return String.format("stmt.%s(%s,%s);\n",
                    JdbcUtils.getColumnSetter(property),
                    paramIndex,
                    paramVar);
        }
    }

    private static Object getSQLDataType(String type) {
        switch(type) {
            case "Integer":
            case "Boolean":
            case "Byte":
            case "Long":
            case "Short":
                return "java.sql.Types.INTEGER";
            case "Float":
                return "java.sql.Types.FLOAT";
            case "Double":
                return "java.sql.Types.DOUBLE";
        }
        return "java.sql.Types.NULL";
    }

    private static String getWrapperType(String type) {
        return WrapperTypeMap.get(type);
    }

    private static String generateLobParameterVariable(SingleProperty property, String paramVar) {
        if (property.getType().equals("java.sql.Clob") || property.getType().equals("java.sql.Blob")
                || property.getType().equals("byte[]") || property.getType().equals("Byte[]")) {
            return paramVar;
        }
        if (property.getType().equals(String.class.getName())) {
            return String.format("new SerialClob(%s.toCharArray())", paramVar);
        }
        return String.format("SerializationUtils.serialize(%s)", paramVar);
    }

    private static String getLobColumnSetter(SingleProperty property) {
        //we don't support using Clob to saving String
        if (property.getType().equals("java.sql.Clob")) {
            return "setClob";
        }
        if (property.getType().equals("java.sql.Blob") || property.getType().equals("Byte[]")) {
            return "setBlob";
        }
        return "setBytes";
    }

    public static String generateStatementParameterSetter(String paramIndex, SingleProperty property, Entity entity) {
        String paramVar = entity.getName() + "." + property.getGetter() + "()";
        return generateStatementParameterSetter(paramIndex, property, paramVar);
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


    public static String generateIdEmptyTest(SingleProperty idProperty, Entity entity) {
        if (TypeUtils.isIntProperty(idProperty)) {
            return String.format("%s.%s() == 0 ",entity.getName(),idProperty.getGetter());
        } else if (TypeUtils.isStringType(idProperty)) {
            return String.format("StringUtils.isEmpty(%s.%s())",entity.getName(),idProperty.getGetter());
        }
        throw new RuntimeException("Unsupported Id Property type in entity "+entity.getClassInfo().getQualifiedName()+" : "+idProperty.getType());
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
