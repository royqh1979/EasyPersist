import ${entity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;
import java.util.Date;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public void exportToExcel(
    <#list indexedProperties as indexProperty><#if generator.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
    Date end${indexProperty.name?cap_first},
    <#else>${generator.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
    </#list>String orderBy, SortType sortType, Pager pager,OutputStream outputStream) throws IOException {
        HSSFWorkbook workbook=new HSSFWorkbook();
        HSSFSheet sheet=workbook.createSheet();
        HSSFCellStyle dateCellStyle = workbook.createCellStyle();
        HSSFDataFormat format= workbook.createDataFormat();
        dateCellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
        HSSFCellStyle numberCellStyle = workbook.createCellStyle();
        numberCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
        persistor.findAll(<#list indexedProperties as indexProperty><#if generator.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
            end${indexProperty.name?cap_first},
            <#elseif generator.isRangeTypeProperty(indexProperty) >
            ${indexProperty.name},${indexProperty.name},
            <#else>
            ${indexProperty.name},
            </#if></#list>orderBy,sortType==SortType.asc, pager.getStartRow(), pager.getPageSize(),
            new ${entity.classInfo.name}Persistor.RowProcessor() {
                int i=1;
                @Override
                public void processRow(ResultSet rs) throws SQLException {
                    HSSFRow row=sheet.createRow(i);
                    ${entity.classInfo.name} ${entity.name}=persistor.SIMPLE_ROW_MAPPER.mapRow(rs,i++);
                    int t=1;
                    HSSFCell cell;
    <#list entity.properties as property>
        <#if property == entity.idProperty >
        <#else>
                    cell=row.createCell(t++);
            <#if property.isReferenceProperty()>
                <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                <#if generator.isDepartmentInfoType(refEntity)>
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cell.setCellValue(${entity.name}.${property.getter}());
                <#else>
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cell.setCellValue(${entity.name}.${property.getter}());
                </#if>
            <#elseif generator.isBooleanProperty(property) >
                cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
                cell.setCellValue(${entity.name}.${property.getter}());
            <#elseif property.isTemporal() >
                cell.setCellStyle(dateCellStyle);
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(${entity.name}.${property.getter}());
            <#else>
                <#if generator.isIntProperty(property) >
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(${entity.name}.${property.getter}());
                <#elseif generator.isNumberProperty(property) >
                cell.setCellStyle(numberCellStyle);
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(${entity.name}.${property.getter}());
                <#else>
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellValue(${entity.name}.${property.getter}());
                </#if>
            </#if>
        </#if>
    </#list>
           }
        });
        workbook.write(outputStream);
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