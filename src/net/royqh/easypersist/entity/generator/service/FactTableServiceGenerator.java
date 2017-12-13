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
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.utils.TemplateUtils;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class FactTableServiceGenerator {

    private static Template ServiceForFactTableTemplate = TemplateLoader.loadTemplate("Service-FactTableEditor.ftl");


    public static void generateService(PsiFileFactory psiFileFactory, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir, Module module) {
        String serviceClassName = CodeUtils.getServiceName(entity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateServiceFile(entity,null, psiFileFactory,module);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateServiceFile(Entity factTableEntity, PsiPackage targetPackage, PsiFileFactory psiFileFactory, Module module) {
        String serviceClassName = CodeUtils.getServiceName(factTableEntity);
        String factTableEntityPersistorName=CodeUtils.getPersistorCompositorName(factTableEntity);
        StringWriter writer = new StringWriter();
        if (targetPackage != null) {
            writer.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            writer.append("package dummy;\n");
        }


        /*---*/
        Entity baseEntity=factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getEntityKeyProperty().getRefEntityFullClassName());
        Entity propertyEntity=factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getPropertyKeyProperty().getRefEntityFullClassName());
        if (baseEntity.getListHeaderProperty()==null) {
            throw new RuntimeException("Entity "+baseEntity.getClassInfo().getQualifiedName()+" don't have @ListHeader annotation!");
        }
        Map<String,Object> dataModel=new HashMap<>();
        dataModel.put("factTableEntity",factTableEntity);
        dataModel.put("baseEntity",baseEntity);
        dataModel.put("propertyEntity",propertyEntity);
        //dataModel.put("entityIdType", TypeUtils.getShortTypeName(baseEntity.getIdProperty().getType()));
        dataModel.put("templateUtils", TemplateUtils.templateUtils);

        Set<String> importTypes=CodeUtils.getRefencedTypes(factTableEntity);
        dataModel.put("importTypes",importTypes);
        importTypes.add(factTableEntity.getClassInfo().getQualifiedName());
        importTypes.add(baseEntity.getClassInfo().getQualifiedName());
        importTypes.add(propertyEntity.getClassInfo().getQualifiedName());
        importTypes.addAll(CodeUtils.getPropertyTypes(factTableEntity));
        importTypes.addAll(CodeUtils.getPropertyTypes(baseEntity));
        importTypes.addAll(CodeUtils.getPropertyTypes(propertyEntity));
        /*
        if (TypeUtils.isObjectType(factTableEntity.getFactTableInfo().getValueProperty().getType())) {
            importTypes.add(factTableEntity.getFactTableInfo().getValueProperty().getType());
        }
        */
        addEntityPersistorToImportTypes(factTableEntity, module, importTypes);
        try {
            ServiceForFactTableTemplate.process(dataModel,writer);
            dataModel.clear();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return psiFileFactory.createFileFromText(serviceClassName + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }

    private static void addEntityPersistorToImportTypes(Entity entity, Module module, Set<String> importTypes) {
        String persistorType= CodeUtils.getPersistorType(entity,module);
        if (persistorType!=null) {
            importTypes.add(persistorType);
        }
    }

    /* used by free marker */
}
