package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.*;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Roy on 2016/2/24.
 */
public class MethodGenerator {
    private SQLGenerator sqlGenerator;

    public MethodGenerator(SQLGenerator sqlGenerator) {
        this.sqlGenerator = sqlGenerator;
    }

    public SQLGenerator getSqlGenerator() {
        return sqlGenerator;
    }

    public  void createDeleteMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append(sqlGenerator.generateDeleteSQL(entity));

        content.append("public void delete(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        content.append("String sql=DELETE_SQL;\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append("stmt.");
        content.append(JdbcUtils.getColumnSetter(idProperty));
        content.append("(1,id);\n");
        content.append("stmt.executeUpdate();\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createUpdateMethod(StringBuilder content, Entity entity) {
        List<String> updateColumns = new ArrayList<>();
        List<SingleProperty> updateProperties = new ArrayList<>();
        SingleProperty idProperty = entity.getIdProperty();
        for (Property property : entity.getProperties()) {
            if (idProperty == property)
                continue;
            if (property.getPropertyType() == PropertyType.Column) {
                SingleProperty singleProperty = (SingleProperty) property;
                updateColumns.add(sqlGenerator.getQuote()+singleProperty.getColumnName() +
                        sqlGenerator.getQuote()+"=?");
                updateProperties.add(singleProperty);
            }
        }
        content.append(sqlGenerator.generateUpdateSQL(entity.getTableName(), updateColumns, idProperty.getColumnName()));

        content.append("public void update(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append("String sql=UPDATE_SQL;\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);

        for (int i = 0; i < updateProperties.size(); i++) {
            SingleProperty property = updateProperties.get(i);
            String stmtSetter = JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, entity);
            content.append(stmtSetter);
        }
        content.append(
                JdbcUtils.generateStatementParameterSetter((updateProperties.size() + 1) + "", idProperty, entity));
        content.append("stmt.executeUpdate();\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createCreateMethod(StringBuilder content, Entity entity) {
        List<String> insertFields = new ArrayList<>();
        List<SingleProperty> insertProperties = new ArrayList<>();
        SingleProperty idProperty = entity.getIdProperty();
        for (Property property : entity.getProperties()) {
            if (entity.isAutoGenerateId() && idProperty == property)
                continue;
            if (property.getPropertyType() == PropertyType.Column) {
                SingleProperty singleProperty = (SingleProperty) property;
                insertFields.add(singleProperty.getColumnName());
                insertProperties.add(singleProperty);
            }
        }
        content.append(sqlGenerator.generateInsertSQL(entity.getTableName(), insertFields));

        if (entity.isAutoGenerateId()) {
            createCreateWithAutoGenerateIdMethod(content, entity, insertProperties);
        } else {
            createCreateWithoutAutoGenerateIdMethod(content, entity, insertProperties);
        }
    }

    public  void createCreateWithoutAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public ");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" create(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append("String sql=INSERT_SQL;");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        for (int i = 0; i < insertProperties.size(); i++) {
            SingleProperty property = insertProperties.get(i);
            content.append(
                    JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, entity));
        }
        content.append("stmt.executeUpdate();\n");
        content.append("return " + entity.getName() + "." + idProperty.getGetter() + "();\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createCreateWithAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public ");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" create(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append("String sql=INSERT_SQL;");
        content.append("logger.debug(sql);\n");
        createPreparedStatementWithGeneratedKeyStatments(content);
        for (int i = 0; i < insertProperties.size(); i++) {
            SingleProperty property = insertProperties.get(i);
            content.append(
                    JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, entity));
        }
        content.append("stmt.executeUpdate();\n");
        content.append("ResultSet resultSet=stmt.getGeneratedKeys();\n");
        content.append("if (!resultSet.next()) {\n");
        content.append("throw new EmptyResultDataAccessException(1);\n");
        content.append("}\n");
        content.append(String.format("%s.%s(resultSet.%s(1));\n",
                entity.getName(), idProperty.getSetter(), JdbcUtils.getColumnGetter(idProperty)));
        content.append(String.format("return %s.%s();\n",
                entity.getName(), idProperty.getGetter()));
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createLoadByIdMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public " + entity.getClassInfo().getName() + " retrieve(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        content.append("String sql=SIMPLE_SELECT_SQL+");
        content.append("\" where ");
        content.append(sqlGenerator.getQuote());
        content.append(idProperty.getColumnName());
        content.append(sqlGenerator.getQuote());
        content.append(" = ?\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(idProperty)));
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("if (!resultSet.next()) {\n");
        content.append("throw new EmptyResultDataAccessException(1);\n");
        content.append("}\n");
        content.append("return SIMPLE_ROW_MAPPER.mapRow(resultSet,1);\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createLoadAllMethod(StringBuilder content, Entity entity) {
//        String rowCallbackHandlerClassName = CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append("public List<" + entity.getClassInfo().getName() + "> retrieveAll() {\n");
        content.append("String sql=SELECT_ALL_SQL;");
        content.append("logger.debug(sql);\n");
        createStatementStatments(content);
        content.append("ResultSet resultSet=stmt.executeQuery(sql);\n");
        content.append(String.format("List<%s> results=new ArrayList<>();\n",
                entity.getClassInfo().getName()));
        content.append("int i=1;\n");
        content.append("while(resultSet.next()){\n");
        content.append("results.add(SIMPLE_ROW_MAPPER.mapRow(resultSet,i++));\n");
        content.append("}\n");
        content.append("return results;\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createRetrieveByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public " + entity.getClassInfo().getName() + " retrieveBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                    + " " + singleProperty.getName());
        }
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateRetrieveByXXXSQL(entity, indexProperties));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        for (int i = 0; i < indexProperties.size(); i++) {
            SingleProperty property = indexProperties.get(i);
            content.append(
                    JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, property.getName()));
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("if (!resultSet.next()) {\n");
        content.append("throw new EmptyResultDataAccessException(1);\n");
        content.append("}\n");
        content.append("return SIMPLE_ROW_MAPPER.mapRow(resultSet,1);\n");
        createExceptionHandleStatements(content);
        content.append("}\n");

    }


    public  void createCountByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public int countBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeType(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isString(singleProperty.getType()))  {
                    parameterList.add("String "+singleProperty.getName());
                }
                continue;
            }  else {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + singleProperty.getName());

            }
        }
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateCountByXXXSQL(entity, indexProperties));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        int i = 1;
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, "\"%\"+"+property.getName()+"+\"%\""));
                    i++;
                }
                continue;
            }  else {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName()));
                i++;
            }
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("if (!resultSet.next()) {\n");
        content.append("throw new EmptyResultDataAccessException(1);\n");
        content.append("}\n");
        content.append("return resultSet.getInt(1);\n");
        createExceptionHandleStatements(content);
        content.append("}\n");

    }

    public  void createFindByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        createFindByXXXMethodWithoutSort(entity, indexInfo, content);
        createFindByXXXMethodWithSort(entity, indexInfo, content);
    }

    private  void createFindByXXXMethodWithoutSort(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public List<" + entity.getClassInfo().getName() + "> findBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeType(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isString(singleProperty.getType()))  {
                    parameterList.add("String "+singleProperty.getName());
                }
                continue;
            }  else {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + singleProperty.getName());

            }
        }
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("String sql;\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindByXXXSQL(entity, indexProperties));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        int i = 1;
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, "\"%\"+"+property.getName()+"+\"%\""));
                    i++;
                }
                continue;
            }  else {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName()));
                i++;
            }
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append(String.format("List<%s> results=new ArrayList<>();\n",
                entity.getClassInfo().getName()));
        content.append("int i=1;\n");
        content.append("while(resultSet.next()){\n");
        content.append("results.add(SIMPLE_ROW_MAPPER.mapRow(resultSet,i++));\n");
        content.append("}\n");
        content.append("return results;\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    private  void createFindByXXXMethodWithSort(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public List<" + entity.getClassInfo().getName() + "> findBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeType(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isString(singleProperty.getType()))  {
                    parameterList.add("String "+singleProperty.getName());
                }
                continue;
            }  else {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + singleProperty.getName());

            }
        }
        parameterList.add("String orderBy");
        parameterList.add("boolean isAscending");
        parameterList.add("int startPos");
        parameterList.add("int resultSize");
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("Preconditions.checkArgument(checkColumnName(orderBy), \" order by column name '\"+orderBy+\"'is invalid\");\n");
        content.append("String sql;\n");
        content.append("String sortSql=isAscending?\" asc \":\" desc \";\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindByXXXSQL(entity, indexProperties));
        content.append(" order by \"+orderBy+sortSql+\"");
        content.append(sqlGenerator.generateLimitClause("startPos","resultSize"));
        content.append(";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        int i = 1;
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, "\"%\"+"+property.getName()+"+\"%\""));
                    i++;
                }
                continue;
            }  else {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName()));
                i++;
            }
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append(String.format("List<%s> results=new ArrayList<>();\n",
                entity.getClassInfo().getName()));
        content.append("int i=1;\n");
        content.append("while(resultSet.next()){\n");
        content.append("results.add(SIMPLE_ROW_MAPPER.mapRow(resultSet,i++));\n");
        content.append("}\n");
        content.append("return results;\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createCountAllMethod(Entity entity, StringBuilder content) {
        List<SingleProperty> indexProperties = getAllIndexProperties(entity);

        content.append("public int countAll(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeType(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isString(singleProperty.getType()))  {
                    parameterList.add("String "+singleProperty.getName());
                }
                continue;
            }  else {
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + singleProperty.getName());

            }
        }
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("List<String> params=new ArrayList<>();\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(String.format("if (%s!=null && %s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName()),
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s between ? and ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(String.format("if (%s!=null) {\n", property.getName()));
                    content.append(String.format("params.add(\"%s%s%s like ?\");\n",
                            sqlGenerator.getQuote(),
                            property.getColumnName(),
                            sqlGenerator.getQuote()));
                    content.append("}\n");
                }
                continue;
            } else {
                content.append(String.format("if (%s!=null) {\n", property.getName()));
                content.append(String.format("params.add(\"%s%s%s=?\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append("}\n");
            }
        }

        content.append("String sql;\n");
        content.append("if (params.size()!=0) {\n");
        content.append("sql=\"select count(*) from " +sqlGenerator.getQuote()
                +entity.getTableName() + sqlGenerator.getQuote() + " where \"+String.join(\" and \",params);\n");
        content.append("} else {\n");
        content.append("sql=\"select count(*) from "  +sqlGenerator.getQuote()
                + entity.getTableName() +sqlGenerator.getQuote() + "\";\n");
        content.append("}\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append("int i=1;\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(String.format("if (%s!=null && %s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName()),
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i+1", property, "max" + StringUtils.capitalize(property.getName())));
                content.append("i+=2;\n");
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(String.format("if (%s!=null) {\n", property.getName()));
                    content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property,
                                "\"%\"+"+property.getName()+"+\"%\""));
                    content.append("i++;\n");
                    content.append("}\n");
                }
                continue;
            } else {
                content.append(String.format("if (%s!=null) {\n", property.getName()));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, property.getName()));
                content.append("i++;\n");
                content.append("}\n");
            }
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("if (!resultSet.next()) {\n");
        content.append("throw new EmptyResultDataAccessException(1);\n");
        content.append("}\n");
        content.append("return resultSet.getInt(1);\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }


    public  void createFindAllMethod(Entity entity, StringBuilder content) {
        List<SingleProperty> indexProperties = getAllIndexProperties(entity);

        content.append("public List<" + entity.getClassInfo().getName() + "> findAll(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeType(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isString(singleProperty.getType()))  {
                    parameterList.add("String "+singleProperty.getName());
                }
                continue;
            } else {
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + singleProperty.getName());

            }
        }
        parameterList.add("String orderBy");
        parameterList.add("boolean isAscending");
        parameterList.add("int startPos");
        parameterList.add("int resultSize");
        content.append(String.join(",", parameterList));
        content.append(") {\n");

        content.append("List<String> params=new ArrayList<>();\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(String.format("if (%s!=null && %s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName()),
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s between ? and ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(String.format("if (%s!=null) {\n", property.getName()));
                    content.append(String.format("params.add(\"%s%s%s like ?\");\n",
                            sqlGenerator.getQuote(),
                            property.getColumnName(),
                            sqlGenerator.getQuote()));
                    content.append("}\n");
                }
                continue;
            } else {
                content.append(String.format("if (%s!=null) {\n", property.getName()));
                content.append(String.format("params.add(\"%s%s%s=?\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append("}\n");
            }
        }

        content.append("String sql,orderClause;\n");
        content.append("if (orderBy==null) {\n");
        content.append("orderClause=\"\";\n");
        content.append("}else{\n");
        content.append("Preconditions.checkArgument(checkColumnName(orderBy), \" order by column name '\"+orderBy+\"'is invalid\");\n");

        content.append(" String sortSql=isAscending?\" asc \":\" desc \";\n");
        content.append("orderClause=\" order by \"+orderBy+sortSql;\n");
        content.append("}\n");
        content.append("String limitClause=\" ");
        content.append(sqlGenerator.generateLimitClause("startPos","resultSize"));
        content.append(";\n");
        content.append("if (params.size()!=0) {\n");
        content.append("sql=\"select * from "  +sqlGenerator.getQuote()
                + entity.getTableName()
                +sqlGenerator.getQuote()+ " where \"+String.join(\" and \",params)+orderClause+limitClause;\n");
        content.append("} else {\n");
        content.append("sql=\"select * from " +sqlGenerator.getQuote()
                + entity.getTableName()  +sqlGenerator.getQuote()+ "\"+orderClause+limitClause;\n");
        content.append("}\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append("int i=1;\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(String.format("if (%s!=null && %s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName()),
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i+1", property, "max" + StringUtils.capitalize(property.getName())));
                content.append("i+=2;\n");
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(String.format("if (%s!=null) {\n", property.getName()));
                    content.append(
                            JdbcUtils.generateStatementParameterSetter("i", property, "\"%\"+"+property.getName()+"+\"%\""));
                    content.append("i++;\n");content.append("}\n");
                }
                continue;
            } else {
                content.append(String.format("if (%s!=null) {\n", property.getName()));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, property.getName()));
                content.append("i++;\n");
                content.append("}\n");
            }
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append(String.format("List<%s> results=new ArrayList<>();\n",
                entity.getClassInfo().getName()));
        content.append("i=1;\n");
        content.append("while(resultSet.next()){\n");
        content.append("results.add(SIMPLE_ROW_MAPPER.mapRow(resultSet,i++));\n");
        content.append("}\n");
        content.append("return results;\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    protected  void createStatementStatments(StringBuilder content) {
        content.append("Connection con = DataSourceUtils.getConnection(getDataSource());\n");
        content.append("Statement stmt = null;\n");
        content.append("try {\n");
        content.append("stmt = con.createStatement();\n");
    }

    protected  void createPreparedStatementStatments(StringBuilder content) {
        content.append("Connection con = DataSourceUtils.getConnection(getDataSource());\n");
        content.append("PreparedStatement stmt = null;\n");
        content.append("try {\n");
        content.append("stmt = con.prepareStatement(sql);\n");
    }

    protected  void createPreparedStatementWithGeneratedKeyStatments(StringBuilder content) {
        content.append("Connection con = DataSourceUtils.getConnection(getDataSource());\n");
        content.append("PreparedStatement stmt = null;\n");
        content.append("try {\n");
        content.append("stmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);\n");
    }

    protected  void createExceptionHandleStatements(StringBuilder content) {
        content.append("}\n");
        content.append("catch (SQLException ex) {\n");
        content.append("JdbcUtils.closeStatement(stmt);\n");
        content.append("stmt = null;\n");
        content.append("DataSourceUtils.releaseConnection(con, getDataSource());\n");
        content.append("con = null;\n");
        content.append("throw getExceptionTranslator().translate(\"JDBC \", sql, ex);\n");
        content.append("}\n");
        content.append("finally {\n");
        content.append("JdbcUtils.closeStatement(stmt);\n");
        content.append("DataSourceUtils.releaseConnection(con, getDataSource());\n");
        content.append("}\n");
    }

    public  void createExceptionTranslatorGetter(StringBuilder content) {
        content.append("public synchronized SQLExceptionTranslator getExceptionTranslator() {\n");
        content.append("if (this.exceptionTranslator == null) {\n");
        content.append("DataSource dataSource = getDataSource();\n");
        content.append("if (dataSource != null) {\n");
        content.append("this.exceptionTranslator = new SQLErrorCodeSQLExceptionTranslator(dataSource);\n");
        content.append("}\n");
        content.append("else {\n");
        content.append("this.exceptionTranslator = new SQLStateSQLExceptionTranslator();\n");
        content.append("}\n");
        content.append("}\n");
        content.append("return this.exceptionTranslator;\n");
        content.append("}\n");
    }

    public  void createDataSourceGetter(StringBuilder content) {
        content.append("public DataSource getDataSource() {\n");
        content.append("return dataSource;\n");
        content.append("}\n");
    }

    public  void createDataSourceSetter(StringBuilder content) {
        content.append("public void setDataSource(DataSource dataSource) {\n");
        content.append("this.dataSource=dataSource;\n");
        content.append("}\n");
    }


    @NotNull
    public  List<SingleProperty> getIndexProperties(Entity entity, IndexInfo indexInfo) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        for (String propertyName : indexInfo.getProperties()) {
            SingleProperty singleProperty = (SingleProperty) entity.getProperty(propertyName);
            indexProperties.add(singleProperty);
        }
        return indexProperties;
    }

    private  List<SingleProperty> getAllIndexProperties(Entity entity) {
        Set<String> allIndexPropertieNames = new HashSet<>();
        for (IndexInfo indexInfo : entity.getIndexes()) {
            for (String propertyName : indexInfo.getProperties()) {
                SingleProperty singleProperty = (SingleProperty) entity.getProperty(propertyName);
                allIndexPropertieNames.add(singleProperty.getName());
            }
        }
        List<SingleProperty> allIndexProperties = new ArrayList<>();
        for (String propertyName : allIndexPropertieNames) {
            allIndexProperties.add((SingleProperty) entity.getProperty(propertyName));
        }
        return allIndexProperties;
    }

    public  void createFindXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("public List<");
        content.append(relationInfo.getMappingEntityFullClassName());
        content.append("> find" +
                StringUtils.capitalize(mappingEntity.getName()) + "(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id");
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateFindXXXMappingSQL(entity, relationInfo));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append(String.format("List<%s> results=new ArrayList<>();\n",
                mappingEntity.getClassInfo().getName()));
        content.append("int i=1;\n");
        content.append("while(resultSet.next()){\n");
        content.append("results.add(");
        content.append(CodeUtils.getPersistorName(mappingEntity));
        content.append(".SIMPLE_ROW_MAPPER.mapRow(resultSet,i++));\n");
        content.append("}\n");
        content.append("return results;\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createCountXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("public int count" +
                StringUtils.capitalize(mappingEntity.getName()) + "(");

        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id");
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateCountXXXMappingSQL(entity, relationInfo));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("if (!resultSet.next()) {\n");
        content.append("throw new EmptyResultDataAccessException(1);\n");
        content.append("}\n");
        content.append("return resultSet.getInt(1);\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createFindXXXMappingWithSortMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("public List<");
        content.append(relationInfo.getMappingEntityFullClassName());
        content.append("> find" +
                StringUtils.capitalize(mappingEntity.getName()) + "WithSort(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,String orderBy,boolean isAscending,int startPos,int resultSize");
        content.append(") {\n");
        content.append("String sql;\n");
        content.append("if (orderBy==null) {\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindXXXMappingSQL(entity, relationInfo));
        content.append(sqlGenerator.generateLimitClause("startPos","resultSize"));
        content.append(";\n");
        content.append("}else{\n");
        content.append("Preconditions.checkArgument(checkColumnName(orderBy), \" order by column name '\"+orderBy+\"'is invalid\");\n");
        content.append("String sortSql=isAscending?\" asc \":\" desc \";\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindXXXMappingSQL(entity, relationInfo));
        content.append(" order by A.\"+orderBy+sortSql+\"");
        content.append(sqlGenerator.generateLimitClause("startPos","resultSize"));
        content.append(";\n");
        content.append("}\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append(String.format("List<%s> results=new ArrayList<>();\n",
                mappingEntity.getClassInfo().getName()));
        content.append("int i=1;\n");
        content.append("while(resultSet.next()){\n");
        content.append("results.add(");
        content.append(CodeUtils.getPersistorName(mappingEntity));
        content.append(".SIMPLE_ROW_MAPPER.mapRow(resultSet,i++));\n");
        content.append("}\n");
        content.append("return results;\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createCreateXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        String mappingEntityId=mappingEntity.getName()+"Id";
        content.append("public void add");
        content.append(StringUtils.capitalize(mappingEntity.getName()));
        content.append("To");
        content.append(StringUtils.capitalize(entity.getName())+  "(");

        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,");
        content.append(TypeUtils.getShortTypeName(mappingEntity.getIdProperty().getType()));
        content.append(" ");
        content.append(mappingEntityId);
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateCreateXXXMappingSQL(entity, relationInfo));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append(String.format("stmt.%s(2,%s);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty()),
                mappingEntityId));
        content.append("stmt.executeUpdate();\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createDeleteXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        String mappingEntityId=mappingEntity.getName()+"Id";
        content.append("public void delete");
        content.append(StringUtils.capitalize(mappingEntity.getName()));
        content.append("From");
        content.append(StringUtils.capitalize(entity.getName())+  "(");

        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,");
        content.append(TypeUtils.getShortTypeName(mappingEntity.getIdProperty().getType()));
        content.append(" ");
        content.append(mappingEntityId);
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateDeleteXXXMappingSQL(entity, relationInfo));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append(String.format("stmt.%s(2,%s);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty()),
                mappingEntityId));
        content.append("stmt.executeUpdate();\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public  void createBatchDeleteXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        String mappingEntityIds=mappingEntity.getName()+"Ids";
        String mappingEntityId=mappingEntity.getName()+"Id";
        content.append("public void delete");
        content.append(StringUtils.capitalize(mappingEntity.getName()));
        content.append("sFrom");
        content.append(StringUtils.capitalize(entity.getName())+  "(");

        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,List<");
        content.append(TypeUtils.getObjectType(TypeUtils.getShortTypeName(mappingEntity.getIdProperty().getType())));
        content.append("> ");
        content.append(mappingEntityIds);
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateDeleteXXXMappingSQL(entity, relationInfo));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append("for (");
        content.append(TypeUtils.getShortTypeName(mappingEntity.getIdProperty().getType()));
        content.append(" ");
        content.append(mappingEntityId);
        content.append(":");
        content.append(mappingEntityIds);
        content.append("){\n");
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append(String.format("stmt.%s(2,%s);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty()),
                mappingEntityId));
        content.append("stmt.addBatch();\n");
        content.append("}\n");
        content.append("stmt.executeBatch();\n");
        createExceptionHandleStatements(content);
        content.append("}\n");    }

    public  void createDeleteByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public void deleteBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeType(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isString(singleProperty.getType()))  {
                    parameterList.add("String "+singleProperty.getName());
                }
                continue;
            }  else {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + singleProperty.getName());

            }
        }
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateDeleteByXXXSQL(entity, indexProperties));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        int i = 1;
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, "\"%\"+"+property.getName()+"+\"%\""));
                    i++;
                }
                continue;
            }  else {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName()));
                i++;
            }
        }
        content.append("stmt.executeUpdate();\n");
        createExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCheckColumnMethod(Entity entity, StringBuilder content) {
        content.append("public boolean checkColumnName(");
        content.append("String columnName");
        content.append(") {\n");
        content.append("if (columnName==null) { \n");
        content.append(" return false;\n");
        content.append("}\n");
        for (Property property:entity.getProperties()) {
            if (property.getPropertyType()== PropertyType.Column) {
                SingleProperty singleProperty=(SingleProperty)property;
                content.append("if (columnName.equalsIgnoreCase(\"");
                content.append(singleProperty.getColumnName());
                content.append("\")) {\n");
                content.append("return true;\n");
                content.append("}\n");
            }
        }
        content.append("return false;\n");
        content.append("}\n");
    }
}
