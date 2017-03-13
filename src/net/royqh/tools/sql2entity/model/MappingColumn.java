package net.royqh.tools.sql2entity.model;

/**
 * Created by Roy on 2017/2/11.
 */
public class MappingColumn {
    private String columnName;
    private String RefTable;
    private String RefColumn;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getRefTable() {
        return RefTable;
    }

    public void setRefTable(String refTable) {
        RefTable = refTable;
    }

    public String getRefColumn() {
        return RefColumn;
    }

    public void setRefColumn(String refColumn) {
        RefColumn = refColumn;
    }
}
