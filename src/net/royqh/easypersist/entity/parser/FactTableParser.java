package net.royqh.easypersist.entity.parser;

import com.intellij.openapi.module.Module;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiMethod;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.entity.model.jpa.Constants;
import net.royqh.easypersist.entity.parser.jpa.MethodParser;
import net.royqh.easypersist.entity.utils.TypeUtils;

/**
 * Created by roy on 2017/9/6.
 */
public class FactTableParser {
    public static FactTable parse(Entity entity,PsiClass psiClass, Module module) {
        FactTable factTable=new FactTable();
        for (PsiMethod psiMethod:psiClass.getMethods()) {
            String methodName = psiMethod.getName();
            if (MethodParser.isGetter(psiMethod) && TypeUtils.containsAnnotation(psiMethod, Constants.REFERENCE)) {
                Property property=entity.getProperty(TypeUtils.getPropertyNameByGetter(psiMethod));
                if (TypeUtils.containsAnnotation(psiMethod,Constants.ENTITY_KEY)
                        && TypeUtils.containsAnnotation(psiMethod,Constants.PROPERTY_KEY)) {
                    throw new RuntimeException("Fact Table "+psiClass.getQualifiedName()+ "'s property "+ property.getName()+" have @EntityKey and @PropertyKey at the same time!");
                } else if (TypeUtils.containsAnnotation(psiMethod,Constants.ENTITY_KEY)) {
                    if (factTable.getEntityKeyProperty()!=null) {
                        throw new RuntimeException("Fact Table "+psiClass.getQualifiedName()+ " contains more than one @EntityKey!");
                    }
                    if (!(property instanceof ReferenceSingleProperty)) {
                        throw new RuntimeException("Fact Table "+psiClass.getQualifiedName()+ "'s EntityKey property "+ property.getName()+" is not a @Reference property!");
                    }
                    factTable.setEntityKeyProperty((SingleProperty)property);
                } else if (TypeUtils.containsAnnotation(psiMethod,Constants.PROPERTY_KEY)) {
                    if (factTable.getPropertyKeyProperty()!=null) {
                        throw new RuntimeException("Fact Table "+psiClass.getQualifiedName()+ " contains more than one @PropertyKey!");
                    }
                    if (!(property instanceof ReferenceSingleProperty)) {
                        throw new RuntimeException("Fact Table "+psiClass.getQualifiedName()+ "'s PropertyKey property "+ property.getName()+" is not a @Reference property!");

                    }
                    factTable.setPropertyKeyProperty((SingleProperty)property);
                }
            }
        }
        if (factTable.getEntityKeyProperty()==null) {
            throw new RuntimeException("Fact Table "+psiClass.getQualifiedName()+ " doesn't have @EntityKey annotated property!");
        }
        if (factTable.getPropertyKeyProperty()==null) {
            throw new RuntimeException("Fact Table "+psiClass.getQualifiedName()+ " doesn't have @PropertyKey annotated property!");
        }
        return  factTable;
    }
}
