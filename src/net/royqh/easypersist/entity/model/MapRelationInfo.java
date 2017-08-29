package net.royqh.easypersist.entity.model;

/**
 * Created by Roy on 2016/8/22.
 */
public class MapRelationInfo {
    private String mapTable;
    private String MappingEntityFullClassName;
    private String MappingEntityIdColumn;
    private String IdColumn;

    public String getMapTable() {
        return mapTable;
    }

    public void setMapTable(String mapTable) {
        this.mapTable = mapTable;
    }

    public String getMappingEntityFullClassName() {
        return MappingEntityFullClassName;
    }

    public void setMappingEntityFullClassName(String mappingEntityFullClassName) {
        MappingEntityFullClassName = mappingEntityFullClassName;
    }

    public String getMappingEntityIdColumn() {
        return MappingEntityIdColumn;
    }

    public void setMappingEntityIdColumn(String mappingEntityIdColumn) {
        MappingEntityIdColumn = mappingEntityIdColumn;
    }

    public String getIdColumn() {
        return IdColumn;
    }

    public void setIdColumn(String idColumn) {
        IdColumn = idColumn;
    }
}
