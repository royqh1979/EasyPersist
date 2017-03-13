package net.royqh.parser.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roy on 2017/2/9.
 */
public class Model {
    Map<String, Table> tableMap=new HashMap<>();

    public void clear() {
        tableMap.clear();
    }

    public void addTable(Table table) {
        if (tableMap.containsKey(table.getName())){
            throw new RuntimeException("Table "+table.getName()+" is duplicated!");
        }
        tableMap.put(table.getName(),table);
    }

    public Table getTable(String tableName) {
        return tableMap.get(tableName);
    }

    public Map<String, Table> getTableMap() {
        return tableMap;
    }

    public Collection<Table> getTables() {
        return tableMap.values();
    }
}
