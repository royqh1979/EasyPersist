package net.royqh.codegenerator.orm.parsers.jpa;

import com.intellij.psi.*;
import net.royqh.codegenerator.orm.model.ClassInfo;
import net.royqh.codegenerator.orm.model.Entity;
import net.royqh.codegenerator.orm.model.jpa.Constants;
import net.royqh.codegenerator.orm.model.jpa.Table;
import net.royqh.codegenerator.orm.parsers.ParseError;
import org.apache.commons.lang.StringUtils;

import javax.persistence.AccessType;
import java.beans.Introspector;

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
