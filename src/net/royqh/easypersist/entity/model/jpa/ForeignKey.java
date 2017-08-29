package net.royqh.easypersist.entity.model.jpa;

import javax.persistence.ConstraintMode;

/**
 * Created by Roy on 2016/2/10.
 */
public class ForeignKey {
    private String name="";
    private String foreignKeyDefinition="";
    private ConstraintMode constraintMode=ConstraintMode.CONSTRAINT;

    public static final ForeignKey CONSTRAINT_FOREIGN_KEY =new ForeignKey();
    public static final ForeignKey PROVIDER_DEFAULT_FOREIGN_KEY;
    static {
        PROVIDER_DEFAULT_FOREIGN_KEY=new ForeignKey();
        PROVIDER_DEFAULT_FOREIGN_KEY.setConstraintMode(ConstraintMode.PROVIDER_DEFAULT);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForeignKeyDefinition() {
        return foreignKeyDefinition;
    }

    public void setForeignKeyDefinition(String foreignKeyDefinition) {
        this.foreignKeyDefinition = foreignKeyDefinition;
    }

    public ConstraintMode getConstraintMode() {
        return constraintMode;
    }

    public void setConstraintMode(ConstraintMode constraintMode) {
        this.constraintMode = constraintMode;
    }
}
