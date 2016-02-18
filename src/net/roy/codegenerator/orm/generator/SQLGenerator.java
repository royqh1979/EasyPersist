package net.roy.codegenerator.orm.generator;

import net.roy.codegenerator.orm.model.*;
import net.roy.codegenerator.orm.model.jpa.Column;
import net.roy.codegenerator.orm.model.jpa.ElementCollection;

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
}
