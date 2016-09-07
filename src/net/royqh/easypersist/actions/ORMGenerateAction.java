package net.royqh.easypersist.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.EasyPersistor;
import net.royqh.easypersist.parsers.OrmConfigParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Roy on 2016/2/10.
 */
public class ORMGenerateAction extends AnAction {
    private EasyPersistor easyPersistor;


    public ORMGenerateAction() throws ParserConfigurationException, SAXException {
        easyPersistor = new EasyPersistor();
    }


    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        final VirtualFile xmlConfigFile = anActionEvent.getData(CommonDataKeys.VIRTUAL_FILE);
        final Project project = anActionEvent.getProject();
        if (xmlConfigFile == null) {
            return;
        }
        ProgressManager progressManager = ProgressManager.getInstance();
        ORMGenerateTask task = new ORMGenerateTask(project, "Generating ORM Code...", true,
                easyPersistor,
                xmlConfigFile);
        progressManager.run(task);
    }

    @Override
    public void update(AnActionEvent e) {
        final VirtualFile file = e.getData(CommonDataKeys.VIRTUAL_FILE);
        if (file == null || (!file.getName().endsWith(OrmConfigParser.ORM_CONFIG_FILE_NAME))) {
            e.getPresentation().setVisible(false);
        } else {
            e.getPresentation().setVisible(true);
        }
    }
}
