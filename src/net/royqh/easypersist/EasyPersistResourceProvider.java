package net.royqh.easypersist;

import com.intellij.javaee.ResourceRegistrar;
import com.intellij.javaee.StandardResourceProvider;
import com.intellij.openapi.application.ApplicationManager;

/**
 * Created by Roy on 2017/2/21.
 */
public class EasyPersistResourceProvider implements StandardResourceProvider {
    @Override
    public void registerResources(ResourceRegistrar registrar) {
        registrar.addStdResource("http://royqh.net/codegenerator/orm/schema/config_1_0.xsd", "/schemas/config_1_0.xsd", this.getClass());
        registrar.addStdResource("http://royqh.net/codegenerator/orm/schema/config_1_1.xsd", "/schemas/config_1_1.xsd", this.getClass());
        registrar.addStdResource("http://royqh.net/codegenerator/orm/schema/config_1_2.xsd", "/schemas/config_1_2.xsd", this.getClass());
    }
}
