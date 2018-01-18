package net.royqh.easypersist.ui.editor;

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
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
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

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EditorTypeChooseDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox<ViewType> cbViewType;
    private JCheckBox cbImport;
    private JCheckBox cbExport;
    private JLabel lbEntityClassName;
    private JLabel lbEntityChineseAlias;
    private JLabel lbEntityTableName;
    private JLabel lbEntityType;
    private JPanel pnlImageDemo;
    private ImageView imgEditorDemo;
    private Entity entity;
    private Logger logger = Logger.getLogger(EditorTypeChooseDialog.class);
    private Map<String, BufferedImage> preLoadedImages = new HashMap<>();
    private boolean goOn;
    private ViewType viewType;
    private boolean importSelected;
    private boolean exportSelected;

    public EditorTypeChooseDialog(Entity entity) {
        this.entity = entity;
        $$$setupUI$$$();
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

        cbViewType.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                ViewType viewType = (ViewType) itemEvent.getItem();
                cbImport.setEnabled(viewType.containsExcelStyleEditor() || viewType.containsFullFunctionEditor());
                changeImage(viewType);
            }
        });
    }


    private void changeImage(ViewType viewType) {
        try {
            switch (viewType) {
                case ExcelStyleEditorOnly:
                    prepareImageAndDraw("/images/ExcelStyleEditorUI.png");
                    break;
                case FullFunctionEditorOnly:
                    prepareImageAndDraw("/images/FullFunctionalEdtiorUI.png");
                    break;
                case SearchViewOnly:
                    prepareImageAndDraw("/images/SearchViewUI.png");
                    break;
                case FullFunctionEdtiorAndSearchView:
                    prepareImageAndDraw("/images/FullEditorAndSearchView.png");
                    break;
                case ExcelStyleEditorAndSearchView:
                    prepareImageAndDraw("/images/ExcelEditorAndSearchViewUI.png");
                    break;
                default:
                    imgEditorDemo.setImage(null);
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        }
    }

    private void prepareImageAndDraw(String resourcePath) throws IOException {
        BufferedImage image = preLoadedImages.get(resourcePath);
        if (image == null) {
            image = ImageIO.read(getClass().getResourceAsStream(resourcePath));
            preLoadedImages.put(resourcePath, image);
        }
        imgEditorDemo.setImage(image);
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
        imgEditorDemo = new ImageView();
    }

    private void onCancel() {
        goOn = false;
        dispose();
    }

    private void onOK() {
        goOn = true;
        viewType = (ViewType) cbViewType.getSelectedItem();
        importSelected = cbImport.isSelected();
        exportSelected = cbExport.isSelected();
        dispose();
    }

    public boolean isGoOn() {
        return goOn;
    }

    public ViewType getViewType() {
        return viewType;
    }

    public boolean isImportSelected() {
        return importSelected;
    }

    public boolean isExportSelected() {
        return exportSelected;
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayoutManager(5, 1, new Insets(10, 10, 10, 10), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1, true, false));
        panel1.add(panel2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        buttonOK = new JButton();
        buttonOK.setText("OK");
        panel2.add(buttonOK, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonCancel = new JButton();
        buttonCancel.setText("Cancel");
        panel2.add(buttonCancel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pnlImageDemo = new JPanel();
        pnlImageDemo.setLayout(new BorderLayout(0, 0));
        contentPane.add(pnlImageDemo, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(710, 350), null, 1, false));
        pnlImageDemo.add(imgEditorDemo, BorderLayout.CENTER);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("可生成视图类型");
        panel3.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        cbViewType.setModel(defaultComboBoxModel1);
        panel3.add(cbViewType, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel4, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        cbImport = new JCheckBox();
        cbImport.setSelected(true);
        cbImport.setText("包含Excel导入功能");
        panel4.add(cbImport, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cbExport = new JCheckBox();
        cbExport.setSelected(true);
        cbExport.setText("包含Excel导出功能");
        panel4.add(cbExport, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayoutManager(2, 4, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel5, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("实体类名");
        panel5.add(label2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbEntityClassName = new JLabel();
        lbEntityClassName.setText("ProductType");
        panel5.add(lbEntityClassName, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("实体中文名");
        panel5.add(label3, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbEntityChineseAlias = new JLabel();
        lbEntityChineseAlias.setText("产品类型");
        panel5.add(lbEntityChineseAlias, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("对应数据表名");
        panel5.add(label4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbEntityTableName = new JLabel();
        lbEntityTableName.setText("product_type");
        panel5.add(lbEntityTableName, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("实体类型");
        panel5.add(label5, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbEntityType = new JLabel();
        lbEntityType.setText("普通实体");
        panel5.add(lbEntityType, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }
}
