import ${entity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
<#list typeList as type>
import ${type};
</#list>

@Service
public class ${entity.classInfo.name}Service {
    @Autowired
    private ${entity.classInfo.name}Persistor persistor;
    private List<${entity.classInfo.name}> cachedList=null;
    private boolean dirty=false;

    public List<${entity.classInfo.name}> listAll(boolean refresh) {
        if (refresh) {
            dirty=true;
        }
        checkCache();
        return cachedList;
    }

    public void exportToExcel(
    <#list entity.properties as property>
        <#if property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        List<${refEntity.classInfo.name}> list${refEntity.classInfo.name},
        </#if>
    </#list>OutputStream outputStream) throws IOException {
        HSSFWorkbook workbook=new HSSFWorkbook();
        HSSFSheet sheet=workbook.createSheet();
        HSSFCellStyle dateCellStyle = workbook.createCellStyle();
        HSSFDataFormat format= workbook.createDataFormat();
        dateCellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
        HSSFCellStyle numberCellStyle = workbook.createCellStyle();
        numberCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
        HSSFRow row=sheet.createRow(0);
        HSSFCell cell;
        int t=0;
        <#list entity.properties as property>
            <#if property == entity.idProperty >
            <#else>
            cell=row.createCell(t++);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            cell.setCellValue("${property.chineseAlias}");
            </#if>
        </#list>
        checkCache();
        int i=1;
        for (${entity.classInfo.name} ${entity.name}:cachedList){
            row=sheet.createRow(i);
            t=0;
        <#list entity.properties as property>
            <#if property == entity.idProperty >
            <#else>
            cell=row.createCell(t++);
                <#if property.isReferenceProperty()>
                    <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    <#if refEntity.listHeaderProperty??>
                        <#assign listHeader=refEntity.listHeaderProperty>
                    <#else>
                        <#assign listHeader=refEntity.idProperty>
                    </#if>
            cell.setCellType(Cell.CELL_TYPE_STRING);
            cell.setCellValue("");
            for (${refEntity.classInfo.name} ${refEntity.name}:list${refEntity.classInfo.name}){
                if (${refEntity.name}.${refEntity.idProperty.getter}()==${entity.name}.${property.getter}()){
                    cell.setCellValue(${refEntity.name}.${listHeader.getter}());
                }
            }
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
            i++;
        }
        workbook.write(outputStream);
    }

<#list entity.properties as property>
        <#if property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        public int countBy${property.name?cap_first}(
        ${generator.getObjectType(property.type)} ${property.name}) {
            return persistor.countBy${property.name?cap_first}(<#if generator.isRangeTypeProperty(property) >
        ${property.name},${property.name}
        <#else>
        ${property.name}
        </#if>);
        }

        public List<${entity.classInfo.name}> findBy${property.name?cap_first}(${generator.getObjectType(property.type)} ${property.name},
            String orderBy, SortType sortType, Pager pager){
             return persistor.findBy${property.name?cap_first}(<#if generator.isRangeTypeProperty(property) >
        ${property.name},${property.name}
        <#else>
        ${property.name}
        </#if>,orderBy,sortType==SortType.asc, pager.getStartRow(), pager.getPageSize());
        }
        </#if>
</#list>

    public ${idType} create(${entity.classInfo.name} ${entity.name}) {
        dirty=true;
        return persistor.create(${entity.name});
    }

    public ${entity.classInfo.name} retrieve(${idType} id) {
        return persistor.retrieve(id);
    }

    public void delete(${idType} id) {
        dirty=true;
        persistor.delete(id);
    }

    public void update(${entity.classInfo.name} ${entity.name}<#if !entity.isAutoGenerateId() >,${entity.idProperty.type} ${entity.idProperty.name}</#if>) {
        dirty=true;
<#if entity.isAutoGenerateId() >
        persistor.update(${entity.name});
<#else>
        persistor.update(${entity.name},${entity.idProperty.name});
</#if>
    }

    private void checkCache() {
        if (cachedList==null || dirty) {
            cachedList= persistor.retrieveAll();
            dirty=false;
        }
    }

}