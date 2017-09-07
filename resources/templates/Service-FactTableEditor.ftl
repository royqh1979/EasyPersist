import ${entity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;
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


<#list entity.properties as property>
        <#if property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        public int countBy${property.name?cap_first}(
        ${templateUtils.getObjectType(property.type)} ${property.name}) {
            return persistor.countBy${property.name?cap_first}(<#if templateUtils.isRangeTypeProperty(property) >
        ${property.name},${property.name}
        <#else>
        ${property.name}
        </#if>);
        }

        public List<${entity.classInfo.name}> findBy${property.name?cap_first}(${templateUtils.getObjectType(property.type)} ${property.name},
            String orderBy, SortType sortType, Pager pager){
             return persistor.findBy${property.name?cap_first}(<#if templateUtils.isRangeTypeProperty(property) >
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