package net.royqh.easypersist.actions;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiManager;
import net.royqh.easypersist.sql.model.Model;
import net.royqh.easypersist.sql.generator.EntitiesGenerator;
import net.royqh.easypersist.sql.parser.sql2entity.ModelParser;
import net.royqh.easypersist.sql.parser.sql2entity.MySQLModelParser;
import net.royqh.easypersist.sql.parser.sql2entity.PostgreSQLModelParser;
import net.royqh.easypersist.ui.editor.EditorTypeChooseDialog;
import net.royqh.easypersist.ui.entity.SQL2EntityDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Roy on 2017/2/12.
 */
public class SQL2EntityAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        final VirtualFile sqlFile = anActionEvent.getData(CommonDataKeys.VIRTUAL_FILE);
        final Project project = anActionEvent.getProject();
        if (sqlFile == null) {
            return;
        }
        ProgressManager progressManager = ProgressManager.getInstance();
        SQL2EntityTask task = new SQL2EntityTask(project,sqlFile);
        progressManager.run(task);
    }

    @Override
    public void update(AnActionEvent e) {
        final VirtualFile file = e.getData(CommonDataKeys.VIRTUAL_FILE);
        if (file == null || (!file.getName().endsWith(".sql"))) {
            e.getPresentation().setVisible(false);
        } else {
            e.getPresentation().setVisible(true);
        }
    }

    public class SQL2EntityTask extends Task.Backgroundable {
        private VirtualFile sqlFile;

        public SQL2EntityTask(@Nullable Project project, VirtualFile sqlFile) {
            super(project, "Generate Entites");
            this.sqlFile=sqlFile;
        }

        @Override
        public void run(@NotNull ProgressIndicator indicator) {
            WriteCommandAction.runWriteCommandAction(getProject(), new Runnable() {
                @Override
                public void run() {
                    SQL2EntityDialog dialog = new SQL2EntityDialog();
                    dialog.setTitle("SQL to Entity Generation...");
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);

                    if (!dialog.isGoOn()) {
                        return;
                    }
                    try {
                        indicator.setFraction(0.1);
                        sqlFile.refresh(false,false);
                        ModelParser modelParser=null;
                        switch(dialog.getSQLDialectType()) {
                            case MySQL:
                                modelParser=new MySQLModelParser();
                                break;
                            case PostgreSQL:
                                modelParser=new PostgreSQLModelParser();
                                break;
                        }
                        System.out.println("haha");
                        Model model=modelParser.parse(sqlFile);

                        VirtualFile root=  ProjectRootManager.getInstance(getProject())
                                .getFileIndex().getContentRootForFile(sqlFile);


                        VirtualFile genDir=root.findChild("gen");
                        if (genDir==null) {
                            genDir=root.createChildDirectory(getProject(),"gen");
                        }
                        if (genDir==null) {
                            throw new RuntimeException("无法在当前模块(module)下创建文件夹gen!");
                        }
                        PsiDirectory psiOutputDir=PsiManager.getInstance(getProject()).findDirectory(genDir);
                        EntitiesGenerator.generate(psiOutputDir,model,getProject());

                        indicator.setFraction(1);
                        Notification notification = new Notification(
                                "Easy Persist",
                                "成功",
                                "SQL文件"+sqlFile.getName()+"对应的实体类已成功生成",
                                NotificationType.INFORMATION
                        );
                        Notifications.Bus.notify(notification, getProject());
                    } catch (Exception e) {
                        e.printStackTrace();
                        Logger.getInstance(SQL2EntityTask.class).error(e);
                        Notification notification = new Notification(
                                "Easy Persist",
                                "失败",
                                "生成失败:" + e.getMessage(),
                                NotificationType.ERROR
                        );
                        Notifications.Bus.notify(notification);
                        JOptionPane.showMessageDialog(null,e.getMessage(),"处理失败",JOptionPane.ERROR_MESSAGE);

                    }
                }
            });
        }
    }
}
