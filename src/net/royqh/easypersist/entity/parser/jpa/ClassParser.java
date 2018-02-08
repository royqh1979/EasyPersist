package net.royqh.easypersist.entity.parser.jpa;

import com.intellij.openapi.module.Module;
import com.intellij.psi.*;
import com.intellij.psi.search.GlobalSearchScope;
import net.royqh.easypersist.entity.MappingRepository;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.entity.model.jpa.*;
import net.royqh.easypersist.entity.parser.FactTableParser;
import net.royqh.easypersist.entity.parser.ParseError;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;

import javax.persistence.AccessType;
import java.beans.Introspector;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Roy on 2016/2/14.
 */
public class ClassParser {
    public static Entity parseEntityClass(PsiClass psiClass, boolean checkChineseAlias) {
        String entityName = parseEntityName(psiClass);
        ClassInfo classInfo = new ClassInfo(psiClass.getName(), psiClass.getQualifiedName());
        Entity entity = new Entity(entityName, classInfo, psiClass);
        parseClassAnnotations(psiClass, entity);
        checkClassFields(psiClass, entity);
        parseClassProperties(psiClass, entity);
        processIndexInfo(entity);
        processGISProperties(entity);

        checkIdExist(psiClass, entity);
        if (!entity.isAutoGenerateId() && entity.hasSubEntity()) {
            throw new RuntimeException("实体类" + entity.getClassInfo().getQualifiedName() + "包含子实体,但主键属性缺少@Generated annotation注解(不是数据库自动生成?)!");
        }
        if (checkChineseAlias) {
            doCheckChineseAlias(entity);
        }
        if (isFactTableClass(psiClass)) {
            FactTableInfo factTable = FactTableParser.parse(entity, psiClass);
            entity.setFactTableInfo(factTable);
        }
        if (entity.getListHeaderProperty() != null) {
            SingleProperty listHeaderProperty = entity.getListHeaderProperty();
            if (!entity.propertyIndexed(listHeaderProperty)) {
                throw new RuntimeException("实体类" + entity.getClassInfo().getQualifiedName() + "的@ListHeader"
                        + listHeaderProperty.getName() + "必须被@Column(unique=true)或@Talbe(indexes)索引!");
            }
        }

        //for debug:
        /*
        System.out.println("entity "+entity.getName()+" indexed properties:");
        for (IndexInfo indexInfo:entity.getIndexes()) {
            for (String propertyName:indexInfo.getProperties()){
                System.out.print(propertyName+" ");
            }
            System.out.println("");
        }
        System.out.println("--------");
        */
        return entity;
    }

    private static void processGISProperties(Entity entity) {
        List<SingleProperty> gisProperties=null;
        for (Property property:entity.getProperties()) {
            if (property instanceof SingleProperty) {
                SingleProperty singleProperty=(SingleProperty)property;
                if (TypeUtils.isGISType(singleProperty)) {
                    if (gisProperties==null) {
                        gisProperties=new ArrayList<>();
                    }
                    gisProperties.add(singleProperty);
                }
            }
        }
        if (gisProperties!=null) {
            entity.setGISProperties(gisProperties);
        }
    }

    private static void doCheckChineseAlias(Entity entity) {
        if (StringUtils.isEmpty(entity.getChineseAlias())) {
            throw new RuntimeException("实体类" + entity.getClassInfo().getQualifiedName()
                    + "缺少@ChineseAlias注解.");

        }
        for (Property property : entity.getProperties()) {
            if (property instanceof SingleProperty) {
                SingleProperty singleProperty = (SingleProperty) property;
                if (StringUtils.isEmpty(singleProperty.getChineseAlias())) {
                    throw new RuntimeException("实体类" + entity.getClassInfo().getQualifiedName()
                            + "的getter方法" + property.getGetter() + "()缺少@ChineseAlias注解");
                }
            }
        }
    }

    private static void checkIdExist(PsiClass psiClass, Entity entity) {
        if (entity.getIdProperty() == null) {
            throw new ParseError(entity,
                    "no id property!");
        }
    }

    private static String parseEntityName(PsiClass psiClass) {
        PsiAnnotation entityAnno = AnnotationUtils.findAnnotation(psiClass, Constants.ENTITY);
        String name = AnnotationUtils.getValue(entityAnno, "name");
        if (!StringUtils.isBlank(name)) {
            return name;
        }
        return Introspector.decapitalize(psiClass.getName());
    }

    private static void parseClassAnnotations(PsiClass psiClass, Entity entity) {
        /* parse @Table annotation */
        Table table = AnnotationParser.parseTable(psiClass);
        entity.setTable(table);

        /* parse @Access annotation */
        AccessType type = AnnotationParser.parseAccessType(psiClass);
        entity.setAccessType(type);

        /* parse @ChineseAlias annotation */
        String chineseAlias = AnnotationParser.parseChineseAlias(psiClass);
        entity.setChineseAlias(chineseAlias);

        /* parse custom @MapRelations annotation */
        entity.setMapRelationInfos(AnnotationParser.parseMapRelations(psiClass));

        entity.setSubEntities(AnnotationParser.parseSubEntities(psiClass));
    }

    private static void processIndexInfo(Entity entity) {
        //indexes
        Index[] indexes = entity.getTable().getIndexes();
        if (indexes.length > 0) {
            for (int i = 0; i < indexes.length; i++) {
                Index index = indexes[i];
                IndexInfo indexInfo = new IndexInfo();
                indexInfo.setName(index.getName());
                indexInfo.setUnique(index.isUnique());
                Set<String> properties = new LinkedHashSet<>();
                //System.out.println(index.getColumnList());
                for (String s : index.getColumnList().split(",")) {
                    s = s.replaceAll("(?i)asc", "");
                    s = s.replaceAll("(?i)desc", "");
                    String columnName = s.trim();
                    //System.out.println("++"+columnName);
                    SingleProperty singleProperty = entity.getPropertyByColumnName(columnName);
                    if (singleProperty == null) {
                        throw new RuntimeException(String.format("在实体类%s中缺少属性与数据表%s的%s字段对应",
                                entity.getClassInfo().getQualifiedName(),entity.getTableName(),columnName));
                    }
                    properties.add(singleProperty.getName());
                }
                indexInfo.setProperties(properties);
                entity.addIndex(indexInfo);
            }
        }
        //unique constraints
        UniqueConstraint[] uniqueConstraints = entity.getTable().getUniqueConstraints();
        if (uniqueConstraints.length > 0) {
            for (int i = 0; i < uniqueConstraints.length; i++) {
                UniqueConstraint uniqueConstraint = uniqueConstraints[i];
                IndexInfo indexInfo = new IndexInfo();
                indexInfo.setUnique(true);
                Set<String> properties = new LinkedHashSet<>();
                for (String columnName : uniqueConstraint.getColumnNames()) {
                    SingleProperty singleProperty = entity.getPropertyByColumnName(columnName);
                    if (singleProperty == null) {
                        throw new RuntimeException(String.format("在实体类%s中缺少属性与数据表%s的%s字段对应",
                                entity.getClassInfo().getQualifiedName(),entity.getTableName(),columnName));
                    }
                    properties.add(singleProperty.getName());
                }
                indexInfo.setProperties(properties);
                entity.addIndex(indexInfo);
            }
        }
        //unique columns
        for (Property property : entity.getProperties()) {
            if (property == entity.getIdProperty()) {
                continue;
            }
            if (property.getPropertyType() == PropertyType.Column) {
                SingleProperty singleProperty = (SingleProperty) property;
                if (singleProperty.getColumn().isUnique()) {
                    IndexInfo indexInfo = new IndexInfo();
                    indexInfo.setUnique(true);
                    Set<String> properties = new LinkedHashSet<>();
                    properties.add(singleProperty.getName());
                    properties.add(singleProperty.getName());
                    indexInfo.setProperties(properties);
                    entity.addIndex(indexInfo);
                }
            }
        }

        //entity.removeIndexedProperty(entity.getIdProperty().getName());
    }

    private static void checkClassFields(PsiClass psiClass, Entity entity) {
        for (PsiField psiField : psiClass.getAllFields()) {
            for (PsiAnnotation annotation : psiField.getModifierList().getAnnotations()) {
                if (annotation.getQualifiedName().startsWith("javax.persistence.")) {
                    throw new ParseError(entity,
                            "field \"" + psiField.getName()
                                    + "\" -- field access is not supported");
                }
            }
        }
    }

    private static void parseClassProperties(PsiClass psiClass, Entity entity) {
        for (PsiMethod psiMethod : psiClass.getMethods()) {
            String methodName = psiMethod.getName();
            if (MethodParser.isGetter(psiMethod)) {
                MethodParser.parseGetterInfo(psiMethod, entity);
            } else {
                checkNonGetterMethodAnnotations(psiMethod, entity);
            }
        }
    }

    /**
     * non getter method shouldn't have jpa annotation. Check it
     *
     * @param psiMethod
     * @param entity
     */
    private static void checkNonGetterMethodAnnotations(PsiMethod psiMethod, Entity entity) {
        for (PsiAnnotation annotation : psiMethod.getModifierList().getAnnotations()) {
            if (annotation.getQualifiedName().startsWith("javax.persistence.")) {
                throw new ParseError(entity,
                        "method \"" + psiMethod.getName()
                                + "\" is not a public getter, jpa annotation is not allowed!");
            }
        }
    }


    public static Entity parseEntityClassWithReferences(PsiClass psiClass, Module module, boolean checkChineseAlias) {
        MappingRepository mappingRepository = new MappingRepository();
        JavaPsiFacade facade = JavaPsiFacade.getInstance(module.getProject());
        GlobalSearchScope moduleScope = GlobalSearchScope.moduleWithDependenciesScope(module);
        return doParseEntityClassWithReferences(psiClass,
                module, mappingRepository, facade, moduleScope, checkChineseAlias);
    }

    private static Entity doParseEntityClassWithReferences(PsiClass psiClass, Module module, MappingRepository repository,
                                                           JavaPsiFacade facade, GlobalSearchScope searchScope, boolean checkChineseAlias) {
        if (repository.isClassExist(psiClass)) {
            return repository.findEntityByClass(psiClass.getQualifiedName());
        }
        if (!ClassParser.isEntityClass(psiClass)) {
            throw new RuntimeException(psiClass.getQualifiedName() + "不是实体类!");
        }
        Entity entity = parseEntityClass(psiClass, checkChineseAlias);
        repository.addEntity(entity);
        for (MapRelationInfo mapRelationInfo : entity.getMapRelationInfos()) {
            PsiClass mappingClass = facade.findClass(mapRelationInfo.getMappingEntityFullClassName(), searchScope);
            if (mappingClass == null) {
                throw new RuntimeException(String.format("找不到实体类%s的多对多关系类(关联表映射类)%s",
                        psiClass.getQualifiedName(), mapRelationInfo.getMappingEntityFullClassName()));
            }
            doParseEntityClassWithReferences(mappingClass,
                    module, repository, facade, searchScope, checkChineseAlias);
        }
        for (Property property : entity.getProperties()) {
            if (property instanceof ReferenceSingleProperty) {
                ReferenceSingleProperty referenceSingleProperty = (ReferenceSingleProperty) property;
                PsiClass mappingClass = facade.findClass(referenceSingleProperty.getRefEntityFullClassName(), searchScope);
                if (mappingClass == null) {
                    throw new RuntimeException(String.format("找不到实体类%s的外键映射类(普通1对1或1对多关系)%s",
                            psiClass.getQualifiedName(), referenceSingleProperty.getRefEntityFullClassName()));
                }
                doParseEntityClassWithReferences(mappingClass,
                        module, repository, facade, searchScope, checkChineseAlias);
            }
        }
        for (SubEntityInfo subEntityInfo : entity.getSubEntities()) {
            PsiClass mappingClass = facade.findClass(subEntityInfo.getEntityClassName(), searchScope);
            if (mappingClass == null) {
                throw new RuntimeException(String.format("找不到实体类%s的子实体类（类似总表和子表的包含关系）%s",
                        psiClass.getQualifiedName(), subEntityInfo.getEntityClassName() ));
            }
            Entity subEntity = doParseEntityClassWithReferences(mappingClass,
                    module, repository, facade, searchScope, checkChineseAlias);
            subEntityInfo.setSubEntity(subEntity);
            subEntityInfo.setSubEntityReferenceProperty(findReferenceProperty(subEntity, entity.getClassInfo().getQualifiedName()));
        }
        return entity;
    }

    private static ReferenceSingleProperty findReferenceProperty(Entity subEntity, String entityFullClassName) {
        for (Property property : subEntity.getProperties()) {
            if (property instanceof ReferenceSingleProperty) {
                ReferenceSingleProperty referenceSingleProperty = (ReferenceSingleProperty) property;
                if (referenceSingleProperty.getRefEntityFullClassName().equals(entityFullClassName)) {
                    return referenceSingleProperty;
                }
            }
        }
        throw new RuntimeException(String.format("在子实体类%s中缺少关联实体类%s的外键属性",subEntity.getClassInfo().getQualifiedName(),entityFullClassName ));
    }

    public static boolean isEntityClass(PsiElement element) {
        if (!(element instanceof PsiClass)) {
            return false;
        }
        PsiClass psiClass = (PsiClass) element;
        return ClassParser.isEntityClass(psiClass);
    }

    public static boolean isEntityClass(PsiClass psiClass) {
        PsiAnnotation entityAnnotation = AnnotationUtils.findAnnotation(psiClass,
                Constants.ENTITY);
        return entityAnnotation != null;
    }

    public static boolean isNormalEntityClass(PsiClass psiClass) {
        PsiAnnotation entityAnnotation = AnnotationUtils.findAnnotation(psiClass,
                Constants.ENTITY);
        PsiAnnotation factTableAnnotation = AnnotationUtils.findAnnotation(psiClass,
                Constants.FACT_TABLE);
        return entityAnnotation != null && factTableAnnotation == null;
    }

    public static boolean isFactTableClass(PsiClass psiClass) {
        PsiAnnotation entityAnnotation = AnnotationUtils.findAnnotation(psiClass,
                Constants.ENTITY);
        PsiAnnotation factTableAnnotation = AnnotationUtils.findAnnotation(psiClass,
                Constants.FACT_TABLE);
        return entityAnnotation != null && factTableAnnotation != null;
    }
}
