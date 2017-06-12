package net.royqh.easypersist.actions;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.psi.impl.file.PsiFileImplUtil;
import net.royqh.easypersist.MappingRepository;
import net.royqh.easypersist.generator.MethodGenerator;
import net.royqh.easypersist.generator.MySQLGenerator;
import net.royqh.easypersist.generator.PersistorsGenerator;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.parsers.OrmConfigParser;
import net.royqh.easypersist.parsers.jpa.AnnotationUtils;
import net.royqh.easypersist.parsers.jpa.ClassParser;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Roy on 2017/6/12.
 */
public class GeneratePersistorAction extends AnAction {
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
                    indicator.setFraction(0.2);
                    indicator.setText("Parsing Entity "+psiClass.getQualifiedName());
                    Entity entity = ClassParser.parseEntityClassWithMappings(psiClass, module);

                    VirtualFile root = ProjectRootManager.getInstance(project)
                            .getFileIndex().getContentRootForFile(psiClass.getContainingFile().getVirtualFile());
                    indicator.setText("Generating Persistor for "+psiClass.getQualifiedName());
                    indicator.setFraction(1);
                    WriteCommandAction.runWriteCommandAction(e.getProject(),new Runnable() {

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
                                persistorsGenerator.generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
                            } catch (Exception exception) {
                                exception.printStackTrace();
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
                } catch (Exception exception) {
                    exception.printStackTrace();
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
            PsiAnnotation entityAnnotation = AnnotationUtils.findAnnotation(psiClass,
                    Constants.ENTITY);
            if (entityAnnotation != null) {
                e.getPresentation().setVisible(true);
                return;
            }
        }
        e.getPresentation().setVisible(false);
    }
}
