package net.royqh.codegenerator.orm.model.jpa;

/**
 * Created by Roy on 2016/2/10.
 */
public class ManyToOne extends RelationShip {
    private boolean optional=true;
    public ManyToOne(String targetEntity) {
        super(targetEntity);
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }
}
