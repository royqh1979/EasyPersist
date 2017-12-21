package net.royqh.easypersist.entity.generator.service;

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
import net.royqh.easypersist.entity.model.SubEntityInfo;
import net.royqh.easypersist.ui.ViewType;
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
    private static Template ServiceForSearchViewTemplate =TemplateLoader.loadTemplate("Service-SearchView.ftl");
    private static Template ServiceForSubEntityFullEditorTemplate =TemplateLoader.loadTemplate("Service-SubEntity.ftl");

    public static void generateService(ViewType viewType, PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module, boolean importEnabled, boolean exportEnabled) {
        String serviceClassName = CodeUtils.getServiceName(entity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateServiceFile(viewType, entity, null, psiFileFactory,module,importEnabled,exportEnabled);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
        if (viewType.containsFullFunctionEditor() || viewType.containsSearchView()) {
            for (SubEntityInfo subEntityInfo : entity.getSubEntities()) {
                generateSubEntityService(psiFileFactory, codeStyleManager, subEntityInfo, entity, psiOutputDir, module,viewType);
            }
        }
    }

    private static void generateSubEntityService(PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, SubEntityInfo subEntityInfo, Entity entity, PsiDirectory psiOutputDir, Module module, ViewType viewType) {
        Entity subEntity=subEntityInfo.getSubEntity();
        String serviceClassName = CodeUtils.getServiceName(subEntity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateSubEntityServiceFile(subEntityInfo, psiFileFactory,module,viewType);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateSubEntityServiceFile(SubEntityInfo subEntityInfo, PsiFileFactory psiFileFactory, Module module, ViewType viewType) {
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
        String persistorCompositorType=CodeUtils.getPersistCompositorType(subEntity,module);
        if (persistorCompositorType!=null) {
            typeList.add(persistorCompositorType);
        }
        String persistorType=CodeUtils.getPersistorType(subEntity,module);
        if (persistorType!=null) {
            typeList.add(persistorType);
        }
        typeList.addAll(CodeUtils.getMappedTypePersistorList(subEntity,module));
        typeList.addAll(CodeUtils.getRefencedTypes(subEntity));
        typeList.addAll(CodeUtils.getReferencedPersistCompositorTypes(subEntity,module));
        dataModel.put("typeList",typeList);
        dataModel.put("refPropertyType",TypeUtils.getShortTypeName(subEntityInfo.getSubEntityReferenceProperty().getType()));
        dataModel.put("forFullEditor",viewType.containsFullFunctionEditor());
        dataModel.put("forSearchView",viewType.containsSearchView());
        try {
            ServiceForSubEntityFullEditorTemplate.process(dataModel,writer);
            dataModel.clear();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }


    private static PsiFile generateServiceFile(ViewType viewType, Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory, Module module, boolean importEnabled, boolean exportEnabled) {
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
        dataModel.put("importEnabled",importEnabled);
        dataModel.put("exportEnabled",exportEnabled);


        Set<String> typeList=CodeUtils.getRefencedTypes(entity);
        dataModel.put("typeList",typeList);
        String persistCompositorType=CodeUtils.getPersistCompositorType(entity,module);
        if (persistCompositorType!=null) {
            typeList.add(persistCompositorType);
        }
        String persistorType=CodeUtils.getPersistorType(entity,module);
        if (persistorType!=null) {
            typeList.add(persistorType);
        }
        typeList.addAll(CodeUtils.getReferencedPersistCompositorTypes(entity,module));
        dataModel.put("indexedProperties",CodeUtils.getAllIndexedProperties(entity));
        try {
            if (viewType.containsFullFunctionEditor()) {
                typeList.addAll(CodeUtils.getMappedTypeList(entity));
                typeList.addAll(CodeUtils.getMappedTypePersistorList(entity,module));
                dataModel.put("includeSearchView",viewType.containsSearchView());
                ServiceForFullEditorTemplate.process(dataModel,writer);
            }
            if (viewType.containsExcelStyleEditor()) {
                dataModel.put("includeSearchView",viewType.containsSearchView());
                ServiceForCodeEditorTemplate.process(dataModel, writer);
            }
            if (viewType==ViewType.SearchViewOnly) {
                typeList.addAll(CodeUtils.getReferencedPersistCompositorTypes(entity,module));
                ServiceForSearchViewTemplate.process(dataModel, writer);
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
