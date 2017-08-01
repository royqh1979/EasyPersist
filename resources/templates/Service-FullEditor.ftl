import ${entity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;
import java.util.Date;

import java.util.List;

<#list typeList as type>
import ${type};
</#list>

@Service
public class ${entity.classInfo.name}Service {
    @Autowired
    private ${entity.classInfo.name}Persistor persistor;

    public int countAll(<#list indexedProperties as indexProperty>
        <#if generator.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
            Date end${indexProperty.name?cap_first}
        <#else>${generator.getObjectType(indexProperty.type)} ${indexProperty.name}</#if><#sep>,</#sep></#list>) {
        return persistor.countAll(<#list indexedProperties as indexProperty>
            <#if generator.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
                end${indexProperty.name?cap_first}
            <#elseif generator.isRangeTypeProperty(indexProperty) >
                ${indexProperty.name},${indexProperty.name}
            <#else>
                ${indexProperty.name}
            </#if><#sep>,</#sep></#list>);
    }

    public List<${entity.classInfo.name}> findAll(
        <#list indexedProperties as indexProperty><#if generator.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
        Date end${indexProperty.name?cap_first},
        <#else>${generator.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
        </#list>String orderBy, SortType sortType, Pager pager) {
    return persistor.findAll(<#list indexedProperties as indexProperty><#if generator.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
            end${indexProperty.name?cap_first},
        <#elseif generator.isRangeTypeProperty(indexProperty) >
            ${indexProperty.name},${indexProperty.name},
        <#else>
            ${indexProperty.name},
        </#if></#list>orderBy,sortType==SortType.asc, pager.getStartRow(), pager.getPageSize());
    }

    public ${idType} create(${entity.classInfo.name} ${entity.name}) {
        return persistor.create(${entity.name});
    }

    public ${entity.classInfo.name} retrieve(${idType} id) {
        return persistor.retrieve(id);
    }

    public void delete(${idType} id) {
        persistor.delete(id);
    }

    public void update(${entity.classInfo.name} ${entity.name}) {
        persistor.update(${entity.name});
    }

<#list entity.mapRelationInfos as relationInfo>
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

    public void add${mapEntity.classInfo.name}sTo${entity.classInfo.name}(${entity.idProperty.type} id,Iterable<${generator.getObjectType(mapEntity.idProperty.type)}> ${mapEntity.name}Ids) {
        persistor.add${mapEntity.classInfo.name}sTo${entity.classInfo.name}(id, ${mapEntity.name}Ids);
    }

    public void delete${mapEntity.classInfo.name}From${entity.classInfo.name}(${entity.idProperty.type} id,${mapEntity.idProperty.type} ${mapEntity.name}Id) {
        persistor.delete${mapEntity.classInfo.name}From${entity.classInfo.name}(id, ${mapEntity.name}Id);
    }

    public void delete${mapEntity.classInfo.name}sFrom${entity.classInfo.name}(${entity.idProperty.type} id,Iterable<${generator.getObjectType(mapEntity.idProperty.type)}> ${mapEntity.name}Ids) {
        persistor.delete${mapEntity.classInfo.name}sFrom${entity.classInfo.name}(id, ${mapEntity.name}Ids);
    }

    <#assign mapIndexedProperties=generator.getIndexedProperties(mapEntity)>
    public List<${mapEntity.classInfo.name}> find${mapEntity.classInfo.name}ForAdd(
        <#list mapIndexedProperties as indexProperty><#if generator.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
        Date end${indexProperty.name?cap_first},
        <#else>${generator.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
        </#list>int mappingId) {
        return persistor.find${mapEntity.classInfo.name}ForAdd(<#list mapIndexedProperties as indexProperty><#if generator.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
        end${indexProperty.name?cap_first},
        <#elseif generator.isRangeTypeProperty(indexProperty) >
        ${indexProperty.name},${indexProperty.name},
        <#else>
        ${indexProperty.name},
        </#if></#list>mappingId);
    }

</#list>

}