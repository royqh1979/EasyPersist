package net.royqh.easypersist.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.utils.TypeUtils;
import net.royqh.parser.model.Index;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class ServiceGenerator {

    private static Template ServiceForCodeTemplate=TemplateLoader.loadTemplate("Service-Code.ftl");

    public static void generateService(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir) {
        String serviceClassName = CodeUtils.getServiceName(entity);
        String fileName = serviceClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateServiceFile(entity, null, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateServiceFile(Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String className = CodeUtils.getServiceName(entity);
        String persistorName=CodeUtils.getPersistorCompositorName(entity);
        StringWriter writer = new StringWriter();
        if (targetPackage != null) {
            writer.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            writer.append("package dummy;\n");
        }

        /*---*/
        writer.append("import ");
        writer.append(entity.getClassInfo().getQualifiedName());
        writer.append(";\n");
        writer.append("import org.springframework.beans.factory.annotation.Autowired;\n");
        writer.append("import org.springframework.stereotype.Service;\n");

        writer.append("import java.util.List;\n");

        Map<String,Object> dataModel=new HashMap<>();
        dataModel.put("entity",entity);
        dataModel.put("idType", TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        /*
        Set<Entity> refEntities=CodeUtils.getRefencingEntities(entity);
        dataModel.put("refEntities",refEntities);
        */

        try {
            ServiceForCodeTemplate.process(dataModel,writer);
            dataModel.clear();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }
}
