package net.royqh.parser.postgresql.model;

import java.util.*;

/**
 * Created by Roy on 2017/2/4.
 */
public class Table {
    private String name;
    private Map<String,Column> columnMap=new HashMap<>();
    private List<Index> indexs=new ArrayList<>();
    private List<ForeignKey> foreignKeys=new ArrayList<>();
    private List<Check> checks=new ArrayList<>();

    public Table(String name) {
        this.name = name;
    }

    public Collection<Column> getColumns() {
        return columnMap.values();
    }

    public Column getColumn(String columnName) {
        return columnMap.get(columnName);
    }

    public String getName() {
        return name;
    }

    public List<Index> getIndexs() {
        return indexs;
    }

    public List<ForeignKey> getForeignKeys() {
        return foreignKeys;
    }

    public List<Check> getChecks() {
        return checks;
    }

    public void addColumn(Column column) {
        columnMap.put(column.getName(),column);
    }

    public void addIndex(Index index) {
        indexs.add(index);
    }

    public void addForeignKey(ForeignKey foreignKey) {
        foreignKeys.add(foreignKey);
    }

    public void addCheck(Check check) {
        checks.add(check);
    }
}
