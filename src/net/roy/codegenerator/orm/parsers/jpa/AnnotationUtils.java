package net.roy.codegenerator.orm.parsers.jpa;

import com.intellij.psi.*;
import com.intellij.psi.impl.PsiClassImplUtil;
import com.intellij.psi.impl.PsiImplUtil;
import com.intellij.psi.impl.PsiJavaParserFacadeImpl;
import com.intellij.psi.util.PsiClassUtil;
import net.roy.codegenerator.orm.model.jpa.Column;
import net.roy.codegenerator.orm.model.jpa.Constants;
import org.apache.commons.lang.StringUtils;

import javax.persistence.CascadeType;
import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roy on 2016/2/14.
 */
public class AnnotationUtils {
    public static String getValue(PsiAnnotation annotation, String attributeName) {
        PsiAnnotationMemberValue value=annotation.findAttributeValue(attributeName);
        return value.getText().replace("\"", "");
    }

    public static <E extends Enum<E>> E getEnumValue(PsiAnnotation annotation, String attributeName, Class<E> clazz){
        String value=getValue(annotation,attributeName);
        if (value.contains(".")){
            int pos=value.lastIndexOf(".");
            value=value.substring(pos+1);
        }
        return Enum.valueOf(clazz,value);
    }

    public static <E extends Enum<E>> E[] getEnumArray(PsiAnnotation annotation, String attributeName, Class<E> clazz) {
        String value=getValue(annotation,attributeName);
        value=value.replace("{","")
                .replace("}","")
                .trim();
        if (StringUtils.isEmpty(value)){
            return (E[])Array.newInstance(clazz,0);
        }
        String values[]=value.split(",");
        E[] enums= (E[])Array.newInstance(clazz,values.length);
        for (int i=0;i<values.length;i++) {
            String val=values[i].trim();
            if (val.contains(".")){
                int pos=val.lastIndexOf(".");
                val=val.substring(pos+1);
            }
            enums[i]=Enum.valueOf(clazz,val);
        }
        return enums;


    }

    public static boolean getBooleanValue(PsiAnnotation annotation, String attributeName){
        String value=getValue(annotation,attributeName);
        return Boolean.valueOf(value);
    }

    public static PsiAnnotation findAnnotation(PsiAnnotationOwner annotationOwner, String annotationName){
        return PsiImplUtil.findAnnotation(annotationOwner,annotationName);
    }

    public static PsiAnnotation findAnnotation(PsiModifierListOwner modifierListOwner, String annotationName) {
        return findAnnotation(modifierListOwner.getModifierList(),annotationName);
    }

    public static int getIntValue(PsiAnnotation annotation, String attributeName) {
        String value=getValue(annotation,attributeName);
        return Integer.valueOf(value);
    }

    public static String getClassName(PsiAnnotation annotation, String attributeName) {
        String value=getValue(annotation,attributeName);
        if (value.equals(Constants.VOID))
            return value;
        if (value.endsWith(".class")) {
            int len=value.length()-".class".length();
            value.substring(0,len);
        }
        PsiType type=PsiImplUtil.buildTypeFromTypeString(value,annotation,annotation.getContainingFile());
        return type.getCanonicalText();
    }

    public static PsiAnnotation[] getAnnotationArray(PsiAnnotation annotation, String attributeName){
        String value=getValue(annotation,attributeName);
        value=value.replace("{","").replace("}","");
        if (StringUtils.isEmpty(value)){
            return new PsiAnnotation[]{};
        }
        String[] values=value.split(",");
        PsiAnnotation[] annotations=new PsiAnnotation[values.length];
        for (int i=0;i<values.length;i++) {
            String str=values[i].trim();
            PsiJavaParserFacade parserFacade=JavaPsiFacade.getInstance(annotation.getProject()).getParserFacade();
            annotations[i]=parserFacade.createAnnotationFromText(str,annotation);
        }
        return annotations;
    }
}
