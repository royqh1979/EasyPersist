package net.royqh.easypersist.actions;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.parser.jpa.ClassParser;
import net.royqh.easypersist.ui.EditorTypeChooseDialog;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Roy on 2017/6/12.
 */
public class GenerateViewAction extends AnAction {
    private static Logger logger = Logger.getInstance(GenerateViewAction.class);

    @Override
    public void actionPerformed(AnActionEvent e) {
        ProgressManager progressManager = ProgressManager.getInstance();
        progressManager.run(new Task.Backgroundable(e.getProject(), "Parsing Entity...") {

            @Override
            public void run(@NotNull ProgressIndicator indicator) {

                try {
                    PsiClass psiClass = (PsiClass) e.getData(CommonDataKeys.PSI_ELEMENT);
                    Project project = e.getProject();
                    Module module = ModuleUtil.findModuleForFile(psiClass.getContainingFile().getVirtualFile(), project);
                    Entity entity = ApplicationManager.getApplication().runReadAction(new Computable<Entity>() {
                        @Override
                        public Entity compute() {
                            indicator.setFraction(0.5);
                            indicator.setText("Parsing Entity " + psiClass.getQualifiedName());
                            return ClassParser.parseEntityClassWithReferences(psiClass, module, true);
                        }
                    });

                    indicator.setFraction(1);
                    EditorTypeChooseDialog dialog = new EditorTypeChooseDialog(entity,psiClass,module);
                    dialog.updateUI();
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
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
        e.getPresentation().setVisible(ClassParser.isEntityClass(element));
    }
}
