package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.MapRelationInfo;
import net.royqh.easypersist.model.SingleProperty;

import java.util.List;

/**
 * Created by Roy on 2017/2/20.
 */
public abstract class SQLGenerator {
    public abstract StringBuilder generateSimpleSelectSQL(Entity entity);

    public abstract StringBuilder generateSelectAllSQL(Entity entity);

    public abstract StringBuilder  generateFullJoinSelectSQL(Entity entity);

    public abstract StringBuilder generateInsertSQL(String tableName, List<String> insertFields);

    public abstract StringBuilder generateUpdateSQL(String tableName, List<String> updateColumns, String idColumnName);

    public abstract StringBuilder generateDeleteSQL(Entity entity);

    public abstract StringBuilder generateRetrieveByXXXSQL(Entity entity, List<SingleProperty> indexProperties);

    public abstract StringBuilder generateCountByXXXSQL(Entity entity, List<SingleProperty> indexProperties);

    public abstract StringBuilder generateFindByXXXSQL(Entity entity, List<SingleProperty> indexProperties);

    public abstract StringBuilder generateCountXXXMappingSQL(Entity entity, MapRelationInfo relationInfo);

    public abstract StringBuilder generateFindXXXMappingSQL(Entity entity, MapRelationInfo relationInfo);

    public abstract StringBuilder generateCreateXXXMappingSQL(Entity entity, MapRelationInfo relationInfo);

    public abstract StringBuilder generateDeleteXXXMappingSQL(Entity entity, MapRelationInfo relationInfo);

    public abstract StringBuilder generateDeleteByXXXSQL(Entity entity, List<SingleProperty> indexProperties);

    public abstract String getQuote();

    public abstract String generateLimitClause(String start, String count);
}
