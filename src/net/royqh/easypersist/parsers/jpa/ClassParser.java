package net.royqh.easypersist.parsers.jpa;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.psi.*;
import com.intellij.psi.search.GlobalSearchScope;
import net.royqh.easypersist.MappingRepository;
import net.royqh.easypersist.model.*;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.model.jpa.Index;
import net.royqh.easypersist.model.jpa.Table;
import net.royqh.easypersist.model.jpa.UniqueConstraint;
import net.royqh.easypersist.parsers.ParseError;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;

import javax.persistence.AccessType;
import java.beans.Introspector;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roy on 2016/2/14.
 */
public class ClassParser {
    public static Entity parseEntityClass(PsiClass psiClass) {
        String entityName=parseEntityName(psiClass);
        ClassInfo classInfo=new ClassInfo(psiClass.getName(),psiClass.getQualifiedName());
        Entity entity=new Entity(entityName,classInfo,psiClass);
        parseClassAnnotations(psiClass, entity);
        checkClassFields(psiClass, entity);
        parseClassProperties(psiClass, entity);
        processIndexInfo(entity);
        checkIdExist(psiClass,entity);

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

    private static void checkIdExist(PsiClass psiClass, Entity entity) {
        if (entity.getIdProperty()==null) {
            throw new ParseError(entity,
                    "no id property!");
        }
    }

    private static String parseEntityName(PsiClass psiClass) {
        PsiAnnotation entityAnno=AnnotationUtils.findAnnotation(psiClass,Constants.ENTITY);
        String name=AnnotationUtils.getValue(entityAnno,"name");
        if (!StringUtils.isBlank(name)) {
            return name;
        }
        return Introspector.decapitalize(psiClass.getName());
    }

    private static void parseClassAnnotations(PsiClass psiClass, Entity entity) {
        /* parse @Table annotation */
        Table table=AnnotationParser.parseTable(psiClass);
        entity.setTable(table);

        /* parse @Access annotation */
        AccessType type=AnnotationParser.parseAccessType(psiClass);
        entity.setAccessType(type);

        /* parse @ChineseAlias annotation */
        String chineseAlias=AnnotationParser.parseChineseAlias(psiClass);
        entity.setChineseAlias(chineseAlias);

        /* parse custom @MapRelations annotation */
        entity.setMapRelationInfos(AnnotationParser.parseMapRelations(psiClass));

        entity.setSubEntities(AnnotationParser.parseSubEntities(psiClass));
    }

    private static void processIndexInfo(Entity entity) {
        //indexes
        Index[] indexes=entity.getTable().getIndexes();
        if (indexes.length>0) {
            for (int i=0;i<indexes.length;i++) {
                Index index=indexes[i];
                IndexInfo indexInfo=new IndexInfo();
                indexInfo.setName(index.getName());
                indexInfo.setUnique(index.isUnique());
                Set<String> properties=new HashSet<>();
                //System.out.println(index.getColumnList());
                for (String s:index.getColumnList().split(",")) {
                    s=s.replaceAll("(?i)asc", "");
                    s=s.replaceAll("(?i)desc","");
                    String columnName=s.trim();
                    //System.out.println("++"+columnName);
                    SingleProperty singleProperty=entity.getPropertyByColumnName(columnName);
                    if (singleProperty==null) {
                        throw new RuntimeException("There's no property corresponding to column \""+columnName+"\" in entity "+entity.getName());
                    }
                    properties.add(singleProperty.getName());
                }
                indexInfo.setProperties(properties);
                entity.addIndex(indexInfo);
            }
        }
        //unique constraints
        UniqueConstraint[] uniqueConstraints=entity.getTable().getUniqueConstraints();
        if (uniqueConstraints.length>0) {
            for (int i=0;i<uniqueConstraints.length;i++) {
                UniqueConstraint uniqueConstraint=uniqueConstraints[i];
                IndexInfo indexInfo=new IndexInfo();
                indexInfo.setUnique(true);
                Set<String> properties=new HashSet<>();
                for (String columnName:uniqueConstraint.getColumnNames()) {
                    SingleProperty singleProperty=entity.getPropertyByColumnName(columnName);
                    if (singleProperty==null) {
                        throw new RuntimeException("There's no property corresponding to column \""+columnName+"\" in entity "+entity.getName());
                    }
                    properties.add(singleProperty.getName());
                }
                indexInfo.setProperties(properties);
                entity.addIndex(indexInfo);
            }
        }
        //unique columns
        for (Property property:entity.getProperties()) {
            if (property==entity.getIdProperty()) {
                continue;
            }
            if (property.getPropertyType()== PropertyType.Column) {
                SingleProperty singleProperty=(SingleProperty)property;
                if (singleProperty.getColumn().isUnique()) {
                    IndexInfo indexInfo=new IndexInfo();
                    indexInfo.setUnique(true);
                    Set<String> properties=new HashSet<>();
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
        for (PsiField psiField:psiClass.getAllFields()) {
            for (PsiAnnotation annotation:psiField.getModifierList().getAnnotations()) {
                if (annotation.getQualifiedName().startsWith("javax.persistence.")){
                    throw new ParseError(entity,
                            "field \""+psiField.getName()
                                    +"\" -- field access is not supported");
                }
            }
        }
    }

    private static void parseClassProperties(PsiClass psiClass, Entity entity) {
        for (PsiMethod psiMethod:psiClass.getMethods()) {
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
     * @param psiMethod
     * @param entity
     */
    private static void checkNonGetterMethodAnnotations(PsiMethod psiMethod, Entity entity) {
        for (PsiAnnotation annotation:psiMethod.getModifierList().getAnnotations()) {
            if (annotation.getQualifiedName().startsWith("javax.persistence.")){
                throw new ParseError(entity,
                        "method \""+psiMethod.getName()
                                +"\" is not a public getter, jpa annotation is not allowed!");
            }
        }
    }


    public static Entity parseEntityClassWithMappings(PsiClass psiClass, Module module){
        MappingRepository mappingRepository=new MappingRepository();
        JavaPsiFacade facade=JavaPsiFacade.getInstance(module.getProject());
        GlobalSearchScope moduleScope = GlobalSearchScope.moduleWithDependenciesScope(module);
        return doParseEntityClassWithMappings(psiClass,
                module,mappingRepository,facade,moduleScope);
    }
    
    private static Entity doParseEntityClassWithMappings(PsiClass psiClass, Module module, MappingRepository repository,
                                                       JavaPsiFacade facade, GlobalSearchScope searchScope){
        if (repository.isClassExist(psiClass)) {
            return repository.findEntityByClass(psiClass.getQualifiedName());
        }
        if (!ClassParser.isEntityClass(psiClass)) {
            throw new RuntimeException("Class "+psiClass.getQualifiedName()+"is NOT a entity class!");
        }
        Entity entity=parseEntityClass(psiClass);
        repository.addEntity(entity);
        for (MapRelationInfo mapRelationInfo: entity.getMapRelationInfos()) {
            PsiClass mappingClass=facade.findClass(mapRelationInfo.getMappingEntityFullClassName(),searchScope);
            if (mappingClass==null) {
                throw new RuntimeException("Mapping Class "+mapRelationInfo.getMappingEntityFullClassName()+ " for "+psiClass.getQualifiedName()+" not found!");
            }
            doParseEntityClassWithMappings(mappingClass,
                    module,repository,facade,searchScope);
        }
        for (Property property: entity.getProperties()) {
            if (property instanceof ReferenceSingleProperty)  {
                ReferenceSingleProperty referenceSingleProperty=(ReferenceSingleProperty)property;
                PsiClass mappingClass=facade.findClass(referenceSingleProperty.getRefEntityFullClassName(),searchScope);
                if (mappingClass==null) {
                    throw new RuntimeException("Referencing Class "+referenceSingleProperty.getRefEntityFullClassName()+ " for "+psiClass.getQualifiedName()+" not found!");
                }
                doParseEntityClassWithMappings(mappingClass,
                        module,repository,facade,searchScope);
            } 
        }
        return entity;
    }

    public static boolean isEntityClass(PsiClass psiClass) {
        PsiAnnotation entityAnnotation = AnnotationUtils.findAnnotation(psiClass,
                Constants.ENTITY);
        return entityAnnotation!=null;
    }
}
