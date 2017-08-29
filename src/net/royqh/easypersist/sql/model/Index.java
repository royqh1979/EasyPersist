package net.royqh.easypersist.sql.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2017/2/4.
 */
public class Index {
    private String name=null;

    private Type type;
    private List<String> columns=new ArrayList<>();

    public Index(Type type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void addColumn(String columnName) {
        columns.add(columnName);
    }

    public List<String> getColumns() {
        return columns;
    }

    public enum Type{
        PrimaryKey,
        Unique,
        Index,
        FullText,
        Exclude,  
        Spatial
    }
}
