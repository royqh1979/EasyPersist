package net.royqh.easypersist.entity.model;

/**
 * Created by Roy on 2017/7/12.
 */
public class SubEntityInfo {
    private String entityClassName;
    private ReferenceSingleProperty subEntityReferenceProperty;
    private Entity subEntity;

    public SubEntityInfo(String entityClassName) {
        this.entityClassName = entityClassName;
    }

    public void setSubEntityReferenceProperty(ReferenceSingleProperty subEntityReferenceProperty) {
        this.subEntityReferenceProperty = subEntityReferenceProperty;
    }

    public String getEntityClassName() {
        return entityClassName;
    }

    public ReferenceSingleProperty getSubEntityReferenceProperty() {
        return subEntityReferenceProperty;
    }

    public Entity getSubEntity() {
        return subEntity;
    }

    public void setSubEntity(Entity subEntity) {
        this.subEntity = subEntity;
    }
}
