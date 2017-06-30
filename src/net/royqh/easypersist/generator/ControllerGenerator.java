package net.royqh.easypersist.generator;

import com.github.rjeschke.txtmark.Run;
import com.intellij.lang.java.JavaLanguage;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.royqh.easypersist.model.*;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.utils.TypeUtils;

import java.io.*;
import java.util.*;

/**
 * Created by Roy on 2017/6/24.
 */
public class ControllerGenerator {
    private static Template ControllerTemplate=TemplateLoader.loadTemplate("Controller.ftl");

    public static void generateController(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir) {
        String controllerClassName = CodeUtils.getControllerName(entity);
        String fileName = controllerClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generateControllerFile(entity, null, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

    private static PsiFile generateControllerFile(Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String controllerClassName = CodeUtils.getControllerName(entity);
        String serviceClassName=CodeUtils.getServiceName(entity);
        String serviceName=entity.getName()+"Service";
        String persistorName=CodeUtils.getPersistorCompositorName(entity);
        StringWriter writer = new StringWriter();
        if (targetPackage != null) {
            writer.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            writer.append("package dummy;\n");
        }

        /*-- */
        writer.append("import ");
        writer.append(entity.getClassInfo().getQualifiedName());
        writer.append(";\n");
        writer.append("import cn.edu.bjfu.smartforestry.view.ProcessingResultType;\n");
        writer.append("import cn.edu.bjfu.smartforestry.view.utils.Result;\n");
        writer.append("import cn.edu.bjfu.smartforestry.view.utils.ResultWithEntity;\n");
        writer.append("import com.qui.base.Grid;\n");
        writer.append("import com.qui.base.ListForSelect;\n");
        writer.append("import com.qui.base.Pager;\n");
        writer.append("import org.slf4j.Logger;\n");
        writer.append("import org.slf4j.LoggerFactory;\n");
        writer.append("import org.springframework.beans.factory.annotation.Autowired;\n");
        writer.append("import org.springframework.stereotype.Controller;\n");
        writer.append("import org.springframework.web.bind.annotation.RequestMapping;\n");
        writer.append("import org.springframework.web.bind.annotation.RequestMethod;\n");
        writer.append("import org.springframework.web.bind.annotation.RequestParam;\n");
        writer.append("import org.springframework.web.bind.annotation.ResponseBody;\n");
        writer.append("import net.royqh.lang.DateTools;\n");


        writer.append("import java.util.List;\n");

        Set<String> types = new HashSet<>();
        for (Property property : entity.getProperties()) {
            PropertyType propertyType = property.getPropertyType();
            switch (propertyType) {
                case Column:
                    types.add(TypeUtils.cleanForImport(property.getType()));
                    if (property instanceof ReferenceSingleProperty) {
                        ReferenceSingleProperty referenceSingleProperty=(ReferenceSingleProperty)property;
                        types.add(referenceSingleProperty.getRefEntityFullClassName());
                    }
                    break;
                /*
                case OneToMany:
                    types.add(((OneToManyCollectionProperty) property)
                            .getOneToMany().getTargetEntity());
                    break;
                case ManyToMany:
                    types.add(((ManyToManyCollectionProperty) property)
                            .getManyToMany().getTargetEntity());
                    break;
                case OneToOne:
                    types.add(((OneToOneProperty) property)
                            .getOneToOne().getTargetEntity());
                    break;
                case ManyToOne:
                    types.add(((ManyToOneProperty) property)
                            .getManyToOne().getTargetEntity());
                    break;
                case ElementCollection:
                    types.add(((ElementCollectionProperty) property)
                            .getElementCollection().getTargetClassName());
                    break;
                    */
            }
        }
        for (MapRelationInfo relationInfo : entity.getMapRelationInfos()) {
            types.add(relationInfo.getMappingEntityFullClassName());
            Entity mappingEntity = entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
            if (mappingEntity==null) {
                throw new RuntimeException("Not found entity definition for class "+relationInfo.getMappingEntityFullClassName());
            }
            /* 如果单独为某一个Entity生成Persistor, 这时我们不知道Persistor应该放在哪个包里 */
            if (mappingEntity.getPersistorPackageName()!=null) {
                types.add(mappingEntity.getPersistorPackageName().replaceAll(System.lineSeparator(), ".")
                        + "." + CodeUtils.getPersistorName(mappingEntity));
            }
        }
        types.removeAll(Constants.PRIMITIVE_TYPES);
        types.removeAll(Constants.BASIC_TYPES);
        for (String type : types) {
            writer.append("import ");
            writer.append(type);
            writer.append(";\n");
        }

        Map<String,Object> dataModel=new HashMap<>();
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
        StringBuilder content=new StringBuilder();
        generateEntityPropertySettings(content,entity,false);
        dataModel.put("entityPropertySettings",content);
        if (!entity.isAutoGenerateId()) {
            content=new StringBuilder();
            generateEntityPropertySetting(content,entity,entity.getIdProperty());
            dataModel.put("entityIdPropertySetting",content);
        }
        content=new StringBuilder();
        generateEntityParamList(content,entity,false);
        dataModel.put("params",content);
        content=new StringBuilder();
        generateEntityParam(content,entity,entity.getIdProperty());
        dataModel.put("idParam",content);
        content=new StringBuilder();
        generateEntityDump(content,entity,false);
        dataModel.put("entityDumpWithoutId",content);
        content=new StringBuilder();
        generateEntityDump(content,entity,true);
        dataModel.put("entityDumpWithId",content);

        try {
            ControllerTemplate.process(dataModel,writer);
            dataModel.clear();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


         /*
        content.append("@Controller\n");
        content.append("@RequestMapping(\"codes/");
        content.append(entity.getName());
        content.append("\")\n");
        content.append("public class ");
        content.append(controllerClassName);
        content.append(" {\n");

        content.append("@Autowired\n");
        content.append(String.format("private %s %s;\n",
                serviceClassName,
                serviceName));
        for (Property property:entity.getProperties()) {
            if (property instanceof ReferenceSingleProperty) {
                ReferenceSingleProperty referenceSingleProperty = (ReferenceSingleProperty) property;
                Entity referenceEntity = entity.getMappingRepository().findEntityByClass(referenceSingleProperty.getRefEntityFullClassName());
                content.append("@Autowired\n");
                content.append(String.format("private %s %s;\n",
                        CodeUtils.getServiceName(referenceEntity),
                        referenceEntity.getName()+"Service"));
            }
        }
        */

        /* main method */
        /*
        content.append("@RequestMapping(value = \"/main\",method = RequestMethod.GET)\n");
        content.append("public String main(){\n");
        content.append("return \"");
        content.append(entity.getName());
        content.append("\";");
        content.append("}\n");
        */

        /* list method */
        /*
        content.append("@RequestMapping(value = \"/list\",method = RequestMethod.POST,\n");
        content.append("produces = \"application/json\")\n");
        content.append("@ResponseBody\n");
        content.append(String.format("public Grid<%s> list() {\n",
                entity.getClassInfo().getName()));
        content.append(String.format("List<%s> list=%s.listAll();\n",
                entity.getClassInfo().getName(),
                serviceName));
        content.append("Pager pager = new Pager(1000, 1);\n");
        content.append("pager.setTotalRows(list.size());\n");
        content.append(String.format("Grid<%s> result = new Grid<>(pager, list, null, null);\n",
                entity.getClassInfo().getName()));
        content.append("return result;\n");
        content.append("}\n");
        */

        /* list refrenced entity methods*/
        /*
        for (Property property:entity.getProperties()) {
            if (property instanceof ReferenceSingleProperty) {
                ReferenceSingleProperty referenceSingleProperty=(ReferenceSingleProperty)property;
                Entity referenceEntity=entity.getMappingRepository().findEntityByClass(referenceSingleProperty.getRefEntityFullClassName());
                content.append(String.format("@RequestMapping(value = \"/list%s\", method = RequestMethod.POST,\n",
                        referenceEntity.getClassInfo().getName()));
                content.append("produces = \"application/json\")\n");
                content.append("@ResponseBody\n");
                content.append(String.format("public ListForSelect list%s() {\n",
                        referenceEntity.getClassInfo().getName()));
                content.append(String.format("List<%s> list=%s.listAll();\n",
                        referenceEntity.getClassInfo().getName(),
                       referenceEntity.getName()+"Service" ));
                content.append("ListForSelect listForSelect=new ListForSelect();\n");

                content.append(String.format("for (%s %s:list) {\n",
                        referenceEntity.getClassInfo().getName(),
                        referenceEntity.getName()
                        ));
                if (referenceEntity.getListHeaderProperty()==null) {
                    throw new RuntimeException("Entity "+entity.getClassInfo().getQualifiedName()+" don't have a List Header property!");
                }
                content.append(String.format("listForSelect.addItem(%s.%s()+\"\",%s.%s());\n",
                        referenceEntity.getName(),
                        referenceEntity.getIdProperty().getGetter(),
                        referenceEntity.getName(),
                        referenceEntity.getListHeaderProperty().getGetter()
                        ));

                content.append("}\n");
                content.append("return listForSelect;\n");
                content.append("}\n");

            }
        }
        */

        /* create method */
        /*
        content.append("@RequestMapping(value = \"/create\",method = RequestMethod.POST,\n");
        content.append("produces = \"application/json\")\n");
        content.append("@ResponseBody\n");
        content.append("public ResultWithEntity<");
        content.append(entity.getClassInfo().getName());
        content.append("> create(");
        generateEntityParamList(content,entity,false);
        content.append(") {\n");
        content.append(String.format("%s %s=new %s();\n",
                entity.getClassInfo().getName(),
                entity.getName(),
                entity.getClassInfo().getName()));
        generateEntityPropertySettings(content,entity,false);
        content.append(String.format("%s.create(%s);\n",
                serviceName,
                entity.getName()));
        content.append(String.format("return new ResultWithEntity<>(ProcessingResultType.Success,%s);\n",
                entity.getName()
                ));
        content.append("}\n");
        */


        /* update method */
        /*
        content.append("@RequestMapping(value = \"/update\",method = RequestMethod.POST,\n");
        content.append("produces = \"application/json\")\n");
        content.append("@ResponseBody\n");
        content.append(String.format("public ResultWithEntity<%s> update(",
                entity.getClassInfo().getName()));
        generateEntityParamList(content,entity,true);
        content.append(") {\n");
        content.append(String.format("%s %s=%s.retrieve(%s);\n",
                entity.getClassInfo().getName(),
                entity.getName(),
                serviceName,
                entity.getIdProperty().getName()));
        content.append(String.format("if (%s==null)      {\n",
                entity.getName()));
        content.append(String.format("return new ResultWithEntity<>(ProcessingResultType.Fail,%s);\n",
                entity.getName()));
        content.append("}\n");
        generateEntityPropertySettings(content,entity,false);
        content.append(String.format("%s.update(%s);\n",
                serviceName,
                entity.getName()
                ));
        content.append(String.format("return new ResultWithEntity<>(ProcessingResultType.Success,%s);\n",
                entity.getName()));
        content.append("}\n");
        */

        /* delete method */
        /*
        content.append("@RequestMapping(value = \"/delete\",method = RequestMethod.POST,\n");
        content.append("produces = \"application/json\")\n");
        content.append("@ResponseBody\n");
        content.append(String.format("public Result delete(%s id) {\n",
                entity.getIdProperty().getType(),
                entity.getIdProperty().getName()
                ));
        content.append(String.format("%s.delete(id);\n",
                serviceName
                ));
        content.append("return new Result(ProcessingResultType.Success,\"删除成功\");\n");


        content.append("}\n");

        content.append("}\n");
        */
        /*--*/

        /*
        try {
            FileOutputStream outputStream=new FileOutputStream("E:\\test.java");
            OutputStreamWriter fWriter=new OutputStreamWriter(outputStream,"UTF-8");
            fWriter.write(writer.toString());
            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        return psiFileFactory.createFileFromText(controllerClassName + ".java", JavaLanguage.INSTANCE,
                writer.toString());
    }

    private static void generateEntityDump(StringBuilder content, Entity entity,boolean withIdProperty) {
        for (Property property:entity.getProperties()){
            if (property == entity.getIdProperty() && !withIdProperty) {
                continue;
            }
            if (property.getPropertyType()== PropertyType.Column) {
                generateEntityPropertyDump(content,entity,(SingleProperty)property);
            }
        }
    }

    private static void generateEntityPropertyDump(StringBuilder content, Entity entity, SingleProperty property) {
        content.append(String.format("logger.debug(\"%s.%s:\",",
                entity.getClassInfo().getName(),
                property.getName()
                ));
        if (property.getEnumType()!=null) {
            content.append(property.getName()+"Val");
        } else {
            String shortTypeName=TypeUtils.getShortTypeName(property.getType());
            switch (shortTypeName) {
                case "Date":
                case "boolean":
                case "Boolean":
                    content.append(property.getName() + "Val");
                    break;
                default:
                    content.append(property.getName());
            }
        }
        content.append(");\n");
    }

    private static void generateEntityPropertySettings(StringBuilder content, Entity entity, boolean withIdProperty) {
        for (Property property:entity.getProperties()){
            if (property == entity.getIdProperty() && !withIdProperty) {
                continue;
            }
            if (property.getPropertyType()== PropertyType.Column) {
                generateEntityPropertySetting(content,entity,(SingleProperty)property);
            }
        }

    }

    private static void generateEntityPropertySetting(StringBuilder content, Entity entity, SingleProperty property) {
        if (TypeUtils.isPrimitiveType(property.getType())){
            content.append(entity.getName());
            content.append(".");
            content.append(property.getSetter());
            content.append("(");
            switch(property.getType()) {
                case "boolean":
                    content.append(String.format("\"y\".equals(%s)",
                            property.getName()+"Val"));
                    break;
                default:
                content.append(property.getName());
            }
            content.append(");\n");
        } else{
            String shortTypeName=TypeUtils.getShortTypeName(property.getType());
            if (property.getEnumType()!=null) {
                content.append(String.format("if (%s==null){\n",
                        property.getName()+"Val"));
                content.append(entity.getName());
                content.append(".");
                content.append(property.getSetter());
                content.append("(null);\n");
                content.append("} else {\n");
                content.append(entity.getName());
                content.append(".");
                content.append(property.getSetter());
                content.append("(");
                content.append(String.format("%s.values()[%s]",
                        shortTypeName,
                        property.getName()+"Val"));
                content.append(");\n");
                content.append("}\n");
            } else {
                switch (shortTypeName) {
                    case "Date":
                        content.append(entity.getName());
                        content.append(".");
                        content.append(property.getSetter());
                        content.append("(DateTools.parseDate(");
                        content.append(property.getName()+"Val");
                        content.append("));\n");
                        break;
                    case "Boolean":
                        content.append(String.format("if (%s==null){\n",
                                property.getName()+"Val"));
                        content.append(entity.getName());
                        content.append(".");
                        content.append(property.getSetter());
                        content.append("(null);\n");
                        content.append("} else {\n");
                        content.append(entity.getName());
                        content.append(".");
                        content.append(property.getSetter());
                        content.append("(");
                        content.append(String.format("\"y\".equals(%s)",
                                property.getName()+"Val"));
                        content.append(");\n");
                        content.append("}\n");
                        break;
                    default:
                        content.append(entity.getName());
                        content.append(".");
                        content.append(property.getSetter());
                        content.append("(");
                        content.append(property.getName());
                        content.append(");\n");
                }
            }

        }

    }

    private static void generateEntityParamList(StringBuilder content, Entity entity, boolean withIdProperty) {
        int i;
        i=0;
        for (Property property:entity.getProperties()){
            if (property == entity.getIdProperty() && !withIdProperty) {
                continue;
            }
            if (property.getPropertyType()== PropertyType.Column) {
                if (i!=0) {
                    content.append(" , ");
                }
                i++;
                generateEntityParam(content,entity,(SingleProperty)property);
            }
        }
    }

    private static void generateEntityParam(StringBuilder content, Entity entity, SingleProperty property) {
        content.append(String.format("@RequestParam(\"%s\")",
                property.getName()));
        if (property.getEnumType()!=null) {
            content.append("Integer ");
            content.append(property.getName()+"Val");
        } else {
            String shortTypeName=TypeUtils.getShortTypeName(property.getType());
            switch (shortTypeName) {
                case "Date":
                case "boolean":
                case "Boolean":
                    content.append("String ");
                    content.append(property.getName() + "Val");
                    break;
                default:
                    content.append(shortTypeName);
                    content.append(" ");
                    content.append(property.getName());
            }
        }
    }
}

