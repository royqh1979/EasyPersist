package net.royqh.easypersist.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.utils.TypeUtils;

/**
 * Created by Roy on 2017/6/24.
 */
public class ServiceGenerator {
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
        StringBuilder content = new StringBuilder();
        if (targetPackage != null) {
            content.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            content.append("package dummy;\n");
        }

        /*---*/
        content.append("import ");
        content.append(entity.getClassInfo().getQualifiedName());
        content.append(";\n");
        content.append("import org.springframework.beans.factory.annotation.Autowired;\n");
        content.append("import org.springframework.stereotype.Service;\n");

        content.append("import java.util.List;\n");

        content.append("@Service\n");
        content.append("public class ");
        content.append(className);
        content.append(" {\n");
        content.append("@Autowired\n");
        content.append("private ");
        content.append(persistorName);
        content.append(" persistor;\n");
        content.append("private List<");
        content.append(entity.getClassInfo().getName());
        content.append("> cachedList=null;\n");
        content.append("private boolean dirty=false;");

        content.append("public List<");
        content.append(entity.getClassInfo().getName());
        content.append("> listAll(boolean refresh) {\n");
        content.append("if (refresh) {\n");
        content.append("dirty=true;\n");
        content.append("}\n");
        content.append("checkCache();\n");
        content.append("return cachedList;\n");
        content.append("}\n");

        content.append("public ");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" create(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append(" dirty=true;\n");
        content.append("return persistor.create(");
        content.append(entity.getName());
        content.append(");\n");
        content.append("}\n");

        content.append("public ");
        content.append(entity.getClassInfo().getName());
        content.append(" retrieve(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id) {\n");
        content.append("return persistor.retrieve(id);\n");
        content.append("}\n");

        content.append("public void delete(");
        content.append(TypeUtils.getShortTypeName(entity.getIdProperty().getType()));
        content.append(" id) {\n");
        content.append(" dirty=true;\n");
        content.append("persistor.delete(id);\n");
        content.append("}\n");

        content.append("public void update(");
        content.append(entity.getClassInfo().getName());
        content.append(" ");
        content.append(entity.getName());
        content.append(") {\n");
        content.append(" dirty=true;\n");
        content.append(String.format("persistor.update(%s);\n",
                entity.getName()
                ));
        content.append("}\n\n");


        content.append("private void checkCache() {\n");
        content.append("if (cachedList==null || dirty) {\n");
        content.append("cachedList= persistor.getAll();\n");
        content.append("dirty=false;\n");
        content.append("}\n");
        content.append("}\n\n");

        content.append("}\n");
        /*--*/

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                content.toString());
    }
}
