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
import net.royqh.easypersist.entity.generator.persistor.MySQLGenerator;
import net.royqh.easypersist.entity.generator.persistor.PersistorMethodGenerator;
import net.royqh.easypersist.entity.generator.persistor.PersistorsGenerator;
import net.royqh.easypersist.entity.generator.service.FactTableServiceGenerator;
import net.royqh.easypersist.entity.generator.service.ServiceGenerator;
import net.royqh.easypersist.entity.generator.view.ControllerGenerator;
import net.royqh.easypersist.entity.generator.view.FactTableControllerGenerator;
import net.royqh.easypersist.entity.generator.view.FactTableViewGenerator;
import net.royqh.easypersist.entity.generator.view.ViewGenerator;
import net.royqh.easypersist.entity.model.Entity;
import net.royqh.easypersist.entity.parser.jpa.ClassParser;
import net.royqh.easypersist.ui.EditorTypeChooseDialog;
import net.royqh.easypersist.ui.ViewType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.IOException;

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
                            indicator.setFraction(0.1);
                            indicator.setText("Parsing Entity " + psiClass.getQualifiedName());
                            return ClassParser.parseEntityClassWithReferences(psiClass, module, true);
                        }
                    });
                    EditorTypeChooseDialog dialog = new EditorTypeChooseDialog(entity);
                    dialog.setTitle("View Generation Setting");
                    dialog.updateUI();
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);

                    if (!dialog.isGoOn()) {
                        return;
                    }

                    ViewType viewType = dialog.getViewType();
                    boolean importSelected = dialog.isImportSelected();
                    boolean exportSelected = dialog.isExportSelected();

                    VirtualFile root = ProjectRootManager.getInstance(project)
                            .getFileIndex().getContentRootForFile(psiClass.getContainingFile().getVirtualFile());
                    WriteCommandAction.runWriteCommandAction(project, new Runnable() {
                        @Override
                        public void run() {
                            try {
                                VirtualFile genDir = root.findChild("gen");
                                if (genDir == null) {
                                    genDir = root.createChildDirectory(project, "gen");
                                }
                                if (genDir == null) {
                                    throw new RuntimeException("无法在当前模块(module)下创建文件夹gen!");
                                }
                                PsiDirectory psiOutputDir = PsiManager.getInstance(module.getProject()).findDirectory(genDir);

                                PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(module.getProject());
                                JavaPsiFacade facade = JavaPsiFacade.getInstance(module.getProject());
                                CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(module.getProject());
                                PersistorMethodGenerator methodGenerator = new PersistorMethodGenerator(new MySQLGenerator());
                                PersistorsGenerator persistorsGenerator = new PersistorsGenerator(methodGenerator);

                                if (viewType == ViewType.FactTableEditorOnly) {
                                    generateFactTableView(entity,module,psiOutputDir, psiFileFactory, facade, codeStyleManager, persistorsGenerator, indicator);
                                } else {

                                    generateViewFiles(entity,module,psiOutputDir, psiFileFactory, facade, codeStyleManager, persistorsGenerator, indicator, viewType, importSelected, exportSelected);
                                }

                                Notification notification = new Notification(
                                        "Easy Persist",
                                        "成功",
                                        "实体类" + psiClass.getName() + "的视图相关代码已生成完毕.",
                                        NotificationType.INFORMATION
                                );
                                Notifications.Bus.notify(notification, module.getProject());
                            } catch (IOException e1) {
                                throw new RuntimeException(e1);
                            }
                        }
                    });
                    
                } catch (Exception exception) {
                    exception.printStackTrace();
                    Notification notification = new Notification(
                            "Easy Persist",
                            "失败",
                            "生成失败:" + exception.getMessage(),
                            NotificationType.ERROR
                    );
                    Notifications.Bus.notify(notification, e.getProject());
                    logger.error(exception);
                    JOptionPane.showMessageDialog(null,exception.getMessage(),"处理失败",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    @Override
    public void update(AnActionEvent e) {
        PsiElement element = e.getData(CommonDataKeys.PSI_ELEMENT);
        e.getPresentation().setVisible(ClassParser.isEntityClass(element));
    }

    private void generateViewFiles(Entity entity, Module module, PsiDirectory psiOutputDir, PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, PersistorsGenerator persistorsGenerator, ProgressIndicator indicator, ViewType viewType, boolean importEnabled, boolean exportEnabled) {
        indicator.setText(String.format("Generating persistors for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.2);
        persistorsGenerator.generatePersistor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
        persistorsGenerator.generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
        indicator.setText(String.format("Generating service for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.4);
        ServiceGenerator.generateService(viewType, psiFileFactory, codeStyleManager, entity, psiOutputDir, module, importEnabled, exportEnabled);
        indicator.setText(String.format("Generating controller for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.2);
        ControllerGenerator.generateController(viewType, psiFileFactory, codeStyleManager, entity, psiOutputDir, module, importEnabled, exportEnabled);
        indicator.setText(String.format("Generating view jsp files for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.8);
        ViewGenerator.generateJspViews(viewType, entity, psiOutputDir, importEnabled, exportEnabled);
        indicator.setFraction(1);
    }

    private void generateFactTableView(Entity entity, Module module, PsiDirectory psiOutputDir, PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, PersistorsGenerator persistorsGenerator, @NotNull ProgressIndicator indicator) {
        Entity factTableEntity = entity;
        Entity baseEntity = factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getEntityKeyProperty().getRefEntityFullClassName());
        Entity propertyEntity = factTableEntity.getMappingRepository().findEntityByClass(factTableEntity.getFactTableInfo().getPropertyKeyProperty().getRefEntityFullClassName());

        indicator.setText(String.format("Generating persistors for %s ", factTableEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.2);
        persistorsGenerator.generatePersistor(psiFileFactory, facade, codeStyleManager, factTableEntity, psiOutputDir);
        persistorsGenerator.generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, factTableEntity, psiOutputDir);
        indicator.setText(String.format("Generating persistors for %s ", baseEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.3);
        persistorsGenerator.generatePersistor(psiFileFactory, facade, codeStyleManager, baseEntity, psiOutputDir);
        persistorsGenerator.generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, baseEntity, psiOutputDir);
        indicator.setText(String.format("Generating persistors for %s ", propertyEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.4);
        persistorsGenerator.generatePersistor(psiFileFactory, facade, codeStyleManager, propertyEntity, psiOutputDir);
        persistorsGenerator.generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, propertyEntity, psiOutputDir);
        indicator.setText(String.format("Generating service for %s ", factTableEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.5);
        FactTableServiceGenerator.generateService(psiFileFactory, codeStyleManager, factTableEntity, psiOutputDir, module);
        indicator.setText(String.format("Generating service for %s ", propertyEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.6);
        ServiceGenerator.generateService(ViewType.ExcelStyleEditorOnly, psiFileFactory, codeStyleManager, propertyEntity, psiOutputDir, module, false, false);
        indicator.setText(String.format("Generating service for %s ", baseEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.7);
        ServiceGenerator.generateService(ViewType.FactTableEditorOnly, psiFileFactory, codeStyleManager, baseEntity, psiOutputDir, module, false, false);
        indicator.setText(String.format("Generating controller for %s ", factTableEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.8);
        FactTableControllerGenerator.generateController(psiFileFactory, codeStyleManager, factTableEntity, psiOutputDir, module);
        indicator.setText(String.format("Generating view jsp files for %s ", factTableEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.9);
        FactTableViewGenerator.generateView(factTableEntity, psiOutputDir);
        indicator.setFraction(1);
    }
}
