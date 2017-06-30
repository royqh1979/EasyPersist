package net.royqh.easypersist.actions;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.EasyPersistor;
import net.royqh.easypersist.parsers.OrmConfigParser;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Roy on 2016/2/10.
 */
public class GenerateORMCodeAction extends AnAction {
    private EasyPersistor easyPersistor;


    public GenerateORMCodeAction() throws ParserConfigurationException, SAXException {
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
                GenerateORMCodeTask task = new GenerateORMCodeTask(project, "Generating ORM Code...", true,
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

    /**
     * Created by Roy on 2016/8/31.
     */
    public class GenerateORMCodeTask extends Task.Backgroundable {
        private EasyPersistor easyPersistor;
        private VirtualFile xmlConfigFile;

        public GenerateORMCodeTask(@Nullable Project project, @Nls(capitalization = Nls.Capitalization.Title) @NotNull String title, boolean canBeCancelled, EasyPersistor easyPersistor,
                                   VirtualFile xmlConfigFile) {
            super(project, title, canBeCancelled);
            this.easyPersistor=easyPersistor;
            this.xmlConfigFile=xmlConfigFile;
        }

        @Override
        public void run(@NotNull ProgressIndicator indicator) {
            easyPersistor.execute(getProject(),xmlConfigFile,indicator);
            Notification notification = new Notification(
                    "Easy Persist",
                    "Success",
                    "ORM Code generation finised.",
                    NotificationType.INFORMATION
            );
            Notifications.Bus.notify(notification, getProject());
        }

    }
}
