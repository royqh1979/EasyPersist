package net.royqh.easypersist.sql.model;

import org.apache.commons.lang.StringUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roy on 2017/7/10.
 */
public class IndexColumnsSet {
    private Set<String> set=new HashSet<>();
    public void clear() {
        set.clear();
    }

    public boolean contains(String columnName) {
        return set.stream().anyMatch(c -> c.equals(columnName));
    }

    public boolean contains(Column column) {
        return contains(column.getName());
    }

    public void add(String columnName) {
        if (StringUtils.isEmpty(columnName)) {
            throw new RuntimeException("字段名不应为空!");
        }
        if (contains(columnName)) {
            throw new RuntimeException("字段" +columnName+"在同一个索引／外键定义中重复出现");
        }
        set.add(columnName);
    }

    public void add(Column column) {
        add(column.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndexColumnsSet that = (IndexColumnsSet) o;

        if (set.size()!= that.set.size()) {
            return false;
        }
        for (String c:set) {
            if (!that.set.contains(c)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result=0;
        for (String column:set) {
            result = 31 * result + column.hashCode();
        }
        return result;
    }

    public void addAll(Collection<String> columnNames) {
        for (String columnName:columnNames) {
            add(columnName);
        }
    }
}
