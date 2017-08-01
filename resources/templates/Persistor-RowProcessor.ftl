public interface RowProcessor{
    void processRow(ResultSet rs) throws SQLException;
}

public static class DefaultRowProcessor implements RowProcessor{
    private int i=1;
    private List<${entity.classInfo.name}> results=new ArrayList<>();
    @Override
    public void processRow(ResultSet rs) throws SQLException {
        results.add(SIMPLE_ROW_MAPPER.mapRow(rs, i++));
    }

    public List<${entity.classInfo.name}> getResults() {
        return results;
    }

}