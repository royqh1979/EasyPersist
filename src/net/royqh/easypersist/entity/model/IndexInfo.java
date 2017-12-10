package net.royqh.easypersist.entity.model;

import java.util.Set;

/**
 * Created by Roy on 2016/3/3.
 */
public class IndexInfo {
    Set<String> properties;
    boolean unique;
    String name="";
    String id="";

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public void setProperties(Set<String> properties) {
        this.properties = properties;
        if (properties==null) {
            id="";
        } else {
            StringBuilder sb=new StringBuilder();
            for (String p:properties) {
                sb.append(p);
            }
            id=sb.toString();
        }
    }

    public Set<String> getProperties() {
        return properties;
    }

    public String getId() {
        return id;
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

        return id.equals(indexInfo.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
