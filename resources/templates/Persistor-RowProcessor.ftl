public interface RowProcessor{
    void processRow(ResultSet rs, int i) throws SQLException;
}

public static class DefaultRowProcessor implements RowProcessor{
    private List<${entity.classInfo.name}> results=new ArrayList<>();
    @Override
    public void processRow(ResultSet rs,int i) throws SQLException {
        results.add(SIMPLE_ROW_MAPPER.mapRow(rs,i));
    }

    public List<${entity.classInfo.name}> getResults() {
        return results;
    }

}

    public static class MappedRowProcessor implements RowProcessor {
        private List<Map<String, Object>> results = new ArrayList<>();

        @Override
        public void processRow(ResultSet rs, int i) throws SQLException {
            results.add(MAP_ROW_MAPPER.mapRow(rs, i));
        }

        public List<Map<String, Object>> getResults() {
            return results;
        }
    }
