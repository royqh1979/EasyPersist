package net.royqh.easypersist.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.MapRelationInfo;
import net.royqh.easypersist.model.SingleProperty;
import net.royqh.easypersist.model.SubEntityInfo;
import net.royqh.easypersist.utils.TypeUtils;

import java.io.*;
import java.util.*;

/**
 * Created by Roy on 2017/6/24.
 */
public class ControllerGenerator {
    private static Template ControllerForCodeEditorTemplate = TemplateLoader.loadTemplate("Controller-CodeEdit.ftl");
    private static Template ControllerForFullEditorTemplate = TemplateLoader.loadTemplate("Controller-FullEdit.ftl");
    private static ControllerGenerator generator=new ControllerGenerator();

    public static void generateController(EditorStyle editorStyle, PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir) {
        String controllerClassName = CodeUtils.getControllerName(entity);
        String fileName = controllerClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateControllerFile(editorStyle,entity, null, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateControllerFile(EditorStyle editorStyle, Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String controllerClassName = CodeUtils.getControllerName(entity);
        StringWriter writer = new StringWriter();
        if (targetPackage != null) {
            writer.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            writer.append("package dummy;\n");
        }

        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("entity", entity);
        Set<String> types = CodeUtils.getTypeList(entity, true);
        dataModel.put("typeList", types);
        Set<Entity> refEntities = CodeUtils.getRefencingEntities(entity);
        dataModel.put("refEntities", refEntities);
        dataModel.put("generator",generator);
        
        try {
            if (editorStyle==EditorStyle.NormalStyle) {
                dataModel.put("indexedProperties", CodeUtils.getAllIndexProperties(entity));
                Set<Entity> serviceEntities=new HashSet<>();
                for (SubEntityInfo subEntityInfo:entity.getSubEntities()) {
                    //add entities referenced by subEntity
                    Set<Entity> subRefEntities=CodeUtils.getRefencingEntities(subEntityInfo.getSubEntity());
                    refEntities.addAll(subRefEntities);
                    //add import types used by subEntity
                    types.addAll(CodeUtils.getTypeList(subEntityInfo.getSubEntity(), true));
                    serviceEntities.add(subEntityInfo.getSubEntity());
                }
                for (MapRelationInfo mapRelationInfo:entity.getMapRelationInfos()){
                    Entity mapEntity=entity.getMappingRepository().findEntityByClass(mapRelationInfo.getMappingEntityFullClassName());
                    Set<Entity> mapRefEntities=CodeUtils.getRefencingEntities(mapEntity);
                    refEntities.addAll(mapRefEntities);
                    types.addAll(CodeUtils.getTypeList(mapEntity,true));
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

    public  void generateEntityPropertySetting(StringBuilder content, Entity entity, SingleProperty property) {
            String shortTypeName = TypeUtils.getShortTypeName(property.getType());

            content.append(String.format("if (StringUtils.isEmpty(%s)){\n",
                    property.getName() + "Val"));
            if (property.getColumn().isNullable() && !TypeUtils.isPrimitiveType(property.getType())) {
                content.append(entity.getName());
                content.append(".");
                content.append(property.getSetter());
                content.append("(null);\n");
            } else {
                if ("Date".equals(shortTypeName)) {
                    content.append("//if date is empty, let it be now.\n");
                    content.append(entity.getName());
                    content.append(".");
                    content.append(property.getSetter());
                    content.append("(");
                    content.append("new Date()");
                    content.append(");\n");
                } else {
                    content.append(" throw new RuntimeException(\"param for " + property.getName() + " is empty!\");\n");
                }
            }
            content.append("} else {\n");
            content.append(entity.getName());
            content.append(".");
            content.append(property.getSetter());
            content.append("(");
            generateConvertParameterStatement(property, content);
            content.append(");\n");
            content.append("}\n");
    }

    public String generateEntityPropertySetting(Entity entity, SingleProperty property) {
        StringBuilder builder=new StringBuilder();
        generateEntityPropertySetting(builder,entity, property);
        return builder.toString();
    }

    public String getObjectType(String type) {
        return TypeUtils.getObjectType(type);
    }

    public String getConvertParameterStatement(SingleProperty property) {
        StringBuilder builder = new StringBuilder();
        generateConvertParameterStatement(property, builder);
        return builder.toString();
    }

    public void generateConvertParameterStatement(SingleProperty property, StringBuilder builder) {
        String shortTypeName = TypeUtils.getObjectType(property.getType());
        if (property.getEnumType() != null) {
            builder.append(String.format("%s.values()[%s]",
                    shortTypeName,
                    property.getName() + "Val"));
        } else {
            switch (shortTypeName) {
                case "Date":
                    builder.append("DateTools.parseDate(");
                    builder.append(property.getName() + "Val");
                    builder.append(")");
                    break;
                case "Boolean":
                    builder.append(String.format("\"y\".equals(%s)",
                            property.getName() + "Val"));
                    break;
                case "Integer":
                    builder.append(String.format("Integer.parseInt(%s)",
                            property.getName() + "Val"));
                    break;
                case "Long":
                case "Short":
                case "Double":
                case "Float":
                    builder.append(String.format("%s.parse%s(%s)",
                            shortTypeName, shortTypeName, property.getName() + "Val"));
                    break;
                case "BigDecimal":
                    builder.append(String.format("new BigDecimal(%s)",
                            property.getName() + "Val"));
                    break;
                default:
                    builder.append(property.getName() + "Val");
            }
        }
    }
    
    public boolean isDateProperty(SingleProperty property){
        return "Date".equals(TypeUtils.getShortTypeName(property.getType()));
    }
}

