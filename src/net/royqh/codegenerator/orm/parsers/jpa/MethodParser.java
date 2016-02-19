package net.royqh.codegenerator.orm.parsers.jpa;

import com.intellij.psi.PsiMethod;
import com.intellij.psi.PsiModifier;
import net.royqh.codegenerator.orm.model.jpa.*;
import net.royqh.codegenerator.orm.utils.TypeUtils;
import net.royqh.codegenerator.orm.model.*;
import org.apache.commons.lang.StringUtils;

import javax.persistence.TemporalType;

/**
 * Created by Roy on 2016/2/14.
 */
public class MethodParser {
    /**
     * check if a method is getter
     * @param psiMethod
     * @return
     */
    public static boolean isGetter(PsiMethod psiMethod) {
        String methodName=psiMethod.getName();
        String propertyName="";
        /* getter should not be static */
        if (psiMethod.hasModifierProperty(PsiModifier.STATIC)) {
            return false;
        }
        /* getter should start with get or is */
        if (methodName.startsWith("get")){
            propertyName=methodName.substring(3);
        } else if (methodName.startsWith("is")) {
            /* only boolean getter should start with is */
            String propertyType=psiMethod.getReturnType().getCanonicalText();
            if (!propertyType.equals("boolean")) {
                return false;
            }
            propertyName=methodName.substring(2);
        } else {
            return false;
        }
        /* check if is a valid propertyName */
        return TypeUtils.isValidPropertyName(propertyName);
    }

    public static void parseGetterInfo(PsiMethod psiMethod, Entity entity) {
        System.out.println("0:"+psiMethod.getName());
        System.out.println("1:"+psiMethod.getReturnType().toString());
        System.out.println("2:"+psiMethod.getReturnType().getCanonicalText());
        System.out.println("3:"+psiMethod.getReturnType().getClass());

        if (TypeUtils.containsAnnotation(psiMethod, Constants.TRANSIENT)) {
            return;
        }
        if (TypeUtils.isCollectionProperty(psiMethod)){
            if (TypeUtils.containsAnnotation(psiMethod, Constants.ELEMENT_COLLECTION)) {
                ElementCollectionProperty property=
                        parseElementCollectionProperty(psiMethod);
                entity.addProperty(property);
                return;
            }
            if (TypeUtils.containsAnnotation(psiMethod, Constants.ONE_TO_MANY)){
                OneToManyCollectionProperty property=parseOneToManyCollectionProperty(psiMethod);
                entity.addProperty(property);
                return;
            }
            if (TypeUtils.containsAnnotation(psiMethod, Constants.MANY_TO_MANY)){
                ManyToManyCollectionProperty property=parseManyToManyCollectionProperty(psiMethod);
                entity.addProperty(property);
                return;
            }
        } else if (TypeUtils.isMapProperty(psiMethod)){
            //TODO: map not supported yet
        } else {
            if (TypeUtils.containsAnnotation(psiMethod, Constants.MANY_TO_ONE)) {
                ManyToOneProperty property=parseManyToOneProperty(psiMethod);
                entity.addProperty(property);
                return;
            }

            if (TypeUtils.containsAnnotation(psiMethod, Constants.ONE_TO_ONE)) {
                OneToOneProperty property=parseOneToOneProperty(psiMethod);
                entity.addProperty(property);
                return;
            }
            SingleProperty singleProperty=parseSingleProperty(psiMethod);
            entity.addProperty(singleProperty);
            if (TypeUtils.containsAnnotation(psiMethod,Constants.ID)) {
                entity.setIdProperty(singleProperty.getName());
                entity.setAutoGenerateId(TypeUtils.containsAnnotation(psiMethod,Constants.GENERATED_VALUE));
            }
        }

        SingleProperty idProperty=entity.getIdProperty();
        for (Property property: entity.getProperties()) {
            if (property.getPropertyType()==PropertyType.ElementCollection) {
                ElementCollectionProperty collectionProperty=(ElementCollectionProperty)property;
                CollectionTable collectionTable=collectionProperty.getCollectionTable();
                if (StringUtils.isEmpty(collectionTable.getName())) {
                      collectionTable.setName(entity.getName()+"_"+property.getName());
                }
                if (collectionTable.getJoinColumns().length<1) {
                    JoinColumn[] joinColumns=new JoinColumn[1];
                    joinColumns[0]=new JoinColumn();
                    joinColumns[0].setName(entity.getName()+"_"+idProperty.getName());
                }
            }
        }
    }

    private static ManyToManyCollectionProperty parseManyToManyCollectionProperty(PsiMethod psiMethod) {
        String name=TypeUtils.getPropertyNameByGetter(psiMethod);

        ManyToMany manyToMany=AnnotationParser.parseManyToMany(psiMethod);
        String collectionType=TypeUtils.getCollectionType(psiMethod);
        ManyToManyCollectionProperty property=new ManyToManyCollectionProperty(
                name,
                psiMethod.getReturnType().getCanonicalText(),
                collectionType
        );

        property.setManyToMany(manyToMany);
        return property;
    }

    private static OneToManyCollectionProperty parseOneToManyCollectionProperty(PsiMethod psiMethod) {
        String name=TypeUtils.getPropertyNameByGetter(psiMethod);

        OneToMany oneToMany=AnnotationParser.parseOneToMany(psiMethod);

        String collectionType=TypeUtils.getCollectionType(psiMethod);
        OneToManyCollectionProperty property=new OneToManyCollectionProperty(
                name,
                psiMethod.getReturnType().getCanonicalText(),
                collectionType
        );

        property.setOneToMany(oneToMany);
        return property;
    }

    private static ElementCollectionProperty parseElementCollectionProperty(PsiMethod psiMethod) {
        String name= TypeUtils.getPropertyNameByGetter(psiMethod);

        ElementCollection elementCollection=
                AnnotationParser.parseElementCollection(psiMethod);
        String collectionType=TypeUtils.getCollectionType(psiMethod);
        ElementCollectionProperty property=new ElementCollectionProperty(name,
                psiMethod.getReturnType().getCanonicalText(),
                collectionType);
        property.setElementCollection(elementCollection);
        CollectionTable collectionTable=AnnotationParser.parseCollectionTable(psiMethod);
        property.setCollectionTable(collectionTable);
        Column column=AnnotationParser.parseColumn(psiMethod);
        property.setColumn(column);
        return property;
    }

    private static OneToOneProperty parseOneToOneProperty(PsiMethod psiMethod) {
        String name= TypeUtils.getPropertyNameByGetter(psiMethod);
        /* parse OneToOne Annotation */
        OneToOne oneToOne=AnnotationParser.parseOneToOne(psiMethod);
        return new OneToOneProperty(name, oneToOne.getTargetEntity(),oneToOne);
    }

    private static ManyToOneProperty parseManyToOneProperty(PsiMethod psiMethod) {
        String name= TypeUtils.getPropertyNameByGetter(psiMethod);
        ManyToOne manyToOne=AnnotationParser.parseManyToOne(psiMethod);
        return new ManyToOneProperty(name,manyToOne.getTargetEntity(),manyToOne);
    }

    private static SingleProperty parseSingleProperty(PsiMethod psiMethod) {
        String name= TypeUtils.getPropertyNameByGetter(psiMethod);
        String type=psiMethod.getReturnType().getCanonicalText();
        Column column=AnnotationParser.parseColumn(psiMethod);
        SingleProperty property=new SingleProperty(name,type,column);
        TemporalType temporalType=AnnotationParser.parseTemporal(psiMethod);
        property.setTemporalType(temporalType);
        property.setGetter(psiMethod.getName());
        return property;
    }


}
