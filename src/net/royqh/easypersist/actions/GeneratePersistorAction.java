package net.royqh.easypersist.actions;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.royqh.easypersist.entity.generator.persistor.PersistorMethodGenerator;
import net.royqh.easypersist.entity.generator.persistor.MySQLGenerator;
import net.royqh.easypersist.entity.generator.persistor.PersistorsGenerator;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.parser.jpa.ClassParser;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Created by Roy on 2017/6/12.
 */
public class GeneratePersistorAction extends AnAction {
    private static Logger logger = Logger.getInstance(GeneratePersistorAction.class);

    @Override
    public void actionPerformed(AnActionEvent e) {
        ProgressManager progressManager = ProgressManager.getInstance();
        progressManager.run(new Task.Backgroundable(e.getProject(), "Generate Entity Persistor") {

            @Override
            public void run(@NotNull ProgressIndicator indicator) {

                try {
                    PsiClass psiClass = (PsiClass) e.getData(CommonDataKeys.PSI_ELEMENT);
                    Project project = e.getProject();
                    Module module = ModuleUtil.findModuleForFile(psiClass.getContainingFile().getVirtualFile(), project);
                    Entity entity=ApplicationManager.getApplication().runReadAction(new Computable<Entity>() {
                        @Override
                        public Entity compute() {
                            indicator.setFraction(0.2);
                            indicator.setText("Parsing Entity " + psiClass.getQualifiedName());
                            return ClassParser.parseEntityClassWithReferences(psiClass, module,false);
                        }
                    });

                    VirtualFile root = ProjectRootManager.getInstance(project)
                            .getFileIndex().getContentRootForFile(psiClass.getContainingFile().getVirtualFile());
                    WriteCommandAction.runWriteCommandAction(e.getProject(), new Runnable() {

                        @Override
                        public void run() {
                            try {
                                indicator.setText("Generating Persistor for " + psiClass.getQualifiedName());
                                indicator.setFraction(0.5);
                                VirtualFile genDir = root.findChild("gen");
                                if (genDir == null) {
                                    genDir = root.createChildDirectory(project, "gen");
                                }
                                if (genDir == null) {
                                    throw new RuntimeException("Can't create folder gen!");
                                }
                                PsiDirectory psiOutputDir = PsiManager.getInstance(project).findDirectory(genDir);

                                PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(project);
                                JavaPsiFacade facade = JavaPsiFacade.getInstance(project);
                                CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(project);
                                PersistorMethodGenerator methodGenerator = new PersistorMethodGenerator(new MySQLGenerator());
                                PersistorsGenerator persistorsGenerator = new PersistorsGenerator(methodGenerator);
                                persistorsGenerator.generatePersistor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
                                persistorsGenerator.generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
                            } catch (IOException exception) {
                                throw new RuntimeException(exception);
                            }
                        }
                    });
                    Notification notification = new Notification(
                            "Easy Persist",
                            "Success",
                            "Entity "+psiClass.getName()+" 's persistor code generation finished.",
                            NotificationType.INFORMATION
                    );
                    Notifications.Bus.notify(notification, e.getProject());
                } catch (Exception exception) {
                    exception.printStackTrace();
                    logger.error(exception);
                    Notification notification = new Notification(
                            "Easy Persist",
                            "Error",
                            "Generation failed :" + exception.getMessage(),
                            NotificationType.ERROR
                    );
                    Notifications.Bus.notify(notification, e.getProject());
                    throw new RuntimeException(exception);
                }

            }
        });

    }

    @Override
    public void update(AnActionEvent e) {
        PsiElement element = e.getData(CommonDataKeys.PSI_ELEMENT);
        if (element instanceof PsiClass) {
            PsiClass psiClass = (PsiClass) element;
            if (ClassParser.isNormalEntityClass(psiClass)) {
                e.getPresentation().setVisible(true);
                return;
            }
        }
        e.getPresentation().setVisible(false);
    }
}
