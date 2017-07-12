package net.royqh.easypersist.parsers.jpa;

import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.PsiModifierListOwner;
import net.royqh.easypersist.annotations.MapRelation;
import net.royqh.easypersist.model.MapRelationInfo;
import net.royqh.easypersist.model.SubEntityInfo;
import net.royqh.easypersist.model.jpa.*;
import net.royqh.easypersist.model.jpa.CollectionTable;
import net.royqh.easypersist.model.jpa.Column;
import net.royqh.easypersist.model.jpa.ElementCollection;
import net.royqh.easypersist.model.jpa.Index;
import net.royqh.easypersist.model.jpa.JoinColumn;
import net.royqh.easypersist.model.jpa.JoinTable;
import net.royqh.easypersist.model.jpa.ManyToMany;
import net.royqh.easypersist.model.jpa.ManyToOne;
import net.royqh.easypersist.model.jpa.OneToMany;
import net.royqh.easypersist.model.jpa.OneToOne;
import net.royqh.easypersist.model.jpa.Table;
import net.royqh.easypersist.model.jpa.UniqueConstraint;
import net.royqh.easypersist.parsers.ParseError;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;
import java.util.*;

import static java.util.Collections.EMPTY_SET;

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
            Index[] indexes=parseTableIndexes(tableAnnotation);
            table.setIndexes(indexes);
            UniqueConstraint[] uniqueConstraints=parseTableUniqueContraints(tableAnnotation);
            table.setUniqueConstraints(uniqueConstraints);
            return table;
        } else {
            return new Table();
        }
    }

    private static UniqueConstraint[] parseTableUniqueContraints(PsiAnnotation tableAnnotation) {
        PsiAnnotation[] constraintAnnos=AnnotationUtils.getAnnotationArray(tableAnnotation,"uniqueConstraints");
        UniqueConstraint[] constraints=new UniqueConstraint[constraintAnnos.length];
        for (int i=0;i<constraintAnnos.length;i++){
            PsiAnnotation constraintAnno=constraintAnnos[i];
            UniqueConstraint uniqueConstraint=new UniqueConstraint();
            uniqueConstraint.setName(AnnotationUtils.getValue(constraintAnno,"name"));
            uniqueConstraint.setColumnNames(AnnotationUtils.getValues(constraintAnno, "columnNames"));
            constraints[i]=uniqueConstraint;
        }
        return constraints;
    }

    private static Index[] parseTableIndexes(PsiAnnotation tableAnnotation) {
        PsiAnnotation[] indexAnnos=AnnotationUtils.getAnnotationArray(tableAnnotation,"indexes");
        Index[] indexes=new Index[indexAnnos.length];
        for (int i=0;i<indexAnnos.length;i++){
            PsiAnnotation indexAnno=indexAnnos[i];
            Index index=new Index();
            index.setName(AnnotationUtils.getValue(indexAnno,"name"));
            index.setUnique(AnnotationUtils.getBooleanValue(indexAnno,"unique"));
            index.setColumnList(AnnotationUtils.getValue(indexAnno,"columnList"));
            indexes[i]=index;
        }
        return indexes;
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
            column.setUpdatable(AnnotationUtils.getBooleanValue(columnAnno, "updatable"));
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

    public static EnumType parseEnumerated(PsiMethod psiMethod) {
        PsiAnnotation temporalAnno=AnnotationUtils.findAnnotation(psiMethod,Constants.ENUMERATED);
        if (temporalAnno==null) {
            return null;
        }
        return AnnotationUtils.getEnumValue(temporalAnno,null,EnumType.class);
    }

    public static List<MapRelationInfo> parseMapRelations(PsiClass psiClass) {
        PsiAnnotation annotation=AnnotationUtils.findAnnotation(psiClass,Constants.MAP_RELATIONS);
        if (annotation!=null) {
            List<MapRelationInfo> relationInfos=parseMapRelationsArray(annotation);
            return relationInfos;
        } else {
            return Collections.EMPTY_LIST;
        }
    }

    private static List<MapRelationInfo> parseMapRelationsArray(PsiAnnotation annotation) {
        PsiAnnotation[] relationAnnos=AnnotationUtils.getAnnotationArray(annotation,"relations");
        List<MapRelationInfo> relationInfos=new ArrayList<>();
        for (int i=0;i<relationAnnos.length;i++){
            PsiAnnotation relationAnno=relationAnnos[i];
            MapRelationInfo relationInfo=new MapRelationInfo();
            relationInfo.setMapTable(AnnotationUtils.getValue(relationAnno,"table"));
            relationInfo.setMappingEntityFullClassName(AnnotationUtils.getClassName(relationAnno,"mappingEntityClass"));
            relationInfo.setMappingEntityIdColumn(AnnotationUtils.getValue(relationAnno,"mappingEntityIdColumn"));
            relationInfo.setIdColumn(AnnotationUtils.getValue(relationAnno,"idColumn"));
            relationInfos.add(relationInfo);
        }
        return relationInfos;
    }

    public static boolean parseLob(PsiMethod psiMethod) {
        PsiAnnotation temporalAnno=AnnotationUtils.findAnnotation(psiMethod,Constants.LOB);
        if (temporalAnno==null) {
            return false;
        }
        return true;
    }

    public static String parseChineseAlias(PsiModifierListOwner psiModifierListOwner) {
        PsiAnnotation chineseAnnotation=AnnotationUtils.findAnnotation(psiModifierListOwner,
                Constants.CHINESE_ALIAS);
        if (chineseAnnotation==null) {
            return null;
        } else {
            return AnnotationUtils.getValue(chineseAnnotation, "value");
        }
    }

    public static Set<SubEntityInfo> parseSubEntities(PsiModifierListOwner psiModifierListOwner) {
        PsiAnnotation subEntitiesAnnotation=AnnotationUtils.findAnnotation(psiModifierListOwner,
                Constants.SUB_ENTITIES);
        if (subEntitiesAnnotation==null) {
            return EMPTY_SET;
        } else {
            String[] values=AnnotationUtils.getClassNames(subEntitiesAnnotation, "value");
            Set<SubEntityInfo> subEntityInfos=new HashSet<>();
            for (String v:values)  {
                subEntityInfos.add(new SubEntityInfo(v));
            }
            return subEntityInfos;
        }
    }
}
