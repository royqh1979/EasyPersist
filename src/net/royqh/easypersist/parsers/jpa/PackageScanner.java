package net.royqh.easypersist.parsers.jpa;

import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import net.royqh.easypersist.MappingRepository;
import net.royqh.easypersist.model.config.EntitiesConfig;
import net.royqh.easypersist.parsers.ParseError;
import net.royqh.easypersist.utils.TypeUtils;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.jpa.Constants;

/**
 * Created by Roy on 2016/2/11.
 */
public class PackageScanner {
    public MappingRepository scan(String entityPackageName,Project project){
        //System.out.println(entitiesConfig);
        JavaPsiFacade facade=JavaPsiFacade.getInstance(project);
        PsiPackage entityPackage=facade.findPackage(entityPackageName);
        MappingRepository mappingRepository =new MappingRepository();
        scanPackage(entityPackage, mappingRepository);
        return mappingRepository;
    }

    private void scanPackage(PsiPackage entityPackage, MappingRepository mappingRepository) {
        for (PsiClass psiClass:entityPackage.getClasses()){
            scanClass(psiClass, mappingRepository);
        }
        for (PsiPackage subPackage:entityPackage.getSubPackages()){
            //TODO: how to process target sub package?
            scanPackage(subPackage, mappingRepository);
        }
    }

    private static void scanClass(PsiClass psiClass, MappingRepository mappingRepository) {
        PsiAnnotation[] annotations=psiClass.getModifierList().getAnnotations();
        if (!TypeUtils.containsAnnotation(psiClass, Constants.ENTITY)){
            return;
        }

        if (!psiClass.hasModifierProperty(PsiModifier.PUBLIC)){
            throw new ParseError(String.format("Class %s is not public",psiClass.getQualifiedName()));
        }
        if (psiClass.hasModifierProperty(PsiModifier.ABSTRACT)){
            throw new ParseError(String.format("Class %s is abstract",psiClass.getQualifiedName()));
        }
        Entity entity=ClassParser.parseEntityClass(psiClass);
        mappingRepository.addEntity(entity);
    }

     /**
     * method to dump Annotations, for debug only
     * @param modifierListOwner
     */
    private void dumpAnnotations(PsiModifierListOwner modifierListOwner) {
        for (PsiAnnotation annotation:modifierListOwner.getModifierList().getAnnotations()){
            System.out.println(annotation.getQualifiedName());
        }
    }
}
