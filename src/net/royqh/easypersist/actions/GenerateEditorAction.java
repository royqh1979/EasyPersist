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
import net.royqh.easypersist.generator.*;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.parsers.jpa.ClassParser;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Created by Roy on 2017/6/12.
 */
public class GenerateEditorAction extends AnAction {
    private static Logger logger = Logger.getInstance(GenerateEditorAction.class);

    @Override
    public void actionPerformed(AnActionEvent e) {
        ProgressManager progressManager = ProgressManager.getInstance();
        progressManager.run(new Task.Backgroundable(e.getProject(), "Generate Editor Persistor") {

            @Override
            public void run(@NotNull ProgressIndicator indicator) {

                try {
                    PsiClass psiClass = (PsiClass) e.getData(CommonDataKeys.PSI_ELEMENT);
                    Project project = e.getProject();
                    Module module = ModuleUtil.findModuleForFile(psiClass.getContainingFile().getVirtualFile(), project);
                    indicator.setFraction(0.2);
                    indicator.setText("Parsing Entity " + psiClass.getQualifiedName());
                    Entity entity=ApplicationManager.getApplication().runReadAction(new Computable<Entity>() {
                        @Override
                        public Entity compute() {
                            return ClassParser.parseEntityClassWithMappings(psiClass, module);
                        }
                    });

                    VirtualFile root = ProjectRootManager.getInstance(project)
                            .getFileIndex().getContentRootForFile(psiClass.getContainingFile().getVirtualFile());
                    indicator.setText("Generating Persistor for " + psiClass.getQualifiedName());
                    indicator.setFraction(1);
                    WriteCommandAction.runWriteCommandAction(e.getProject(), new Runnable() {

                        @Override
                        public void run() {
                            try {
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
                                MethodGenerator methodGenerator = new MethodGenerator(new MySQLGenerator());
                                PersistorsGenerator persistorsGenerator = new PersistorsGenerator(methodGenerator);
                                persistorsGenerator.generatePersistor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
                                persistorsGenerator.generatePersistorCompositorForEditor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
                                ServiceGenerator.generateService(psiFileFactory, facade, codeStyleManager,entity,psiOutputDir);
                                ControllerGenerator.generateController(psiFileFactory, facade, codeStyleManager,entity,psiOutputDir);
                                ViewGenerator.generateJspViews(entity,psiOutputDir);
                            }  catch (IOException e1) {
                                throw new RuntimeException(e1);
                            }
                        }
                    });
                } catch (Exception exception) {
                    exception.printStackTrace();
                    Notification notification = new Notification(
                            "Easy Persist",
                            "Error",
                            "Generation failed :" + exception.getMessage(),
                            NotificationType.ERROR
                    );
                    Notifications.Bus.notify(notification, e.getProject());
                    logger.error(exception);
                }

            }
        });

    }

    @Override
    public void update(AnActionEvent e) {
        PsiElement element = e.getData(CommonDataKeys.PSI_ELEMENT);
        if (element instanceof PsiClass) {
            PsiClass psiClass = (PsiClass) element;
            if (ClassParser.isEntityClass(psiClass)) {
                e.getPresentation().setVisible(true);
                return;
            }
        }
        e.getPresentation().setVisible(false);
    }
}
