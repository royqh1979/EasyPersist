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
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiManager;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.sql.dialects.SqlLanguageDialect;
import net.royqh.easypersist.sql.parser.syntax.mysql.MySQLLexer;
import net.royqh.easypersist.sql.parser.syntax.mysql.MySQLParser;
import net.royqh.easypersist.sql.parser.mysql2postgresql.Mysql2PostgresqlVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Convert MySQL Table define codes to PostgreSQL
 * Created by Roy on 2017/2/12.
 */
public class MySQL2PostgreSQLAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        final VirtualFile mysqlFile = anActionEvent.getData(CommonDataKeys.VIRTUAL_FILE);
        final Project project = anActionEvent.getProject();
        if (mysqlFile == null) {
            return;
        }
        ProgressManager progressManager = ProgressManager.getInstance();
        MySQL2PostgreSQLTask task = new MySQL2PostgreSQLTask(project,mysqlFile);
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

    public class MySQL2PostgreSQLTask extends Task.Backgroundable{
        private VirtualFile mysqlFile;
        public MySQL2PostgreSQLTask(Project project, VirtualFile mysqlFile) {
            super(project,"Convert MySQL to PostgreSQL");
            this.mysqlFile=mysqlFile;
        }

        @Override
        public void run(@NotNull ProgressIndicator indicator) {
            WriteCommandAction.runWriteCommandAction(getProject(), new Runnable() {
                @Override
                public void run() {
                    try {
                        indicator.setFraction(0.1);
                        
                        InputStream is=mysqlFile.getInputStream();
                        InputStreamReader reader=new InputStreamReader(is, mysqlFile.getCharset());
                        ANTLRInputStream input = new ANTLRInputStream(reader);
                        MySQLLexer lexer = new MySQLLexer(input);
// create a buffer of tokens pulled from the lexer
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
                        MySQLParser parser = new MySQLParser(tokens);
                        ParseTree tree = parser.prog(); // begin parsing at init rule
                        Mysql2PostgresqlVisitor visitor=new Mysql2PostgresqlVisitor(tokens);
                        tree.accept(visitor);
                        StringBuilder convertedSql=visitor.getConvertedSQL();

                        PsiFileFactory fileFactory=PsiFileFactory.getInstance(getProject());
                        PsiFile psiFile=fileFactory.createFileFromText(mysqlFile.getNameWithoutExtension()+".postgre.sql",SqlLanguageDialect.findLanguageByID("PostgreSQL"),convertedSql);

                        CodeStyleManager codeStyleManager=CodeStyleManager.getInstance(getProject());
                        psiFile=(PsiFile)codeStyleManager.reformat(psiFile);

                        PsiDirectory psiDirectory= PsiManager.getInstance(getProject()).findDirectory(mysqlFile.getParent());

                        PsiFile oldFile = psiDirectory.findFile(psiFile.getName());
                        if (oldFile != null) {
                            oldFile.delete();
                        }
                        psiDirectory.add(psiFile);
                        indicator.setFraction(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Logger.getInstance(MySQL2PostgreSQLTask.class).error(e);
                        Notification notification = new Notification(
                                "Easy Persist",
                                "Error",
                                "Generation failed :" + e.getMessage(),
                                NotificationType.ERROR
                        );
                        Notifications.Bus.notify(notification, getProject());
                        throw new RuntimeException(e);
                    }

                }
            });
        }
    }
}
