package net.royqh.easypersist.entity.model;

/**
 * Created by roy on 2017/9/6.
 */
public class FactTable {
    private SingleProperty entityKeyProperty;
    private SingleProperty propertyKeyProperty;

    public SingleProperty getEntityKeyProperty() {
        return entityKeyProperty;
    }

    public void setEntityKeyProperty(SingleProperty entityKeyProperty) {
        this.entityKeyProperty = entityKeyProperty;
    }

    public SingleProperty getPropertyKeyProperty() {
        return propertyKeyProperty;
    }

    public void setPropertyKeyProperty(SingleProperty propertyKeyProperty) {
        this.propertyKeyProperty = propertyKeyProperty;
    }
}
