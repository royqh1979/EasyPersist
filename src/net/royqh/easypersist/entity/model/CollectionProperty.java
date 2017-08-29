package net.royqh.easypersist.entity.model;

/**
 * Created by Roy on 2016/2/13.
 */
public abstract class CollectionProperty extends Property {
    private String collectionType;
    public CollectionProperty(String name, String type,String collectionType) {
        super(name, type);
        this.collectionType=collectionType;
    }

    public String getCollectionType() {
        return collectionType;
    }
}
