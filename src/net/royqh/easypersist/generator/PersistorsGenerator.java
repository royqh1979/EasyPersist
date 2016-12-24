package net.royqh.easypersist.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.SourceFolder;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.royqh.easypersist.MappingRepository;
import net.royqh.easypersist.model.*;
import net.royqh.easypersist.model.jpa.Constants;
import net.royqh.easypersist.utils.TypeUtils;

import java.util.*;

/**
 * Created by Roy on 2016/2/15.
 */
public class PersistorsGenerator {
    public static void generate(Project project, MappingRepository mappingRepository, ProgressIndicator indicator) {
        PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(project);
        JavaPsiFacade facade = JavaPsiFacade.getInstance(project);
        CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(project);
        int i,n;
        i=1;n=mappingRepository.getAllEntities().size();
        for (Entity entity : mappingRepository.getAllEntities()) {
            indicator.checkCanceled();
            indicator.setText("generating persistor for "+entity.getClassInfo().getQualifiedName());
            generatePersistor(psiFileFactory, facade, codeStyleManager, entity);
            generatePersistorCompositor(psiFileFactory, facade,codeStyleManager,entity);
            indicator.setFraction(0.5 + (i + 0.0) / n / 2);
            i++;
        }

    }

    private static void generatePersistorCompositor(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity) {
        String compositorClassName= CodeUtils.getPersistorCompositorName(entity);
        String fileName=compositorClassName+".java";

        PsiDirectory psiDirectory = findOrCreatePackageDirectory(entity.getPersistorPackageName(),facade,entity);
        PsiPackage targetPackage = JavaDirectoryService.getInstance().getPackage(psiDirectory);

        PsiFile oldFile=psiDirectory.findFile(fileName);
        //We Only Create compositor when it is not existed;
        if (oldFile != null ) {
            return ;
        }
        PsiFile psiFile = generatePersistorCompositorFile(entity, targetPackage, psiFileFactory);
        psiFile=(PsiFile)codeStyleManager.reformat(psiFile);
        psiDirectory.add(psiFile);
    }
    private static PsiFile generatePersistorCompositorFile(Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String className = CodeUtils.getPersistorCompositorName(entity);
        StringBuilder content = new StringBuilder();
        content.append("package " + targetPackage.getQualifiedName() + ";\n");
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
        content.append("public class " + className + "{\n");
        content.append("    private DataSource dataSource;\n");
        content.append("    private ");
        content.append(CodeUtils.getPersistorName(entity));
        content.append(" persistor;\n\n");
        content.append(" public "+className+"() {}\n");
        content.append(" public "+className+"(DataSource dataSource) {\n");
        content.append("    setDataSource(dataSource);\n");
        content.append("}\n");
        content.append("    @Autowired\n");
        content.append("public void setDataSource(DataSource dataSource) {\n");
        content.append("this.dataSource=dataSource;\n");
        content.append("persistor=new ");
        content.append(CodeUtils.getPersistorName(entity));
        content.append("();\n");
        content.append("persistor.setDataSource(dataSource);\n");
        content.append("}\n");
        content.append("}\n");

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                content.toString());
    }

    private static void generatePersistor(PsiFileFactory psiFileFactory, JavaPsiFacade facade, CodeStyleManager codeStyleManager, Entity entity) {
        /*
        PsiPackage targetPackage = findOrCreatePackageDirectory(entity.getPersistorPackageName(),facade,entity);
        PsiDirectory psiDirectory = targetPackage.getDirectories()[0];
        */
        PsiDirectory psiDirectory = findOrCreatePackageDirectory(entity.getPersistorPackageName(),facade,entity);
        PsiPackage targetPackage = JavaDirectoryService.getInstance().getPackage(psiDirectory);;

        PsiFile psiFile = generatePersistorFile(entity, targetPackage, psiFileFactory);
        psiFile=(PsiFile)codeStyleManager.reformat(psiFile);

        PsiFile oldFile = psiDirectory.findFile(psiFile.getName());
        if (oldFile != null) {
            oldFile.delete();
        }
        psiDirectory.add(psiFile);
    }

    private static PsiDirectory findOrCreatePackageDirectory(String packageName, JavaPsiFacade facade, Entity entity) {
        int pos=packageName.lastIndexOf('.');
        if (pos>0) {
            String parentPackageName=packageName.substring(0,pos);
            String dirName=packageName.substring(pos+1);
            PsiDirectory parentDir= findOrCreatePackageDirectory(parentPackageName,facade, entity);
            PsiDirectory packageDir= findOrCreateSubDirectory(parentDir,dirName);
            return packageDir;
        } else {
            PsiFile entityFile= entity.getPsiClass().getContainingFile();
            Module module=ModuleUtil.findModuleForPsiElement(entity.getPsiClass().getContainingFile());
            SourceFolder[] sourceFolders= ModuleRootManager.getInstance(module).getContentEntries()[0].getSourceFolders();
            if (sourceFolders.length<=0) {
                throw new RuntimeException("Can't find Source Folder for project!");
            }
            PsiManager manager=PsiManager.getInstance(facade.getProject());
            PsiDirectory parentDir=manager.findDirectory(sourceFolders[0].getFile());
            PsiDirectory packageDir=findOrCreateSubDirectory(parentDir,packageName);
            return packageDir;
        }
    }

    private static PsiDirectory findOrCreateSubDirectory(PsiDirectory parentDir, String dirName) {
        PsiDirectory subDirectory=parentDir.findSubdirectory(dirName);
        if (subDirectory==null) {
            subDirectory=parentDir.createSubdirectory(dirName);
        }
        return subDirectory;
    }

    private static PsiFile generatePersistorFile(Entity entity, PsiPackage targetPackage, PsiFileFactory psiFileFactory) {
        String className = CodeUtils.getPersistorName(entity);
        StringBuilder content = new StringBuilder();
        content.append("package " + targetPackage.getQualifiedName() + ";\n");

        generateImports(entity, content);


        content.append("public class " + className + "{\n");
        content.append("private Logger logger= LoggerFactory.getLogger("+className+".class);\n");
        content.append("    private DataSource dataSource;\n");
        content.append("private SQLExceptionTranslator exceptionTranslator;\n");
        createSQLs(content, entity);

        createBasicMethods(entity, content);

        createSearchMethods(entity,content);

        createMappingListMethods(entity,content);

        createUtilMethods(content);


        content.append(RowMapperGenerator.createRowMapper(entity));

        //content.append(RowCallbackHandlerGenerator.createRowCallbackHandler(entity));

        content.append("}\n");

        return psiFileFactory.createFileFromText(className + ".java", JavaLanguage.INSTANCE,
                content.toString());
    }


    private static void createMappingListMethods(Entity entity, StringBuilder content) {
        for (MapRelationInfo relationInfo: entity.getMapRelationInfos()) {
            MethodGenerator.createCreateXXXMappingMethod(entity,relationInfo,content);
            MethodGenerator.createDeleteXXXMappingMethod(entity,relationInfo,content);
            MethodGenerator.createBatchDeleteXXXMappingMethod(entity,relationInfo,content);
            MethodGenerator.createCountXXXMappingMethod(entity,relationInfo,content);
            MethodGenerator.createFindXXXMappingMethod(entity,relationInfo,content);
            MethodGenerator.createFindXXXMappingWithSortMethod(entity,relationInfo,content);
        }
    }

    private static void createSearchMethods(Entity entity, StringBuilder content) {
        for (IndexInfo indexInfo:entity.getIndexes()) {
            if (indexInfo.isUnique()) {
                MethodGenerator.createRetrieveByXXXMethod(entity, indexInfo, content);
                if (canGenerateRangeQuery(entity,indexInfo)) {
                    MethodGenerator.createCountByXXXMethod(entity, indexInfo, content);
                    MethodGenerator.createFindByXXXMethod(entity, indexInfo, content);
                }
            } else {
                MethodGenerator.createCountByXXXMethod(entity, indexInfo, content);
                MethodGenerator.createFindByXXXMethod(entity, indexInfo, content);
            }
            MethodGenerator.createDeleteByXXXMethod(entity,indexInfo,content);
        }

        MethodGenerator.createCountAllMethod(entity,content);
        MethodGenerator.createFindAllMethod(entity,content);
    }

    private static boolean canGenerateRangeQuery(Entity entity, IndexInfo indexInfo) {
        List<SingleProperty> indexProperties = MethodGenerator.getIndexProperties(entity, indexInfo);
        if (indexInfo.isUnique()) {
            for (SingleProperty singleProperty : indexProperties) {
                if (!TypeUtils.isRangeType(singleProperty) && !TypeUtils.isStringType(singleProperty)) {
                    //unique and not range type, can't retrive many entity by this property
                    return false;
                }
            }
        }
        return true;
    }

    private static void createUtilMethods(StringBuilder content) {
        MethodGenerator.createExceptionTranslatorGetter(content);
        MethodGenerator.createDataSourceGetter(content);
        MethodGenerator.createDataSourceSetter(content);
    }

    private static void createBasicMethods(Entity entity, StringBuilder content) {
        MethodGenerator.createLoadByIdMethod(content, entity);
        MethodGenerator.createLoadAllMethod(content, entity);

        MethodGenerator.createCreateMethod(content, entity);
        MethodGenerator.createUpdateMethod(content, entity);
        MethodGenerator.createDeleteMethod(content,entity);

    }

    private static void generateImports(Entity entity, StringBuilder content) {
        content.append("import javax.sql.DataSource;\n");
        content.append("import org.slf4j.Logger;\n");
        content.append("import org.slf4j.LoggerFactory;\n");
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
        Set<String> types = new HashSet<>();
        for (Property property : entity.getProperties()) {
            PropertyType propertyType = property.getPropertyType();
            switch (propertyType) {
                case Column:
                    types.add(TypeUtils.cleanForImport(property.getType()));
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
        for (MapRelationInfo relationInfo:entity.getMapRelationInfos()) {
            types.add(relationInfo.getMappingEntityFullClassName());
            Entity mappingEntity=entity.getMappingRepository().findEntityByClass(relationInfo.getMappingEntityFullClassName());
            types.add(mappingEntity.getPersistorPackageName().replaceAll(System.lineSeparator(),".")
                +"."+CodeUtils.getPersistorName(mappingEntity));
        }
        types.removeAll(Constants.PRIMITIVE_TYPES);
        for (String type:types){
            content.append("import ");
            content.append(type);
            content.append(";\n");
        }


    }

    /*
    private static void createLoadByIdMethod(StringBuilder content, Entity entity) {
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

    private static void createLoadAllMethod(StringBuilder content, Entity entity) {
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

    private static void createSQLs(StringBuilder content, Entity entity) {
        content.append(SQLGenerator.generateSimpleSelectSQL(entity));
       // content.append(SQLGenerator.generateFullJoinSelectSQL(entity));
        /*
        content.append(SQLGenerator.generateInsertSQL(entity));
        content.append(SQLGenerator.generateUpdateSQL(entity));
        content.append
        */


    }
}
