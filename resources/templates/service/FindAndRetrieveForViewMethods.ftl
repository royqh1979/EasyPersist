<#compress >
public List<Map<String,Object>> findAllForView(
<#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
        Date end${indexProperty.name?cap_first},
<#else>${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
</#list>String orderBy, SortType sortType, Pager pager) {
        __${entity.classInfo.name}Persistor.MappedRowProcessor rowProcessor= new __${entity.classInfo.name}Persistor.MappedRowProcessor();
        persistor.findAll(<#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
            end${indexProperty.name?cap_first},
<#elseif templateUtils.isRangeTypeProperty(indexProperty) >
    ${indexProperty.name},${indexProperty.name},
<#else>
    ${indexProperty.name},
</#if></#list>orderBy,sortType==SortType.asc, pager.getStartRow(), pager.getPageSize(),rowProcessor);
        List<Map<String,Object>> ${entity.name}List=rowProcessor.getResults();
        for (Map<String,Object> ${entity.name}:${entity.name}List) {
<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        ${entity.name}.put("${refEntity.name}",${refEntity.name}Persistor.retrieve((${property.type})${entity.name}.get("${property.name}")));
    </#if>
</#list>
        }
        return ${entity.name}List;
    }

    public Map<String, Object> retrieveForView(int id) {
        Map<String,Object> ${entity.name}=persistor.retrieve(id,__${entity.classInfo.name}Persistor.MAP_ROW_MAPPER);
<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        ${entity.name}.put("${refEntity.name}",${refEntity.name}Persistor.retrieve((${property.type})${entity.name}.get("${property.name}")));
    </#if>
</#list>
        return ${entity.name};
    }
</#compress>