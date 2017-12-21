<#compress >
    public void exportToExcel(
    <#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
        Date end${indexProperty.name?cap_first},
    <#else>${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
    </#list><#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    List<${refEntity.classInfo.name}> list${refEntity.classInfo.name},
    </#if>
</#list>HSSFSheet sheet, int startRow, int startCol) throws IOException {
            ExportRowToExcelProcessor processor=new ExportRowToExcelProcessor(<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                list${refEntity.classInfo.name},
    </#if>
</#list>sheet, startRow, startCol);
            persistor.findAll(<#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
                end${indexProperty.name?cap_first},
<#elseif templateUtils.isRangeTypeProperty(indexProperty) >
    ${indexProperty.name},${indexProperty.name} ,
<#else>
    ${indexProperty.name},
</#if></#list>processor);
        }
</#compress>