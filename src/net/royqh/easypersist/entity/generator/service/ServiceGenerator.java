package net.royqh.easypersist.entity.generator.service;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.module.Module;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import net.royqh.easypersist.entity.generator.EditorStyle;
import net.royqh.easypersist.entity.generator.TemplateLoader;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.utils.TemplateUtils;
import net.royqh.easypersist.utils.TypeUtils;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class ServiceGenerator {

    private static Template ServiceForCodeEditorTemplate = TemplateLoader.loadTemplate("Service-CodeEditor.ftl");
    private static Template ServiceForFullEditorTemplate =TemplateLoader.loadTemplate("Service-FullEditor.ftl");
    private static Template ServiceForSubEntityFullEditorTemplate =TemplateLoader.loadTemplate("Service-SubEntityFullEditor.ftl");

    public static void generateService(EditorStyle editorStyle, PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module) {
        String serviceClassName = CodeUtils.getServiceName(entity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateServiceFile(editorStyle, entity, null, psiFileFactory,module);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
        if (editorStyle==EditorStyle.NormalStyle) {
            for (SubEntityInfo subEntityInfo : entity.getSubEntities()) {
                generateSubEntityService(psiFileFactory, codeStyleManager, subEntityInfo, entity, psiOutputDir, module);
            }
        }
    }

    private static void generateSubEntityService(PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, SubEntityInfo subEntityInfo, Entity entity, PsiDirectory psiOutputDir, Module module) {
        Entity subEntity=subEntityInfo.getSubEntity();
        String serviceClassName = CodeUtils.getServiceName(subEntity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateSubEntityServiceFile(subEntityInfo, psiFileFactory,module);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateSubEntityServiceFile(SubEntityInfo subEntityInfo, PsiFileFactory psiFileFactory, Module module) {
        Entity subEntity=subEntityInfo.getSubEntity();
        String className = CodeUtils.getServiceName(subEntity);
        StringWriter writer = new StringWriter();
        writer.append("package dummy;\n");
        /*---*/
        Map<String,Object> dataModel=new HashMap<>();
        dataModel.put("subEntity",subEntityInfo.getSubEntity());
        dataModel.put("subEntityInfo",subEntityInfo);
        dataModel.put("idType", TypeUtils.getShortTypeName(subEntityInfo.getSubEntity().getIdProperty().getType()));
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        dataModel.put("indexedProperties",CodeUtils.getAllIndexedProperties(subEntity));
        Set<String> typeList=CodeUtils.getMappedTypeList(subEntity);
        String persistorType=CodeUtils.getPersistorType(subEntity,module);
        if (persistorType!=null) {
            typeList.add(persistorType);
        }
        typeList.addAll(CodeUtils.getMappedTypePersistorList(subEntity,module));
        typeList.addAll(CodeUtils.getRefencedTypes(subEntity));
        dataModel.put("typeList",typeList);
        dataModel.put("refPropertyType",TypeUtils.getShortTypeName(subEntityInfo.getSubEntityReferenceProperty().getType()));
        try {
            ServiceForSubEntityFullEditorTemplate.process(dataModel,writer);
            dataModel.clear();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }


    private static PsiFile generateServiceFile(EditorStyle editorStyle, Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory, Module module) {
        String className = CodeUtils.getServiceName(entity);
        StringWriter writer = new StringWriter();
        if (targetPackage != null) {
            writer.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            writer.append("package dummy;\n");
        }

        /*---*/
        Map<String,Object> dataModel=new HashMap<>();
        dataModel.put("entity",entity);
        dataModel.put("idType", TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        dataModel.put("templateUtils", TemplateUtils.templateUtils);

        Set<String> typeList=CodeUtils.getRefencedTypes(entity);
        dataModel.put("typeList",typeList);
        try {
            if (editorStyle==EditorStyle.NormalStyle) {
                dataModel.put("indexedProperties",CodeUtils.getAllIndexedProperties(entity));
                typeList.addAll(CodeUtils.getMappedTypeList(entity));
                String persistorType=CodeUtils.getPersistorType(entity,module);
                if (persistorType!=null) {
                    typeList.add(persistorType);
                }
                typeList.addAll(CodeUtils.getMappedTypePersistorList(entity,module));
                ServiceForFullEditorTemplate.process(dataModel,writer);
            } else if (editorStyle==EditorStyle.ExcelStyle) {
                String persistorType=CodeUtils.getPersistorType(entity,module);
                if (persistorType!=null) {
                    typeList.add(persistorType);
                }
                typeList.addAll(CodeUtils.getReferencedPersistorTypes(entity,module));
                ServiceForCodeEditorTemplate.process(dataModel, writer);
            }
            dataModel.clear();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }

    /* used by free marker */
}
