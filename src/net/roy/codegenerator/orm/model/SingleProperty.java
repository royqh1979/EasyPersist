package net.roy.codegenerator.orm.model;

import net.roy.codegenerator.orm.model.Property;
import net.roy.codegenerator.orm.model.jpa.Column;
import org.apache.commons.lang.StringUtils;

import javax.persistence.TemporalType;

/**
 * Created by Roy on 2016/2/10.
 */
public class SingleProperty extends Property {
    private Column column;
    private TemporalType temporalType=null;

    public SingleProperty(String name, String type, Column column) {
        super(name,type);
        this.column=column;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public TemporalType getTemporalType() {
        return temporalType;
    }

    public void setTemporalType(TemporalType temporalType) {
        this.temporalType = temporalType;
    }


    public String getColumnName() {
        if (column==null) {
            return getName();
        }
        if (StringUtils.isEmpty(getColumn().getName())){
            return getName();
        }
        return getColumn().getName();
    }


    @Override
    public PropertyType getPropertyType() {
        return PropertyType.Column;
    }
}
