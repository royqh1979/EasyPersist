<#compress >
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
</#compress>