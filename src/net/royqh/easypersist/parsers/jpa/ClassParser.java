package net.royqh.easypersist.parsers.jpa;

import com.intellij.psi.*;
import net.royqh.easypersist.model.*;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.model.jpa.Index;
import net.royqh.easypersist.model.jpa.Table;
import net.royqh.easypersist.model.jpa.UniqueConstraint;
import net.royqh.easypersist.parsers.ParseError;
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
        Entity entity=new Entity(entityName,classInfo);
        parseClassAnnotations(psiClass, entity);
        checkClassFields(psiClass, entity);
        parseClassProperties(psiClass, entity);
        processIndexInfo(entity);

        //for debug:
        System.out.println("entity "+entity.getName()+" indexed properties:");
        for (IndexInfo indexInfo:entity.getIndexes()) {
            for (String propertyName:indexInfo.getProperties()){
                System.out.print(propertyName+" ");
            }
            System.out.println("");
        }
        System.out.println("--------");
        return entity;
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
                System.out.println(index.getColumnList());
                for (String s:index.getColumnList().split(",")) {
                    s=s.replaceAll("(?i)asc", "");
                    s=s.replaceAll("(?i)desc","");
                    String columnName=s.trim();
                    System.out.println("++"+columnName);
                    SingleProperty singleProperty=entity.getPropertyByColumnName(columnName);
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




}
