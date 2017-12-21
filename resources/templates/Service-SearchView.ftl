<#compress>
import ${entity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;

import java.util.Date;
import java.util.List;
import java.util.Map;
<#if exportEnabled>
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
</#if>

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

    <#include "service/CountAllMethod.ftl" >

    <#include "service/FindAndRetrieveForViewMethods.ftl" >

<#if exportEnabled>
    <#include "service/SearchAndExportToExcelMethod.ftl" >
    <#assign entityToExport=entity>
    <#include "service/ExportRowToExcelProcessor.ftl" >
</#if>
}
</#compress>