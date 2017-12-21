<#compress>
import ${entity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;
import java.util.Map;

<#list typeList as type>
import ${type};
</#list>

@Service
public class ${entity.classInfo.name}Service {
    @Autowired
    private ${entity.classInfo.name}Persistor persistor;
<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
    @Autowired
    private ${refEntity.classInfo.name}Persistor ${refEntity.name}Persistor;
    </#if>
</#list>

    public int countAll(<#list indexedProperties as indexProperty>
        <#if templateUtils.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
            Date end${indexProperty.name?cap_first}
        <#else>${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name}</#if><#sep>,</#sep></#list>) {
        return persistor.countAll(<#list indexedProperties as indexProperty>
            <#if templateUtils.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
                end${indexProperty.name?cap_first}
            <#elseif templateUtils.isRangeTypeProperty(indexProperty) >
                ${indexProperty.name},${indexProperty.name}
            <#else>
                ${indexProperty.name}
            </#if><#sep>,</#sep></#list>);
    }

    public List<${entity.classInfo.name}> findAll(
        <#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
        Date end${indexProperty.name?cap_first},
        <#else>${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
        </#list>String orderBy, SortType sortType, Pager pager) {
    return persistor.findAll(<#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
            end${indexProperty.name?cap_first},
        <#elseif templateUtils.isRangeTypeProperty(indexProperty) >
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
<#if includeSearchView>
    <#include "service/FindAndRetrieveForViewMethods.ftl" >
</#if>

<#if exportEnabled>
    public void exportToExcel(
        <#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
        Date end${indexProperty.name?cap_first},
        <#else>${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
        </#list><#list entity.properties as property>
        <#if property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    List<${refEntity.classInfo.name}> list${refEntity.classInfo.name},
        </#if>
    </#list>String orderBy, SortType sortType, Pager pager, HSSFSheet sheet, int startRow, int startCol) throws IOException {
            ExportRowToExcelProcessor processor=new ExportRowToExcelProcessor(<#list entity.properties as property>
        <#if property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                list${refEntity.classInfo.name},
        </#if>
    </#list>sheet, startRow, startCol);
            persistor.findAll(<#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
                end${indexProperty.name?cap_first},
    <#elseif templateUtils.isRangeTypeProperty(indexProperty) >
        ${indexProperty.name},${indexProperty.name},
    <#else>
        ${indexProperty.name},
    </#if></#list>orderBy,sortType==SortType.asc, pager.getStartRow(), pager.getPageSize(),
                processor
            );
        }

    <#assign entityToExport=entity>
    <#include "service/ExportRowToExcelProcessor.ftl" >
</#if>

<#list entity.mapRelationInfos as relationInfo>
    <#include "service/fulleditor-mapEntity.ftl" >
</#list>

}
</#compress>