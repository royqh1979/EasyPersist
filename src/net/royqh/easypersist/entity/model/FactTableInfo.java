package net.royqh.easypersist.entity.model;

/**
 * Created by roy on 2017/9/6.
 */
public class FactTableInfo {
    private ReferenceSingleProperty entityKeyProperty;
    private ReferenceSingleProperty propertyKeyProperty;
    private SingleProperty valueProperty;

    public ReferenceSingleProperty getEntityKeyProperty() {
        return entityKeyProperty;
    }

    public void setEntityKeyProperty(ReferenceSingleProperty entityKeyProperty) {
        this.entityKeyProperty = entityKeyProperty;
    }

    public ReferenceSingleProperty getPropertyKeyProperty() {
        return propertyKeyProperty;
    }

    public void setPropertyKeyProperty(ReferenceSingleProperty propertyKeyProperty) {
        this.propertyKeyProperty = propertyKeyProperty;
    }

    public SingleProperty getValueProperty() {
        return valueProperty;
    }

    public void setValueProperty(SingleProperty valueProperty) {
        this.valueProperty = valueProperty;
    }
}
