package net.royqh.easypersist.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;

/**
 * Created by Roy on 2017/6/27.
 */
public class TemplateLoader {
    private static Configuration configuration;
    static {
        configuration=new Configuration(Configuration.VERSION_2_3_23);
        try {
            configuration.setDirectoryForTemplateLoading(new File(TemplateLoader.class.getResource("/templates").getFile()));
            configuration.setDefaultEncoding("UTF-8");
            configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Template loadTemplate(String templateFileName) {
        try {
            return configuration.getTemplate(templateFileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
