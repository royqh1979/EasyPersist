<#compress>
public String getColumnNameByPropertyNameFor${entity.classInfo.name}(String propertyName)
{
    if (StringUtils.isEmpty(propertyName)) {
        return null;
    }
    <#list entity.properties as property>
        <#if property.isColumnProperty() >
    if (propertyName.equals("${property.name}")){
        return "${property.columnName}";
    }
        </#if>
    </#list>
    throw new RuntimeException("Can't find property "+propertyName);
}
</#compress>