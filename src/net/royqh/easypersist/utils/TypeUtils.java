package net.royqh.easypersist.utils;

import com.intellij.psi.*;
import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.parsers.ParseError;
import org.apache.commons.lang.StringUtils;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roy on 2016/2/13.
 */
public abstract class TypeUtils {
    public static boolean containsAnnotation(PsiModifierListOwner modifierListOwner, String... annotations) {
        return containsAnnotation(modifierListOwner.getModifierList(), annotations);
    }
    public static boolean containsAnnotation(PsiAnnotationOwner annotationOwner, String... annotations) {
        List<String> annotationNames = Arrays.asList(annotations);

        for (PsiAnnotation annotation : annotationOwner.getAnnotations()) {
            if (annotationNames.contains(annotation.getQualifiedName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCollectionProperty(PsiMethod psiMethod) {
        String type=psiMethod.getReturnType().getCanonicalText();
        for (String collectionType: Constants.COLLECTIONS) {
            if (type.startsWith(collectionType)){
                return true;
            }
        }
        return false;
    }

    public static boolean isMapProperty(PsiMethod psiMethod) {
        String type=psiMethod.getReturnType().getCanonicalText();
        return type.startsWith(Constants.MAP);
    }

    public static String getPropertyNameByGetter(PsiMethod psiMethod) {
        String name=psiMethod.getName();
        if (name.startsWith("is")){
            name=name.substring(2);
        } else {
            name=name.substring(3);
        }
        return Introspector.decapitalize(name);
    }

    /**
     * check if an string is a propertyName
     * @param propertyName
     * @return
     */
    public static boolean isValidPropertyName(String propertyName) {
        if (StringUtils.isEmpty(propertyName)){
            return false;
        }
        if (!Character.isUpperCase(propertyName.charAt(0))) {
            return false;
        }
        return true;
    }

    public static String getCollectionType(PsiMethod psiMethod) {
        String type=psiMethod.getReturnType().getCanonicalText();
        for (String collectionType:Constants.COLLECTIONS){
            if (type.startsWith(collectionType)) {
                return collectionType;
            }
        }
        throw new ParseError(
                String.format("%s: noknown collection type ",psiMethod.getName())
        );
    }

    private static Pattern collectionElementPattern=Pattern.compile("[^<>]*<([\\w.]+)>[^<>]*");
    public static String parseCollectionElementType(String type) {
        Matcher matcher=collectionElementPattern.matcher(type);
        if (!matcher.find()){
            return "";
        }
        return matcher.group(1).trim();
    }

    public static String getShortTypeName(String type) {
        if (!type.contains(".")){
            return type;
        }
        int pos=type.lastIndexOf(".");
        return type.substring(pos+1);
    }

    private final static Map<String,String> PrimitiveTypeMapper =new HashMap<>();
    static{
        PrimitiveTypeMapper.put("boolean", "Boolean");
        PrimitiveTypeMapper.put("byte", "Byte");
        PrimitiveTypeMapper.put("double", "Double");
        PrimitiveTypeMapper.put("float", "Float");
        PrimitiveTypeMapper.put("int", "Integer");
        PrimitiveTypeMapper.put("long", "Long");
        PrimitiveTypeMapper.put("short", "Short");
    }
    private final static Map<String,String> InversePrimitiveTypeMapper =new HashMap<>();
    static{
        InversePrimitiveTypeMapper.put("Boolean","boolean");
        InversePrimitiveTypeMapper.put("Byte","byte");
        InversePrimitiveTypeMapper.put("Double","double");
        InversePrimitiveTypeMapper.put("Float","float");
        InversePrimitiveTypeMapper.put("Integer","int");
        InversePrimitiveTypeMapper.put("Long","long");
        InversePrimitiveTypeMapper.put("Short","short");
    }

    public static String getObjectType(String type) {
        String shortTypeName= TypeUtils.getShortTypeName(type);
        if (PrimitiveTypeMapper.containsKey(shortTypeName)){
            return PrimitiveTypeMapper.get(shortTypeName);
        }
        return shortTypeName;
    }

    public static Object getPrimitiveType(String type) {
        String shortTypeName= TypeUtils.getShortTypeName(type);
        if (PrimitiveTypeMapper.containsKey(type)){
            return type;
        }
        return InversePrimitiveTypeMapper.get(shortTypeName);
    }

    public static boolean isRangeType(SingleProperty singleProperty) {
        if (singleProperty.getTemporalType()!=null) {
            return true;
        }
        String type=singleProperty.getType();
        if (type.equals("boolean")){
            return false;
        }
        if (PrimitiveTypeMapper.containsKey(type)) {
            return true;
        }
        String shortTypeName= TypeUtils.getShortTypeName(type);
        if (shortTypeName.equals("Boolean")){
            return false;
        }
        if (InversePrimitiveTypeMapper.containsKey(shortTypeName)){
            return true;
        }
        if (type.equals("java.math.BigDecimal")){
            return true;
        }
        if (type.equals("java.time.Date")) {
            return true;
        }
        if (type.equals("java.sql.Date")) {
            return true;
        }
        if (type.equals("java.sql.Time")) {
            return true;
        }
        if (type.equals("java.sql.Timestamp")) {
            return true;
        }
        return false;
    }

    public static boolean isString(String type) {
        return "String".equals(TypeUtils.getShortTypeName(TypeUtils.getObjectType(type)));
    }

    public static boolean isStringType(SingleProperty singleProperty) {
        return isString(singleProperty.getType());
    }
}
