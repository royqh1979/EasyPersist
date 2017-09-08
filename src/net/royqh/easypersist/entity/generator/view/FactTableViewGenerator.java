package net.royqh.easypersist.entity.generator.view;

import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.royqh.easypersist.entity.generator.EditorStyle;
import net.royqh.easypersist.entity.generator.TemplateLoader;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.model.MapRelationInfo;
import net.royqh.easypersist.entity.model.SubEntityInfo;
import net.royqh.easypersist.entity.utils.CodeUtils;
import net.royqh.easypersist.entity.utils.TemplateUtils;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class FactTableViewGenerator {
    private static Template JspViewForFactTableEditorTemplate = TemplateLoader.loadTemplate("View-FactTableEditor.jsp.ftl");

    private static void generateJspView(Entity entity, PsiDirectory psiOutputDir, String jspFileName, Template template, Map<String, Object> dataModel) {
        PsiFile oldFile = psiOutputDir.findFile(jspFileName);

        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        OutputStreamWriter writer = null;
        try {
            VirtualFile jspViewFile = psiOutputDir.getVirtualFile().createChildData(FactTableViewGenerator.class, jspFileName);

            writer = new OutputStreamWriter(jspViewFile.getOutputStream(FactTableViewGenerator.class), "UTF-8");
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

    /**
     * entity编辑导航页
     * @param factTableEntity
     * @param psiOutputDir
     */
    public static void generateView(Entity factTableEntity, PsiDirectory psiOutputDir) {
        Entity baseEntity = factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getEntityKeyProperty().getRefEntityFullClassName());
        Entity propertyEntity = factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getPropertyKeyProperty().getRefEntityFullClassName());

        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("factTableEntity", factTableEntity);
        dataModel.put("baseEntity", baseEntity);
        dataModel.put("propertyEntity", propertyEntity);
        //dataModel.put("entityIdType", TypeUtils.getShortTypeName(baseEntity.getIdProperty().getType()));
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(baseEntity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("indexedProperties", CodeUtils.getAllIndexProperties(baseEntity));
        generateJspView(factTableEntity, psiOutputDir, factTableEntity.getName() + ".jsp", JspViewForFactTableEditorTemplate, dataModel);
    }
}
