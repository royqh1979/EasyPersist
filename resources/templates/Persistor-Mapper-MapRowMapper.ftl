<#compress>
public final static RowMapper<Map<String,Object>> MAP_ROW_MAPPER = new RowMapper<Map<String,Object>>() {
    <#if entity.hasGISProperty() >
    WKTReader wktReader=new WKTReader();
    </#if>

    @Override
    public Map<String,Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
        Map<String,Object> ${entity.name} = new HashMap<>();
        <#list entity.properties as property>
            {
                ${rowMapperUtils.generateGetColumnValueStatement(property)}
            <#if property.column.nullable>
                if (rs.wasNull()) {
                    ${entity.name}.put("${property.name}",null);
                } else {
            </#if>
                ${entity.name}.put("${property.name}",val);
            <#if property.column.nullable>
                }
            </#if>
            }
        </#list>
        return ${entity.name} ;
    }
};
</#compress>