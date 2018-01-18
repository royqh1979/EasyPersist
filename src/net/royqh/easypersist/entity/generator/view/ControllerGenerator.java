package net.royqh.easypersist.entity.generator.view;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.module.Module;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiPackage;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import net.royqh.easypersist.entity.generator.TemplateLoader;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.model.MapRelationInfo;
import net.royqh.easypersist.entity.model.SubEntityInfo;
import net.royqh.easypersist.ui.editor.ViewType;
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.utils.TemplateUtils;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class ControllerGenerator {
    private static Template ControllerForCodeEditorTemplate = TemplateLoader.loadTemplate("Controller-CodeEdit.ftl");
    private static Template ControllerForFullEditorTemplate = TemplateLoader.loadTemplate("Controller-FullEdit.ftl");
    private static Template ControllerForSearchViewTemplate = TemplateLoader.loadTemplate("Controller-SearchView.ftl");

    public static void generateController(ViewType viewType, PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module, boolean importEnabled, boolean exportEnabled) {
        if (viewType.containsExcelStyleEditor()) {
            generateEditorController(ViewType.ExcelStyleEditorOnly, psiFileFactory,codeStyleManager,entity,psiOutputDir,module,importEnabled,exportEnabled);
        }
        if (viewType.containsFullFunctionEditor()) {
            generateEditorController(ViewType.FullFunctionEditorOnly, psiFileFactory,codeStyleManager,entity,psiOutputDir,module,importEnabled,exportEnabled);
        }
        if (viewType.containsSearchView()) {
            generateSearchViewController(psiFileFactory,codeStyleManager,entity,psiOutputDir,module,exportEnabled);
        }
    }
    private static void generateEditorController(ViewType viewType, PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module, boolean importEnabled, boolean exportEnabled) {
        String controllerClassName = CodeUtils.getEditorControllerName(entity);
        String fileName = controllerClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateControllerFile(viewType,entity, null, psiFileFactory, module,importEnabled,exportEnabled);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static void generateSearchViewController(PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module, boolean exportEnabled) {
        String controllerClassName = CodeUtils.getViewControllerName(entity);
        String fileName = controllerClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateControllerFile(ViewType.SearchViewOnly,entity, null, psiFileFactory, module,false,exportEnabled);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateControllerFile(ViewType viewType, Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory, Module module, boolean importEnabled, boolean exportEnabled) {
        String controllerClassName;
        if (viewType==ViewType.SearchViewOnly) {
            controllerClassName = CodeUtils.getViewControllerName(entity);
        } else {
            controllerClassName = CodeUtils.getEditorControllerName(entity);
        }
        StringWriter writer = new StringWriter();
        if (targetPackage != null) {
            writer.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            writer.append("package dummy;\n");
        }

        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        Set<String> typeList = CodeUtils.getPropertyTypes(entity, true);
        String serviceType=CodeUtils.getServiceType(entity,module);
        if (serviceType!=null) {
            typeList.add(serviceType);
        }
        typeList.addAll(CodeUtils.getRefencedServiceTypes(entity,module));
        dataModel.put("typeList", typeList);
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(entity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        dataModel.put("importEnabled",importEnabled);
        dataModel.put("exportEnabled",exportEnabled);
        dataModel.put("indexedProperties", CodeUtils.getAllIndexedProperties(entity));

        try {
            if (viewType==ViewType.FullFunctionEditorOnly ) {
                Set<Entity> serviceEntities=new HashSet<>();
                for (SubEntityInfo subEntityInfo:entity.getSubEntities()) {
                    //add entities referenced by subEntity
                    Set<Entity> subRefEntities=CodeUtils.getRefencingEntities(subEntityInfo.getSubEntity());
                    refEntities.addAll(subRefEntities);
                    //add import types used by subEntity
                    String subServiceType=CodeUtils.getServiceType(subEntityInfo.getSubEntity(),module);
                    if (subServiceType!=null) {
                        typeList.add(subServiceType);
                    }
                    typeList.addAll(CodeUtils.getRefencedServiceTypes(subEntityInfo.getSubEntity(),module));
                    typeList.addAll(CodeUtils.getPropertyTypes(subEntityInfo.getSubEntity(), true));
                    serviceEntities.add(subEntityInfo.getSubEntity());
                }
                for (MapRelationInfo mapRelationInfo:entity.getMapRelationInfos()){
                    Entity mapEntity=entity.getMappingRepository().findEntityByClass(mapRelationInfo.getMappingEntityFullClassName());
                    Set<Entity> mapRefEntities=CodeUtils.getRefencingEntities(mapEntity);
                    refEntities.addAll(mapRefEntities);
                    typeList.addAll(CodeUtils.getPropertyTypes(mapEntity,true));
                    typeList.addAll(CodeUtils.getRefencedServiceTypes(mapEntity,module));
                    serviceEntities.add(mapEntity);
                }
                refEntities.remove(entity);
                serviceEntities.addAll(refEntities);
                dataModel.put("serviceEntities",serviceEntities);
                ControllerForFullEditorTemplate.process(dataModel, writer);
            }
            if (viewType==ViewType.ExcelStyleEditorOnly){
                ControllerForCodeEditorTemplate.process(dataModel, writer);
            }
            if (viewType==ViewType.SearchViewOnly){
                Set<Entity> serviceEntities=new HashSet<>();
                for (SubEntityInfo subEntityInfo:entity.getSubEntities()) {
                    //add import types used by subEntity
                    String subServiceType=CodeUtils.getServiceType(subEntityInfo.getSubEntity(),module);
                    if (subServiceType!=null) {
                        typeList.add(subServiceType);
                    }
                    serviceEntities.add(subEntityInfo.getSubEntity());
                    typeList.add(subEntityInfo.getSubEntity().getClassInfo().getQualifiedName());
                }
                refEntities.remove(entity);
                serviceEntities.addAll(refEntities);
                dataModel.put("serviceEntities",serviceEntities);
                ControllerForSearchViewTemplate.process(dataModel, writer);
            }
            dataModel.clear();

            /*
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(
                    new FileOutputStream("f:/test.java"),
                    "UTF-8"
            ) ;
            outputStreamWriter.write(writer.toString());
            outputStreamWriter.close();
            */
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        /*
        try {
            Writer fileWriter=new OutputStreamWriter(new FileOutputStream("f:\\test.java"),"UTF-8");
            fileWriter.write(writer.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        return psiFileFactory.createFileFromText(controllerClassName + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }

}

