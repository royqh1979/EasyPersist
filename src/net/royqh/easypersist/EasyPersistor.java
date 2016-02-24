package net.royqh.easypersist;

import com.intellij.notification.*;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.generator.PersistorsGenerator;
import net.royqh.easypersist.model.config.EntitiesConfig;
import net.royqh.easypersist.parsers.OrmConfigParser;
import net.royqh.easypersist.parsers.jpa.PackageScanner;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

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

    public void execute(Project project,VirtualFile xmlConfigFile) throws IOException, SAXException {
        ormConfigParser.parse(xmlConfigFile);
        NotificationGroup notificationGroup=new NotificationGroup("Test Action",
                NotificationDisplayType.TOOL_WINDOW,true);
        for (EntitiesConfig entitiesConfig:ormConfigParser.getEntitiesConfigs()) {
            WriteCommandAction.runWriteCommandAction(project, new Runnable() {
                @Override
                public void run() {
                    MappingRepository mappingRepository = packageScanner.scan(entitiesConfig, project);
                    PersistorsGenerator.generate(entitiesConfig, project, mappingRepository);

                    Notification notification = notificationGroup.createNotification(
                            "Scan finished",
                            NotificationType.INFORMATION
                    );
                    Notifications.Bus.notify(notification, project);
                }
            });
        }
    }
}
