package net.royqh.easypersist.entity.parser.jpa;

import com.intellij.psi.*;
import com.intellij.psi.impl.PsiImplUtil;
import net.royqh.easypersist.entity.model.jpa.Constants;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2016/2/14.
 */
public class AnnotationUtils {
    public static String getValue(PsiAnnotation annotation, String attributeName) {
        PsiAnnotationMemberValue value=annotation.findAttributeValue(attributeName);
        return value.getText().replace("\"", "");
    }

    public static String[] getValues(PsiAnnotation annotation, String attributeName) {
        String str=getValue(annotation,attributeName);
        str=str.replaceAll("[\\s\\{\\}]","");
        return str.split(",");
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

    private static String parseClassName(PsiAnnotation annotation, String value) {
        if (value.equals(Constants.VOID))
            return value;
        if (value.endsWith(".class")) {
            int len=value.length()-".class".length();
            value=value.substring(0,len);
        }

        PsiManager psiManager=annotation.getManager();
        PsiType type=PsiImplUtil.buildTypeFromTypeString(value,annotation,annotation.getContainingFile());
        //JavaPsiFacade javaPsiFacade=JavaPsiFacade.getInstance(psiManager.getProject());
        //PsiType type=javaPsiFacade.getParserFacade().createTypeFromText(value,annotation.getContext());
        return type.getCanonicalText(true);
    }

    public static String[] getClassNames(PsiAnnotation annotation, String attributeName) {
        String[] values=getValues(annotation,attributeName);
        String[] results=new String[values.length];
        for (int i=0;i<values.length;i++) {
            results[i]=parseClassName(annotation,values[i]);
        }
        return results;
    }

    public static String getClassName(PsiAnnotation annotation, String attributeName) {
        String value=getValue(annotation,attributeName);
        return parseClassName(annotation,value);
    }

    public static PsiAnnotation[] getAnnotationArray(PsiAnnotation annotation, String attributeName){
        PsiAnnotationMemberValue pValue=annotation.findAttributeValue(attributeName);
        String value=pValue.getText();
        List<String> values=splitAnnotationArrayString(value);
        PsiAnnotation[] annotations=new PsiAnnotation[values.size()];
        for (int i=0;i<values.size();i++) {
            String str=values.get(i).trim();
            PsiJavaParserFacade parserFacade=JavaPsiFacade.getInstance(annotation.getProject()).getParserFacade();
            annotations[i]=parserFacade.createAnnotationFromText(str,annotation);
        }
        return annotations;
    }

    private static List<String> splitAnnotationArrayString(String value) {
        List<String> strList=new ArrayList<>();
        StringBuilder tmp=new StringBuilder();
        boolean inAnno=false;
        int level=0;
        for (char ch : value.toCharArray()) {
            if (inAnno) {
                tmp.append(ch);
                if (ch == '(') {
                    level++;
                } else if (ch == ')') {
                    level--;
                    if (level == 0) {
                        inAnno = false;
                        strList.add(tmp.toString());
                        tmp = new StringBuilder();
                    }
                }
            } else {
                if (ch == '@') {
                    inAnno = true;
                    tmp.append(ch);
                }
            }
        }
        return strList;
    }
}
