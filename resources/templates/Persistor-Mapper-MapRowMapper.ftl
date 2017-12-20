public final static RowMapper<Map<String,Object>> MAP_ROW_MAPPER = new RowMapper<Map<String,Object>>() {
    @Override
    public Map<String,Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
        Map<String,Object> ${entity.name} = new HashMap<>();
        <#list entity.properties as property>
            <#if property.column.nullable>
            {
                ${rowMapperUtils.generateGetColumnValueStatement(property)}
                if (rs.wasNull()) {
                    ${entity.name}.put("${property.name}","");
                } else {
            <#else>
                {
            </#if>
                ${entity.name}.put("${property.name}",val);
                }
            }
        </#list>
        return ${entity.name} ;
    }
};