package net.royqh.easypersist.model.jpa;

/**
 * Created by Roy on 2016/2/10.
 */
public class OneToMany extends RelationShip {
    private String mappedBy="";
    private boolean orphanRemoval=false;
    public OneToMany(String targetEntity) {
        super(targetEntity);
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
