package net.royqh.easypersist.utils;

import com.intellij.psi.*;
import net.royqh.easypersist.entity.model.SingleProperty;
import net.royqh.easypersist.entity.model.jpa.Constants;
import net.royqh.easypersist.entity.parser.ParseError;
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

    public static final String FILE_INFO_TYPE = "FileInfo";
    private static final String DEPARTMENT_INFO_TYPE = "DepartmentInfo";

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
        if (isChinese(propertyName)){
            return true;
        }
        if (!Character.isUpperCase(propertyName.charAt(0))) {
            return false;
        }
        return true;
    }

    // 根据Unicode编码完美的判断中文汉字和符号
    private static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
    }

    // 完整的判断中文汉字和符号
    public static boolean isChinese(String strName) {
        if (StringUtils.isEmpty(strName)){
            return false;
        }
        char[] ch = strName.toCharArray();
        return isChinese(ch[0]);
        /*
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (isChinese(c)) {
                return true;
            }
        } 
        return false;
        */
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

    public static boolean isPrimitiveType(String type){
        return PrimitiveTypeMapper.containsKey(type);
    }

    public static Object getPrimitiveType(String type) {
        String shortTypeName= TypeUtils.getShortTypeName(type);
        if (PrimitiveTypeMapper.containsKey(type)){
            return type;
        }
        return InversePrimitiveTypeMapper.get(shortTypeName);
    }

    public static boolean isRangeTypeProperty(SingleProperty singleProperty) {
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

    public static boolean isStringType(String type) {
        return "String".equals(TypeUtils.getShortTypeName(TypeUtils.getObjectType(type)));
    }

    public static boolean isStringType(SingleProperty singleProperty) {
        return isStringType(singleProperty.getType());
    }


    public static String cleanForImport(String type) {
        return type.replaceAll("<.*>|\\[.*\\]","");
    }

    public static boolean isWrapperType(String type) {
        return Constants.WRAPER_TYPES.contains(type);
    }

    public static boolean isFileInfoType(String type) {
        String shortTypeName=getShortTypeName(type);
        return FILE_INFO_TYPE.equals(shortTypeName);
    }

    public static boolean isDepartmentInfoType(String type) {
        String shortTypeName=getShortTypeName(type);
        return DEPARTMENT_INFO_TYPE.equals(shortTypeName);
    }

    public static boolean isIntProperty(SingleProperty property) {
        switch (TypeUtils.getShortTypeName(property.getType())) {
            case "Integer":
            case "int":
            case "Short":
            case "short":
            case "Long":
            case "long":
            case "byte":
            case "Byte":
                return true;
            default:
                return false;
        }
    }

    public static boolean isBigDecimal(SingleProperty property) {
        if ("BigDecimal".equals(TypeUtils.getShortTypeName(property.getType()))) {
            return true;
        }
        return false;
    }

    public static boolean isNumberProperty(SingleProperty property) {
        switch (TypeUtils.getShortTypeName(property.getType())) {
            case "Float":
            case "float":
            case "Double":
            case "double":
            case "BigDecimal":
                return true;
            default:
                return false;
        }
    }

    public static boolean isBooleanProperty(SingleProperty property) {
        switch (TypeUtils.getShortTypeName(property.getType())) {
            case "Boolean":
            case "boolean":
                return true;
            default:
                return false;
        }
    }

    public static boolean isDateProperty(SingleProperty property) {
        return "Date".equals(TypeUtils.getShortTypeName(property.getType()));
    }

    public static boolean isObjectType(String type) {
        if (PrimitiveTypeMapper.containsKey(type)) {
            return false;
        }
        if (InversePrimitiveTypeMapper.containsKey(type)){
            return false;
        }
        return true;
    }
}
