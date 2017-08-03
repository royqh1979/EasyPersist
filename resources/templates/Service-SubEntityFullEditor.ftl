import ${subEntity.classInfo.qualifiedName};
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
public class ${subEntity.classInfo.name}Service {
    @Autowired
    private ${subEntity.classInfo.name}Persistor persistor;

<#assign refProperty=subEntityInfo.subEntityReferenceProperty >
    
    public int countBy${refProperty.name?cap_first}(${refPropertyType} ${refProperty.name}) {
        return persistor.countBy${refProperty.name?cap_first}(${refProperty.name},${refProperty.name});
    }

    public List<${subEntity.classInfo.name}> findBy${refProperty.name?cap_first}(${refPropertyType} ${refProperty.name},String orderBy, SortType sortType, Pager pager) {
        return persistor.findBy${refProperty.name?cap_first}(${refProperty.name},${refProperty.name},orderBy,sortType==SortType.asc,pager.getStartRow(),pager.getPageSize());
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