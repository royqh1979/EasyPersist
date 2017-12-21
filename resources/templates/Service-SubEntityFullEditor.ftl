<#compress>
import ${subEntity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;
import java.util.Date;

import java.util.List;
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

<#list typeList as type>
import ${type};
</#list>

@Service
public class ${subEntity.classInfo.name}Service {
    <#assign entityToExport=subEntity>
    <#include "service/ExportRowToExcelProcessor.ftl" >

    @Autowired
    private ${subEntity.classInfo.name}Persistor persistor;

<#assign refProperty=subEntityInfo.subEntityReferenceProperty >
    
    public int countBy${refProperty.name?cap_first}(${refPropertyType} ${refProperty.name}) {
        return persistor.countBy${refProperty.name?cap_first}(${refProperty.name},${refProperty.name});
    }

    public List<${subEntity.classInfo.name}> findBy${refProperty.name?cap_first}(${refPropertyType} ${refProperty.name},String orderBy, SortType sortType, Pager pager) {
        return persistor.findBy${refProperty.name?cap_first}(${refProperty.name},${refProperty.name},orderBy,sortType==SortType.asc,pager.getStartRow(),pager.getPageSize());
    }

    public void ExportToExcelByBy${refProperty.name?cap_first}(${refPropertyType} ${refProperty.name}, <#list subEntity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=subEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
    List<${refEntity.classInfo.name}> list${refEntity.classInfo.name},
    </#if>
</#list>HSSFSheet sheet, int startRow, int startCol) {
        ExportRowToExcelProcessor processor=new ExportRowToExcelProcessor(<#list subEntity.properties as property>
            <#if property.isReferenceProperty()>
                <#assign refEntity=subEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
            list${refEntity.classInfo.name},
            </#if>
        </#list>sheet, startRow, startCol);
        persistor.findBy${refProperty.name?cap_first}(${refProperty.name},${refProperty.name},processor);
    }

    public ${idType} create(${subEntity.classInfo.name} ${subEntity.name}) {
        return persistor.create(${subEntity.name});
    }

    public ${subEntity.classInfo.name} retrieve(${idType} id) {
        return persistor.retrieve(id);
    }

    public void delete(${idType} id) {
        persistor.delete(id);
    }

    public void update(${subEntity.classInfo.name} ${subEntity.name}) {
        persistor.update(${subEntity.name});
    }

}
</#compress>