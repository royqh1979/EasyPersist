package net.royqh.codegenerator.orm.model;

import net.royqh.codegenerator.orm.model.jpa.CollectionTable;
import net.royqh.codegenerator.orm.model.jpa.Column;
import net.royqh.codegenerator.orm.model.jpa.ElementCollection;

/**
 * Created by Roy on 2016/2/12.
 */
public class ElementCollectionProperty extends CollectionProperty {
    private ElementCollection elementCollection;
    private CollectionTable collectionTable;
    private Column column;

    public ElementCollectionProperty(String name, String type, String collectionType) {
        super(name, type, collectionType);
    }

    public ElementCollection getElementCollection() {
        return elementCollection;
    }

    public void setElementCollection(ElementCollection elementCollection) {
        this.elementCollection = elementCollection;
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.ElementCollection;
    }

    public CollectionTable getCollectionTable() {
        return collectionTable;
    }

    public void setCollectionTable(CollectionTable collectionTable) {
        this.collectionTable = collectionTable;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }
}
