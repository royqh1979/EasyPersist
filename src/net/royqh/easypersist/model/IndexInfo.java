package net.royqh.easypersist.model;

import java.util.Set;

/**
 * Created by Roy on 2016/3/3.
 */
public class IndexInfo {
    Set<String> properties;
    boolean unique;
    String name="";

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public void setProperties(Set<String> properties) {
        this.properties = properties;
    }

    public Set<String> getProperties() {
        return properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndexInfo indexInfo = (IndexInfo) o;

        return !(properties != null ? !properties.equals(indexInfo.properties) : indexInfo.properties != null);

    }

    @Override
    public int hashCode() {
        return properties != null ? properties.hashCode() : 0;
    }
}
