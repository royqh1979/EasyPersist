package net.roy.codegenerator.orm.model.jpa;

/**
 * Created by Roy on 2016/2/10.
 */
public class OneToOne extends RelationShip {
    private boolean optional=true;
    private String mappedBy="";
    private boolean orphanRemoval=false;
    public OneToOne(String targetEntity) {
        super(targetEntity);
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public String getMappedBy() {
        return mappedBy;
    }

    public void setMappedBy(String mappedBy) {
        this.mappedBy = mappedBy;
    }

    public boolean isOrphanRemoval() {
        return orphanRemoval;
    }

    public void setOrphanRemoval(boolean orphanRemoval) {
        this.orphanRemoval = orphanRemoval;
    }
}
