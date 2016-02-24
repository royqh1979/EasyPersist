package net.royqh.easypersist.model.jpa;

/**
 * Created by Roy on 2016/2/18.
 */
public class CollectionTable {
    private String name="";
    private String catalog="";
    private String schema="";
    private JoinColumn[] joinColumns;
    private UniqueConstraint[] uniqueConstraints;
    private Index[] indexes;
    private ForeignKey foreignKey = ForeignKey.PROVIDER_DEFAULT_FOREIGN_KEY;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public JoinColumn[] getJoinColumns() {
        return joinColumns;
    }

    public void setJoinColumns(JoinColumn[] joinColumns) {
        this.joinColumns = joinColumns;
    }

    public UniqueConstraint[] getUniqueConstraints() {
        return uniqueConstraints;
    }

    public void setUniqueConstraints(UniqueConstraint[] uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
    }

    public Index[] getIndexes() {
        return indexes;
    }

    public void setIndexes(Index[] indexes) {
        this.indexes = indexes;
    }

    public ForeignKey getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(ForeignKey foreignKey) {
        this.foreignKey = foreignKey;
    }
}
