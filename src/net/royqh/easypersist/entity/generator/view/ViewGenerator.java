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
import net.royqh.easypersist.entity.model.SingleProperty;
import net.royqh.easypersist.entity.model.SubEntityInfo;
import net.royqh.easypersist.entity.utils.CodeUtils;
import net.royqh.easypersist.entity.utils.TemplateUtils;
import net.royqh.easypersist.entity.utils.TypeUtils;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class ViewGenerator {
    private static Template JspViewForCodeEditorTemplate = TemplateLoader.loadTemplate("View-CodeEditor.jsp.ftl");
    private static Template JspMainViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Main.jsp.ftl");
    private static Template JspEditViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Edit-Main.jsp.ftl");
    private static Template JspEntityEditViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Edit-Entity.jsp.ftl");
    private static Template JspSubEntityEditViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Edit-SubEntity.jsp.ftl");
    private static Template JspNtoNMappingEditViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Edit-NtoN-Mapping.jsp.ftl");
    private static Template JspNtoNMappingAddEditViewForFullEditorTemplate = TemplateLoader.loadTemplate("View-FullEditor-Edit-NtoN-Mapping-Add.jsp.ftl");

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
        if (editorStyle==EditorStyle.NormalStyle) {
            /* entity 列表视图 */
            generateMainJspViewFileForFullEditor(entity,psiOutputDir);
            /* entity编辑视图-标签导航页 */
            generateEditMainJspViewFileForFullEditor(entity,psiOutputDir);
            /* entity编辑视图 */
            generateEntityEditJspViewFileForFullEditor(entity,psiOutputDir);
            /* subEntity 编辑视图 */
            for (SubEntityInfo subEntityInfo:entity.getSubEntities()) {
                generateSubEntityEditJspViewFileForFullEditor(entity,subEntityInfo,psiOutputDir);
            }
            /* nton映射关系编辑视图 */
            for (MapRelationInfo relationInfo:entity.getMapRelationInfos()) {
                generateNtoNRelationEditJspViewFileForFullEditor(entity,relationInfo,psiOutputDir);
                generateNtoNRelationAddEditJspViewFileForFullEditor(entity,relationInfo,psiOutputDir);
            }
        } else {
            generateJspViewFileForCodeEditor(entity, psiOutputDir);
        }

    }

    private static void generateNtoNRelationAddEditJspViewFileForFullEditor(Entity entity, MapRelationInfo mapRelationInfo, PsiDirectory psiOutputDir) {
        Map<String, Object> dataModel = new HashMap<>();
        Entity relationEntity=entity.getMappingRepository().findEntityByClass(mapRelationInfo.getMappingEntityFullClassName());
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(relationEntity);
        dataModel.put("mapRelationInfo",mapRelationInfo);
        dataModel.put("mapRelationEntity",relationEntity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        dataModel.put("indexedProperties", CodeUtils.getAllIndexProperties(relationEntity));

        generateJspView(entity, psiOutputDir, entity.getName() + "-mapping-add-"+relationEntity.getName()+".jsp", JspNtoNMappingAddEditViewForFullEditorTemplate, dataModel);
    }

    private static void generateNtoNRelationEditJspViewFileForFullEditor(Entity entity, MapRelationInfo mapRelationInfo, PsiDirectory psiOutputDir) {
        Map<String, Object> dataModel = new HashMap<>();
        Entity relationEntity = entity.getMappingRepository().findEntityByClass(mapRelationInfo.getMappingEntityFullClassName());
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(relationEntity);
        refEntities.remove(entity);
        dataModel.put("entity", entity);
        dataModel.put("mapRelationInfo", mapRelationInfo);
        dataModel.put("mapRelationEntity", relationEntity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("templateUtils", TemplateUtils.templateUtils);

        generateJspView(entity, psiOutputDir, entity.getName() + "-mapping-" + relationEntity.getName() + ".jsp", JspNtoNMappingEditViewForFullEditorTemplate, dataModel);
    }

    /**
     * subEntity编辑视图
     * @param entity
     * @param subEntityInfo
     * @param psiOutputDir
     */
    private static void generateSubEntityEditJspViewFileForFullEditor(Entity entity, SubEntityInfo subEntityInfo, PsiDirectory psiOutputDir) {
        Map<String, Object> dataModel = new HashMap<>();
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(subEntityInfo.getSubEntity());
        refEntities.remove(entity);
        dataModel.put("entity", entity);
        dataModel.put("subEntityInfo",subEntityInfo);
        dataModel.put("subEntity",subEntityInfo.getSubEntity());
        dataModel.put("refEntities", refEntities);
        dataModel.put("templateUtils", TemplateUtils.templateUtils);

        generateJspView(entity, psiOutputDir, entity.getName() + "-edit-"+subEntityInfo.getSubEntity().getName()+".jsp", JspSubEntityEditViewForFullEditorTemplate, dataModel);

    }

    /**
     * entity编辑视图
     * @param entity
     * @param psiOutputDir
     */
    private static void generateEntityEditJspViewFileForFullEditor(Entity entity, PsiDirectory psiOutputDir) {
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(entity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        dataModel.put("indexedProperties", CodeUtils.getAllIndexProperties(entity));
        generateJspView(entity, psiOutputDir, entity.getName() + "-edit-entity.jsp", JspEntityEditViewForFullEditorTemplate, dataModel);
    }

    /**
     * entity编辑导航页
     * @param entity
     * @param psiOutputDir
     */
    private static void generateEditMainJspViewFileForFullEditor(Entity entity, PsiDirectory psiOutputDir) {
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        generateJspView(entity, psiOutputDir, entity.getName() + "-edit.jsp", JspEditViewForFullEditorTemplate, dataModel);

    }

    /**
     *  entity列表视图
     * @param entity
     * @param psiOutputDir
     */
    private static void generateMainJspViewFileForFullEditor(Entity entity, PsiDirectory psiOutputDir) {
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(entity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        dataModel.put("indexedProperties", CodeUtils.getAllIndexProperties(entity));
        generateJspView(entity, psiOutputDir, entity.getName() + ".jsp", JspMainViewForFullEditorTemplate, dataModel);

    }

    private static void generateJspViewFileForCodeEditor(Entity entity, PsiDirectory psiOutputDir) {
        String fileName = entity.getName() + ".jsp";
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(entity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("templateUtils", TemplateUtils.templateUtils);
        generateJspView(entity, psiOutputDir, fileName, JspViewForCodeEditorTemplate, dataModel);
    }

}
