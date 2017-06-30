package net.royqh.easypersist.parsers.jpa;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.SourceFolder;
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
        if (!ClassParser.isEntityClass(psiClass)) {
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

     /*
     * method to dump Annotations, for debug only
     * @param modifierListOwner
     */
     /*
    private void dumpAnnotations(PsiModifierListOwner modifierListOwner) {
        for (PsiAnnotation annotation:modifierListOwner.getModifierList().getAnnotations()){
            System.out.println(annotation.getQualifiedName());
        }
    }
    */

    public void scanInModule(EntitiesConfig entitiesConfig, Module module, MappingRepository mappingRepository, int configNo, int numConfigs, ProgressIndicator indicator) {
        //System.out.println(entitiesConfig);
        PsiPackage entityPackage=findPackage(module,entitiesConfig.getEntityPackage());
        if (entityPackage==null) {
            throw new RuntimeException("Can't find Package:"+entitiesConfig.getEntityPackage());
        }
        scanPackageInModule(module,entityPackage, mappingRepository,
                entitiesConfig.getEntityPackage(),
                entitiesConfig.getOutputPackage(),configNo,numConfigs,indicator);

    }

    private void scanPackageInModule(Module module, PsiPackage entityPackage, MappingRepository mappingRepository, String entityPackageName, String outputPackage, int configNo, int numConfigs, ProgressIndicator indicator) {
        int i=1;
        PsiClass[] classes=entityPackage.getClasses(module.getModuleWithDependenciesScope());
        int n=classes.length;
        for (PsiClass psiClass:classes){
            indicator.checkCanceled();
            indicator.setText("parsing "+psiClass.getQualifiedName());
            scanClass(psiClass, mappingRepository, entityPackageName, outputPackage);
            indicator.setFraction((configNo+(0.0+i)/n)/numConfigs);
        }
        for (PsiPackage subPackage:entityPackage.getSubPackages()){
            scanPackageInModule(module,subPackage, mappingRepository, subPackage.getQualifiedName(),
                    outputPackage+"."+subPackage.getName(), configNo,numConfigs, indicator);
        }
    }

    private PsiDirectory findPackageDir(Module module,String packageName) {
        SourceFolder[] sourceFolders= ModuleRootManager.getInstance(module).getContentEntries()[0].getSourceFolders();
        if (sourceFolders.length<=0) {
            throw new RuntimeException("Can't find Source Folder for project!");
        }
        PsiManager manager=PsiManager.getInstance(module.getProject());
        PsiDirectory sourceDir=manager.findDirectory(sourceFolders[0].getFile());
        String[] subPackNames=packageName.split("\\.");
        PsiDirectory packDir=sourceDir;
        for (String subPackName:subPackNames) {
            packDir=packDir.findSubdirectory(subPackName);
            if (packDir==null) {
                throw new RuntimeException("Can't find package "+packageName+" in module "+module.getName());
            }
        }
        return packDir;
    }

    private PsiPackage findPackage(Module module, String packageName) {
        PsiDirectory packDir=findPackageDir(module,packageName);
        PsiPackage targetPackage = JavaDirectoryService.getInstance().getPackage(packDir);
        return targetPackage;
    }
}
