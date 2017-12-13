package net.royqh.easypersist.entity.parser.jpa;

import com.intellij.psi.*;
import com.intellij.psi.util.PsiTypesUtil;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.entity.model.jpa.*;
import net.royqh.easypersist.utils.TypeUtils;

import javax.persistence.EnumType;
import javax.persistence.TemporalType;

/**
 * Created by Roy on 2016/2/14.
 */
public class MethodParser {
    /**
     * check if a method is getter
     *
     * @param psiMethod
     * @return
     */
    public static boolean isGetter(PsiMethod psiMethod) {
        String methodName = psiMethod.getName();
        String propertyName = "";
        /* getter should not be static */
        if (psiMethod.hasModifierProperty(PsiModifier.STATIC)) {
            return false;
        }
        /* getter should start with get or is */
        if (methodName.startsWith("get")) {
            propertyName = methodName.substring(3);
        } else if (methodName.startsWith("is")) {
            /* only boolean getter should start with is */
            String propertyType = psiMethod.getReturnType().getCanonicalText();
            if (!propertyType.equals("boolean")) {
                return false;
            }
            propertyName = methodName.substring(2);
        } else {
            return false;
        }
        /* check if is a valid propertyName */
        return TypeUtils.isValidPropertyName(propertyName);
    }

    /**
     * extract entity property info from getter method
     *
     * @param psiMethod
     * @param entity
     */
    public static void parseGetterInfo(PsiMethod psiMethod, Entity entity) {
        try {
            if (TypeUtils.containsAnnotation(psiMethod, Constants.TRANSIENT)) {
                return;
            }
            if (TypeUtils.isCollectionProperty(psiMethod)) {
                if (TypeUtils.containsAnnotation(psiMethod, Constants.ELEMENT_COLLECTION)) {
                    ElementCollectionProperty property =
                            parseElementCollectionProperty(psiMethod);
                    entity.addProperty(property);
                    return;
                }
                if (TypeUtils.containsAnnotation(psiMethod, Constants.ONE_TO_MANY)) {
                    OneToManyCollectionProperty property = parseOneToManyCollectionProperty(psiMethod);
                    entity.addProperty(property);
                    return;
                }
                if (TypeUtils.containsAnnotation(psiMethod, Constants.MANY_TO_MANY)) {
                    ManyToManyCollectionProperty property = parseManyToManyCollectionProperty(psiMethod);
                    entity.addProperty(property);
                    return;
                }
            } else {
                if (TypeUtils.containsAnnotation(psiMethod, Constants.MANY_TO_ONE)) {
                    ManyToOneProperty property = parseManyToOneProperty(psiMethod);
                    entity.addProperty(property);
                    return;
                }

                if (TypeUtils.containsAnnotation(psiMethod, Constants.ONE_TO_ONE)) {
                    OneToOneProperty property = parseOneToOneProperty(psiMethod);
                    entity.addProperty(property);
                    return;
                }
            }

            /* we are normal column property */
            SingleProperty singleProperty = parseSingleProperty(psiMethod);
            entity.addProperty(singleProperty);
            if (TypeUtils.containsAnnotation(psiMethod, Constants.ID)) {
                entity.setIdProperty(singleProperty.getName());
                entity.setAutoGenerateId(TypeUtils.containsAnnotation(psiMethod, Constants.GENERATED_VALUE));
            }
            if (TypeUtils.containsAnnotation(psiMethod, Constants.LIST_HEADER)) {
                entity.setListHeaderProperty(singleProperty.getName());
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(entity.getClassInfo().getQualifiedName() +
                    "-" + psiMethod.getName() + "():" + e.getMessage(), e);
        }
    }

    private static ManyToManyCollectionProperty parseManyToManyCollectionProperty(PsiMethod psiMethod) {
        String name = TypeUtils.getPropertyNameByGetter(psiMethod);

        ManyToMany manyToMany = AnnotationParser.parseManyToMany(psiMethod);
        String collectionType = TypeUtils.getCollectionType(psiMethod);
        ManyToManyCollectionProperty property = new ManyToManyCollectionProperty(
                name,
                psiMethod.getReturnType().getCanonicalText(),
                collectionType
        );

        property.setManyToMany(manyToMany);
        return property;
    }

    private static OneToManyCollectionProperty parseOneToManyCollectionProperty(PsiMethod psiMethod) {
        String name = TypeUtils.getPropertyNameByGetter(psiMethod);

        OneToMany oneToMany = AnnotationParser.parseOneToMany(psiMethod);

        String collectionType = TypeUtils.getCollectionType(psiMethod);
        OneToManyCollectionProperty property = new OneToManyCollectionProperty(
                name,
                psiMethod.getReturnType().getCanonicalText(),
                collectionType
        );

        property.setOneToMany(oneToMany);
        return property;
    }

    private static ElementCollectionProperty parseElementCollectionProperty(PsiMethod psiMethod) {
        String name = TypeUtils.getPropertyNameByGetter(psiMethod);

        ElementCollection elementCollection =
                AnnotationParser.parseElementCollection(psiMethod);
        String collectionType = TypeUtils.getCollectionType(psiMethod);
        ElementCollectionProperty property = new ElementCollectionProperty(name,
                psiMethod.getReturnType().getCanonicalText(),
                collectionType);
        property.setElementCollection(elementCollection);
        CollectionTable collectionTable = AnnotationParser.parseCollectionTable(psiMethod);
        property.setCollectionTable(collectionTable);
        Column column = AnnotationParser.parseColumn(psiMethod);
        property.setColumn(column);
        return property;
    }

    private static OneToOneProperty parseOneToOneProperty(PsiMethod psiMethod) {
        String name = TypeUtils.getPropertyNameByGetter(psiMethod);
        /* parse OneToOne Annotation */
        OneToOne oneToOne = AnnotationParser.parseOneToOne(psiMethod);
        return new OneToOneProperty(name, oneToOne.getTargetEntity(), oneToOne);
    }

    private static ManyToOneProperty parseManyToOneProperty(PsiMethod psiMethod) {
        String name = TypeUtils.getPropertyNameByGetter(psiMethod);
        ManyToOne manyToOne = AnnotationParser.parseManyToOne(psiMethod);
        return new ManyToOneProperty(name, manyToOne.getTargetEntity(), manyToOne);
    }

    private static SingleProperty parseSingleProperty(PsiMethod psiMethod) {
        String name = TypeUtils.getPropertyNameByGetter(psiMethod);
        String type = psiMethod.getReturnType().getCanonicalText();
        Column column = AnnotationParser.parseColumn(psiMethod);
        SingleProperty property;
        PsiAnnotation referenceAnno = AnnotationUtils.findAnnotation(psiMethod, Constants.REFERENCE);
        if (referenceAnno != null) {
            ReferenceSingleProperty referenceSingleProperty = new ReferenceSingleProperty(name, type, column);
            referenceSingleProperty.setRefEntityFullClassName(AnnotationUtils.getClassName(referenceAnno, "refEntityClass"));
            property = referenceSingleProperty;
        } else {
            property = new SingleProperty(name, type, column);
        }
        String chineseAlias = AnnotationParser.parseChineseAlias(psiMethod);
        if (chineseAlias != null) {
            property.setChineseAlias(chineseAlias);
        } else if (TypeUtils.isChinese(name)) {
            property.setChineseAlias(name);
        }
        if (type.equals("java.util.Date")) {
            TemporalType temporalType = AnnotationParser.parseTemporal(psiMethod);
            if (temporalType == null) {
                throw new RuntimeException("java.util.Date property should be annotated with @Temporal!");
            }
            property.setTemporalType(temporalType);
        }

        if (type.equals("java.sql.Blob") || type.equals("byte[]")) {
            if (!AnnotationParser.parseLob(psiMethod)) {
                throw new RuntimeException("Blob or byte[] property should be annotated with @Lob!");
            }
            property.setLob(true);
        }

        PsiClass retunTypeClass = PsiTypesUtil.getPsiClass(psiMethod.getReturnType());
        if (retunTypeClass != null && retunTypeClass.isEnum()) {
            EnumType enumType = AnnotationParser.parseEnumerated(psiMethod);
            if (enumType == null) {
                enumType = enumType.STRING;
            }
            property.setEnumType(enumType);
        }
        property.setGetter(psiMethod.getName());

        if (!property.isLob()) {
            property.setLob(AnnotationParser.parseLob(psiMethod));
        }
        return property;
    }
}
