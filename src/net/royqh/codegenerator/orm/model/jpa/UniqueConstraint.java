package net.royqh.codegenerator.orm.model.jpa;

/**
 * Created by Roy on 2016/2/10.
 */
public class UniqueConstraint {
    private String name="";
    private String[] columnNames={};

    public String getName() {
        return name;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }
}
