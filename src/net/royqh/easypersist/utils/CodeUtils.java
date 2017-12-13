package net.royqh.easypersist.utils;

import com.intellij.openapi.module.Module;
import com.intellij.psi.PsiClass;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiShortNamesCache;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.entity.model.jpa.Constants;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

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
        return "__" + entity.getClassInfo().getName()
                    + "Persistor";
    }

    public static String getPersistorCompositorName(Entity entity) {
        return  entity.getClassInfo().getName() + "Persistor";
    }

    public static String getServiceName(Entity entity) {
        return entity.getClassInfo().getName()+"Service";
    }

    public static String getControllerName(Entity entity) {
        return entity.getClassInfo().getName()+"Controller";
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
    public static List<SingleProperty> getAllIndexedProperties(Entity entity) {
        Set<String> allIndexPropertieNames = new HashSet<>();
        for (IndexInfo indexInfo : entity.getIndexes().values()) {
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
    public static Set<String> getPropertyTypes(Entity entity) {
        return getPropertyTypes(entity,false);
    }

    @NotNull
    public static Set<String> getPropertyTypes(Entity entity, boolean withRef) {
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
        for (SubEntityInfo subEntityInfo:entity.getSubEntities()){
            types.add(subEntityInfo.getEntityClassName());
        }

        getMappedTypeList(entity, types);
        types.removeAll(Constants.PRIMITIVE_TYPES);
        types.removeAll(Constants.BASIC_TYPES);
        return types;
    }

    public static List<Entity> getSubEntities(Entity entity) {
        if (!entity.hasSubEntity()) {
            return Collections.EMPTY_LIST;
        }
        List<Entity> subEntities=new ArrayList<>();
        for (SubEntityInfo subEntityInfo:entity.getSubEntities()) {
            Entity subEntity=entity.getMappingRepository().findEntityByClass(subEntityInfo.getEntityClassName());
            subEntities.add(subEntity);
        }
        return subEntities;
    }



    public static Set<String> getMappedTypeList(Entity entity) {
        Set<String> types = new HashSet<>();
        getMappedTypeList(entity, types);
        return types;
    }

    private static void getMappedTypeList(Entity entity, Set<String> types) {
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
    }

    public static Set<String> getRefencedTypes(Entity entity) {
        Set<String> results=new HashSet<>();
        for (Property property:entity.getProperties()){
            if (property.isReferenceProperty()) {
                ReferenceSingleProperty referenceSingleProperty=(ReferenceSingleProperty)property;
                results.add(referenceSingleProperty.getRefEntityFullClassName());
            }
        }
        return results;
    }

    public static Set<String> getMappedTypePersistorList(Entity entity,Module module) {
        Set<String> types = new HashSet<>();
        getMappedTypePersistorList(entity, types,module);
        return types;
    }

    public static void getMappedTypePersistorList(Entity entity, Set<String> types, Module module) {
        GlobalSearchScope moduleScope = GlobalSearchScope.moduleWithDependenciesScope(module);
        for (MapRelationInfo relationInfo : entity.getMapRelationInfos()) {
            Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
            if (mappingEntity==null) {
                throw new RuntimeException("Not found entity definition for class "+relationInfo.getMappingEntityFullClassName());
            }
            String persistorClassName=getPersistorType(mappingEntity,module,moduleScope);
            if (persistorClassName!=null) {
                types.add(persistorClassName);
            }
        }

    }

    public static String getPersistorType(Entity entity, Module module) {
        GlobalSearchScope moduleScope = GlobalSearchScope.moduleWithDependenciesScope(module);
        return getPersistorType(entity,module,moduleScope);
    }

    public static String getPersistorType(Entity entity, Module module, GlobalSearchScope searchScope) {
        PsiClass[] persistorClasses=PsiShortNamesCache.getInstance(module.getProject()).getClassesByName(getPersistorCompositorName(entity),searchScope);
        if (persistorClasses.length>0) {
            return persistorClasses[0].getQualifiedName();
        }
        return null;
    }


    public static String getServiceType(Entity entity, Module module) {
        GlobalSearchScope moduleScope = GlobalSearchScope.moduleWithDependenciesScope(module);
        return getServiceType(entity,module,moduleScope);
    }

    public static String getServiceType(Entity entity, Module module, GlobalSearchScope searchScope) {
        String serviceName;
        if (TypeUtils.isDepartmentInfoType(entity.getClassInfo().getQualifiedName())){
            serviceName="DepartmentService";
        } else if (TypeUtils.isFileInfoType(entity.getClassInfo().getQualifiedName())){
            serviceName="FileService";
        } else {
            serviceName=getServiceName(entity);
        }
        PsiClass[] serviceClasses=PsiShortNamesCache.getInstance(module.getProject()).getClassesByName(serviceName,searchScope);
        if (serviceClasses.length>0) {
            return serviceClasses[0].getQualifiedName();
        }
        return null;
    }

    public static Set<String> getRefencedServiceTypes(Entity entity, Module module) {
        Set<String> services=new HashSet<>();
        GlobalSearchScope moduleScope = GlobalSearchScope.moduleWithDependenciesScope(module);
        for (Property property:entity.getProperties()) {
            if (property instanceof ReferenceSingleProperty) {
                ReferenceSingleProperty referenceSingleProperty = (ReferenceSingleProperty) property;
                Entity referenceEntity = entity.getMappingRepository().findEntityByClass(referenceSingleProperty.getRefEntityFullClassName());
                String serviceClassName=getServiceType(referenceEntity,module,moduleScope);
                if (serviceClassName!=null) {
                    services.add(serviceClassName);
                }
            }
        }
        return services;
    }

    public static Set<String> getReferencedPersistorTypes(Entity entity, Module module) {
        Set<String> persistors=new HashSet<>();
        GlobalSearchScope moduleScope = GlobalSearchScope.moduleWithDependenciesScope(module);
        for (Property property:entity.getProperties()) {
            if (property instanceof ReferenceSingleProperty) {
                ReferenceSingleProperty referenceSingleProperty = (ReferenceSingleProperty) property;
                Entity referenceEntity = entity.getMappingRepository().findEntityByClass(referenceSingleProperty.getRefEntityFullClassName());
                String persistorTypeName=getPersistorType(referenceEntity,module,moduleScope);
                if (persistorTypeName!=null) {
                    persistors.add(persistorTypeName);
                }
            }
        }
        return persistors;
    }

    /**
     * create content by template
     * @param content
     * @param template
     * @param dataModel
     */
    public static void generateContent(StringBuilder content, Template template, Map<String, Object> dataModel) {
        StringWriter writer = new StringWriter();
        try {
            template.process(dataModel, writer);
            content.append(writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
