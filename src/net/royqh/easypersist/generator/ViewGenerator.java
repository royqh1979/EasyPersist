package net.royqh.easypersist.generator;

import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.model.SubEntityInfo;
import net.royqh.easypersist.utils.TypeUtils;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class ViewGenerator {
    private static Template JspViewForCodeEditorTemplate = TemplateLoader.loadTemplate("View-CodeEditor.jsp.ftl");
    private static Template JspMainViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Main.jsp.ftl");
    private static Template JspUpdateViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Update.jsp.ftl");
    private static ViewGenerator generator = new ViewGenerator();

    private static void generateJspView(Entity entity, PsiDirectory psiOutputDir, String jspFileName, Template template, Map<String, Object> dataModel) {
        PsiFile oldFile = psiOutputDir.findFile(jspFileName);

        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        OutputStreamWriter writer = null;
        try {
            VirtualFile jspViewFile = psiOutputDir.getVirtualFile().createChildData(ViewGenerator.class, jspFileName);

            writer = new OutputStreamWriter(jspViewFile.getOutputStream(ViewGenerator.class), "UTF-8");
            template.process(dataModel, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void generateJspViews(EditorStyle editorStyle, Entity entity, PsiDirectory psiOutputDir) {
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(entity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("generator", generator);
        if (editorStyle==EditorStyle.NormalStyle) {
            dataModel.put("indexedProperties", CodeUtils.getAllIndexProperties(entity));
            generateJspView(entity, psiOutputDir, entity.getName() + ".jsp", JspMainViewForFullEditorTemplate, dataModel);

            Set<Entity> subEntites=new HashSet<>();
            for (SubEntityInfo subEntityInfo:entity.getSubEntities()) {
                Set<Entity> subRefEntities=CodeUtils.getRefencingEntities(subEntityInfo.getSubEntity());
                refEntities.addAll(subRefEntities);
            }
            refEntities.remove(entity);
            generateJspView(entity, psiOutputDir, entity.getName() + "-update.jsp", JspUpdateViewForFullEditorTemplate, dataModel);
        } else {
            String fileName = entity.getName() + ".jsp";
            generateJspView(entity, psiOutputDir, fileName, JspViewForCodeEditorTemplate, dataModel);
        }

    }

    public String getDefaultValue(String type) {
        String shortTypeName = TypeUtils.getShortTypeName(type);
        switch (shortTypeName) {
            case "int":
            case "long":
            case "short":
                return "0";
            case "String":
                return "\"未定义\"";
            case "Date":
                return "\"\"";
            case "boolean":
                return "\"n\"";
            case "BigDecimal":
            case "float":
            case "double":
                return "0";
            default:
                return "\"\"";
        }
    }

    public boolean isIntProperty(SingleProperty property) {
        switch (TypeUtils.getShortTypeName(property.getType())) {
            case "Integer":
            case "int":
            case "Short":
            case "short":
            case "Long":
            case "long":
                return true;
            default:
                return false;
        }
    }

    public boolean isNumberProperty(SingleProperty property) {
        switch (TypeUtils.getShortTypeName(property.getType())) {
            case "Float":
            case "float":
            case "Double":
            case "double":
            case "BigDecimal":
                return true;
            default:
                return false;
        }
    }

    public boolean isBooleanProperty(SingleProperty property) {
        switch (TypeUtils.getShortTypeName(property.getType())) {
            case "Boolean":
            case "boolean":
                return true;
            default:
                return false;
        }
    }

    public boolean isDateProperty(SingleProperty property) {
        return "Date".equals(TypeUtils.getShortTypeName(property.getType()));
    }
}
