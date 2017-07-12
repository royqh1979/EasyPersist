package net.royqh.easypersist.generator;

import com.intellij.openapi.util.text.StringUtil;
import net.royqh.easypersist.model.*;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

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

    public static String getServiceName(Entity entity) {
        return StringUtil.capitalize(entity.getName())+"Service";
    }

    public static String getControllerName(Entity entity) {
        return StringUtil.capitalize(entity.getName())+"Controller";
    }
    @NotNull
    public static Set<Entity> getRefencingEntities(Entity entity) {
        Set<Entity> refEntities=new HashSet<>();
        for (Property property:entity.getProperties()) {
            if (property instanceof ReferenceSingleProperty) {
                ReferenceSingleProperty referenceSingleProperty = (ReferenceSingleProperty) property;
                Entity referenceEntity = entity.getMappingRepository().findEntityByClass(referenceSingleProperty.getRefEntityFullClassName());
                refEntities.add(referenceEntity);
            }
        }
        return refEntities;
    }

}
