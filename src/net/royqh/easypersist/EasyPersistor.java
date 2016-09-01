package net.royqh.easypersist;

import com.intellij.notification.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
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
        ormConfigParser = new OrmConfigParser();
        packageScanner = new PackageScanner();
    }

    public void execute(Project project, VirtualFile xmlConfigFile, ProgressIndicator indicator) {
        ApplicationManager.getApplication().saveAll();
        NotificationGroup notificationGroup = new NotificationGroup("Easy Persit",
                NotificationDisplayType.TOOL_WINDOW, true);
        Notification notification;

        notification = notificationGroup.createNotification(
                "Generating ORM Code ...",
                NotificationType.INFORMATION
        );
        Notifications.Bus.notify(notification, project);

        indicator.setText("Parsing Entities...");
        indicator.setFraction(0.0);
        try {
            ormConfigParser.parse(xmlConfigFile);
            MappingRepository mappingRepository = new MappingRepository();
            int i=1;
            int n=ormConfigParser.getEntitiesConfigs().size();
            for (EntitiesConfig entitiesConfig : ormConfigParser.getEntitiesConfigs()) {
                System.out.println(entitiesConfig);
                packageScanner.scan(entitiesConfig, project, mappingRepository,i,n,indicator);
                i++;
            }
            indicator.setText("Generating ORM codes ...");
            indicator.setFraction(0.5);
            PersistorsGenerator.generate(project, mappingRepository,indicator);
            mappingRepository.clear();
            notification = notificationGroup.createNotification(
                    "Generation finished ",
                    NotificationType.INFORMATION
            );
            Notifications.Bus.notify(notification, project);
        } catch (Exception e) {
            e.printStackTrace();
            notification = notificationGroup.createNotification(
                    "Generation failed :" + e.getMessage(),
                    NotificationType.ERROR
            );
            Notifications.Bus.notify(notification, project);
        }
    }
}
