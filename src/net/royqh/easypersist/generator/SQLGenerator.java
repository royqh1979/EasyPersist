package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.*;
import net.royqh.easypersist.model.jpa.Column;
import net.royqh.easypersist.utils.TypeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2016/2/17.
 */
public class SQLGenerator {
    public static StringBuilder generateSimpleSelectSQL(Entity entity) {
        String tableName = entity.getTableName();
        SingleProperty idProperty = entity.getIdProperty();
        StringBuilder content=new StringBuilder();
        content.append("public static final String SIMPLE_SELECT_SQL=");
        content.append("\"select * from " + tableName + "\";\n");
        return content;
    }

    public static StringBuilder  generateFullJoinSelectSQL(Entity entity) {
        String tablePrefix="t";
        String tableName = entity.getTableName();
        SingleProperty idProperty = entity.getIdProperty();
        StringBuilder content=new StringBuilder();
        content.append("public static final String FULL_JOIN_SELECT_SQL=");
        content.append("\"select ");
        String tableAbbrev = "A";
        boolean firstProp = true;
        List<ElementCollectionProperty> elementCollections=new ArrayList<>();
        for (Property property : entity.getProperties()) {
            PropertyType propertyType = property.getPropertyType();
            if (propertyType==PropertyType.Column) {
                    if (!firstProp) {
                        content.append(",");
                    }
                    SingleProperty singleProperty = (SingleProperty) property;
                    content.append(String.format(" %s.%s as %s",
                            tableAbbrev, singleProperty.getColumnName(),
                            CodeUtils.getPropertyVarName(entity, singleProperty)));
            } else if (propertyType == PropertyType.ElementCollection) {
                elementCollections.add((ElementCollectionProperty)property);
            }
            firstProp = false;
        }
        for (int i=0;i<elementCollections.size();i++) {
            String elementTableAbbrev=tablePrefix+i;
            ElementCollectionProperty property=elementCollections.get(i);
            Column column=property.getColumn();
            content.append(",");
            content.append(String.format(" %s.%s as %s ",
                    elementTableAbbrev,column.getName(),CodeUtils.getPropertyVarName(entity,property)));
        }
        content.append(" from " + tableName + " " + tableAbbrev);
        for (int i=0;i<elementCollections.size();i++) {
            ElementCollectionProperty property=elementCollections.get(i);
            String elementTableAbbrev=tablePrefix+i;
            String elementTableName=property.getCollectionTable().getName();
            String joinColumnName=property.getCollectionTable().getJoinColumns()[0].getName();
            content.append(String.format(" left join %s %s on %s.%s=%s.%s ",
                    elementTableName, elementTableAbbrev,
                    tableAbbrev, idProperty.getColumnName(),
                    elementTableAbbrev, joinColumnName));
        }
        content.append( " \";\n");
        return content;
    }

    public static StringBuilder generateInsertSQL(String tableName, List<String> insertFields) {
        StringBuilder content=new StringBuilder();
        content.append("public final static String INSERT_SQL=\"insert into ");
        content.append(tableName);
        content.append("(");
        content.append(String.join(",",insertFields));
        content.append(") values (?");
        for (int i=1;i<insertFields.size();i++) {
            content.append(",?");
        }
        content.append(")\";\n");
        return content;

    }

    public static StringBuilder generateUpdateSQL(String tableName, List<String> updateColumns, String idColumnName) {
        StringBuilder content=new StringBuilder();
        content.append("public final static String UPDATE_SQL=\"update ");
        content.append(tableName);
        content.append(" set ");
        content.append(String.join(",",updateColumns));
        content.append(" where ");
        content.append(idColumnName);
        content.append("=?\";\n");

        return content;
    }

    public static StringBuilder generateDeleteSQL(Entity entity) {
        StringBuilder content=new StringBuilder();
        SingleProperty idProperty=entity.getIdProperty();
        content.append("public final static String DELETE_SQL=\"delete from ");
        content.append(entity.getTableName());
        content.append(" where ");
        content.append(idProperty.getColumnName());
        content.append("=?\";");
        return content;
    }

    public static StringBuilder generateRetrieveByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content=new StringBuilder();
        content.append("select * from ");
        content.append(entity.getTableName());
        content.append(" where ");
        List<String> clauses=new ArrayList<>();
        for (SingleProperty property:indexProperties) {
            clauses.add(property.getColumnName()+" = ?");
        }
        content.append(String.join(" and ",clauses));
        return content;
    }

    public static StringBuilder generateCountByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content=new StringBuilder();
        content.append("select count(*) from ");
        content.append(entity.getTableName());
        content.append(" where ");
        List<String> clauses=new ArrayList<>();
        for (SingleProperty property:indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                clauses.add("(" + property.getColumnName() + " between ? and ? )");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    clauses.add(property.getColumnName() + " like ?");
                }
                continue;
            }  else {
                clauses.add(property.getColumnName() + " = ?");
            }
        }
        content.append(String.join(" and ",clauses));
        return content;
    }

    public static StringBuilder generateFindByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content=new StringBuilder();
        content.append("select * from ");
        content.append(entity.getTableName());
        content.append(" where ");
        List<String> clauses=new ArrayList<>();
        for (SingleProperty property:indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                clauses.add("(" + property.getColumnName() + " between ? and ? )");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isStringType(property)) {
                    clauses.add(property.getColumnName() + " like ?");
                }
                continue;
            } else{
                clauses.add(property.getColumnName() + " = ?");
            }
        }
        content.append(String.join(" and ",clauses));
        return content;
    }

    public static StringBuilder generateCountXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content=new StringBuilder();
        Entity mappingEntity=entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("select count(*) from ");
        content.append(mappingEntity.getTableName());
        content.append(" A, ");
        content.append(relationInfo.getMapTable());
        content.append(" B where ");
        content.append(" A.");
        content.append(mappingEntity.getIdProperty().getColumnName());
        content.append(" = B.");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append(" and ");
        content.append(" B.");
        content.append(relationInfo.getIdColumn());
        content.append(" = ?");
        return content;
    }

    public static StringBuilder generateFindXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content=new StringBuilder();
        Entity mappingEntity=entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("select A.* from ");
        content.append(mappingEntity.getTableName());
        content.append(" A, ");
        content.append(relationInfo.getMapTable());
        content.append(" B where ");
        content.append(" A.");
        content.append(mappingEntity.getIdProperty().getColumnName());
        content.append(" = B.");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append(" and ");
        content.append(" B.");
        content.append(relationInfo.getIdColumn());
        content.append(" = ?");
        return content;
    }

    public static StringBuilder generateCreateXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content=new StringBuilder();
        Entity mappingEntity=entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("insert into ");
        content.append(relationInfo.getMapTable());
        content.append("(");
        content.append(relationInfo.getIdColumn());
        content.append(",");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append(") values (?,?)");

        return content;
    }

    public static StringBuilder generateDeleteXXXMappingSQL(Entity entity, MapRelationInfo relationInfo) {
        StringBuilder content=new StringBuilder();
        Entity mappingEntity=entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
        content.append("delete from ");
        content.append(relationInfo.getMapTable());
        content.append(" where ");
        content.append(relationInfo.getIdColumn());
        content.append("=? and ");
        content.append(relationInfo.getMappingEntityIdColumn());
        content.append("=?");

        return content;
    }

    public static StringBuilder generateDeleteByXXXSQL(Entity entity, List<SingleProperty> indexProperties) {
        StringBuilder content=new StringBuilder();
        content.append("select delete from ");
        content.append(entity.getTableName());
        content.append(" where ");
        List<String> clauses=new ArrayList<>();
        for (SingleProperty property:indexProperties) {
            if (TypeUtils.isRangeType(property)) {
                clauses.add("(" + property.getColumnName() + " between ? and ? )");
            } else if (property.getColumn().isUnique()) {
                if (TypeUtils.isString(property.getType()))  {
                    clauses.add(property.getColumnName() + " like ?");
                }
                continue;
            }  else {
                clauses.add(property.getColumnName() + " = ?");
            }
        }
        content.append(String.join(" and ",clauses));
        return content;
    }
}
