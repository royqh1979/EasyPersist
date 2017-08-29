package net.royqh.easypersist.entity.model;

import net.royqh.easypersist.entity.model.jpa.OneToMany;

/**
 * Created by Roy on 2016/2/13.
 */
public class OneToManyCollectionProperty extends CollectionProperty {
    private OneToMany oneToMany;
    public OneToManyCollectionProperty(String name, String type, String collectionType) {
        super(name, type, collectionType);
    }

    public OneToMany getOneToMany() {
        return oneToMany;
    }

    public void setOneToMany(OneToMany oneToMany) {
        this.oneToMany = oneToMany;
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.OneToMany;
    }
}
