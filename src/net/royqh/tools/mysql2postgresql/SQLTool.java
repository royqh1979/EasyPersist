package net.royqh.tools.mysql2postgresql;

import net.royqh.parser.model.*;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Roy on 2017/2/5.
 */
public class SQLTool {
    public static void generateTableColumnDefinitions(Table table, StringBuilder builder) {
        String comment = "";
        int i=0;
        for (Column column:table.getColumns()) {
            if (i != 0) {
                builder.append(",");
                if (!StringUtils.isEmpty(comment)) {
                    builder.append("/*");
                    builder.append(comment);
                    builder.append("*/");
                }
                builder.append("\n");
                comment = "";
            }
            i++;
            builder.append("\"");
            builder.append(column.getName());
            builder.append("\"");

            if (column.isAutoIncrement()) {
                builder.append(" SERIAL");
            } else {
                builder.append(" ");
                builder.append(column.getType());
            }
            if (column.getCollate() != null) {
                builder.append(" COLLATE ");
                builder.append(column.getCollate());
            }
            if (column.isNotNull()) {
                builder.append(" NOT NULL");
            } else {
                builder.append(" NULL");
            }

            if (column.isUnique()) {
                builder.append(" UNIQUE");
            }
            if (column.isPrimaryKey()) {
                builder.append(" PRIMARY KEY");
            }
            if (column.getDefaultValue() != null) {
                builder.append(" DEFAULT ");
                builder.append(column.getDefaultValue());
            }
            if (column.getComment() != null) {
                comment = column.getComment();
            }

            if (column.getReference() != null) {
                ColumnReference reference = column.getReference();
                builder.append(" REFERENCES \"");
                builder.append(reference.getTable());
                builder.append("\" (\"");
                builder.append(reference.getColumn());
                builder.append("\")");
                generateMatchType(reference.getMatchType(), builder);
                generateAction(reference.getOnDelete(), " On Delete", builder);
                generateAction(reference.getOnUpdate(), " On Update", builder);
            }
        }
        if (!StringUtils.isEmpty(comment)) {
            builder.append("/*");
            builder.append(comment);
            builder.append("*/");
        }
    }

    private static void generateAction(ColumnReference.Action action, String str, StringBuilder builder) {
        if (action == null) {
            return;
        }
        builder.append(str);
        switch (action) {
            case CASCADE:
                builder.append(" CASCADE");
                break;
            case NO_ACTION:
                builder.append(" NO ACTION");
                break;
            case RESTRICT:
                builder.append(" RESTRICT");
                break;
            case SET_NULL:
                builder.append(" SET NULL");
                break;
        }
    }

    private static void generateMatchType(ColumnReference.MatchType matchType, StringBuilder builder) {
        if (matchType == null) {
            return;
        }
        switch (matchType) {
            case MATCH_FULL:
                builder.append(" MATCH FULL");
                break;
            case MATCH_PARTIAL:
                builder.append(" MATCH PARTIAL");
                break;
            case MATCH_SIMPLE:
                builder.append(" MATCH SIMPLE");
                break;
        }
        return;
    }

    public static void generateTableConstrains(Table table, StringBuilder builder) {
        for (Index index : table.getIndexs()) {
            if (index.getType() == Index.Type.Index
                    || index.getType() == Index.Type.FullText
                    || index.getType() == Index.Type.Spatial) {
                //PostgreSQL don't support in-model index definition;
                break;
            }
            builder.append(",\n");
            if (index.getName()!=null) {
                builder.append(" CONSTRAINT \"");
                builder.append(index.getName());
                builder.append("\"");
            }
            switch (index.getType()) {
                case Unique:
                    builder.append(" UNIQUE ");
                    break;
                case PrimaryKey:
                    builder.append(" PRIMARY KEY ");
                    break;
            }
            builder.append("(\"");
            builder.append(String.join("\",\"",index.getColumns()));
            builder.append("\")");
        }
    }

    public static void generateTableForeignKeys(Table table, StringBuilder builder) {
        for (ForeignKey foreignKey:table.getForeignKeys()) {
            builder.append(",\n");
            if (foreignKey.getName()!=null) {
                builder.append(" CONSTRAINT \"");
                builder.append(foreignKey.getName());
                builder.append("\"");
            }
            builder.append(" FOREIGN KEY (\"") ;
            builder.append(String.join("\",\"",foreignKey.getColumns()));
            builder.append("\") REFERENCES \"");
            builder.append(foreignKey.getRefTable());
            builder.append("\" (\"");
            builder.append(String.join("\",\"",foreignKey.getRefColumns()));
            builder.append("\")");
        }
    }

    public static void generateTableChecks(Table table, StringBuilder builder) {
       for (Check check:table.getChecks()) {
           builder.append(",\n");
           builder.append(" CHECK (");
           builder.append(check.getExpression());
           builder.append(")");
       }
    }

    public static void generateTableIndexes(Table table, StringBuilder builder) {
        for (Index index: table.getIndexs()) {
            if (index.getType()== Index.Type.Unique
                    || index.getType()== Index.Type.PrimaryKey) {
                break;
            }
            builder.append("\nCREATE INDEX ");
            if (index.getName()!=null) {
                builder.append("\"");
                builder.append(index.getName());
                builder.append("\"");
            } 
            builder.append(" ON \"");
            builder.append(table.getName());
            builder.append("\" (\"");
            builder.append(String.join("\",\"",index.getColumns()));
            builder.append("\" );");
        }
    }
}
