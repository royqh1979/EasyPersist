package net.royqh.easypersist.generator;

import com.intellij.openapi.util.text.StringUtil;
import net.royqh.easypersist.model.CollectionProperty;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.Property;
import net.royqh.easypersist.model.SingleProperty;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Roy on 2016/2/18.
 */
public class CodeUtils {
    /**
     * 获取(生成)实体关系(映射)方法名
     * <p>该方法名用于在生成的Persitor中</p>
     * @param entity
     * @return
     */
    public static String getEntityMapName(Entity entity) {
        return entity.getName()+"Map";
    }


    public static String getRowCallbackHandlerClassName(Entity entity) {
        return entity.getClassInfo().getName()+"RowCallbackHandler";
    }

    public static String getPropertyVarName(Entity entity, Property property) {
        return entity.getName()+"_"+property.getName();
    }

    public static void appendEntityDeclareStatement(StringBuilder content, Entity entity) {
        content.append(
                String.format("%s %s;\n",
                        entity.getClassInfo().getName(),
                        entity.getName()
                        ));

    }

    public static String getIdVarName(Entity entity) {
        SingleProperty idProperty=entity.getIdProperty();
        return getPropertyVarName(entity, idProperty);
    }

    public static String getCollectionImplementType(CollectionProperty property) {
        String type=property.getCollectionType();
        switch(type) {
            case "java.util.List":
            case "java.util.Collection":
                return "ArrayList<>";
            case "java.util.Set":
                return "HashSet<>";
        }
        return type;
    }


    @NotNull
    public static String getPersistorName(Entity entity) {
        return "__" + StringUtil.capitalize(entity.getName())
                    + "Persistor";
    }

    public static String getPersistorCompositorName(Entity entity) {
        return  StringUtil.capitalize(entity.getName())
                + "Persistor";
    }
}
