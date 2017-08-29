package net.royqh.easypersist.entity.generator;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;

/**
 * Created by Roy on 2017/6/27.
 */
public class TemplateLoader {
    private static Configuration configuration = null;

    static {
        configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setTemplateLoader(new ClassTemplateLoader(TemplateLoader.class, "/templates"));
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

    }

    public static Template loadTemplate(String templateFileName) {
        try {
            return configuration.getTemplate(templateFileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
