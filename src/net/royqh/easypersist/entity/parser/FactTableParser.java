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
                        throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "包含多个@EntityKey注解属性（只能有一个）!");
                    }
                    if (!(property instanceof ReferenceSingleProperty)) {
                        throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "的@EntityKey注解属性" + property.getName() + "缺少@Reference注解!");
                    }
                    factTable.setEntityKeyProperty((ReferenceSingleProperty) property);
                    annoCounts++;
                }
                if (TypeUtils.containsAnnotation(psiMethod, Constants.PROPERTY_KEY)) {
                    if (factTable.getPropertyKeyProperty() != null) {
                        throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "包含多个@PropertyKey注解属性（只能有一个）!");
                    }
                    if (!(property instanceof ReferenceSingleProperty)) {
                        throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "的@PropertyKey注解属性" + property.getName() + "缺少@Reference注解!");

                    }
                    factTable.setPropertyKeyProperty((ReferenceSingleProperty) property);
                    annoCounts++;
                }
            }
            if (TypeUtils.containsAnnotation(psiMethod, Constants.VALUE_COLUMN)) {
                if (factTable.getValueProperty() != null) {
                    throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "包含多个@ValueColumn注解!");
                }
                if (!(property instanceof SingleProperty)) {
                    throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "的@ValueColumn属性" + property.getName() + "不是个普通值属性!");

                }
                factTable.setValueProperty((SingleProperty) property);
                annoCounts++;
            }
            if (annoCounts > 1) {
                throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "的属性" + property.getName() + "同时包含@EntityKey / @PropertyKey /@ValueColumn注解!");
            }
        }
        if (factTable.getEntityKeyProperty() == null) {
            throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "缺少@EntityKey注解属性!");
        }
        if (factTable.getPropertyKeyProperty() == null) {
            throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "缺少@PropertyKey注解属性!");
        }
        if (factTable.getValueProperty() == null) {
            throw new RuntimeException("事实表实体类" + psiClass.getQualifiedName() + "缺少@ValueColumn注解属性!");
        }
        return factTable;
    }
}
