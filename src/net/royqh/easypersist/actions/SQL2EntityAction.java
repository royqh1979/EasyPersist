package net.royqh.easypersist.actions;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiManager;
import net.royqh.parser.mysql.MySQLLexer;
import net.royqh.parser.postgresql.PostgreSQLLexer;
import net.royqh.parser.postgresql.PostgreSQLParser;
import net.royqh.parser.postgresql.model.Model;
import net.royqh.tools.sql2entity.EntitiesGenerator;
import net.royqh.tools.sql2entity.Sql2ModelVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
                    NotificationGroup notificationGroup = new NotificationGroup("Easy Persit",
                            NotificationDisplayType.TOOL_WINDOW, true);
                    Notification notification;
                    try {
                        indicator.setFraction(0);
                        InputStream is=sqlFile.getInputStream();
                        InputStreamReader reader=new InputStreamReader(is, sqlFile.getCharset());
                        ANTLRInputStream input = new ANTLRInputStream(reader);
                        PostgreSQLLexer lexer=new PostgreSQLLexer(input);
                        CommonTokenStream tokenStream=new CommonTokenStream(lexer);
                        PostgreSQLParser parser=new PostgreSQLParser(tokenStream);
                        ParseTree tree=parser.prog();
                        Model model=new Model();
                        Sql2ModelVisitor visitor=new Sql2ModelVisitor(tokenStream,model);
                        tree.accept(visitor);

                        VirtualFile root= ProjectRootManager.getInstance(getProject())
                                .getFileIndex().getContentRootForFile(sqlFile);

                        File rootDir = new File(root.getPath());

                        File outputDir=new File(root.getPath()+File.separator+"gen");

                        if (!outputDir.exists()) {
                            outputDir.mkdir();
                        }

                        if (!outputDir.isDirectory()) {
                            throw new RuntimeException("Can't create directory "+outputDir.getPath());
                        }
                        
                        EntitiesGenerator.generate(outputDir.getPath(),model);

                        List<File> files=new ArrayList<>();
                        files.add(outputDir);
                        LocalFileSystem.getInstance().refreshIoFiles(files);

                        indicator.setFraction(1);

                    } catch (IOException e) {
                        e.printStackTrace();
                        notification = notificationGroup.createNotification(
                                "Generation failed :" + e.getMessage(),
                                NotificationType.ERROR
                        );
                        Notifications.Bus.notify(notification, getProject());
                    }
                }
            });
        }
    }
}
