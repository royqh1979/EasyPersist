package net.royqh.easypersist.generator;

import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.royqh.easypersist.model.Entity;
import net.royqh.easypersist.model.Property;
import net.royqh.easypersist.model.ReferenceSingleProperty;
import net.royqh.easypersist.model.SingleProperty;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Roy on 2017/6/24.
 */
public class ViewGenerator {
    private static Template JspViewTemplate;
    static {
        JspViewTemplate=TemplateLoader.loadTemplate("EditorView.jsp.ftl");
    }
    public static void generateJspViews(Entity entity, PsiDirectory psiOutputDir) {
        OutputStreamWriter writer=null;
        try {
            VirtualFile jspViewFile =psiOutputDir.getVirtualFile().createChildData(ViewGenerator.class,entity.getName()+".jsp");

            writer=new OutputStreamWriter(jspViewFile.getOutputStream(ViewGenerator.class),"UTF-8");
            Map<String,Object> dataModel=new HashMap<>();
            dataModel.put("entity",entity);
            Set<Entity> refEntities=new HashSet<>();
            dataModel.put("entity",entity);
            for (Property property:entity.getProperties()) {
                if (property instanceof ReferenceSingleProperty) {
                    ReferenceSingleProperty referenceSingleProperty = (ReferenceSingleProperty) property;
                    Entity referenceEntity = entity.getMappingRepository().findEntityByClass(referenceSingleProperty.getRefEntityFullClassName());
                    refEntities.add(referenceEntity);
                }
            }
            dataModel.put("refEntities",refEntities);
            if (StringUtils.isEmpty(entity.getChineseAlias())){
                throw new RuntimeException("Entity Class "+entity.getClassInfo().getQualifiedName()
                        +" don't have @ChineseAlias annotation.");

            }
            for (Property property:entity.getProperties()) {
                if (property instanceof SingleProperty) {
                    SingleProperty singleProperty=(SingleProperty)property;
                    if (StringUtils.isEmpty(singleProperty.getChineseAlias())) {
                        throw new RuntimeException("Entity Class "+entity.getClassInfo().getQualifiedName()
                            +"'s property "+property.getGetter()+"() don't have @ChineseAlias annotation.");
                    }
                }
            }

            JspViewTemplate.process(dataModel,writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
