package net.royqh.easypersist.entity.generator.persistor;

import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.entity.model.jpa.Column;
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.utils.TypeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2016/2/17.
 */
public class MySQLGenerator extends SQLGenerator {
    /**
     * 生成最基本的(无Join)Selete语句
     *
     * @param entity
     * @return
     */
    @Override
    public StringBuilder generateSimpleSelectSQL(Entity entity) {
        String tableName = entity.getTableName();
        SingleProperty idProperty = entity.getIdProperty();
        StringBuilder content = new StringBuilder();
        content.append("public static final String SIMPLE_SELECT_SQL=");
        content.append("\"select * from `" + tableName + "`\";\n");
        return content;
    }

    @Override
    public StringBuilder generateSelectAllSQL(Entity entity) {
        String tableName = entity.getTableName();
        SingleProperty idProperty = entity.getIdProperty();
        StringBuilder content = new StringBuilder();
        content.append("public static final String SELECT_ALL_SQL=");
        content.append("\"select * from `" + tableName + "` order by ");
        content.append(idProperty.getColumnName());
        content.append(" asc\";\n");
        return content;
    }

    /**
     * 生成包含Join关系的Selete语句
     * <p>用于对JPA @ElementCollection的支持</p>
     *
     * @param entity
     * @return
     */
    @Override
    public StringBuilder generateFullJoinSelectSQL(Entity entity) {
        String tablePrefix = "t";
        String tableName = entity.getTableName();
        SingleProperty idProperty = entity.getIdProperty();
        StringBuilder content = new StringBuilder();
        content.append("public static final String FULL_JOIN_SELECT_SQL=");
        content.append("\"select ");
        String tableAbbrev = "A";
        boolean firstProp = true;
        List<ElementCollectionProperty> elementCollections = new ArrayList<>();
        for (Property property : entity.getProperties()) {
            PropertyType propertyType = property.getPropertyType();
            if (propertyType == PropertyType.Column) {
                if (!firstProp) {
                    content.append(",");
                }
                SingleProperty singleProperty = (SingleProperty) property;
                content.append(String.format(" `%s`.`%s` as `%s`",
                        tableAbbrev, singleProperty.getColumnName(),
                        CodeUtils.getPropertyVarName(entity, singleProperty)));
            } else if (propertyType == PropertyType.ElementCollection) {
                elementCollections.add((ElementCollectionProperty) property);
            }
            firstProp = false;
        }
        for (int i = 0; i < elementCollections.size(); i++) {
            String elementTableAbbrev = tablePrefix + i;
            ElementCollectionProperty property = elementCollections.get(i);
            Column column = property.getColumn();
            content.append(",");
            content.append(String.format(" `%s`.`%s` as `%s` ",
                    elementTableAbbrev, column.getName(), CodeUtils.getPropertyVarName(entity, property)));
        }
        content.append(String.format(" from `%s` `%s` ", tableName, tableAbbrev));
        for (int i = 0; i < elementCollections.size(); i++) {
            ElementCollectionProperty property = elementCollections.get(i);
            String elementTableAbbrev = tablePrefix + i;
            String elementTableName = property.getCollectionTable().getName();
            String joinColumnName = property.getCollectionTable().getJoinColumns()[0].getName();
            content.append(String.format(" left join `%s` `%s` on `%s`.`%s`=`%s`.`%s` ",
                    elementTableName, elementTableAbbrev,
                    tableAbbrev, idProperty.getColumnName(),
                    elementTableAbbrev, joinColumnName));
        }
        content.append(" \";\n");
        return content;
    }

    /**
     * 生成Insert语句
     *
     * @param tableName
     * @param insertFields
     * @return
     */
    @Override
    public StringBuilder generateInsertSQL(String tableName, List<String> insertFields) {
        StringBuilder content = new StringBuilder();
        content.append("public final static String INSERT_SQL=\"insert into `");
        content.append(tableName);
        content.append("` (`");
        content.append(String.join("`,`", insertFields));
        content.append("`) values (?");
        for (int i = 1; i < insertFields.size(); i++) {
            content.append(",?");
        }
        content.append(")\";\n");
        return content;

    }

    /**
     * 生成Update语句
     *
     * @param tableName
     * @param updateColumns
     * @param idColumnName
     * @return
     */
    @Override
    public StringBuilder generateUpdateSQL(String tableName, List<String> updateColumns, String idColumnName) {
        StringBuilder content = new StringBuilder();
        content.append("public final static String UPDATE_SQL=\"update `");
        content.append(tableName);
        content.append("` set ");
        content.append(String.join(",", updateColumns));
        content.append(" where `");
        content.append(idColumnName);
        content.append("`=?\";\n");

        return content;
    }

    /**
     * 生成Delete语句
     *
     * @param entity
     * @return
     */
    @Override
    public StringBuilder generateDeleteSQL(Entity entity) {
        StringBuilder content = new StringBuilder();
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public final static String DELETE_SQL=\"delete from `");
        content.append(entity.getTableName());
        content.append("` where `");
        content.append(idProperty.getColumnName());
        content.append("`=?\";\n");
        return content;
    }

    @Override
    public StringBuilder generateRetrieveByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content = new StringBuilder();
        content.append("select * from `");
        content.append(entity.getTableName());
        content.append("` where ");
        List<String> clauses = new ArrayList<>();
        for (SingleProperty property : indexProperties) {
            clauses.add("`" + property.getColumnName() + "` = ?");
        }
        content.append(String.join(" and ", clauses));
        return content;
    }

    @Override
    public StringBuilder generateCountByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content = new StringBuilder();
        content.append("select count(*) from `");
        content.append(entity.getTableName());
        content.append("` where ");
        List<String> clauses = new ArrayList<>();
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                clauses.add("(`" + property.getColumnName() + "` between ? and ? )");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property)) {
                    clauses.add("`" + property.getColumnName() + "` like ? ");
                }else{
                    clauses.add("`" + property.getColumnName() + "` = ?");
                }
            } else {
                clauses.add("`" + property.getColumnName() + "` = ?");
            }
        }
        content.append(String.join(" and ", clauses));
        return content;
    }

    @Override
    public StringBuilder generateFindByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content = new StringBuilder();
        content.append("select * from `");
        content.append(entity.getTableName());
        content.append("` where ");
        List<String> clauses = new ArrayList<>();
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                clauses.add("(`" + property.getColumnName() + "` between ? and ? )");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property)) {
                    clauses.add("`" + property.getColumnName() + "` like ? ");
                } else{
                    clauses.add("`" + property.getColumnName() + "` = ?");
                }
            } else {
                clauses.add("`" + property.getColumnName() + "` = ?");
            }
        }
        content.append(String.join(" and ", clauses));
        return content;
    }

    @Override
    public StringBuilder generateCountXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content = new StringBuilder();
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("select count(*) from `");
        content.append(mappingEntity.getTableName());
        content.append("` A, `");
        content.append(relationInfo.getMapTable());
        content.append("` B where ");
        content.append(" A.`");
        content.append(mappingEntity.getIdProperty().getColumnName());
        content.append("` = B.`");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append("` and ");
        content.append(" B.`");
        content.append(relationInfo.getIdColumn());
        content.append("` = ?");
        return content;
    }

    @Override
    public StringBuilder generateFindXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content = new StringBuilder();
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("select A.* from `");
        content.append(mappingEntity.getTableName());
        content.append("` A, `");
        content.append(relationInfo.getMapTable());
        content.append("` B where ");
        content.append(" A.`");
        content.append(mappingEntity.getIdProperty().getColumnName());
        content.append("` = B.`");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append("` and ");
        content.append(" B.`");
        content.append(relationInfo.getIdColumn());
        content.append("` = ?");
        return content;
    }

    @Override
    public StringBuilder generateCreateXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content = new StringBuilder();
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("insert into `");
        content.append(relationInfo.getMapTable());
        content.append("` (`");
        content.append(relationInfo.getIdColumn());
        content.append("`,`");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append("`) values (?,?)");

        return content;
    }

    @Override
    public StringBuilder generateDeleteXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content = new StringBuilder();
        Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("delete from `");
        content.append(relationInfo.getMapTable());
        content.append("` where `");
        content.append(relationInfo.getIdColumn());
        content.append("`=? and `");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append("`=?");

        return content;
    }

    @Override
    public StringBuilder generateDeleteByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content = new StringBuilder();
        content.append("delete from `");
        content.append(entity.getTableName());
        content.append("` where ");
        List<String> clauses = new ArrayList<>();
        for (SingleProperty property : indexProperties) {
            if (TypeUtils.isRangeTypeProperty(property)) {
                clauses.add("(`" + property.getColumnName() + "` between ? and ? )");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property.getType())) {
                    clauses.add("`" + property.getColumnName() + "` like ?");
                }else{
                    clauses.add("`" + property.getColumnName() + "` = ?");
                }
            } else {
                clauses.add("`" + property.getColumnName() + "` = ?");
            }
        }
        content.append(String.join(" and ", clauses));
        return content;
    }

    @Override
    public String getQuote() {
        return "`";
    }

    @Override
    public String generateLimitClause(String start, String count) {
        return " limit \"+" + start + "+\",\"+" + count;
    }
}
