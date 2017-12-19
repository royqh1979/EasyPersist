package net.royqh.easypersist.ui;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.ui.ComboBox;
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
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class EditorTypeChooseDialog extends JDialog {
    private PsiClass psiClass;
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox<ViewType> cbViewType;
    private JCheckBox 包含Excel导入功能CheckBox;
    private JCheckBox 包含Excel导出功能CheckBox;
    private JLabel lbEntityClassName;
    private JLabel lbEntityChineseAlias;
    private JLabel lbEntityTableName;
    private JLabel lbEntityType;
    private Entity entity;
    private Logger logger = Logger.getLogger(EditorTypeChooseDialog.class);
    private Module module;

    public EditorTypeChooseDialog(Entity entity, PsiClass psiClass, Module module) {
        this.entity = entity;
        this.psiClass = psiClass;
        this.module = module;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public void updateUI() {
        lbEntityClassName.setText(entity.getClassInfo().getName());
        lbEntityChineseAlias.setText(entity.getChineseAlias());
        lbEntityTableName.setText(entity.getTableName());
        lbEntityType.setText(entity.isFactTable() ? "事实表实体" : "普通实体");
        DefaultComboBoxModel<ViewType> comboBoxModel = (DefaultComboBoxModel<ViewType>) cbViewType.getModel();
        if (entity.isFactTable()) {
            comboBoxModel.addElement(ViewType.FactTableEditorOnly);
        } else {
            comboBoxModel.addElement(ViewType.ExcelStyleEditorOnly);
            comboBoxModel.addElement(ViewType.FullFunctionEditorOnly);
            comboBoxModel.addElement(ViewType.SearchViewOnly);
            comboBoxModel.addElement(ViewType.ExcelStyleEditorAndSearchView);
            comboBoxModel.addElement(ViewType.FullFunctionEdtiorAndSearchView);
        }
    }

    private void createUIComponents() {
        // place custom component creation code here
        DefaultComboBoxModel<ViewType> comboBoxModel = new DefaultComboBoxModel<>();
        cbViewType = new ComboBox(comboBoxModel);
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void onOK() {
        ProgressManager progressManager = ProgressManager.getInstance();
        progressManager.run(new Task.Backgroundable(module.getProject(), "Generate Editor Persistor") {
            @Override
            public void run(@NotNull ProgressIndicator indicator) {
                try {
                    ViewType viewType = (ViewType) cbViewType.getSelectedItem();
                    VirtualFile root = ProjectRootManager.getInstance(module.getProject())
                            .getFileIndex().getContentRootForFile(psiClass.getContainingFile().getVirtualFile());
                    WriteCommandAction.runWriteCommandAction(module.getProject(), new Runnable() {

                        @Override
                        public void run() {
                            try {
                                VirtualFile genDir = root.findChild("gen");
                                if (genDir == null) {
                                    genDir = root.createChildDirectory(module.getProject(), "gen");
                                }
                                if (genDir == null) {
                                    throw new RuntimeException("Can't create folder gen!");
                                }
                                PsiDirectory psiOutputDir = PsiManager.getInstance(module.getProject()).findDirectory(genDir);

                                PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(module.getProject());
                                JavaPsiFacade facade = JavaPsiFacade.getInstance(module.getProject());
                                CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(module.getProject());
                                PersistorMethodGenerator methodGenerator = new PersistorMethodGenerator(new MySQLGenerator());
                                PersistorsGenerator persistorsGenerator = new PersistorsGenerator(methodGenerator);

                                if (viewType == ViewType.FactTableEditorOnly) {
                                    generateFactTableView(psiOutputDir, psiFileFactory, facade, codeStyleManager, persistorsGenerator, indicator);
                                } else {
                                    generateViewFiles(psiOutputDir, psiFileFactory, facade, codeStyleManager, persistorsGenerator, indicator, viewType);
                                }

                                Notification notification = new Notification(
                                        "Easy Persist",
                                        "Success",
                                        "Entity " + psiClass.getName() + " 's editor code generation finished.",
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
                            "Error",
                            "Generation failed :" + exception.getMessage(),
                            NotificationType.ERROR
                    );
                    Notifications.Bus.notify(notification, module.getProject());
                    logger.error(exception);
                }
            }
        });

        dispose();
    }

    private void generateViewFiles(PsiDirectory psiOutputDir, PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, PersistorsGenerator persistorsGenerator, ProgressIndicator indicator, ViewType viewType) {
        indicator.setText(String.format("Generating persistors for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.2);
        persistorsGenerator.generatePersistor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
        persistorsGenerator.generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, entity, psiOutputDir);
        indicator.setText(String.format("Generating service for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.4);
        ServiceGenerator.generateService(viewType, psiFileFactory, codeStyleManager, entity, psiOutputDir, module);
        indicator.setText(String.format("Generating controller for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.2);
        ControllerGenerator.generateController(viewType, psiFileFactory, codeStyleManager, entity, psiOutputDir, module);
        indicator.setText(String.format("Generating view jsp files for %s ", entity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.8);
        ViewGenerator.generateJspViews(viewType, entity, psiOutputDir);
        indicator.setFraction(1);
    }

    private void generateFactTableView(PsiDirectory psiOutputDir, PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, PersistorsGenerator persistorsGenerator, @NotNull ProgressIndicator indicator) {
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
        ServiceGenerator.generateService(ViewType.ExcelStyleEditorOnly, psiFileFactory, codeStyleManager, propertyEntity, psiOutputDir, module);
        indicator.setText(String.format("Generating service for %s ", baseEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.7);
        ServiceGenerator.generateService(ViewType.FactTableEditorOnly, psiFileFactory, codeStyleManager, baseEntity, psiOutputDir, module);
        indicator.setText(String.format("Generating controller for %s ", factTableEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.8);
        FactTableControllerGenerator.generateController(psiFileFactory, codeStyleManager, factTableEntity, psiOutputDir, module);
        indicator.setText(String.format("Generating view jsp files for %s ", factTableEntity.getClassInfo().getQualifiedName()));
        indicator.setFraction(0.9);
        FactTableViewGenerator.generateView(factTableEntity, psiOutputDir);
        indicator.setFraction(1);
    }

}
