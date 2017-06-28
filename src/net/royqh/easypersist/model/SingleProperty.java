package net.royqh.easypersist.model;

import net.royqh.easypersist.model.jpa.Column;
import org.apache.commons.lang.StringUtils;

import javax.persistence.EnumType;
import javax.persistence.TemporalType;

/**
 * Created by Roy on 2016/2/10.
 */
public class SingleProperty extends Property {
    private Column column;
    private TemporalType temporalType=null;
    private EnumType enumType=null;
    private boolean isLob=false;

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

    public EnumType getEnumType() {
        return enumType;
    }

    public void setEnumType(EnumType enumType) {
        this.enumType = enumType;
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

    public boolean isLob() {
        return isLob;
    }

    public void setLob(boolean lob) {
        isLob = lob;
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.Column;
    }

}
