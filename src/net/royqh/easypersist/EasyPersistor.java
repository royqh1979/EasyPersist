package net.royqh.easypersist;

import com.intellij.notification.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.generator.PersistorsGenerator;
import net.royqh.easypersist.model.config.EntitiesConfig;
import net.royqh.easypersist.parsers.OrmConfigParser;
import net.royqh.easypersist.parsers.jpa.PackageScanner;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Roy on 2016/2/24.
 */
public class EasyPersistor {
    private OrmConfigParser ormConfigParser;
    private PackageScanner packageScanner;

    public EasyPersistor() throws ParserConfigurationException, SAXException {
        ormConfigParser=new OrmConfigParser();
        packageScanner=new PackageScanner();
    }

    public void execute(Project project,VirtualFile xmlConfigFile) {
        WriteCommandAction.runWriteCommandAction(project, new Runnable() {
            @Override
            public void run() {
                ApplicationManager.getApplication().saveAll();
                NotificationGroup notificationGroup = new NotificationGroup("Easy Persit",
                        NotificationDisplayType.TOOL_WINDOW, true);
                try {
                      ormConfigParser.parse(xmlConfigFile);
                    for (EntitiesConfig entitiesConfig : ormConfigParser.getEntitiesConfigs()) {
                        System.out.println(entitiesConfig);
                        MappingRepository mappingRepository = packageScanner.scan(entitiesConfig.getEntityPackage(), project);
                        PersistorsGenerator.generate(entitiesConfig.getOutputPackage(), project, mappingRepository);
                    }
                    Notification notification = notificationGroup.createNotification(
                            "Generation finished",
                            NotificationType.INFORMATION
                    );
                    Notifications.Bus.notify(notification, project);
                } catch(Exception e) {
                    e.printStackTrace();
                    Notification notification = notificationGroup.createNotification(
                            "Generation failed:"+e.getMessage(),
                            NotificationType.ERROR
                    );
                    Notifications.Bus.notify(notification,project);
                }
            }
        });
    }
}
