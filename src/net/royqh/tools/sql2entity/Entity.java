package net.royqh.tools.sql2entity;

import net.royqh.parser.postgresql.model.Column;
import net.royqh.parser.postgresql.model.Table;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

import java.util.Collection;

/**
 * Created by Roy on 2017/2/10.
 */
public class Entity {
    String name;
    String tableName;
    BidiMap<String,String> propertyColumnMap=new DualHashBidiMap<>();

    public Entity(String name, Table table) {
        this.name = name;
        this.tableName = table.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProperty(String propertyName,Column column) {
        propertyColumnMap.put(propertyName,column.getName());
    }

    public String getPropertyByColumnName(String columnName) {
        return propertyColumnMap.getKey(columnName);
    }

    public String getColumnByPropertyName(String propertyName) {
        return propertyColumnMap.get(propertyName);
    }

    public Collection<String> getProperties() {
        return propertyColumnMap.values();
    }

    public String getTableName() {
        return tableName;
    }
}
