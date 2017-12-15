package net.royqh.easypersist.entity.generator.persistor;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.SourceFolder;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.royqh.easypersist.entity.MappingRepository;
import net.royqh.easypersist.utils.CodeUtils;
import net.royqh.easypersist.entity.model.*;
import net.royqh.easypersist.utils.TypeUtils;

import java.util.*;

/**
 * Created by Roy on 2016/2/15.
 */
public class PersistorsGenerator {
    PersistorMethodGenerator methodGenerator;

    public PersistorsGenerator(PersistorMethodGenerator methodGenerator) {
        this.methodGenerator = methodGenerator;
    }

    public void generate(Project project, MappingRepository mappingRepository, ProgressIndicator indicator) {
        PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(project);
        JavaPsiFacade facade = JavaPsiFacade.getInstance(project);
        CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(project);
        int i, n;
        i = 1;
        n = mappingRepository.getAllEntities().size();
        for (Entity entity : mappingRepository.getAllEntities()) {
            //System.out.println(i+"/"+n);
            //System.out.println("generating persistor for " + entity.getClassInfo().getQualifiedName());
            indicator.checkCanceled();
            indicator.setText("generating persistor for " + entity.getClassInfo().getQualifiedName());
            WriteCommandAction.runWriteCommandAction(project,new Runnable() {
                @Override
                public void run() {
                    generatePersistor(psiFileFactory, facade, codeStyleManager, entity);
                    generatePersistorCompositor(psiFileFactory, facade, codeStyleManager, entity);
                }
            });
            indicator.setFraction(0.5 + (i + 0.0) / n / 2);
            i++;
        }

    }

    public void generatePersistorCompositor(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity) {
        String compositorClassName = CodeUtils.getPersistorCompositorName(entity);
        String fileName = compositorClassName + ".java";

        PsiDirectory psiDirectory = findOrCreatePackageDirectory(entity.getPersistorPackageName(), facade, entity);
        PsiPackage targetPackage = JavaDirectoryService.getInstance().getPackage(psiDirectory);

        PsiFile oldFile = psiDirectory.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            return;
        }
        PsiFile psiFile = generatePersistorCompositorFile(entity, targetPackage, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiDirectory.add(psiFile);
    }

    private PsiFile generatePersistorCompositorFile(Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String className = CodeUtils.getPersistorCompositorName(entity);
        StringBuilder content = new StringBuilder();
        if (targetPackage != null) {
            content.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            content.append("package dummy;\n");
        }
        //imports
        content.append("import ");
        content.append(entity.getClassInfo().getQualifiedName());
        content.append(";\n");
        content.append("import org.springframework.beans.factory.annotation.Autowired;\n");
        content.append("import org.springframework.stereotype.Repository;\n");
        content.append("import org.springframework.transaction.annotation.Transactional;\n");
        content.append("import javax.sql.DataSource;\n");


        content.append("@Repository\n");
        content.append("@Transactional\n");
        content.append("public class " + className + " extends "+CodeUtils.getPersistorName(entity)+"{\n");
        content.append("    @Autowired\n");
        content.append("public void setDataSource(DataSource dataSource) {\n");
        content.append("    super.setDataSource(dataSource);\n");
        content.append("}\n");
        content.append("}\n");

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                content.toString());
    }

    public void generatePersistor(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity) {
        /*
        PsiPackage targetPackage = findOrCreatePackageDirectory(entity.getPersistorPackageName(),facade,entity);
        PsiDirectory psiDirectory = targetPackage.getDirectories()[0];
        */
        PsiDirectory psiDirectory = findOrCreatePackageDirectory(entity.getPersistorPackageName(), facade, entity);
        PsiPackage targetPackage = JavaDirectoryService.getInstance().getPackage(psiDirectory);
        ;

        PsiFile psiFile = generatePersistorFile(entity, targetPackage, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);

        PsiFile oldFile = psiDirectory.findFile(psiFile.getName());
        if (oldFile != null) {
            oldFile.delete();
        }
        psiDirectory.add(psiFile);
    }

    private PsiDirectory findOrCreatePackageDirectory(String packageName, JavaPsiFacade facade, Entity entity) {
        int pos = packageName.lastIndexOf('.');
        if (pos > 0) {
            String parentPackageName = packageName.substring(0, pos);
            String dirName = packageName.substring(pos + 1);
            PsiDirectory parentDir = findOrCreatePackageDirectory(parentPackageName, facade, entity);
            PsiDirectory packageDir = findOrCreateSubDirectory(parentDir, dirName);
            return packageDir;
        } else {
            PsiFile entityFile = entity.getPsiClass().getContainingFile();
            Module module = ModuleUtil.findModuleForPsiElement(entity.getPsiClass().getContainingFile());
            SourceFolder[] sourceFolders = ModuleRootManager.getInstance(module).getContentEntries()[0].getSourceFolders();
            if (sourceFolders.length <= 0) {
                throw new RuntimeException("Can't find Source Folder for project!");
            }
            PsiManager manager = PsiManager.getInstance(facade.getProject());
            PsiDirectory parentDir = manager.findDirectory(sourceFolders[0].getFile());
            PsiDirectory packageDir = findOrCreateSubDirectory(parentDir, packageName);
            return packageDir;
        }
    }

    private PsiDirectory findOrCreateSubDirectory(PsiDirectory parentDir, String dirName) {
        PsiDirectory subDirectory = parentDir.findSubdirectory(dirName);
        if (subDirectory == null) {
            subDirectory = parentDir.createSubdirectory(dirName);
        }
        return subDirectory;
    }

    private PsiFile generatePersistorFile(Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String className = CodeUtils.getPersistorName(entity);
        StringBuilder content = new StringBuilder();
        if (targetPackage != null) {
            content.append("package " + targetPackage.getQualifiedName() + ";\n");
        } else {
            content.append("package dummy;\n");
        }

        //System.out.println("Generating imports for "+entity.getName());
        generateImports(entity, content);


        content.append("public class " + className + "{\n");
        content.append("private Logger logger= LoggerFactory.getLogger(" + className + ".class);\n");
        content.append("    private DataSource dataSource;\n");
        content.append("private SQLExceptionTranslator exceptionTranslator;\n");
       // System.out.println("Generating SQLs for "+entity.getName());
        createSQLs(content, entity);

       // System.out.println("Generating Basic Methods for "+entity.getName());
        createBasicMethods(entity, content);

        //System.out.println("Generating Search Methods for "+entity.getName());
        createSearchMethods(entity, content);

        //System.out.println("Generating Mapping List Methods for "+entity.getName());
        createMappingListMethods(entity, content);

        /*
        if (entity.isFactTable()) {
            methodGenerator.createDeleteByEntityKeyMethods(entity,content);
        }
        */

        //System.out.println("Generating Util Methods for "+entity.getName());
        createUtilMethods(content);

        //System.out.println("Generating Check Column Method for "+entity.getName());
        methodGenerator.createPropertyNameToColumnNameMethod(entity, content);

        methodGenerator.createRowProcessor(entity,content);

        //System.out.println("Generating Row Mapper for "+entity.getName());
        RowMapperGenerator.createRowMapper(entity,content);

        //content.append(RowCallbackHandlerGenerator.createRowCallbackHandler(entity));

        content.append("}\n");

//        try {
//            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("f:\\test.java"),"UTF-8");
//            outputStreamWriter.write(content.toString());
//            outputStreamWriter.close();
//        } catch (Exception e){
//
//    }
        //System.out.println("Generating Persistor File for "+entity.getName());
        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                content.toString());
    }


    private void createMappingListMethods(Entity entity, StringBuilder content) {
        for (MapRelationInfo relationInfo : entity.getMapRelationInfos()) {
            methodGenerator.createCreateXXXMappingMethod(entity, relationInfo, content);
            methodGenerator.createBatchCreateXXXMappingMethod(entity, relationInfo, content);
            methodGenerator.createDeleteXXXMappingMethod(entity, relationInfo, content);
            methodGenerator.createBatchDeleteXXXMappingMethod(entity, relationInfo, content);
            methodGenerator.createCountXXXMappingMethod(entity, relationInfo, content);
            methodGenerator.createFindXXXMappingForAddMethod(entity, relationInfo, content);
            methodGenerator.createFindXXXMappingMethod(entity, relationInfo, content);
            methodGenerator.createFindXXXMappingWithSortMethod(entity, relationInfo, content);
            Entity mapEntity=entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
            methodGenerator.createPropertyNameToColumnNameMethod(mapEntity,content);
        }
    }

    private void createSearchMethods(Entity entity, StringBuilder content) {
        for (IndexInfo indexInfo : entity.getIndexes().values()) {
            if (indexInfo.isUnique()) {
                methodGenerator.createRetrieveByXXXMethod(entity, indexInfo, content);
                if (canGenerateRangeQuery(entity, indexInfo)) {
                    methodGenerator.createCountByXXXMethod(entity, indexInfo, content);
                    methodGenerator.createFindByXXXMethod(entity, indexInfo, content);
                }
            } else {
                methodGenerator.createCountByXXXMethod(entity, indexInfo, content);
                methodGenerator.createFindByXXXMethod(entity, indexInfo, content);
            }
            methodGenerator.createDeleteByXXXMethod(entity, indexInfo, content);
        }

        for (Property property : entity.getProperties()) {
            if (!property.isReferenceProperty()) {
                continue;
            }
            ReferenceSingleProperty referenceSingleProperty=(ReferenceSingleProperty)property;
            if (entity.getIndexes().containsKey(referenceSingleProperty.getName())) {
                throw new RuntimeException("Entity "+entity.getClassInfo().getQualifiedName()+"'s @Reference property "+referenceSingleProperty.getName()+" also appear in index.");
            }
            if (referenceSingleProperty.getColumn().isUnique()) {
                methodGenerator.createRetrieveByXXXMethod(entity, referenceSingleProperty, content);
                if (canGenerateRangeQuery(entity, referenceSingleProperty)) {
                    methodGenerator.createCountByXXXMethod(entity, referenceSingleProperty, content);
                    methodGenerator.createFindByXXXMethod(entity, referenceSingleProperty, content);
                }
            } else {
                methodGenerator.createCountByXXXMethod(entity, referenceSingleProperty, content);
                methodGenerator.createFindByXXXMethod(entity, referenceSingleProperty, content);
            }
            methodGenerator.createDeleteByXXXMethod(entity, referenceSingleProperty, content);
        }

        methodGenerator.createCountAllMethod(entity, content);
        methodGenerator.createFindAllMethod(entity, content);
    }

    private boolean canGenerateRangeQuery(Entity entity, ReferenceSingleProperty referenceSingleProperty) {
        List<SingleProperty> indexProperties = new ArrayList<>();
        indexProperties.add(referenceSingleProperty);
        return canGenerateRangeQuery(referenceSingleProperty.getColumn().isUnique(), indexProperties);
    }

    private boolean canGenerateRangeQuery(Entity entity, IndexInfo indexInfo) {
        List<SingleProperty> indexProperties = methodGenerator.getIndexProperties(entity, indexInfo);
        return canGenerateRangeQuery(indexInfo.isUnique(), indexProperties);
    }

    private boolean canGenerateRangeQuery(boolean isUniqueIndex, List<SingleProperty> indexProperties) {
        if (isUniqueIndex) {
            for (SingleProperty singleProperty : indexProperties) {
                if (TypeUtils.isRangeTypeProperty(singleProperty) || TypeUtils.isStringType(singleProperty)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private void createUtilMethods(StringBuilder content) {
        methodGenerator.createExceptionTranslatorGetter(content);
        methodGenerator.createDataSourceGetter(content);
        methodGenerator.createDataSourceSetter(content);
    }

    private void createBasicMethods(Entity entity, StringBuilder content) {
        methodGenerator.createRetrieveByIdMethod(content, entity);
        methodGenerator.createLoadAllMethod(content, entity);
        methodGenerator.createBasicCountAllMethod(content,entity);
        methodGenerator.createCreateMethods(content, entity);
        methodGenerator.createUpdateMethod(content, entity);
        methodGenerator.createDeleteMethods(content, entity);
    }

    private void generateImports(Entity entity, StringBuilder content) {
        content.append("import javax.sql.DataSource;\n");
        content.append("import org.apache.commons.lang3.StringUtils;\n");
        content.append("import org.slf4j.Logger;\n");
        content.append("import org.slf4j.LoggerFactory;\n");
        content.append("import java.util.Date;\n");
        content.append("import java.sql.*;\n");
        content.append("import java.util.*;\n");

        content.append("import com.google.common.base.Preconditions;\n");
        content.append("import net.royqh.lang.SqlTools;");

        content.append("import org.springframework.dao.EmptyResultDataAccessException;\n");
        content.append("import org.springframework.jdbc.core.RowCallbackHandler;\n");
        content.append("import org.springframework.jdbc.core.RowMapper;\n");
        content.append("import org.springframework.jdbc.datasource.DataSourceUtils;\n");
        content.append("import org.springframework.jdbc.support.JdbcUtils;\n");
        content.append("import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;\n");
        content.append("import org.springframework.jdbc.support.SQLExceptionTranslator;\n");
        content.append("import org.springframework.jdbc.support.SQLStateSQLExceptionTranslator;\n");
        content.append("import javax.sql.rowset.serial.SerialClob;\n");
        content.append("import org.apache.commons.lang3.SerializationUtils;\n");
        content.append("import " + entity.getClassInfo().getQualifiedName() + ";\n");
        Set<String> types = CodeUtils.getPropertyTypes(entity);
        for (String type : types) {
            content.append("import ");
            content.append(type);
            content.append(";\n");
        }


    }

    /*
    private  void createRetrieveByIdMethod(StringBuilder content, Entity entity) {
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public " + entity.getClassInfo().getName()+" retrieve(");
        content.append(TypeUtils.getShortTypeName(idProperty.getType()));
        content.append(" id) {\n");
        String rowCallbackHandlerName= CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append(rowCallbackHandlerName+" rowCallbackHandler = new ");
        content.append(rowCallbackHandlerName+"();\n");
        content.append("jdbcTemplate.query(FULL_JOIN_SELECT_SQL + \" where A.id = ?\",\n");
        content.append("new Object[]{id},rowCallbackHandler);\n");

        content.append(entity.getClassInfo().getName()+" value = rowCallbackHandler.getSingleResult();\n");
        content.append("return value;\n");
        content.append("}\n");
    }

    private  void createLoadAllMethod(StringBuilder content, Entity entity) {
        String rowCallbackHandlerClassName= CodeUtils.getRowCallbackHandlerClassName(entity);
        content.append("public List<" + entity.getClassInfo().getName()+"> retrieveAll() {\n");
        content.append(rowCallbackHandlerClassName+" rowCallbackHandler = new ");
        content.append(rowCallbackHandlerClassName+"();\n");
        content.append("jdbcTemplate.query(FULL_JOIN_SELECT_SQL,\n");
        content.append("rowCallbackHandler);\n");

        content.append("List<"+entity.getClassInfo().getName()+"> values =" +
                "new ArrayList<>(rowCallbackHandler.getResults());\n");
        content.append("return values;\n");
        content.append("}\n");
    }
    */

    private void createSQLs(StringBuilder content, Entity entity) {
        content.append(methodGenerator.getSqlGenerator().generateSimpleSelectSQL(entity));
        content.append(methodGenerator.getSqlGenerator().generateSelectAllSQL(entity));
        // content.append(SQLGenerator.generateFullJoinSelectSQL(entity));
        /*
        content.append(SQLGenerator.generateInsertSQL(entity));
        content.append(SQLGenerator.generateUpdateSQL(entity));
        content.append
        */


    }

    public void generatePersistor(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory outputDir) {
        PsiFile psiFile = generatePersistorFile(entity, null, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        PsiFile oldFile = outputDir.findFile(psiFile.getName());
        if (oldFile != null) {
            oldFile.delete();
        }
        outputDir.add(psiFile);
    }

    public void generatePersistorCompositor(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity, PsiDirectory psiOutputDir) {
        String compositorClassName = CodeUtils.getPersistorCompositorName(entity);
        String fileName = compositorClassName + ".java";

        PsiFile oldFile = psiOutputDir.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null) {
            oldFile.delete();
        }
        PsiFile psiFile = generatePersistorCompositorFile(entity, null, psiFileFactory);
        psiFile = (PsiFile) codeStyleManager.reformat(psiFile);
        psiOutputDir.add(psiFile);
    }

}
