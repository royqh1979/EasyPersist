<#compress >import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qui.base.Pager;
import com.qui.base.SortType;

import java.io.IOException;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

<#list importTypes as type>
import ${type};
</#list>

@Service
public class ${factTableEntity.classInfo.name}Service {
    public static final String PROP_PREFIX = "prop_";

    @Autowired
    private ${factTableEntity.classInfo.name}Persistor persistor;

    public Map<String,Object> retrieveFactTable(${baseEntity.classInfo.name} ${baseEntity.name}) {
        Map<String,Object> factTable=new HashMap<>();
        factTable.put("${baseEntity.idProperty.name}",${baseEntity.name}.${baseEntity.idProperty.getter}());
        factTable.put("${baseEntity.listHeaderProperty.name}",${baseEntity.name}.${baseEntity.listHeaderProperty.getter}());
        List<${factTableEntity.classInfo.name}> lst${factTableEntity.classInfo.name}=persistor.findBy${factTableEntity.factTableInfo.entityKeyProperty.name?cap_first}(${baseEntity.name}.${baseEntity.idProperty.getter}(),${baseEntity.name}.${baseEntity.idProperty.getter}());
        for (${factTableEntity.classInfo.name} ${factTableEntity.name}:lst${factTableEntity.classInfo.name}){
            factTable.put(PROP_PREFIX+${factTableEntity.name}.${factTableEntity.factTableInfo.propertyKeyProperty.getter}(),${factTableEntity.name}.${factTableEntity.factTableInfo.valueProperty.getter}());
        }
        return factTable;
    }

    public List<Map<String,Object>> findFactTables(List<${baseEntity.classInfo.name}> lst${baseEntity.classInfo.name}) {
        List<Map<String,Object>> lstFactTable=new ArrayList<>();
        for (${baseEntity.classInfo.name} ${baseEntity.name}:lst${baseEntity.classInfo.name}){
            lstFactTable.add(retrieveFactTable(${baseEntity.name}));
        }
        return lstFactTable;
    }

    public void update(${factTableEntity.classInfo.name} ${factTableEntity.name}){
        persistor.deleteBy${factTableEntity.factTableInfo.entityKeyProperty.name?cap_first}${factTableEntity.factTableInfo.propertyKeyProperty.name?cap_first}(
            ${factTableEntity.name}.${factTableEntity.factTableInfo.entityKeyProperty.getter}(),
            ${factTableEntity.name}.${factTableEntity.factTableInfo.entityKeyProperty.getter}(),
            ${factTableEntity.name}.${factTableEntity.factTableInfo.propertyKeyProperty.getter}(),
            ${factTableEntity.name}.${factTableEntity.factTableInfo.propertyKeyProperty.getter}());
        persistor.create(${factTableEntity.name});
    }

    public void update(Map<String,Object> factTable) {
        ${templateUtils.getShortType(baseEntity.idProperty)} ${baseEntity.name}Id=(${templateUtils.getObjectType(baseEntity.idProperty)})factTable.get("${baseEntity.idProperty.name}");
        persistor.deleteBy${factTableEntity.factTableInfo.entityKeyProperty.name?cap_first}(${baseEntity.name}Id,${baseEntity.name}Id);
        List<${factTableEntity.classInfo.name}> lst${factTableEntity.classInfo.name}=new ArrayList<>();
        for (String key:factTable.keySet()) {
            if ( "${baseEntity.idProperty.name}".equals(key)) {
                continue;
            }
            if ("${baseEntity.listHeaderProperty.name}".equals(key)){
                continue;
            }
            if (!key.startsWith(PROP_PREFIX)) {
                continue;
            }
            ${templateUtils.getShortType(propertyEntity.idProperty)} ${propertyEntity.name}Id=${templateUtils.getConvertParameterStatement(propertyEntity.idProperty,"key.replaceFirst(PROP_PREFIX,\"\")")};
            ${factTableEntity.classInfo.name} ${factTableEntity.name}=new ${factTableEntity.classInfo.name}();
            ${factTableEntity.name}.${factTableEntity.factTableInfo.entityKeyProperty.setter}(${baseEntity.name}Id);
            ${factTableEntity.name}.${factTableEntity.factTableInfo.propertyKeyProperty.setter}(${propertyEntity.name}Id);
            ${factTableEntity.name}.${factTableEntity.factTableInfo.valueProperty.setter}((${templateUtils.getObjectType(factTableEntity.factTableInfo.valueProperty)})factTable.get(key));
            lst${factTableEntity.classInfo.name}.add(${factTableEntity.name});
        }
        persistor.batchCreate(lst${factTableEntity.classInfo.name});
    }

}
</#compress>