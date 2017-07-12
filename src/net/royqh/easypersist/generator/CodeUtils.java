package net.royqh.easypersist.generator;

import com.intellij.openapi.util.text.StringUtil;
import net.royqh.easypersist.model.*;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.utils.TypeUtils;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

    @NotNull
    public static List<SingleProperty> getAllIndexProperties(Entity entity) {
        Set<String> allIndexPropertieNames = new HashSet<>();
        for (IndexInfo indexInfo : entity.getIndexes()) {
            for (String propertyName : indexInfo.getProperties()) {
                SingleProperty singleProperty = (SingleProperty) entity.getProperty(propertyName);
                allIndexPropertieNames.add(singleProperty.getName());
            }
        }
        for (Property property:entity.getProperties()) {
            if (property.isReferenceProperty()) {
                allIndexPropertieNames.add(property.getName());
            }
        }
        List<SingleProperty> allIndexProperties = new ArrayList<>();
        for (String propertyName : allIndexPropertieNames) {
            allIndexProperties.add((SingleProperty) entity.getProperty(propertyName));
        }
        return allIndexProperties;
    }


    @NotNull
    public static Set<String> getTypeList(Entity entity) {
        return getTypeList(entity,false);
    }

    @NotNull
    public static Set<String> getTypeList(Entity entity, boolean withRef) {
        Set<String> types = new HashSet<>();
        for (Property property : entity.getProperties()) {
            PropertyType propertyType = property.getPropertyType();
            switch (propertyType) {
                case Column:
                    types.add(TypeUtils.cleanForImport(property.getType()));
                    if (withRef && (property instanceof ReferenceSingleProperty)) {
                        ReferenceSingleProperty referenceSingleProperty=(ReferenceSingleProperty)property;
                        types.add(TypeUtils.cleanForImport(referenceSingleProperty.getRefEntityFullClassName()));
                    }
                    break;
                /*
                case OneToMany:
                    types.add(((OneToManyCollectionProperty) property)
                            .getOneToMany().getTargetEntity());
                    break;
                case ManyToMany:
                    types.add(((ManyToManyCollectionProperty) property)
                            .getManyToMany().getTargetEntity());
                    break;
                case OneToOne:
                    types.add(((OneToOneProperty) property)
                            .getOneToOne().getTargetEntity());
                    break;
                case ManyToOne:
                    types.add(((ManyToOneProperty) property)
                            .getManyToOne().getTargetEntity());
                    break;
                case ElementCollection:
                    types.add(((ElementCollectionProperty) property)
                            .getElementCollection().getTargetClassName());
                    break;
                    */
            }
        }
        for (MapRelationInfo relationInfo : entity.getMapRelationInfos()) {
            types.add(relationInfo.getMappingEntityFullClassName());
            Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
            if (mappingEntity==null) {
                throw new RuntimeException("Not found entity definition for class "+relationInfo.getMappingEntityFullClassName());
            }
            /* 如果单独为某一个Entity生成Persistor, 这时我们不知道Persistor应该放在哪个包里 */
            if (mappingEntity.getPersistorPackageName()!=null) {
                types.add(mappingEntity.getPersistorPackageName().replaceAll(System.lineSeparator(), ".")
                        + "." + getPersistorName(mappingEntity));
            }
        }
        types.removeAll(Constants.PRIMITIVE_TYPES);
        types.removeAll(Constants.BASIC_TYPES);
        return types;
    }
}
