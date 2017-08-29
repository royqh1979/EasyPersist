package net.royqh.easypersist.sql.model;

import java.util.*;

/**
 * Created by Roy on 2017/2/4.
 */
public class Table {
    private String name;
    private Map<String,Column> columns=new HashMap<>();
    private List<Index> indexs=new ArrayList<>();
    private List<ForeignKey> foreignKeys=new ArrayList<>();
    private List<Check> checks=new ArrayList<>();
    private Set<IndexColumnsSet> indexedColumnsSet=new HashSet<>();

    public Table(String name) {
        this.name = name;
    }


    public Collection<Column> getColumns() {
        return columns.values();
    }

    public Column getColumn(String name) {
        return columns.get(name);
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
        columns.put(column.getName(),column);
        if (column.isPrimaryKey() || column.isUnique() ) {
            addIndexedColumns(column.getName());
        }
    }

    private void addIndexedColumns(String columnName) {
        //System.out.println("Add indexed Column "+columnName+" to table "+getName());
        IndexColumnsSet set = new IndexColumnsSet();
        set.add(columnName);
        if (indexedColumnsSet.contains(set)) {
            throw new RuntimeException("Column " + columnName + " in table " + getName() + " has indexed/referenced!");
        }
        indexedColumnsSet.add(set);
    }

    private void addIndexedColumns(Collection<String> columnNames) {
       // System.out.println("Add indexed Columns "+String.join(",",columnNames)+" to table "+getName());
        IndexColumnsSet set = new IndexColumnsSet();
        set.addAll(columnNames);
        if (indexedColumnsSet.contains(set)) {
            throw new RuntimeException("Columns " + String.join(",",columnNames) + " in table " + getName() + " has indexed/referenced!");
        }
        indexedColumnsSet.add(set);
    }

    public void addIndex(Index index) {
       // System.out.println("add index:"+String.join(",",index.getColumns()));
        addIndexedColumns(index.getColumns());
        indexs.add(index);
    }

    public void addForeignKey(ForeignKey foreignKey) {
       // System.out.println("add foreign key:"+String.join(",",foreignKey.getColumns()));
        addIndexedColumns(foreignKey.getColumns());
        foreignKeys.add(foreignKey);
    }

    public void addCheck(Check check) {
        checks.add(check);
    }
}
