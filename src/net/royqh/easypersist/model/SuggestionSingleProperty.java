package net.royqh.easypersist.model;

import net.royqh.easypersist.model.jpa.Column;

/**
 * Created by Roy on 2017/6/24.
 */
public class SuggestionSingleProperty extends SingleProperty {
    private String refEntityFullClassName;
    private String refEntityColumnName;
    public SuggestionSingleProperty(String name, String type, Column column) {
        super(name, type, column);
    }

    public String getRefEntityFullClassName() {
        return refEntityFullClassName;
    }

    public void setRefEntityFullClassName(String refEntityFullClassName) {
        this.refEntityFullClassName = refEntityFullClassName;
    }

    public String getRefEntityColumnName() {
        return refEntityColumnName;
    }

    public void setRefEntityColumnName(String refEntityColumnName) {
        this.refEntityColumnName = refEntityColumnName;
    }

    @Override
    public boolean isSuggestionProperty() {
        return true;
    }
}
