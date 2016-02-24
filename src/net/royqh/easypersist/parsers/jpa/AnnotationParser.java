package net.royqh.easypersist.parsers.jpa;

import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.PsiModifierListOwner;
import net.royqh.easypersist.model.jpa.*;
import net.royqh.easypersist.parsers.ParseError;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.Nullable;

import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.TemporalType;

/**
 * Created by Roy on 2016/2/14.
 */
public class AnnotationParser {
    @Nullable
    public static JoinColumn parseJoinColumn(PsiMethod psiMethod) {
        PsiAnnotation joinColumnAnno= AnnotationUtils.findAnnotation(psiMethod, Constants.JOIN_COLUMN);
        return parseJoinColumn(joinColumnAnno);
    }

    @Nullable
    private static JoinColumn parseJoinColumn(PsiAnnotation joinColumnAnno) {
        JoinColumn joinColumn;
        if(joinColumnAnno==null) {
            joinColumn=null;
        }else{
            joinColumn=new JoinColumn();
            joinColumn.setName(AnnotationUtils.getValue(joinColumnAnno, "name"));
            joinColumn.setColumnDefinition(AnnotationUtils.getValue(joinColumnAnno,"columnDefinition"));
            //joinColumn.setForeignKey();
            joinColumn.setInsertable(AnnotationUtils.getBooleanValue(joinColumnAnno,"insertable"));
            joinColumn.setNullable(AnnotationUtils.getBooleanValue(joinColumnAnno,"nullable"));
            joinColumn.setUnique(AnnotationUtils.getBooleanValue(joinColumnAnno,"unique"));
            joinColumn.setUpdatable(AnnotationUtils.getBooleanValue(joinColumnAnno,"updatable"));
            joinColumn.setTable(AnnotationUtils.getValue(joinColumnAnno,"table"));
            joinColumn.setReferencedColumnName(AnnotationUtils.getValue(joinColumnAnno,"referencedColumnName"));
        }
        return joinColumn;
    }

    public static Table parseTable(PsiModifierListOwner psiModifierListOwner) {
        PsiAnnotation tableAnnotation=AnnotationUtils.findAnnotation(psiModifierListOwner,
                Constants.TABLE);
        if (tableAnnotation!=null) {
            Table table=new Table();
            table.setName(AnnotationUtils.getValue(tableAnnotation,"name"));
            table.setCatalog(AnnotationUtils.getValue(tableAnnotation, "catalog"));
            table.setSchema(AnnotationUtils.getValue(tableAnnotation, "schema"));
            return table;
        } else {
            return new Table();
        }
    }

    public static AccessType parseAccessType(PsiModifierListOwner modifierListOwner) {
        PsiAnnotation accessAnnotation=AnnotationUtils.findAnnotation(modifierListOwner,
                Constants.ACCESS);
        if (accessAnnotation != null) {
            return AnnotationUtils.getEnumValue(accessAnnotation, "value", AccessType.class);
        }
        return AccessType.PROPERTY;
    }

    public static OneToOne parseOneToOne(PsiMethod psiMethod) {
        PsiAnnotation oneToOneAnno=AnnotationUtils.findAnnotation(psiMethod,Constants.ONE_TO_ONE);
        String targetEntity=AnnotationUtils.getClassName(oneToOneAnno, "targetEntity");
        if (targetEntity!=Constants.VOID){
            targetEntity=psiMethod.getReturnType().getCanonicalText();
        }
        OneToOne oneToOne=new OneToOne(targetEntity);
        oneToOne.setOptional(AnnotationUtils.getBooleanValue(oneToOneAnno, "optional"));
        oneToOne.setFetchType(AnnotationUtils.getEnumValue(oneToOneAnno, "fetch", FetchType.class));
        oneToOne.setCascadeTypes(AnnotationUtils.getEnumArray(oneToOneAnno, "cascade", CascadeType.class));
        oneToOne.setMappedBy(AnnotationUtils.getValue(oneToOneAnno,"mappedBy"));
        oneToOne.setOrphanRemoval(AnnotationUtils.getBooleanValue(oneToOneAnno,"orphanRemoval"));

        JoinColumn joinColumn=parseJoinColumn(psiMethod);
        oneToOne.setJoinColumn(joinColumn);
        return oneToOne;
    }

    public static ManyToOne parseManyToOne(PsiMethod psiMethod) {
        PsiAnnotation manyToOneAnno=AnnotationUtils.findAnnotation(psiMethod,Constants.MANY_TO_ONE);
        String targetEntity=AnnotationUtils.getClassName(manyToOneAnno, "targetEntity");
        if (targetEntity!=Constants.VOID){
            targetEntity=psiMethod.getReturnType().getCanonicalText();
        }
        ManyToOne manyToOne=new ManyToOne(targetEntity);
        manyToOne.setOptional(AnnotationUtils.getBooleanValue(manyToOneAnno,"optional"));
        manyToOne.setFetchType(AnnotationUtils.getEnumValue(manyToOneAnno,"fetch", FetchType.class));
        manyToOne.setCascadeTypes(AnnotationUtils.getEnumArray(manyToOneAnno,"cascade", CascadeType.class));

        JoinColumn joinColumn = AnnotationParser.parseJoinColumn(psiMethod);
        manyToOne.setJoinColumn(joinColumn);
        return manyToOne;
    }

    public static Column parseColumn(PsiMethod psiMethod) {
        PsiAnnotation columnAnno=AnnotationUtils.findAnnotation(psiMethod,Constants.COLUMN);
        Column column;
        if (columnAnno != null){
            column=new Column();
            column.setName(AnnotationUtils.getValue(columnAnno, "name"));
            column.setUnique(AnnotationUtils.getBooleanValue(columnAnno,"unique"));
            column.setNullable(AnnotationUtils.getBooleanValue(columnAnno,"nullable"));
            column.setInsertable(AnnotationUtils.getBooleanValue(columnAnno,"insertable"));
            column.setUnique(AnnotationUtils.getBooleanValue(columnAnno,"updatable"));
            column.setColumnDefinition(AnnotationUtils.getValue(columnAnno,"columnDefinition"));
            column.setTable(AnnotationUtils.getValue(columnAnno,"table"));
            column.setLength(AnnotationUtils.getIntValue(columnAnno,"length"));
            column.setPrecision(AnnotationUtils.getIntValue(columnAnno,"precision"));
            column.setScale(AnnotationUtils.getIntValue(columnAnno,"scale"));
        } else {
            String propertyName=TypeUtils.getPropertyNameByGetter(psiMethod);
            column=new Column();
            column.setName(propertyName);
        }
        return column;
    }

    public static TemporalType parseTemporal(PsiMethod psiMethod) {
        PsiAnnotation temporalAnno=AnnotationUtils.findAnnotation(psiMethod,Constants.TEMPORAL);
        if (temporalAnno==null) {
            return null;
        }
        return AnnotationUtils.getEnumValue(temporalAnno,null,TemporalType.class);
    }

    public static ElementCollection parseElementCollection(PsiMethod psiMethod) {
        PsiAnnotation annotation=AnnotationUtils.findAnnotation(psiMethod,Constants.ELEMENT_COLLECTION);
        ElementCollection elementCollection=new ElementCollection();
        elementCollection.setTargetClassName(AnnotationUtils.getClassName(annotation, "targetClass"));
        elementCollection.setFetchType(AnnotationUtils.getEnumValue(annotation,"fetch",FetchType.class));
        if (elementCollection.getTargetClassName().equals(Constants.VOID)) {
            String type=psiMethod.getReturnType().getCanonicalText();
            String targetClass= TypeUtils.parseCollectionElementType(type);
            if (StringUtils.isBlank(targetClass)){
                throw new ParseError(
                        String.format("%s: no Collection Element Type Info!",psiMethod.getName())
                );
            }
            elementCollection.setTargetClassName(targetClass);
        }
        return elementCollection;
    }
    public static OneToMany parseOneToMany(PsiMethod psiMethod) {
        PsiAnnotation annotation=AnnotationUtils.findAnnotation(psiMethod,Constants.ONE_TO_MANY);
        String targetClass=AnnotationUtils.getClassName(annotation, "targetEntity");
        if (targetClass.equals(Constants.VOID)) {
            targetClass=TypeUtils.parseCollectionElementType(psiMethod.getReturnType().getCanonicalText());
            if (StringUtils.isBlank(targetClass)) {
                throw new ParseError(
                        String.format("%s: no Collection Target Entity Type Info!",psiMethod.getName())
                );
            }
        }
        OneToMany oneToMany=new OneToMany(targetClass);
        oneToMany.setMappedBy(AnnotationUtils.getValue(annotation,"mappedBy"));
        oneToMany.setFetchType(AnnotationUtils.getEnumValue(annotation, "fetch", FetchType.class));
        oneToMany.setCascadeTypes(AnnotationUtils.getEnumArray(annotation, "cascade", CascadeType.class));
        oneToMany.setOrphanRemoval(AnnotationUtils.getBooleanValue(annotation,"orphanRemoval"));

        JoinColumn joinColumn = AnnotationParser.parseJoinColumn(psiMethod);
        oneToMany.setJoinColumn(joinColumn);

        JoinTable joinTable=AnnotationParser.parseJoinTable(psiMethod);
        oneToMany.setJoinTable(joinTable);
        return oneToMany;
    }

    private static JoinTable parseJoinTable(PsiMethod psiMethod) {
        PsiAnnotation annotation=AnnotationUtils.findAnnotation(psiMethod,Constants.JOIN_TABLE);
        JoinTable joinTable=new JoinTable();
        joinTable.setName(AnnotationUtils.getValue(annotation,"name"));
        joinTable.setSchema(AnnotationUtils.getValue(annotation,"schema"));
        joinTable.setCatalog(AnnotationUtils.getValue(annotation,"catalog"));

        JoinColumn[] joinColumns=parseJoinColumns(annotation,"joinColumns");
        joinTable.setJoinColumns(joinColumns);
        JoinColumn[] inverseJoinColumns=parseJoinColumns(annotation,"inverseJoinColumns");
        joinTable.setInverseJoinColumns(inverseJoinColumns);
        return joinTable;

    }

    private static JoinColumn[] parseJoinColumns(PsiAnnotation annotation, String attributeName) {
        PsiAnnotation[] annotations=AnnotationUtils.getAnnotationArray(annotation,attributeName);
        JoinColumn[] joinColumns=new JoinColumn[annotations.length];
        for (int i=0;i<annotations.length;i++){
            joinColumns[i]=parseJoinColumn(annotations[i]);
        }
        return joinColumns;
    }


    public static ManyToMany parseManyToMany(PsiMethod psiMethod) {
        PsiAnnotation annotation=AnnotationUtils.findAnnotation(psiMethod,Constants.MANY_TO_MANY);
        String targetClass=AnnotationUtils.getClassName(annotation, "targetEntity");
        if (targetClass.equals(Constants.VOID)) {
            targetClass=TypeUtils.parseCollectionElementType(psiMethod.getReturnType().getCanonicalText());
            if (StringUtils.isBlank(targetClass)) {
                throw new ParseError(
                        String.format("%s: no Collection Target Entity Type Info!",psiMethod.getName())
                );
            }
        }
        ManyToMany manyToMany=new ManyToMany(targetClass);
        manyToMany.setMappedBy(AnnotationUtils.getValue(annotation, "mappedBy"));
        manyToMany.setFetchType(AnnotationUtils.getEnumValue(annotation, "fetch", FetchType.class));
        manyToMany.setCascadeTypes(AnnotationUtils.getEnumArray(annotation, "cascade", CascadeType.class));

        JoinColumn joinColumn = AnnotationParser.parseJoinColumn(psiMethod);
        manyToMany.setJoinColumn(joinColumn);

        JoinTable joinTable=AnnotationParser.parseJoinTable(psiMethod);
        manyToMany.setJoinTable(joinTable);
        return manyToMany;
    }

    public static CollectionTable parseCollectionTable(PsiMethod psiMethod) {
        PsiAnnotation annotation=AnnotationUtils.findAnnotation(psiMethod,Constants.COLLECTION_TABLE);
        CollectionTable collectionTable=new CollectionTable();

        if (annotation!=null){
            collectionTable.setName(AnnotationUtils.getValue(annotation,"name"));
            collectionTable.setCatalog(AnnotationUtils.getValue(annotation,"catalog"));
            collectionTable.setSchema(AnnotationUtils.getValue(annotation,"schema"));
            collectionTable.setJoinColumns(parseJoinColumns(annotation,"joinColumns"));
        }
        return collectionTable;
    }
}
