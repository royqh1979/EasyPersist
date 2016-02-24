package net.royqh.easypersist.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.EasyPersistor;
import net.royqh.easypersist.parsers.OrmConfigParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Roy on 2016/2/10.
 */
public class ORMGenerateAction extends AnAction {
    private EasyPersistor easyPersistor;


    public ORMGenerateAction() throws ParserConfigurationException, SAXException {
        easyPersistor=new EasyPersistor();
    }



    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        /*
        Object obj=anActionEvent.getData(LangDataKeys.PSI_FILE);
        if (obj instanceof PsiJavaFile) {
            PsiJavaFile psiFile=(PsiJavaFile)obj;
            Messages.showDialog(psiFile.getName(),"ok",new String[]{"OK"}, -1, null);
            PsiClass[] classes=psiFile.getClasses();
            for (PsiClass clazz:classes) {
                System.out.println(clazz.getName());
                PsiField field=clazz.findFieldByName("actions",true);
                PsiAnnotation[] annotations=field.getModifierList().getAnnotations();
            }
        }
        */

        try {
            final VirtualFile xmlConfigFile=anActionEvent.getData(CommonDataKeys.VIRTUAL_FILE);
            final Project project = anActionEvent.getProject();
            if (xmlConfigFile==null) {
                return ;
            }
            easyPersistor.execute(project,xmlConfigFile);

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        project.getProjectFile().getCanonicalPath();
        //project.getBaseDir().findChild();
        final PsiManager psiManager=PsiManager.getInstance(project);
        PsiPackage pkg=JavaPsiFacade.getInstance(project).findPackage("net.roy.domain");
        pkg.getClasses();
        Messages.showDialog(project.getProjectFile().getCanonicalPath(), "ok", new String[]{"OK"}, -1, null);
        */

    }

    @Override
    public void update(AnActionEvent e) {
        final VirtualFile file=e.getData(CommonDataKeys.VIRTUAL_FILE);
        if (file==null | (!file.getName().equals(OrmConfigParser.ORM_CONFIG_FILE_NAME))){
            e.getPresentation().setVisible(false);
        } else {
            e.getPresentation().setVisible(true);
        }
    }
}
