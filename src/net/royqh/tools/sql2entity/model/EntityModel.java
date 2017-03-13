package net.royqh.tools.sql2entity.model;

import net.royqh.parser.model.Table;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

import java.util.*;

/**
 * Created by Roy on 2017/2/10.
 */
public class EntityModel {
    private BidiMap<String,String> entityTableMap =new DualHashBidiMap<>();
    private Map<String,Entity> entityMap=new HashMap<>();
    private List<ManyToManyMapping> manyToMayMappingList=new ArrayList<>();
    private Set<String> mappingTableSet =new HashSet<>();

    public void addEntity(Entity entity) {
        entityTableMap.put(entity.getName(),entity.getTableName());
        entityMap.put(entity.getName(),entity);
    }

    public Collection<Entity> getEntities() {
        return entityMap.values();
    }

    public String getEntityNameByTable(String tableName) {
        return entityTableMap.getKey(tableName);
    }

    public Entity getEntityByTableName(String tableName) {
        return entityMap.get(getEntityNameByTable(tableName));
    }

    public String getTableNameByEntity(String entityName) {
        return entityTableMap.get(entityName);
    }

    public Entity getEntityByName(String entityName) {
        return entityMap.get(entityName);
    }

    public List<ManyToManyMapping> getManyToMayMappings() {
        return manyToMayMappingList;
    }

    public void addManyToManyMapping(ManyToManyMapping mapping) {
        manyToMayMappingList.add(mapping);
        mappingTableSet.add(mapping.getMappingTableName());
    }

    public boolean isMappingTable(Table table) {
        return mappingTableSet.contains(table.getName());
    }


}
