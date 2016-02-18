package net.roy.codegenerator.orm.model;

import net.roy.codegenerator.orm.model.jpa.JoinColumn;
import net.roy.codegenerator.orm.model.jpa.JoinTable;
import net.roy.codegenerator.orm.model.jpa.OneToOne;

/**
 * Created by Roy on 2016/2/13.
 */
public class OneToOneProperty extends Property {
    private OneToOne oneToOne;
    public OneToOneProperty(String name, String type, OneToOne oneToOne) {
        super(name, type);
        this.oneToOne=oneToOne;
    }

    public OneToOne getOneToOne() {
        return oneToOne;
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.OneToOne;
    }
}
