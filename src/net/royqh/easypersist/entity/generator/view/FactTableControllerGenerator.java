package net.royqh.easypersist.entity.generator.view;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.module.Module;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiPackage;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import net.royqh.easypersist.entity.generator.EditorStyle;
import net.royqh.easypersist.entity.generator.TemplateLoader;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.model.MapRelationInfo;
import net.royqh.easypersist.entity.model.SubEntityInfo;
import net.royqh.easypersist.entity.utils.CodeUtils;
import net.royqh.easypersist.entity.utils.TemplateUtils;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class FactTableControllerGenerator {
    private static Template ControllerForFactTableEditorTemplate = TemplateLoader.loadTemplate("Controller-FactTableEdit.ftl");

    public static void generateController(PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module) {
        String controllerClassName = CodeUtils.getControllerName(entity);
        String fileName = controllerClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateControllerFile(entity, null, psiFileFactory, module);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateControllerFile(Entity factTableEntity, PsiPackage targetPackage, PsiFileFactory psiFileFactory, Module module) {
        String controllerClassName = CodeUtils.getControllerName(factTableEntity);
        StringWriter writer = new StringWriter();
        if (targetPackage != null) {
            writer.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            writer.append("package dummy;\n");
        }

        Entity baseEntity = factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getEntityKeyProperty().getRefEntityFullClassName());
        Entity propertyEntity = factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getPropertyKeyProperty().getRefEntityFullClassName());
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("factTableEntity", factTableEntity);
        dataModel.put("baseEntity", baseEntity);
        dataModel.put("propertyEntity", propertyEntity);
        //dataModel.put("entityIdType", TypeUtils.getShortTypeName(baseEntity.getIdProperty().getType()));
        dataModel.put("templateUtils", TemplateUtils.templateUtils);

        /* import factTableEntity & baseEntity & propertyEntity class */
        Set<String> importTypes = CodeUtils.getRefencedTypes(factTableEntity);
        importTypes.add(factTableEntity.getClassInfo().getQualifiedName());
        dataModel.put("importTypes", importTypes);
        /* import all types of base/property/factTable entity's properties */
        importTypes.addAll(CodeUtils.getPropertyTypes(baseEntity, true));
        importTypes.addAll(CodeUtils.getPropertyTypes(propertyEntity, true));
        importTypes.addAll(CodeUtils.getPropertyTypes(factTableEntity));
        /* import service of  base/property/factTable entities */
        addServiceClassForImport(factTableEntity, module, importTypes);
        addServiceClassForImport(baseEntity, module, importTypes);
        addServiceClassForImport(propertyEntity, module, importTypes);
        /* import service of baseEntity referenced entities(code tables) */
        importTypes.addAll(CodeUtils.getRefencedServiceTypes(baseEntity, module));


        Set<Entity> refEntities = CodeUtils.getRefencingEntities(baseEntity);
        dataModel.put("refEntities", refEntities);

        try {
            dataModel.put("indexedProperties", CodeUtils.getAllIndexProperties(baseEntity));
            ControllerForFactTableEditorTemplate.process(dataModel, writer);
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
            Writer fileWriter = new OutputStreamWriter(new FileOutputStream("f:\\test.java"), "UTF-8");
            fileWriter.write(writer.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return psiFileFactory.createFileFromText(controllerClassName + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }

    private static void addServiceClassForImport(Entity factTableEntity, Module module, Set<String> importTypes) {
        String serviceType = CodeUtils.getServiceType(factTableEntity, module);
        if (serviceType != null) {
            importTypes.add(serviceType);
        }
    }

}

