package net.royqh.easypersist.entity.generator.view;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.module.Module;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import net.royqh.easypersist.entity.generator.EditorStyle;
import net.royqh.easypersist.entity.generator.TemplateLoader;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.model.MapRelationInfo;
import net.royqh.easypersist.entity.model.SubEntityInfo;
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.utils.TemplateUtils;

import java.io.*;
import java.util.*;

/**
 * Created by Roy on 2017/6/24.
 */
public class ControllerGenerator {
    private static Template ControllerForCodeEditorTemplate = TemplateLoader.loadTemplate("Controller-CodeEdit.ftl");
    private static Template ControllerForFullEditorTemplate = TemplateLoader.loadTemplate("Controller-FullEdit.ftl");

    public static void generateController(EditorStyle editorStyle, PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module) {
        String controllerClassName = CodeUtils.getControllerName(entity);
        String fileName = controllerClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateControllerFile(editorStyle,entity, null, psiFileFactory, module);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateControllerFile(EditorStyle editorStyle, Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory, Module module) {
        String controllerClassName = CodeUtils.getControllerName(entity);
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
        
        try {
            if (editorStyle==EditorStyle.NormalStyle) {
                dataModel.put("indexedProperties", CodeUtils.getAllIndexedProperties(entity));
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
            } else {
                ControllerForCodeEditorTemplate.process(dataModel, writer);
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

        try {
            Writer fileWriter=new OutputStreamWriter(new FileOutputStream("f:\\test.java"),"UTF-8");
            fileWriter.write(writer.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return psiFileFactory.createFileFromText(controllerClassName + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }

}

