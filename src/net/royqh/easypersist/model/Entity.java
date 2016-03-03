package net.royqh.easypersist.model;

import net.royqh.easypersist.MappingRepository;
import net.royqh.easypersist.model.jpa.ModelError;
import net.royqh.easypersist.model.jpa.Table;
import org.apache.commons.lang.StringUtils;

import javax.persistence.AccessType;
import java.util.*;

/**
 * Entity Class for keeping mapping info
 * Created by Roy on 2016/2/10.
 */
public class Entity {
    private Table table;
    private ClassInfo classInfo;
    private String name;
    private String idProperty;
    private Map<String,Property> propertyMap =new HashMap<>();
    private Map<String,String> columnPropertyMap = new HashMap<>();
    private Set<IndexInfo> indexes =new HashSet<>();
    private AccessType accessType=AccessType.PROPERTY;
    private MappingRepository mappingRepository;
    private boolean autoGenerateId=false;

    public Entity(String name, ClassInfo classInfo) {
        this.name=name;
        this.classInfo=classInfo;
    }

    public String getName() {
        return name;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        if (accessType==AccessType.FIELD) {
            throw new ModelError(
                    String.format("Class %s: @Access(type=Field) is not supported",
                            getClassInfo().getQualifiedName()));
        }
        this.accessType = accessType;
    }

    public Collection<Property> getProperties() {
        return propertyMap.values();
    }

    public SingleProperty getIdProperty() {
        return (SingleProperty)propertyMap.get(idProperty);
    }

    public void setIdProperty(String propertyName) {
        this.idProperty = propertyName;
    }

    public Property getProperty(String propertyName) {
        return propertyMap.get(propertyName);
    }

    public MappingRepository getMappingRepository() {
        return mappingRepository;
    }

    public void setMappingRepository(MappingRepository mappingRepository) {
        this.mappingRepository = mappingRepository;
    }

    public void removeProperty(String propertyName) {
        Property property=propertyMap.get(propertyName);
        propertyMap.remove(propertyName);
        if (property.getPropertyType() == PropertyType.Column) {
            SingleProperty singleProperty=(SingleProperty)property;
            columnPropertyMap.remove(singleProperty.getColumnName());
        }

    }

    public void addProperty(Property property) {
        propertyMap.put(property.getName(),property);
        if (property.getPropertyType() == PropertyType.Column) {
            SingleProperty singleProperty=(SingleProperty)property;
            columnPropertyMap.put(singleProperty.getColumnName(),property.getName());
        }
    }

    public SingleProperty getPropertyByColumnName(String columnName) {
        String propertyName=columnPropertyMap.get(columnName);
        return (SingleProperty)getProperty(propertyName);
    }

    public void addIndex(IndexInfo indexInfo) {
        indexes.add(indexInfo);
    }

    public Set<IndexInfo> getIndexes() {
        return indexes;
    }

    public String getTableName() {
        String name;
        if (StringUtils.isEmpty(getTable().getName())){
            name=getName();
        } else {
            name=getTable().getName();
        }
        if (!StringUtils.isEmpty(getTable().getSchema())) {
            return getTable().getSchema()+"."+name;
        }
        if (!StringUtils.isEmpty(getTable().getCatalog())){
            return getTable().getCatalog()+"."+name;
        }
        return name;
    }

    public boolean isAutoGenerateId() {
        return autoGenerateId;
    }

    public void setAutoGenerateId(boolean autoGenerateId) {
        this.autoGenerateId = autoGenerateId;
    }

}
