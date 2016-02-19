package net.royqh.codegenerator.orm.model.jpa;

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
