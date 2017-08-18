package net.royqh.easypersist;

import com.intellij.notification.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.generator.*;
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
    private static Logger logger=Logger.getInstance(EasyPersistor.class);

    public EasyPersistor() throws ParserConfigurationException, SAXException {
        ormConfigParser = new OrmConfigParser();
        packageScanner = new PackageScanner();
    }

    public void execute(Project project, VirtualFile xmlConfigFile, ProgressIndicator indicator) {
        indicator.setText("Parsing Entities...");
        indicator.setFraction(0.0);
        try {
            Module module = ModuleUtil.findModuleForFile(xmlConfigFile, project);
            ApplicationManager.getApplication().runReadAction(new Runnable() {
                @Override
                public void run() {
                    ormConfigParser.parse(xmlConfigFile);
                }
            });
            MappingRepository mappingRepository = new MappingRepository();
            ApplicationManager.getApplication().runReadAction(new Runnable() {
                @Override
                public void run() {
                    int i = 1;
                    int n = ormConfigParser.getEntitiesConfigs().size();
                    for (EntitiesConfig entitiesConfig : ormConfigParser.getEntitiesConfigs()) {
                        //System.out.println(entitiesConfig);
                        packageScanner.scanInModule(entitiesConfig, module, mappingRepository, i, n, indicator);
                        //packageScanner.scanInProject(entitiesConfig, project, mappingRepository, i, n, indicator);
                        i++;
                    }
                }
            });
            indicator.setText("Generating ORM codes ...");
            indicator.setFraction(0.5);
            SQLGenerator sqlGenerator;
            switch (ormConfigParser.getDialect()) {
                case "MySQL":
                    sqlGenerator = new MySQLGenerator();
                    break;
                case "PostgreSQL":
                    sqlGenerator = new PostgreSQLGenerator();
                    break;
                default:
                    throw new RuntimeException("Wrong dialect in orm-config.xml. Should be MySQL or PostgreSQL!");
            }
            PersistorMethodGenerator methodGenerator = new PersistorMethodGenerator(sqlGenerator);
            PersistorsGenerator persistorsGenerator = new PersistorsGenerator(methodGenerator);
            persistorsGenerator.generate(project, mappingRepository, indicator);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            Notification notification = new Notification("Easy Persist", "Error",
                    "Generation failed :" + e.getMessage(),
                    NotificationType.ERROR
            );
            Notifications.Bus.notify(notification);
        }
    }
}
