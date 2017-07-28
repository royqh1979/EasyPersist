package net.royqh.easypersist.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.model.SubEntityInfo;
import net.royqh.easypersist.utils.TypeUtils;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roy on 2017/6/24.
 */
public class ServiceGenerator {

    private static Template ServiceForCodeEditorTemplate =TemplateLoader.loadTemplate("Service-CodeEditor.ftl");
    private static Template ServiceForFullEditorTemplate =TemplateLoader.loadTemplate("Service-FullEditor.ftl");
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
                generateService(editorStyle, psiFileFactory, codeStyleManager, subEntityInfo.getSubEntity(), psiOutputDir);
            }
        }
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

        try {
            if (editorStyle==EditorStyle.NormalStyle) {
                dataModel.put("indexedProperties",CodeUtils.getAllIndexProperties(entity));
                dataModel.put("typeList",CodeUtils.getMappedTypeList(entity));
                ServiceForFullEditorTemplate.process(dataModel,writer);
            } else {
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

    public boolean isDateProperty(SingleProperty property){
        return "Date".equals(TypeUtils.getShortTypeName(property.getType()));
    }

    public boolean isRangeTypeProperty(SingleProperty property){
        return TypeUtils.isRangeTypeProperty(property);
    }
}
