package net.roy.codegenerator.orm.model.jpa;

import java.util.Arrays;

/**
 * Created by Roy on 2016/2/10.
 */
public class Table {
    private String name="";
    private String schema="";
    private String catalog="";
    private Index[] indexes={};
    private UniqueConstraint[] uniqueConstraints={};

    public String getName() {
        return name;
    }

    public String getSchema() {
        return schema;
    }

    public String getCatalog() {
        return catalog;
    }

    public Index[] getIndexes() {
        return indexes;
    }

    public UniqueConstraint[] getUniqueConstraints() {
        return uniqueConstraints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public void setIndexes(Index[] indexes) {
        this.indexes = indexes;
    }

    public void setUniqueConstraints(UniqueConstraint[] uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", schema='" + schema + '\'' +
                ", catalog='" + catalog + '\'' +
                ", indexes=" + Arrays.toString(indexes) +
                ", uniqueConstraints=" + Arrays.toString(uniqueConstraints) +
                '}';
    }
}
