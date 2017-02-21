package net.royqh.tools.sql2entity;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiJavaFile;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.royqh.parser.postgresql.model.*;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Roy on 2017/2/10.
 */
public class EntitiesGenerator {
    public static void generate(PsiDirectory directory, Model model, Project project) throws IOException {
        EntityModel entityModel = new EntityModel();

        /* 生成实体模型信息 */
        for (Table table : model.getTables()) {
            String tableName = table.getName();
            ManyToManyMapping mapping = parseManyToManyMappingTable(table);
            if (mapping != null) {
                entityModel.addManyToManyMapping(mapping);
                continue;
            }
            String entityName = convertTableName(tableName);
            Entity entity = new Entity(entityName, table);
            for (Column column : table.getColumns()) {
                String columnName = column.getName();
                String propertyName = convertColumnName(columnName);
                entity.addProperty(propertyName, column);
            }
            entityModel.addEntity(entity);
        }

        /* 实际生成实体类 */
        for (Table table : model.getTables()) {
            if (entityModel.isMappingTable(table)) {
                continue;
            }
            StringBuilder entityBuilder = new StringBuilder();
            Entity entity = entityModel.getEntityByTableName(table.getName());
            entityBuilder.append("import java.io.Serializable;\n");
            entityBuilder.append("import java.util.Date;\n");
            entityBuilder.append("import java.math.BigDecimal;\n");
            entityBuilder.append("import javax.persistence.*;\n");

            entityBuilder.append("@Entity\n");
            StringBuilder indexBuilder=new StringBuilder();
            for (Index index : table.getIndexs()) {
                indexBuilder.append("      @Index(columnList = \"");
                indexBuilder.append(String.join(",", index.getColumns()));
                indexBuilder.append("\"");
                if (isUniqueIndex(index)) {
                    indexBuilder.append(", unique = true");
                }
                indexBuilder.append("),\n");
            }
            for (ForeignKey foreignKey : table.getForeignKeys()) {
                indexBuilder.append("      @Index(columnList = \"");
                indexBuilder.append(String.join(",", foreignKey.getColumns()));
                indexBuilder.append("\"),\n");
            }
            if (indexBuilder.length()==0) {
                entityBuilder.append("@Table(name=\"");
                entityBuilder.append(table.getName());
                entityBuilder.append("\")\n");
            } else {
                entityBuilder.append("@Table(name=\"");
                entityBuilder.append(table.getName());
                entityBuilder.append("\",\n");
                entityBuilder.append("  indexes = {\n");
                entityBuilder.append(indexBuilder);
                entityBuilder.append("})\n");
            }
            StringBuilder mappingBuilder = new StringBuilder();
            for (ManyToManyMapping mapping : entityModel.getManyToMayMappings()) {
                generateMappingInfo(entityModel, mapping, mapping.getMappingColumn1(),
                        mapping.getMappingColumn2(), table, mappingBuilder);
                generateMappingInfo(entityModel, mapping, mapping.getMappingColumn2(),
                        mapping.getMappingColumn1(), table, mappingBuilder);
            }
            if (mappingBuilder.length() > 0) {
                entityBuilder.append("@MapRelations(\n");
                entityBuilder.append("        relations = {\n");
                entityBuilder.append(mappingBuilder);
                entityBuilder.append("        }\n");
                entityBuilder.append(")\n");
            }
            entityBuilder.append("public class ");
            entityBuilder.append(entity.getName());
            System.out.println(entity.getName());
            entityBuilder.append(" implements Serializable {\n");

            for (Column column : table.getColumns()) {
                //生成column对应的field变量
                entityBuilder.append("  private ");
                String propertyName = entity.getPropertyByColumnName(column.getName());
                String propertyType = getType(column.getType(), column.isNotNull());
                entityBuilder.append(propertyType);
                entityBuilder.append(" ");
                entityBuilder.append(propertyName);
                entityBuilder.append(";\n ");
            }

            for (Column column : table.getColumns()) {
                //生成column对应的getter
                String propertyName = entity.getPropertyByColumnName(column.getName());
                String propertyType = getType(column.getType(), column.isNotNull());

                if (column.isPrimaryKey()) {
                    entityBuilder.append("@Id\n");
                    if (isSerialType(column.getType())) {
                        entityBuilder.append("@GeneratedValue\n");
                    }
                }
                entityBuilder.append("@Column(name=\"");
                entityBuilder.append(column.getName());
                entityBuilder.append("\"");
                if (column.isUnique()) {
                    entityBuilder.append(", unique=true");
                }
                if (column.isNotNull()) {
                    entityBuilder.append(", nullable=false");
                }
                entityBuilder.append(")\n");
                if (propertyType.equals("Date")) {
                    entityBuilder.append("@Temporal(TemporalType.");
                    entityBuilder.append(getTemporalType(column.getType()));
                    entityBuilder.append(")\n");
                }
                entityBuilder.append("  public ");
                entityBuilder.append(propertyType);
                entityBuilder.append(" ");
                entityBuilder.append(getGetterName(propertyName));
                entityBuilder.append("(){\n");
                entityBuilder.append("      return ");
                entityBuilder.append(propertyName);
                entityBuilder.append(";\n");
                entityBuilder.append("  }\n");

                //生成column对应的setter
                entityBuilder.append("  public void ");
                entityBuilder.append(getSetterName(propertyName));
                entityBuilder.append("(");
                entityBuilder.append(propertyType);
                entityBuilder.append(" ");
                entityBuilder.append(propertyName);
                entityBuilder.append(") {\n");
                entityBuilder.append("      this.");
                entityBuilder.append(propertyName);
                entityBuilder.append("=");
                entityBuilder.append(propertyName);
                entityBuilder.append(";\n");
                entityBuilder.append("  }\n");
            }
            entityBuilder.append("}\n");

            PsiFileFactory psiFileFactory=PsiFileFactory.getInstance(project);

            PsiFile file=psiFileFactory.createFileFromText(entity.getName() + ".java", JavaLanguage.INSTANCE,entityBuilder);

            PsiFile oldFile=directory.findFile(file.getName());
            if (oldFile!=null) {
                oldFile.delete();
            }
            CodeStyleManager codeStyleManager=CodeStyleManager.getInstance(project);
            codeStyleManager.reformat(file);

            directory.add(file);
        }
    }

    private static void generateMappingInfo(EntityModel model, ManyToManyMapping mapping, MappingColumn mappingColumn, MappingColumn refMappingColumn, Table table, StringBuilder builder) {
        if (!mappingColumn.getRefTable().equals(table.getName())) {
            return;
        }
        builder.append("        @MapRelation(table=\"");
        builder.append(mapping.getMappingTableName());
        builder.append("\",\n");
        builder.append("            mappingEntityClass = ");
        Entity mappingEntity=model.getEntityByTableName(refMappingColumn.getRefTable());
        if (mappingEntity==null) {
            throw new RuntimeException(
                    String.format("Can't find reference table \"%s\" in %s: \"FOREIGN KEY (%s) REFERENCES %s (%s)\"",
                            refMappingColumn.getRefTable(),
                            mapping.getMappingTableName(),
                            refMappingColumn.getColumnName(),
                            refMappingColumn.getRefTable(),
                            refMappingColumn.getRefColumn()
                    ));
        }
        builder.append(mappingEntity.getName());
        builder.append(".class,\n");
        builder.append("            mappingEntityIdColumn = \"");
        builder.append(refMappingColumn.getColumnName());
        builder.append("\",\n");
        builder.append("            idColumn = \"");
        builder.append(mappingColumn.getColumnName());
        builder.append("\"),\n");
    }

    private static ManyToManyMapping parseManyToManyMappingTable(Table table) {
        if (table.getColumns().size() != 2) {
            return null;
        }
        int fkcount = 0;
        List<MappingColumn> mappingColumns = new ArrayList<>();
        for (Column column : table.getColumns()) {
            if (column.isPrimaryKey()) {
                return null;
            }
            if (column.getReference() != null) {
                MappingColumn mappingColumn = new MappingColumn();
                mappingColumn.setColumnName(column.getName());
                mappingColumn.setRefTable(column.getReference().getTable());
                mappingColumn.setRefColumn(column.getReference().getColumn());
                mappingColumns.add(mappingColumn);
                fkcount++;
            }
        }
        fkcount += table.getForeignKeys().size();
        if (fkcount != 2) {
            return null;
        }
        for (ForeignKey foreignKey : table.getForeignKeys()) {
            if (foreignKey.getColumns().size() != 1) {
                continue;
            }
            MappingColumn mappingColumn = new MappingColumn();
            mappingColumn.setColumnName(foreignKey.getColumns().get(0));
            mappingColumn.setRefTable(foreignKey.getRefTable());
            mappingColumn.setRefColumn(foreignKey.getRefColumns().get(0));
            mappingColumns.add(mappingColumn);
        }
        if (mappingColumns.size() != 2) {
            return null;
        }
        ManyToManyMapping manyToManyMapping = new ManyToManyMapping();
        manyToManyMapping.setMappingTableName(table.getName());
        manyToManyMapping.setMappingColumn1(mappingColumns.get(0));
        manyToManyMapping.setMappingColumn2(mappingColumns.get(1));
        return manyToManyMapping;
    }

    private static String getTemporalType(String type) {
        String s = type.trim().toLowerCase();
        if (s.startsWith("timestamp")) {
            return "TIMESTAMP";
        }
        if (s.startsWith("time")) {
            return "TIME";
        }
        if (s.startsWith("date")) {
            return "DATE";
        }
        throw new RuntimeException("Unsupported Temporal Type:" + type);
    }

    private static boolean isSerialType(String type) {
        if (type.equals("serial")) {
            return true;
        }
        if (type.equals("serial8")) {
            return true;
        }
        if (type.equals("serial2")) {
            return true;
        }
        return false;
    }

    private static String getGetterName(String propertyName) {
        return "get" + StringUtils.capitalize(propertyName);
    }

    private static String getSetterName(String propertyName) {
        return "set" + StringUtils.capitalize(propertyName);
    }

    private static boolean isUniqueIndex(Index index) {
        if (index.getType().equals(Index.Type.Unique)) {
            return true;
        }
        if (index.getType().equals(Index.Type.PrimaryKey)
                && index.getColumns().size() > 1) {
            return true;
        }
        return false;
    }

    private static String getType(String type, boolean isNotNull) {
        String s = type.replaceAll("\\(.*\\)", "").toLowerCase().trim();
        if (isNotNull) {
            switch (s) {
                case "serial":
                    return "long";
                case "int":
                case "integer":
                case "int4":
                    return "int";
                case "bigint":
                case "bigserial":
                case "serial8":
                case "int8":
                    return "long";
                case "smallint":
                case "int2":
                case "smallserial":
                case "serial2":
                    return "short";
                case "boolean":
                case "bool":
                    return "boolean";
                case "real":
                case "float4":
                    return "float";
                case "doubleprecision":
                case "float8":
                    return "double";
            }
        } else {
            switch (s) {
                case "serial":
                case "bigserial":
                case "serial8":
                case "shortserial":
                case "serial2":
                    throw new RuntimeException("Serial Type should be not null!");
                case "int":
                case "integer":
                case "int4":
                    return "Integer";
                case "bigint":
                case "int8":
                    return "Long";
                case "smallint":
                case "int2":
                    return "Short";
                case "boolean":
                case "bool":
                    return "Boolean";
                case "real":
                case "float4":
                    return "Float";
                case "doubleprecision":
                case "float8":
                    return "Double";
            }
        }
        switch (s) {
            case "char":
            case "character":
            case "varchar":
            case "charactervaring":
            case "text":
                return "String";
            case "date":
            case "time":
            case "timestamp":
                return "Date";
            case "numeric":
            case "decimal":
                return "BigDecimal";
        }
        throw new RuntimeException(" Unsupported column type :" + type);
    }

    private static String convertColumnName(String columnName) {
        String[] names = columnName.split("_");
        StringBuilder builder = new StringBuilder();
        boolean isFirst = true;
        for (String name : names) {
            if (isColumnNamePrefix(name)) {
                continue;
            }
            if (isFirst) {
                isFirst = false;
                builder.append(StringUtils.uncapitalize(name));
            } else {
                builder.append(StringUtils.capitalize(name));
            }
        }
        return builder.toString();
    }

    private static boolean isColumnNamePrefix(String name) {
        if (name.equalsIgnoreCase("pk")) {
            return true;
        }
        if (name.equalsIgnoreCase("fk")) {
            return true;
        }
        if (name.equalsIgnoreCase("sys")) {
            return true;
        }
        if (name.equalsIgnoreCase("cod")) {
            return true;
        }
        return false;
    }

    /**
     * 将数据表明转换为对应的实体类名
     *
     * @param tableName
     * @return
     */
    private static String convertTableName(String tableName) {
        String[] names = tableName.split("_");
        StringBuilder builder = new StringBuilder();
        for (String name : names) {
            if (isTableNamePrefix(name)) {
                continue;
            }
            builder.append(StringUtils.capitalize(name));
        }
        return builder.toString();
    }

    private static boolean isTableNamePrefix(String name) {
        if (name.equalsIgnoreCase("sys")) {
            return true;
        }
        if (name.equalsIgnoreCase("cod")) {
            return true;
        }
        return false;
    }
}
