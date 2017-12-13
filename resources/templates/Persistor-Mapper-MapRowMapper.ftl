public final static RowMapper<Map<String,Object>> MAP_ROW_MAPPER = new RowMapper<Map<String,Object>>() {
    @Override
    public Map<String,Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
        Map<String,Object> ${entity.name} = new HashMap<>();
        <#list entity.properties as property>
            <#if property.column.nullable>
                if (rs.wasNull("${property.columnName}")) {
                    ${entity.name}.put("${property.name}","");
                } else {
            <#else>
                {
            </#if>
                ${rowMapperUtils.generateGetColumnValueStatement(property)}
                ${entity.name}.put("${property.name}",val);
            }
        </#list>
        return ${entity.name} ;
    }
};