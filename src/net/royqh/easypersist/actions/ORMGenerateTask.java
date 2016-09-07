package net.royqh.easypersist.actions;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.progress.PerformInBackgroundOption;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.EasyPersistor;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Roy on 2016/8/31.
 */
public class ORMGenerateTask extends Task.Backgroundable {
    private EasyPersistor easyPersistor;
    private VirtualFile xmlConfigFile;

    public ORMGenerateTask(@Nullable Project project, @Nls(capitalization = Nls.Capitalization.Title) @NotNull String title, boolean canBeCancelled,EasyPersistor easyPersistor,
                           VirtualFile xmlConfigFile) {
        super(project, title, canBeCancelled);
        this.easyPersistor=easyPersistor;
        this.xmlConfigFile=xmlConfigFile;
    }

    @Override
    public void run(@NotNull ProgressIndicator indicator) {
        easyPersistor.execute(getProject(),xmlConfigFile,indicator);
    }
}
