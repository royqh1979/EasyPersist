package net.royqh.easypersist.entity.model;

import org.apache.commons.lang.StringUtils;

/**
 * Created by Roy on 2016/2/10.
 */
public abstract class Property {
    private String name;
    private String chineseAlias=null;
    private String type;
    private String getter;
    private String setter;

    public Property(String name, String type) {
        this.name = name;
        this.type = type;
        this.setter="set"+ StringUtils.capitalize(name);
        this.getter="get"+StringUtils.capitalize(name);
    }

    public String getChineseAlias() {
        return chineseAlias;
    }

    public void setChineseAlias(String chineseAlias) {
        this.chineseAlias = chineseAlias;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getSetter() {
        return setter;
    }

    public abstract PropertyType getPropertyType();

    public boolean isReferenceProperty() {
        return false;
    }

    public boolean isColumnProperty() { return false;}
    
}
