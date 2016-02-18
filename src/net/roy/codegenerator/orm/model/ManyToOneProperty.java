package net.roy.codegenerator.orm.model;

import net.roy.codegenerator.orm.model.jpa.JoinColumn;
import net.roy.codegenerator.orm.model.jpa.JoinTable;
import net.roy.codegenerator.orm.model.jpa.ManyToOne;

/**
 * Created by Roy on 2016/2/13.
 */
public class ManyToOneProperty extends Property {
    private ManyToOne manyToOne;
    public ManyToOneProperty(String name, String type, ManyToOne manyToOne) {
        super(name, type);
        this.manyToOne=manyToOne;
    }

    public ManyToOne getManyToOne() {
        return manyToOne;
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.ManyToOne;
    }
}
