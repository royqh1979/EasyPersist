package net.royqh.easypersist.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import net.royqh.easypersist.model.*;
import net.royqh.easypersist.utils.TypeUtils;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class ServiceGenerator {

    private static Template ServiceForCodeEditorTemplate =TemplateLoader.loadTemplate("Service-CodeEditor.ftl");
    private static Template ServiceForFullEditorTemplate =TemplateLoader.loadTemplate("Service-FullEditor.ftl");
    private static Template ServiceForSubEntityFullEditorTemplate =TemplateLoader.loadTemplate("Service-SubEntityFullEditor.ftl");
    private static ServiceGenerator generator=new ServiceGenerator();

    public static void generateService(EditorStyle editorStyle,PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir) {
        String serviceClassName = CodeUtils.getServiceName(entity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateServiceFile(editorStyle, entity, null, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
        if (editorStyle==EditorStyle.NormalStyle) {
            for (SubEntityInfo subEntityInfo : entity.getSubEntities()) {
                generateSubEntityService(psiFileFactory, codeStyleManager, subEntityInfo, entity, psiOutputDir);
            }
        }
    }

    private static void generateSubEntityService(PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, SubEntityInfo subEntityInfo, Entity entity, PsiDirectory psiOutputDir) {
        Entity subEntity=subEntityInfo.getSubEntity();
        String serviceClassName = CodeUtils.getServiceName(subEntity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateSubEntityServiceFile(subEntityInfo, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateSubEntityServiceFile(SubEntityInfo subEntityInfo, PsiFileFactory psiFileFactory) {
        Entity subEntity=subEntityInfo.getSubEntity();
        String className = CodeUtils.getServiceName(subEntity);
        StringWriter writer = new StringWriter();
        writer.append("package dummy;\n");
        /*---*/
        Map<String,Object> dataModel=new HashMap<>();
        dataModel.put("subEntity",subEntityInfo.getSubEntity());
        dataModel.put("subEntityInfo",subEntityInfo);
        dataModel.put("idType", TypeUtils.getShortTypeName(subEntityInfo.getSubEntity().getIdProperty().getType()));
        dataModel.put("generator", generator);
        dataModel.put("indexedProperties",CodeUtils.getAllIndexProperties(subEntity));
        dataModel.put("typeList",CodeUtils.getMappedTypeList(subEntity));
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


    private static PsiFile generateServiceFile(EditorStyle editorStyle, Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String className = CodeUtils.getServiceName(entity);
        String persistorName=CodeUtils.getPersistorCompositorName(entity);
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
        dataModel.put("generator", generator);

        Set<String> typeList=CodeUtils.getRefencedTypeList(entity);
        dataModel.put("typeList",typeList);
        try {
            if (editorStyle==EditorStyle.NormalStyle) {
                dataModel.put("indexedProperties",CodeUtils.getAllIndexProperties(entity));
                typeList.addAll(CodeUtils.getMappedTypeList(entity));
                ServiceForFullEditorTemplate.process(dataModel,writer);
            } else {
                typeList.remove(entity.getClassInfo().getQualifiedName());
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
    public String getObjectType(String type) {
        return TypeUtils.getObjectType(type);
    }

    public boolean isRangeTypeProperty(SingleProperty property){
        return TypeUtils.isRangeTypeProperty(property);
    }

    public List<SingleProperty> getIndexedProperties(Entity entity) {
        return CodeUtils.getAllIndexProperties(entity);
    }

    public boolean isIntProperty(SingleProperty property) {
        return TypeUtils.isIntProperty(property);

    }

    public boolean isNumberProperty(SingleProperty property) {
        return TypeUtils.isNumberProperty(property);
    }

    public boolean isBooleanProperty(SingleProperty property) {
        return TypeUtils.isBooleanProperty(property);
    }

    public boolean isDateProperty(SingleProperty property) {
        return TypeUtils.isDateProperty(property);
    }

    public boolean isBigDecimalProperty(SingleProperty property) {
        return TypeUtils.isBigDecimal(property);
    }
    public boolean isDepartmentInfoType(Entity entity) {
        return TypeUtils.isDepartmentInfoType(entity.getClassInfo().getName());
    }
}
