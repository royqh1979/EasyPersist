package net.royqh.easypersist.entity.model;

import net.royqh.easypersist.entity.model.jpa.ManyToMany;

/**
 * Created by Roy on 2016/2/13.
 */
public class ManyToManyCollectionProperty extends CollectionProperty {
    private ManyToMany manyToMany;
    public ManyToManyCollectionProperty(String name, String type, String collectionType) {
        super(name, type, collectionType);
    }

    public ManyToMany getManyToMany() {
        return manyToMany;
    }

    public void setManyToMany(ManyToMany manyToMany) {
        this.manyToMany = manyToMany;
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.ManyToMany;
    }
}
