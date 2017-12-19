import ${entity.classInfo.qualifiedName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;

import java.util.Date;
import java.util.List;
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

    <#include "service/CountAllMethod.ftl" >

<#include "service/FindAndRetrieveForViewMethods.ftl" >

}