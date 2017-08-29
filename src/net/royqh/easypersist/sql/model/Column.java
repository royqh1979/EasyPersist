package net.royqh.easypersist.sql.model;

/**
 * Created by Roy on 2017/2/4.
 */
public class Column {
    private String name;
    private String type;
    private boolean notNull=false;
    private boolean autoIncrement=false;
    private boolean unique=false;
    private boolean primaryKey=false;
    private String defaultValue;
    private String comment;
    private String collate;
    private ColumnReference reference=null;
    private String check;

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public Column(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNotNull(boolean notNull) {
        this.notNull = notNull;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isNotNull() {
        return notNull;
    }

    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    public boolean isUnique() {
        return unique;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getComment() {
        return comment;
    }

    public String getCollate() {
        return collate;
    }

    public void setCollate(String collate) {
        this.collate = collate;
    }

    public ColumnReference getReference() {
        return reference;
    }

    public void setReference(ColumnReference reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Column column = (Column) o;

        return name.equals(column.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
