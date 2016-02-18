package net.roy.codegenerator.orm.model.jpa;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;

/**
 * Created by Roy on 2016/2/14.
 */
public class ManyToMany extends RelationShip {
    private String mappedBy="";
    public ManyToMany(String targetEntity) {
        super(targetEntity);
    }

    public String getMappedBy() {
        return mappedBy;
    }

    public void setMappedBy(String mappedBy) {
        this.mappedBy = mappedBy;
    }
}
