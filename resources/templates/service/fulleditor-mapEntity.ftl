<#assign mapEntity=entity.getMappingRepository().findEntityByClass(relationInfo.mappingEntityFullClassName) >
public int count${mapEntity.classInfo.name}(${entity.idProperty.type} id){
    return persistor.count${mapEntity.classInfo.name}(id);
}

public List<${mapEntity.classInfo.name}> find${mapEntity.classInfo.name}(${entity.idProperty.type} id, String orderBy, SortType sortType, Pager pager){
    return persistor.find${mapEntity.classInfo.name}WithSort(id,orderBy,sortType==SortType.asc, pager.getStartRow(), pager.getPageSize());
}

public void add${mapEntity.classInfo.name}To${entity.classInfo.name}(${entity.idProperty.type} id,${mapEntity.idProperty.type} ${mapEntity.name}Id) {
    persistor.add${mapEntity.classInfo.name}To${entity.classInfo.name}(id, ${mapEntity.name}Id);
}

public void add${mapEntity.classInfo.name}sTo${entity.classInfo.name}(${entity.idProperty.type} id,Iterable<${templateUtils.getObjectType(mapEntity.idProperty.type)}> ${mapEntity.name}Ids) {
    persistor.add${mapEntity.classInfo.name}sTo${entity.classInfo.name}(id, ${mapEntity.name}Ids);
}

public void delete${mapEntity.classInfo.name}From${entity.classInfo.name}(${entity.idProperty.type} id,${mapEntity.idProperty.type} ${mapEntity.name}Id) {
    persistor.delete${mapEntity.classInfo.name}From${entity.classInfo.name}(id, ${mapEntity.name}Id);
}

public void delete${mapEntity.classInfo.name}sFrom${entity.classInfo.name}(${entity.idProperty.type} id,Iterable<${templateUtils.getObjectType(mapEntity.idProperty.type)}> ${mapEntity.name}Ids) {
    persistor.delete${mapEntity.classInfo.name}sFrom${entity.classInfo.name}(id, ${mapEntity.name}Ids);
}

<#assign mapIndexedProperties=templateUtils.getIndexedProperties(mapEntity)>
public List<${mapEntity.classInfo.name}> find${mapEntity.classInfo.name}ForAdd(
    <#list mapIndexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
    Date end${indexProperty.name?cap_first},
    <#else>${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
    </#list>int mappingId) {
    return persistor.find${mapEntity.classInfo.name}ForAdd(<#list mapIndexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
        end${indexProperty.name?cap_first},
        <#elseif templateUtils.isRangeTypeProperty(indexProperty) >
        ${indexProperty.name},${indexProperty.name},
        <#else>
        ${indexProperty.name},
        </#if></#list>mappingId);
}