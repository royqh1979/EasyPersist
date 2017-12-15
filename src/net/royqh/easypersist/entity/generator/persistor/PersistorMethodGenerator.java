package net.royqh.easypersist.entity.generator.persistor;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.utils.JdbcUtils;
import net.royqh.easypersist.entity.generator.TemplateLoader;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.utils.TemplateUtils;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Roy on 2016/2/24.
 */
public class PersistorMethodGenerator {
    private SQLGenerator sqlGenerator;
    private static Template CreateFindXXXMappingForAddTemplate = TemplateLoader.loadTemplate("Persistor-Method-CreateFindXXXMappingForAdd.ftl");
    private static Template GetColumnNameByPropertyNameTemplate = TemplateLoader.loadTemplate("Persistor-Method-GetColumnNameByPropertyName.ftl");
    private static Template RowProcessorTemplate = TemplateLoader.loadTemplate("Persistor-RowProcessor.ftl");

    public PersistorMethodGenerator(SQLGenerator sqlGenerator) {
        this.sqlGenerator = sqlGenerator;
    }

    public SQLGenerator getSqlGenerator() {
        return sqlGenerator;
    }

    public void createDeleteMethods(StringBuilder content, Entity entity) {
        content.append(sqlGenerator.generateDeleteSQL(entity));
        createDeleteMethod(content, entity);
        createDeleteAllMethod(content, entity);
        createBatchDeleteMethod(content, entity);
    }

    private void createDeleteAllMethod(StringBuilder content, Entity entity) {
        content.append("public void deleteAll() {\n");
        content.append(String.format("String sql=\"delete from %s%s%s\";\n",
                sqlGenerator.getQuote(), entity.getTableName(), sqlGenerator.getQuote()));
        content.append("logger.debug(sql);\n");
        content.append("Connection con = DataSourceUtils.getConnection(getDataSource());\n");
        content.append("Statement stmt = null;\n");
        content.append("try {\n");
        content.append("stmt = con.createStatement();\n");
        content.append("stmt.execute(sql);\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    private void createBatchDeleteMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();

        content.append("public void batchDelete(List<");
        content.append(TypeUtils.getObjectType(idProperty.getType()));

        content.append("> ids) {\n");
        content.append("String sql=DELETE_SQL;\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("for (%s id:ids) {\n",
                TypeUtils.getObjectType(idProperty.getType())));
        content.append("stmt.");
        content.append(JdbcUtils.getColumnSetter(idProperty));
        content.append("(1,id);\n");
        content.append("stmt.addBatch();\n");
        content.append("}\n");
        content.append("stmt.executeBatch();\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");

    }

    public void createDeleteMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();

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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createUpdateMethod(StringBuilder content, Entity entity) {
        List<String> updateColumns = new ArrayList<>();
        List<SingleProperty> updateProperties = new ArrayList<>();
        SingleProperty idProperty = entity.getIdProperty();
        for (Property property : entity.getProperties()) {
            if (idProperty == property && entity.isAutoGenerateId())
                continue;
            if (property.getPropertyType() == PropertyType.Column) {
                SingleProperty singleProperty = (SingleProperty) property;
                updateColumns.add(sqlGenerator.getQuote() + singleProperty.getColumnName() +
                        sqlGenerator.getQuote() + "=?");
                updateProperties.add(singleProperty);
            }
        }
        content.append(sqlGenerator.generateUpdateSQL(entity.getTableName(), updateColumns, idProperty.getColumnName()));

        if (!entity.isAutoGenerateId()) {
            content.append("public void update(");
            content.append(entity.getClassInfo().getName());
            content.append(" ");
            content.append(entity.getName());
            content.append(") {\n");
            content.append(String.format(" update(%s,%s.%s());",
                    entity.getName(), entity.getName(), entity.getIdProperty().getGetter()));
            content.append("}\n");

        }
        content.append("public void update(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        if (!entity.isAutoGenerateId()) {
            content.append(",");
            content.append(entity.getIdProperty().getType());
            content.append(" ");
            content.append(entity.getIdProperty().getName());
        }
        content.append(") {\n");
        content.append("String sql=UPDATE_SQL;\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);

        for (int i = 0; i < updateProperties.size(); i++) {
            SingleProperty property = updateProperties.get(i);
            String stmtSetter = JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, entity);
            content.append(stmtSetter);
        }
        if (entity.isAutoGenerateId()) {
            content.append(
                    JdbcUtils.generateStatementParameterSetter((updateProperties.size() + 1) + "", idProperty, entity));
        } else {
            content.append(
                    JdbcUtils.generateStatementParameterSetter((updateProperties.size() + 1) + "", idProperty, entity.getIdProperty().getName()));
        }
        content.append("stmt.executeUpdate();\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCreateMethods(StringBuilder content, Entity entity) {
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
        createBatchCreateMethod(content, entity);
    }

    private void createBatchCreateMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public void batchCreate(List<");
        content.append(entity.getClassInfo().getName());
        content.append("> lst");
        content.append(entity.getClassInfo().getName());
        content.append(") {\n");
        if (entity.isAutoGenerateId()) {
            content.append(String.format("String sql=\"insert into %s%s%s(",
                    sqlGenerator.getQuote(), entity.getTableName(), sqlGenerator.getQuote()));
            content.append(sqlGenerator.getQuote() + entity.getIdProperty().getColumnName() + sqlGenerator.getQuote());
            for (Property property : entity.getProperties()) {
                if (idProperty == property)
                    continue;
                if (property.getPropertyType() == PropertyType.Column) {
                    SingleProperty singleProperty = (SingleProperty) property;
                    content.append(String.format(",%s%s%s",
                            sqlGenerator.getQuote(), singleProperty.getColumnName(), sqlGenerator.getQuote()));
                }
            }
            content.append(") values (?");
            for (Property property : entity.getProperties()) {
                if (idProperty == property)
                    continue;
                if (property.getPropertyType() == PropertyType.Column) {
                    content.append(String.format(",?"));
                }
            }
            content.append(")\";\n");
        } else {
            content.append("String sql = INSERT_SQL;\n");
        }

        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("for (%s %s:lst%s) {\n",
                entity.getClassInfo().getName(), entity.getName(), entity.getClassInfo().getName()));
        int i = 1;
        if (entity.isAutoGenerateId()) {
            content.append(String.format("if (%s){\n",
                    JdbcUtils.generateIdEmptyTest(entity.getIdProperty(), entity)));
            content.append("stmt.setNull(1, Types.INTEGER);\n");
            content.append("} else {\n");
            content.append(
                    JdbcUtils.generateStatementParameterSetter("1", entity.getIdProperty(), entity));
            content.append("}\n");
        } else {
            content.append(
                    JdbcUtils.generateStatementParameterSetter("1", entity.getIdProperty(), entity));
        }
        for (Property property : entity.getProperties()) {
            if (idProperty == property)
                continue;
            if (property.getPropertyType() == PropertyType.Column) {
                i++;
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", (SingleProperty)property, entity));

            }
        }
        content.append("stmt.addBatch();\n");
        content.append("}\n");
        content.append("stmt.executeBatch();\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCreateWithoutAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCreateWithAutoGenerateIdMethod(StringBuilder content, Entity entity, List<SingleProperty> insertProperties) {
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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createRetrieveByIdMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public " + entity.getClassInfo().getName() + " retrieve(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        content.append("return retrieve(id,SIMPLE_ROW_MAPPER);\n");
        content.append("}\n");
        content.append("public <T> T retrieve(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id, RowMapper<T> rowMapper) {\n");
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
        content.append("return rowMapper.mapRow(resultSet, 1);\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createLoadAllMethod(StringBuilder content, Entity entity) {
//        String rowCallbackHandlerClassName = CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append("    public List<" + entity.getClassInfo().getName() + "> retrieveAll(){\n");
        content.append("        DefaultRowProcessor rowProcessor=new DefaultRowProcessor();\n");
        content.append("        retrieveAll(rowProcessor);\n");
        content.append("        return rowProcessor.getResults();\n");
        content.append("    }\n");

        content.append("public void retrieveAll(RowProcessor rowProcessor) {\n");
        content.append("String sql=SELECT_ALL_SQL;");
        content.append("logger.debug(sql);\n");
        createStatementStatments(content);
        content.append("ResultSet resultSet=stmt.executeQuery(sql);\n");
        content.append("int _i_row=0;\n");
        content.append("while(resultSet.next()){\n");
        content.append("rowProcessor.processRow(resultSet,_i_row++);\n");
        content.append("}\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createRetrieveByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        createRetrieveByXXXMethod(entity, content, indexProperties);
    }

    public void createRetrieveByXXXMethod(Entity entity, ReferenceSingleProperty referenceSingleProperty, StringBuilder content) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        indexProperties.add(referenceSingleProperty);
        createRetrieveByXXXMethod(entity, content, indexProperties);
    }

    private void createRetrieveByXXXMethod(Entity entity, StringBuilder content, List<SingleProperty> indexProperties) {
        String indexName = JdbcUtils.generateIndexName(indexProperties);
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                    + " " + singleProperty.getName());
        }
        String parameterListStr = String.join(",", parameterList);

        content.append("public " + entity.getClassInfo().getName() + " retrieveBy" +
                indexName + "(");
        content.append(parameterListStr);
        content.append(") {\n");
        content.append("return retrieveBy" +
                indexName + "(");
        for (SingleProperty singleProperty : indexProperties) {
            content.append(singleProperty.getName());
            content.append(",");
        }
        content.append("SIMPLE_ROW_MAPPER);\n");
        content.append("}\n");

        content.append("public <T> T retrieveBy" +
                indexName + "(");
        content.append(parameterListStr);
        content.append(", RowMapper<T> rowMapper) {\n");
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
        content.append("return null;\n");
        content.append("}\n");
        content.append("return rowMapper.mapRow(resultSet,1);\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCountByXXXMethod(Entity entity, ReferenceSingleProperty referenceSingleProperty, StringBuilder content) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        indexProperties.add(referenceSingleProperty);
        createCountByXXXMethod(entity, content, indexProperties);
    }


    public void createCountByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        createCountByXXXMethod(entity, content, indexProperties);

    }

    private void createCountByXXXMethod(Entity entity, StringBuilder content, List<SingleProperty> indexProperties) {
        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public int countBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    parameterList.add("String " + singleProperty.getName());
                }
                continue;
            } else {
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
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName() + "+\"%\""));
                    i++;
                }
                continue;
            } else {
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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createFindByXXXMethod(Entity entity, ReferenceSingleProperty referenceSingleProperty, StringBuilder content) {
        createFindByXXXMethodWithoutSort(entity, referenceSingleProperty, content);
        createFindByXXXMethodWithSort(entity, referenceSingleProperty, content);
    }

    public void createFindByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        createFindByXXXMethodWithoutSort(entity, indexInfo, content);
        createFindByXXXMethodWithSort(entity, indexInfo, content);
    }

    private void createFindByXXXMethodWithoutSort(Entity entity, ReferenceSingleProperty referenceSingleProperty, StringBuilder content) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        indexProperties.add(referenceSingleProperty);
        createFindByXXXMethodWithoutSort(entity, content, indexProperties);
    }

    private void createFindByXXXMethodWithoutSort(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        createFindByXXXMethodWithoutSort(entity, content, indexProperties);
    }

    private void createFindByXXXMethodWithoutSort(Entity entity, StringBuilder content, List<SingleProperty> indexProperties) {
        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public List<" + entity.getClassInfo().getName() + "> findBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    parameterList.add("String " + singleProperty.getName());
                }
                continue;
            } else {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + singleProperty.getName());

            }
        }
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("DefaultRowProcessor rowProcessor=new DefaultRowProcessor();\n");
        content.append("findBy" + indexName + "(");
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                content.append("min" + StringUtils.capitalize(singleProperty.getName() + ","));
                content.append("max" + StringUtils.capitalize(singleProperty.getName() + ","));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    content.append(singleProperty.getName() + ",");
                }
                continue;
            } else {
                content.append(singleProperty.getName() + ",");
            }
        }
        content.append("rowProcessor);\n");
        content.append("return rowProcessor.getResults();\n");
        content.append("}\n");

        content.append("public void findBy" +
                indexName + "(");
        content.append(String.join(",", parameterList));
        content.append(", RowProcessor rowProcessor) {\n");
        content.append("String sql;\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindByXXXSQL(entity, indexProperties));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        int i = 1;
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName() + "+\"%\""));
                    i++;
                }
            } else {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName()));
                i++;
            }
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("int _i_row=0;\n");
        content.append("while(resultSet.next()){\n");
        content.append("rowProcessor.processRow(resultSet,_i_row++);\n");
        content.append("}\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    private void createFindByXXXMethodWithSort(Entity entity, ReferenceSingleProperty referenceSingleProperty, StringBuilder content) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        indexProperties.add(referenceSingleProperty);
        createFindByXXXMethodWithSort(entity, content, indexProperties);
    }

    private void createFindByXXXMethodWithSort(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);
        createFindByXXXMethodWithSort(entity, content, indexProperties);
    }

    private void createFindByXXXMethodWithSort(Entity entity, StringBuilder content, List<SingleProperty> indexProperties) {
        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public List<" + entity.getClassInfo().getName() + "> findBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    parameterList.add("String " + singleProperty.getName());
                }
            } else {
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
        content.append("DefaultRowProcessor rowProcessor=new DefaultRowProcessor();\n");
        content.append("findBy" + indexName + "(");
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                content.append("min" + StringUtils.capitalize(singleProperty.getName() + ","));
                content.append("max" + StringUtils.capitalize(singleProperty.getName() + ","));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    content.append(singleProperty.getName() + ",");
                }
                continue;
            } else {
                content.append(singleProperty.getName() + ",");
            }
        }
        content.append("orderBy,isAscending,startPos,resultSize, rowProcessor);\n");
        content.append("return rowProcessor.getResults();\n");
        content.append("}\n");

        content.append("public void findBy" +
                indexName + "(");
        content.append(String.join(",", parameterList));
        content.append(",RowProcessor rowProcessor) {\n");
        content.append("String orderByColumn=getColumnNameByPropertyNameFor" + entity.getClassInfo().getName() + "(orderBy);\n");
        content.append("String sql;\n");
        content.append("String sortSql=isAscending?\" asc \":\" desc \";\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindByXXXSQL(entity, indexProperties));
        content.append(" order by \"+orderByColumn+sortSql+\"");
        content.append(sqlGenerator.generateLimitClause("startPos", "resultSize"));
        content.append(";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        int i = 1;
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName() + "+\"%\""));
                    i++;
                }
                continue;
            } else {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName()));
                i++;
            }
        }
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("int _i_row=0;\n");
        content.append("while(resultSet.next()){\n");
        content.append("rowProcessor.processRow(resultSet,_i_row++);\n");
        content.append("}\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCountAllMethod(Entity entity, StringBuilder content) {
        List<SingleProperty> indexProperties = CodeUtils.getAllIndexedProperties(entity);

        if (indexProperties.size()<1) {
            return;
        }

        content.append("public int countAll(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    parameterList.add("String " + singleProperty.getName());
                }
                continue;
            } else {
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + singleProperty.getName());

            }
        }
        content.append(String.join(",", parameterList));
        content.append(") {\n");
        content.append("List<String> params=new ArrayList<>();\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(String.format("if (%s!=null && %s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName()),
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s between ? and ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append(String.format("} else if (%s != null) {\n",
                        "min" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s >= ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append(String.format("} else if (%s != null) {\n",
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s <= ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
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
        content.append("sql=\"select count(*) from " + sqlGenerator.getQuote()
                + entity.getTableName() + sqlGenerator.getQuote() + " where \"+String.join(\" and \",params);\n");
        content.append("} else {\n");
        content.append("sql=\"select count(*) from " + sqlGenerator.getQuote()
                + entity.getTableName() + sqlGenerator.getQuote() + "\";\n");
        content.append("}\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append("int i=1;\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(String.format("if (%s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, "min" + StringUtils.capitalize(property.getName())));
                content.append("i++;\n");
                content.append("}\n");
                content.append(String.format("if (%s!=null) {\n",
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, "max" + StringUtils.capitalize(property.getName())));
                content.append("i++;\n");
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
                    content.append(String.format("if (%s!=null) {\n", property.getName()));
                    content.append(
                            JdbcUtils.generateStatementParameterSetter("i", property,
                                    "\"%\"+" + property.getName() + "+\"%\""));
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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }


    public void createFindAllMethod(Entity entity, StringBuilder content) {
        List<SingleProperty> indexProperties = CodeUtils.getAllIndexedProperties(entity);
        content.append("public List<" + entity.getClassInfo().getName() + "> findAll(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(TypeUtils.getObjectType(singleProperty.getType()))
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    parameterList.add("String " + singleProperty.getName());
                }
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
        content.append("DefaultRowProcessor rowProcessor=new DefaultRowProcessor();\n");
        content.append("findAll(");
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                content.append("min" + StringUtils.capitalize(singleProperty.getName() + ","));
                content.append("max" + StringUtils.capitalize(singleProperty.getName() + ","));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    content.append(singleProperty.getName() + ",");
                }
                continue;
            } else {
                content.append(singleProperty.getName() + ",");
            }
        }
        content.append("orderBy,isAscending,startPos,resultSize, rowProcessor);\n");
        content.append("return rowProcessor.getResults();\n");
        content.append("}\n");

        content.append("public void findAll(");
        content.append(String.join(",", parameterList));
        content.append(",RowProcessor rowProcessor) {\n");

        content.append("List<String> params=new ArrayList<>();\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(String.format("if (%s!=null && %s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName()),
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s between ? and ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append(String.format("} else if (%s != null) {\n",
                        "min" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s >= ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append(String.format("} else if (%s != null) {\n",
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(String.format("params.add(\"(%s%s%s <= ? )\");\n",
                        sqlGenerator.getQuote(),
                        property.getColumnName(),
                        sqlGenerator.getQuote()));
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
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
        content.append("String orderByColumn=getColumnNameByPropertyNameFor" + entity.getClassInfo().getName() + "(orderBy);\n");
        content.append("if (orderByColumn==null) {\n");
        content.append("orderClause=\"\";\n");
        content.append("}else{\n");
        content.append(" String sortSql=isAscending?\" asc \":\" desc \";\n");
        content.append("orderClause=\" order by \"+orderByColumn+sortSql;\n");
        content.append("}\n");
        content.append("String limitClause=\" ");
        content.append(sqlGenerator.generateLimitClause("startPos", "resultSize"));
        content.append(";\n");
        content.append("if (params.size()!=0) {\n");
        content.append("sql=\"select * from " + sqlGenerator.getQuote()
                + entity.getTableName()
                + sqlGenerator.getQuote() + " where \"+String.join(\" and \",params)+orderClause+limitClause;\n");
        content.append("} else {\n");
        content.append("sql=\"select * from " + sqlGenerator.getQuote()
                + entity.getTableName() + sqlGenerator.getQuote() + "\"+orderClause+limitClause;\n");
        content.append("}\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append("int i=1;\n");
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(String.format("if (%s!=null) {\n",
                        "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, "min" + StringUtils.capitalize(property.getName())));
                content.append("i++;\n");
                content.append("}\n");
                content.append(String.format("if (%s!=null) {\n",
                        "max" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter("i", property, "max" + StringUtils.capitalize(property.getName())));
                content.append("i++;\n");
                content.append("}\n");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
                    content.append(String.format("if (%s!=null) {\n", property.getName()));
                    content.append(
                            JdbcUtils.generateStatementParameterSetter("i", property, "\"%\"+" + property.getName() + "+\"%\""));
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
        content.append("int _i_row=0;\n");
        content.append("while(resultSet.next()){\n");
        content.append("rowProcessor.processRow(resultSet,_i_row++);\n");
        content.append("}\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    protected void createStatementStatments(StringBuilder content) {
        content.append("Connection con = DataSourceUtils.getConnection(getDataSource());\n");
        content.append("Statement stmt = null;\n");
        content.append("try {\n");
        content.append("stmt = con.createStatement();\n");
    }

    protected void createPreparedStatementStatments(StringBuilder content) {
        content.append("Connection con = DataSourceUtils.getConnection(getDataSource());\n");
        content.append("PreparedStatement stmt = null;\n");
        content.append("try {\n");
        content.append("stmt = con.prepareStatement(sql);\n");
    }

    protected void createPreparedStatementWithGeneratedKeyStatments(StringBuilder content) {
        content.append("Connection con = DataSourceUtils.getConnection(getDataSource());\n");
        content.append("PreparedStatement stmt = null;\n");
        content.append("try {\n");
        content.append("stmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);\n");
    }

    protected void generateExceptionHandleStatements(StringBuilder content) {
        content.append("}\n");
        content.append("catch (SQLException ex) {\n");
        content.append("JdbcUtils.closeStatement(stmt);\n");
        content.append("stmt = null;\n");
        content.append("DataSourceUtils.releaseConnection(con, getDataSource());\n");
        content.append("con = null;\n");
        //content.append("throw getExceptionTranslator().translate(\"JDBC \", sql, ex);\n");
        content.append("throw new RuntimeException(ex);\n");
        content.append("}\n");
        content.append("finally {\n");
        content.append("JdbcUtils.closeStatement(stmt);\n");
        content.append("DataSourceUtils.releaseConnection(con, getDataSource());\n");
        content.append("}\n");
    }

    public void createExceptionTranslatorGetter(StringBuilder content) {
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

    public void createDataSourceGetter(StringBuilder content) {
        content.append("public DataSource getDataSource() {\n");
        content.append("return dataSource;\n");
        content.append("}\n");
    }

    public void createDataSourceSetter(StringBuilder content) {
        content.append("public void setDataSource(DataSource dataSource) {\n");
        content.append("this.dataSource=dataSource;\n");
        content.append("}\n");
    }


    @NotNull
    public List<SingleProperty> getIndexProperties(Entity entity, IndexInfo indexInfo) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        for (String propertyName : indexInfo.getProperties()) {
            SingleProperty singleProperty = (SingleProperty) entity.getProperty(propertyName);
            indexProperties.add(singleProperty);
        }
        return indexProperties;
    }

    public void createFindXXXMappingForAddMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Map<String, Object> dataModel = new HashMap<>();
        Entity mapEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());

        dataModel.put("entityId", entity.getName() + "Id");
        dataModel.put("mapEntity", mapEntity);
        dataModel.put("mapRelationInfo", relationInfo);

        dataModel.put("indexProperties", CodeUtils.getAllIndexedProperties(mapEntity));
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        dataModel.put("quote", sqlGenerator.getQuote());
        CodeUtils.generateContent(content, CreateFindXXXMappingForAddTemplate, dataModel);
    }

    public void createFindXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("public List<");
        content.append(relationInfo.getMappingEntityFullClassName());
        content.append("> find" +
                mappingEntity.getClassInfo().getName() + "(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id");
        content.append(") {\n");
        content.append(CodeUtils.getPersistorName(mappingEntity) + ".DefaultRowProcessor rowProcessor=new " + CodeUtils.getPersistorName(mappingEntity) + ".DefaultRowProcessor();\n");
        content.append("find" + mappingEntity.getClassInfo().getName() + "(");
        content.append("id, rowProcessor);\n");
        content.append("return rowProcessor.getResults();\n");
        content.append("}\n");

        content.append("public  void find" +
                StringUtils.capitalize(mappingEntity.getName()) + "(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id," + CodeUtils.getPersistorName(mappingEntity) + ".RowProcessor rowProcessor");
        content.append(") {\n");
        content.append("String sql=\"");
        content.append(sqlGenerator.generateFindXXXMappingSQL(entity, relationInfo));
        content.append("\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("int _i_row=0;\n");
        content.append("while(resultSet.next()){\n");
        content.append("rowProcessor.processRow(resultSet,_i_row++);\n");
        content.append("}\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCountXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createFindXXXMappingWithSortMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("public List<");
        content.append(relationInfo.getMappingEntityFullClassName());
        content.append("> find" +
                StringUtils.capitalize(mappingEntity.getName()) + "WithSort(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,String orderBy,boolean isAscending,int startPos,int resultSize");
        content.append(") {\n");
        content.append(CodeUtils.getPersistorName(mappingEntity) + ".DefaultRowProcessor rowProcessor=new " + CodeUtils.getPersistorName(mappingEntity) + ".DefaultRowProcessor();\n");
        content.append("find" + mappingEntity.getClassInfo().getName() + "WithSort(");
        content.append("id, orderBy,isAscending,startPos,resultSize,rowProcessor);\n");
        content.append("return rowProcessor.getResults();\n");
        content.append("}\n");

        content.append("public void find" +
                StringUtils.capitalize(mappingEntity.getName()) + "WithSort(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,String orderBy,boolean isAscending,int startPos,int resultSize," + CodeUtils.getPersistorName(mappingEntity) + ".RowProcessor rowProcessor");
        content.append(") {\n");
        content.append("String sql;\n");
        content.append("String orderByColumn=getColumnNameByPropertyNameFor" + mappingEntity.getClassInfo().getName() + "(orderBy);\n");

        content.append("if (orderByColumn==null) {\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindXXXMappingSQL(entity, relationInfo));
        content.append(" ");
        content.append(sqlGenerator.generateLimitClause("startPos", "resultSize"));
        content.append(";\n");
        content.append("}else{\n");

        content.append("String sortSql=isAscending?\" asc \":\" desc \";\n");
        content.append("sql=\"");
        content.append(sqlGenerator.generateFindXXXMappingSQL(entity, relationInfo));
        content.append(" order by A.\"+orderByColumn+sortSql+\" ");
        content.append(sqlGenerator.generateLimitClause("startPos", "resultSize"));
        content.append(";\n");
        content.append("}\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(String.format("stmt.%s(1,id);\n",
                JdbcUtils.getColumnSetter(entity.getIdProperty())));
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("int _i_row=0;\n");
        content.append("while(resultSet.next()){\n");
        content.append("rowProcessor.processRow(resultSet,_i_row++);\n");
        content.append("}\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createCreateXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        String mappingEntityId = mappingEntity.getName() + "Id";
        content.append("public void add");
        content.append(StringUtils.capitalize(mappingEntity.getName()));
        content.append("To");
        content.append(StringUtils.capitalize(entity.getName()) + "(");

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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createBatchCreateXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        String mappingEntityId = mappingEntity.getName() + "Id";
        String mappingEntityIds = mappingEntity.getName() + "Ids";
        content.append("public void add");
        content.append(StringUtils.capitalize(mappingEntity.getName()));
        content.append("sTo");
        content.append(StringUtils.capitalize(entity.getName()) + "(");

        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,Iterable<");
        content.append(TypeUtils.getObjectType(TypeUtils.getShortTypeName(mappingEntity.getIdProperty().getType())));
        content.append("> ");
        content.append(mappingEntityIds);
        content.append(") {\n");

        content.append("String sql=\"");
        content.append(sqlGenerator.generateCreateXXXMappingSQL(entity, relationInfo));
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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createDeleteXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        String mappingEntityId = mappingEntity.getName() + "Id";
        content.append("public void delete");
        content.append(StringUtils.capitalize(mappingEntity.getName()));
        content.append("From");
        content.append(StringUtils.capitalize(entity.getName()) + "(");

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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createBatchDeleteXXXMappingMethod(Entity entity, MapRelationInfo relationInfo, StringBuilder content) {
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        String mappingEntityIds = mappingEntity.getName() + "Ids";
        String mappingEntityId = mappingEntity.getName() + "Id";
        content.append("public void delete");
        content.append(StringUtils.capitalize(mappingEntity.getName()));
        content.append("sFrom");
        content.append(StringUtils.capitalize(entity.getName()) + "(");

        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id,Iterable<");
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
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createDeleteByXXXMethod(Entity entity, ReferenceSingleProperty referenceSingleProperty, StringBuilder content) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        indexProperties.add(referenceSingleProperty);
        createDeleteByXXXMethod(entity, content, indexProperties);
    }

    public void createDeleteByXXXMethod(Entity entity, IndexInfo indexInfo, StringBuilder content) {
        List<SingleProperty> indexProperties = getIndexProperties(entity, indexInfo);

        createDeleteByXXXMethod(entity, content, indexProperties);
    }

    private void createDeleteByXXXMethod(Entity entity, StringBuilder content, List<SingleProperty> indexProperties) {
        String indexName = JdbcUtils.generateIndexName(indexProperties);

        content.append("public void deleteBy" +
                indexName + "(");
        List<String> parameterList = new ArrayList<>();
        for (SingleProperty singleProperty : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(singleProperty)) {
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "min" + StringUtils.capitalize(singleProperty.getName()));
                parameterList.add(TypeUtils.getShortTypeName(singleProperty.getType())
                        + " " + "max" + StringUtils.capitalize(singleProperty.getName()));
            } else if (singleProperty.getColumn().isUnique()) {
                if (TypeUtils.isStringType(singleProperty.getType())) {
                    parameterList.add("String " + singleProperty.getName());
                }
                continue;
            } else {
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
            if (TypeUtils.isRangeTypeProperty(property)) {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, "min" + StringUtils.capitalize(property.getName())));
                content.append(
                        JdbcUtils.generateStatementParameterSetter((i + 1) + "", property, "max" + StringUtils.capitalize(property.getName())));
                i += 2;
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
                    content.append(
                            JdbcUtils.generateStatementParameterSetter(i + "", property, "\"%\"+" + property.getName() + "+\"%\""));
                    i++;
                }
                continue;
            } else {
                content.append(
                        JdbcUtils.generateStatementParameterSetter(i + "", property, property.getName()));
                i++;
            }
        }
        content.append("stmt.executeUpdate();\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    public void createPropertyNameToColumnNameMethod(Entity entity, StringBuilder content) {
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        CodeUtils.generateContent(content, GetColumnNameByPropertyNameTemplate, dataModel);
    }

     public void createRowProcessor(Entity entity, StringBuilder content) {
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        CodeUtils.generateContent(content, RowProcessorTemplate, dataModel);
    }

    /**
     * basic count all method (no query condition)
     * @param content
     * @param entity
     */
    public void createBasicCountAllMethod(StringBuilder content, Entity entity) {
        content.append("public int countAll() {\n");
        content.append("String sql;\n");
        content.append("sql=\"select count(*) from " + sqlGenerator.getQuote()
                + entity.getTableName() + sqlGenerator.getQuote() + "\";\n");
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append("ResultSet resultSet=stmt.executeQuery();\n");
        content.append("if (!resultSet.next()) {\n");
        content.append("throw new EmptyResultDataAccessException(1);\n");
        content.append("}\n");
        content.append("return resultSet.getInt(1);\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }

    /*
    public void createDeleteByEntityKeyMethods(Entity entity, StringBuilder content) {
        ReferenceSingleProperty entityKeyProperty = entity.getFactTableInfo().getEntityKeyProperty();
        content.append(String.format("public void deleteBy%s(%s %s) {\n",
                StringUtils.capitalize(entityKeyProperty.getName()),
                TypeUtils.getShortTypeName(entityKeyProperty.getType()),
                entityKeyProperty.getName()));
        content.append(String.format("String sql=\"delete from %s%s%s where %s%s%s=?\";\n",
                sqlGenerator.getQuote(), entity.getTableName(), sqlGenerator.getQuote(),
                sqlGenerator.getQuote(), entityKeyProperty.getColumnName(), sqlGenerator.getQuote()));
        content.append("logger.debug(sql);\n");
        createPreparedStatementStatments(content);
        content.append(
                JdbcUtils.generateStatementParameterSetter("1", entityKeyProperty,entityKeyProperty.getName()));
        content.append("stmt.executeUpdate();\n");
        generateExceptionHandleStatements(content);
        content.append("}\n");
    }
    */

}
