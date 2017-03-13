package net.royqh.parser.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2017/2/4.
 */
public class ForeignKey {
    private String name=null;
    private String refTable;
    private List<String> columns=new ArrayList<>();
    private List<String>  refColumns=new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRefTable() {
        return refTable;
    }

    public List<String> getRefColumns() {
        return refColumns;
    }

    public void addRefColumn(String columnName) {
        refColumns.add(columnName);
    }

    public void setRefTable(String refTable) {
        this.refTable = refTable;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void addColumn(String columnName) {
        columns.add(columnName);
    }
}
