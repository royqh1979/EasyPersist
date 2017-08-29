package net.royqh.easypersist.entity.model.jpa;

/**
 * Created by Roy on 2016/2/10.
 */
public class Index {
    private String name="";
    private boolean unique=false;
    private String columnList;

    public String getName() {
        return name;
    }

    public boolean isUnique() {
        return unique;
    }

    public String getColumnList() {
        return columnList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public void setColumnList(String columnList) {
        this.columnList = columnList;
    }

}
