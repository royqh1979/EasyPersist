package net.royqh.easypersist.model;

import net.royqh.easypersist.model.jpa.Column;

/**
 * Created by Roy on 2017/6/24.
 */
public class ReferenceSingleProperty extends SingleProperty {
    private String RefEntityFullClassName;
    private String RefEntityColumnName;
    public ReferenceSingleProperty(String name, String type, Column column) {
        super(name, type, column);
    }

    public String getRefEntityFullClassName() {
        return RefEntityFullClassName;
    }

    public void setRefEntityFullClassName(String refEntityFullClassName) {
        RefEntityFullClassName = refEntityFullClassName;
    }

    public String getRefEntityColumnName() {
        return RefEntityColumnName;
    }

    public void setRefEntityColumnName(String refEntityColumnName) {
        RefEntityColumnName = refEntityColumnName;
    }
}
