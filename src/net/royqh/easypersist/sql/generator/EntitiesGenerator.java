package net.royqh.easypersist.sql.generator;

import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.codeStyle.CodeStyleManager;
import net.royqh.easypersist.sql.model.*;
import net.royqh.easypersist.sql.parser.sql2entity.model.Entity;
import net.royqh.easypersist.sql.parser.sql2entity.model.EntityModel;
import net.royqh.easypersist.sql.parser.sql2entity.model.ManyToManyMapping;
import net.royqh.easypersist.sql.parser.sql2entity.model.MappingColumn;
import net.royqh.easypersist.utils.TypeUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
            boolean hasGISType = false;
            StringBuilder entityBuilder = new StringBuilder();
            Entity entity = entityModel.getEntityByTableName(table.getName());
            StringBuilder importBuilder = new StringBuilder();
            importBuilder.append("package dummy;\n\n");
            importBuilder.append("import net.royqh.easypersist.annotations.Reference;\n");
            importBuilder.append("import java.io.Serializable;\n");
            importBuilder.append("import java.util.Date;\n");
            importBuilder.append("import java.math.BigDecimal;\n");
            importBuilder.append("import javax.persistence.*;\n");

            entityBuilder.append("@Entity\n");
            StringBuilder indexBuilder = new StringBuilder();
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
                if (foreignKey.getColumns().size() > 1) {
                    indexBuilder.append("      @Index(columnList = \"");
                    indexBuilder.append(String.join(",", foreignKey.getColumns()));
                    indexBuilder.append("\"),\n");
                }
            }
            if (indexBuilder.length() == 0) {
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
            //System.out.println(entity.getName());
            entityBuilder.append(" implements Serializable {\n");

            for (Column column : table.getColumns()) {
                //生成column对应的field变量
                entityBuilder.append("  private ");
                String propertyName = entity.getPropertyByColumnName(column.getName());
                String propertyType = getType(column.getName(), column.getType(), column.isNotNull());
                entityBuilder.append(propertyType);
                entityBuilder.append(" ");
                entityBuilder.append(propertyName);
                entityBuilder.append(";\n ");
            }

            for (Column column : table.getColumns()) {
                //生成column对应的getter
                String propertyName = entity.getPropertyByColumnName(column.getName());
                String propertyType = getType(column.getName(), column.getType(), column.isNotNull());
                if (!hasGISType) {
                    hasGISType = TypeUtils.isGISType(propertyType);
                }

                if (column.isPrimaryKey()) {
                    entityBuilder.append("@Id\n");
                    if (isSerialType(column.getType()) ||
                            column.isAutoIncrement()
                            ) {
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
                boolean hasReference = false;
                /*
                ColumnReference columnReference=column.getReference();
                if (columnReference!=null) {
                    entityBuilder.append("@Reference(refEntityClass = ");
                    entityBuilder.append(entityModel.getEntityByTableName(columnReference.getTable()));
                    entityBuilder.append(".class,refEntityColumn = \"");
                    entityBuilder.append(columnReference.getColumn());
                    entityBuilder.append("\")\n");
                    hasReference=true;
                }
                */
                for (ForeignKey foreignKey : table.getForeignKeys()) {
                    if (foreignKey.getColumns().size() > 1) {
                        continue;
                    }
                    if (foreignKey.getColumns().get(0).endsWith(column.getName())) {
                        if (hasReference) {
                            throw new RuntimeException("表" + table.getName() + "中有多个外键引用字段" + column.getName());
                        }
                        entityBuilder.append("@Reference(refEntityClass = ");
                        {
                            Entity refEntity = entityModel.getEntityByTableName(foreignKey.getRefTable());
                            if (refEntity != null) {
                                entityBuilder.append(refEntity.getName());
                            } else {
                                entityBuilder.append(convertTableName(foreignKey.getRefTable()));
                            }
                        }
                        entityBuilder.append(".class)\n");
                        hasReference = true;
                    }

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

            if (hasGISType) {
                importBuilder.append("import org.locationtech.jts.geom.*;\n");
            }
            entityBuilder.insert(0, importBuilder);

            PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(project);

            PsiFile file = psiFileFactory.createFileFromText(entity.getName() + ".java", JavaLanguage.INSTANCE, entityBuilder);

            PsiFile oldFile = directory.findFile(file.getName());
            if (oldFile != null) {
                oldFile.delete();
            }
            CodeStyleManager codeStyleManager = CodeStyleManager.getInstance(project);
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
        Entity mappingEntity = model.getEntityByTableName(refMappingColumn.getRefTable());
        if (mappingEntity == null) {
            throw new RuntimeException(
                    String.format("无法找到表%s中引用的外键表%s，相关外键定义为 \"FOREIGN KEY (%s) REFERENCES %s (%s)\"",
                            mapping.getMappingTableName(),
                            refMappingColumn.getRefTable(),
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
        if (table.getForeignKeys().size() != 2) {
            return null;
        }
        List<MappingColumn> mappingColumns = new ArrayList<>();
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
        throw new RuntimeException("不支持的@Temporal时间类型:" + type);
    }

    private static boolean isSerialType(String type) {
        String t = type.trim().toLowerCase();
        if (t.equals("serial")) {
            return true;
        }
        if (t.equals("serial8")) {
            return true;
        }
        if (t.equals("serial2")) {
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

    private static Pattern typePattern = Pattern.compile("^\\s*(\\w+)(.*)$");

    private static String getType(String name, String type, boolean isNotNull) {
        Matcher matcher = typePattern.matcher(type);
        String s = matcher.replaceAll("$1").toLowerCase().trim();
        System.out.println("type:" + type + " - " + s);
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
                case "tinyint":
                    return "byte";
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
                case "double":
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
                    throw new RuntimeException("字段" + name + "为Serial类型，必须为not null!");
                case "int":
                case "integer":
                case "int4":
                    return "Integer";
                case "bigint":
                case "int8":
                    return "Long";
                case "tinyint":
                    return "Byte";
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
                case "double":
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
            case "geometry" :
                return "Geometry";
            case "linestring":
                return "LineString";
            case "polygon":
                return "Polygon";
            case "multipoint":
                return "MultiPoint";
            case "multilinestring":
                return "MultiLineString";
            case  "multipolygon":
                return "MultiPolygon";
            case "geometrycollection":
                return "GeometryCollection";
        }
        throw new RuntimeException("字段 " + name + ":　不支持的数据类型:" + type);
    }

    private static String convertColumnName(String columnName) {
        String[] names = columnName.split("_");
        StringBuilder builder = new StringBuilder();
        boolean isFirst = true;
        for (String name : names) {
            if (isColumnNamePrefix(name)) {
                continue;
            }
            if (StringUtils.isAllUpperCase(name)) {
                name = name.toLowerCase();
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
        if (name.equalsIgnoreCase("bo")) {
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
            if (StringUtils.isAllUpperCase(name)) {
                name = name.toLowerCase();
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
        if (name.equalsIgnoreCase("bo")) {
            return true;
        }
        return false;
    }
}
