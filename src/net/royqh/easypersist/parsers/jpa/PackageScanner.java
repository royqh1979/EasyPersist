package net.royqh.easypersist.parsers.jpa;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.impl.JavaPsiFacadeImpl;
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

    public void scanInProject(EntitiesConfig entitiesConfig, Project project, MappingRepository mappingRepository,
                              int configNo, int numConfigs, ProgressIndicator indicator){

        //System.out.println(entitiesConfig);
        JavaPsiFacade facade=JavaPsiFacade.getInstance(project);
        PsiPackage entityPackage=facade.findPackage(entitiesConfig.getEntityPackage());
        if (entityPackage==null) {
            throw new RuntimeException("Can't find Package:"+entitiesConfig.getEntityPackage());
        }
        scanPackage(entityPackage, mappingRepository,
                entitiesConfig.getEntityPackage(),
                entitiesConfig.getOutputPackage(),configNo,numConfigs,indicator);
    }

    private void scanPackage(PsiPackage entityPackage, MappingRepository mappingRepository, String entitiesPackage, String outputPackage,
                             int configNo, int numConfigs, ProgressIndicator indicator) {
        int i=1;
        int n=entityPackage.getClasses().length;
        for (PsiClass psiClass:entityPackage.getClasses()){
            indicator.checkCanceled();
            indicator.setText("parsing "+psiClass.getQualifiedName());
            scanClass(psiClass, mappingRepository, entitiesPackage, outputPackage);
            indicator.setFraction((configNo+(0.0+i)/n)/numConfigs);
        }
        for (PsiPackage subPackage:entityPackage.getSubPackages()){
            scanPackage(subPackage, mappingRepository, entitiesPackage+"."+subPackage.getName(),
                    outputPackage+"."+subPackage.getName(), configNo,numConfigs, indicator);
        }
    }

    private static void scanClass(PsiClass psiClass, MappingRepository mappingRepository, String entitiesPackage, String persistorPackage) {
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
        entity.setPackageName(entitiesPackage);
        entity.setPersistorPackageName(persistorPackage);
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
