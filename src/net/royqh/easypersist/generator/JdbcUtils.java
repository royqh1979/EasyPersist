package net.royqh.easypersist.generator;

import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Roy on 2016/2/18.
 */
public class JdbcUtils {
    private final static Map<String,String> resultSetColumnTypeMap=new HashMap<>();
    static{
        resultSetColumnTypeMap.put("boolean", "Boolean");
        resultSetColumnTypeMap.put("byte", "Byte");
        resultSetColumnTypeMap.put("double", "Double");
        resultSetColumnTypeMap.put("float", "Float");
        resultSetColumnTypeMap.put("int","Int");
        resultSetColumnTypeMap.put("long","Long");
        resultSetColumnTypeMap.put("short","Short");
    }
    public static String getColumnGetter(SingleProperty property) {
        String propertyType= TypeUtils.getShortTypeName(property.getType()) ;
        if (resultSetColumnTypeMap.containsKey(propertyType)){
            return "get"+resultSetColumnTypeMap.get(propertyType);
        }
        return "get"+propertyType;
    }

    public static String getColumnSetter(SingleProperty property) {
        String propertyType= TypeUtils.getShortTypeName(property.getType()) ;
        if (resultSetColumnTypeMap.containsKey(propertyType)){
            return "set"+resultSetColumnTypeMap.get(propertyType);
        }
        return "set"+propertyType;
    }

    public static String generateIndexName(List<SingleProperty> indexProperties) {
        StringBuilder builder=new StringBuilder();
        for (SingleProperty singleProperty:indexProperties) {
            builder.append(StringUtils.capitalize(singleProperty.getName()));
        }
        return builder.toString();
    }
}
