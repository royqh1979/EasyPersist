package net.royqh.easypersist.entity.parser;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiMethod;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.entity.model.jpa.Constants;
import net.royqh.easypersist.entity.parser.jpa.MethodParser;
import net.royqh.easypersist.utils.TypeUtils;

/**
 * Created by roy on 2017/9/6.
 */
public class FactTableParser {
    public static FactTableInfo parse(Entity entity, PsiClass psiClass) {
        FactTableInfo factTable = new FactTableInfo();
        for (PsiMethod psiMethod : psiClass.getMethods()) {
            String methodName = psiMethod.getName();
            if (!MethodParser.isGetter(psiMethod)) {
                continue;
            }
            Property property = entity.getProperty(TypeUtils.getPropertyNameByGetter(psiMethod));
            int annoCounts = 0;
            if (TypeUtils.containsAnnotation(psiMethod, Constants.REFERENCE)) {
                if (TypeUtils.containsAnnotation(psiMethod, Constants.ENTITY_KEY)) {
                    if (factTable.getEntityKeyProperty() != null) {
                        throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + " contains more than one @EntityKey!");
                    }
                    if (!(property instanceof ReferenceSingleProperty)) {
                        throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + "'s EntityKey property " + property.getName() + " is not a @Reference property!");
                    }
                    factTable.setEntityKeyProperty((ReferenceSingleProperty) property);
                    annoCounts++;
                }
                if (TypeUtils.containsAnnotation(psiMethod, Constants.PROPERTY_KEY)) {
                    if (factTable.getPropertyKeyProperty() != null) {
                        throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + " contains more than one @PropertyKey!");
                    }
                    if (!(property instanceof ReferenceSingleProperty)) {
                        throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + "'s PropertyKey property " + property.getName() + " is not a @Reference property!");

                    }
                    factTable.setPropertyKeyProperty((ReferenceSingleProperty) property);
                    annoCounts++;
                }
            }
            if (TypeUtils.containsAnnotation(psiMethod, Constants.VALUE_COLUMN)) {
                if (factTable.getValueProperty() != null) {
                    throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + " contains more than one @ValueColumn!");
                }
                if (!(property instanceof SingleProperty)) {
                    throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + "'s PropertyKey property " + property.getName() + " is not a value property!");

                }
                factTable.setValueProperty((SingleProperty) property);
                annoCounts++;
            }
            if (annoCounts > 1) {
                throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + "'s property " + property.getName() + " have more than one @EntityKey / @PropertyKey /@ValueColumn at the same time!");
            }
        }
        if (factTable.getEntityKeyProperty() == null) {
            throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + " doesn't have @EntityKey annotated property!");
        }
        if (factTable.getPropertyKeyProperty() == null) {
            throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + " doesn't have @PropertyKey annotated property!");
        }
        if (factTable.getValueProperty() == null) {
            throw new RuntimeException("Fact Table " + psiClass.getQualifiedName() + " doesn't have @ValueColumn annotated property!");
        }
        return factTable;
    }
}
