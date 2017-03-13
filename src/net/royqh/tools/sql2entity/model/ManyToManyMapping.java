package net.royqh.tools.sql2entity.model;

/**
 * Created by Roy on 2017/2/11.
 */
public class ManyToManyMapping {
    private String mappingTableName;
    private MappingColumn mappingColumn1;
    private MappingColumn mappingColumn2;

    public String getMappingTableName() {
        return mappingTableName;
    }

    public void setMappingTableName(String mappingTableName) {
        this.mappingTableName = mappingTableName;
    }

    public MappingColumn getMappingColumn1() {
        return mappingColumn1;
    }

    public void setMappingColumn1(MappingColumn mappingColumn1) {
        this.mappingColumn1 = mappingColumn1;
    }

    public MappingColumn getMappingColumn2() {
        return mappingColumn2;
    }

    public void setMappingColumn2(MappingColumn mappingColumn2) {
        this.mappingColumn2 = mappingColumn2;
    }
}
