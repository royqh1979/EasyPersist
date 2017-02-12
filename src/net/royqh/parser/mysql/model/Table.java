package net.royqh.parser.mysql.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2017/2/4.
 */
public class Table {
    private String name;
    private List<Column> columns=new ArrayList<>();
    private List<Index> indexs=new ArrayList<>();
    private List<ForeignKey> foreignKeys=new ArrayList<>();
    private List<Check> checks=new ArrayList<>();

    public Table(String name) {
        this.name = name;
    }

    public List<Column> getColumns() {
        return columns;
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
        columns.add(column);
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
