package net.royqh.easypersist.model;

/**
 * Created by Roy on 2017/7/12.
 */
public class SubEntityInfo {
    private String entityClassName;
    private String subEntityReferenceProperty;

    public SubEntityInfo(String entityClassName) {
        this.entityClassName = entityClassName;
    }

    public void setSubEntityReferenceProperty(String subEntityReferenceProperty) {
        this.subEntityReferenceProperty = subEntityReferenceProperty;
    }

    public String getEntityClassName() {
        return entityClassName;
    }

    public String getSubEntityReferenceProperty() {
        return subEntityReferenceProperty;
    }
}
