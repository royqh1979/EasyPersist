package net.royqh.codegenerator.orm.model.config;

/**
 * Created by Roy on 2016/2/11.
 */
public class EntitiesConfig {
    private String entityPackage="";
    private String outputPackage="";

    public final static EntitiesConfig EMPTY_CONFIG=new EntitiesConfig();

    public String getEntityPackage() {
        return entityPackage;
    }

    public String getOutputPackage() {
        return outputPackage;
    }

    public void setEntityPackage(String entityPackage) {
        this.entityPackage = entityPackage;
    }

    public void setOutputPackage(String outputPackage) {
        this.outputPackage = outputPackage;
    }

    @Override
    public String toString() {
        return "EntitiesConfig{" +
                "entityPackage='" + entityPackage + '\'' +
                ", outputPackage='" + outputPackage + '\'' +
                '}';
    }
}
