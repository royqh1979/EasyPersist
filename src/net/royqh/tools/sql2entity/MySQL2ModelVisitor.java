package net.royqh.tools.sql2entity;

import net.royqh.parser.ParseTool;
import net.royqh.parser.model.*;
import net.royqh.parser.mysql.MySQLBaseVisitor;
import net.royqh.parser.mysql.MySQLParser;
import net.royqh.parser.mysql.utils.MySQLParseTool;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;

/**
 * Created by Roy on 2017/3/12.
 */
public class MySQL2ModelVisitor extends MySQLBaseVisitor<Void> {
    BufferedTokenStream tokenStream;
    Model model;

    public MySQL2ModelVisitor(BufferedTokenStream tokenStream, Model model) {
        this.tokenStream = tokenStream;
        this.model=model;
    }
    @Override
    public Void visitSql_stmt(MySQLParser.Sql_stmtContext ctx) {
        if (ctx.create_table_stmt()!=null) {
            ctx.create_table_stmt().accept(this);
        }
        return null;
    }

    private Table table;
    @Override
    public Void visitCreateTableStmt(MySQLParser.CreateTableStmtContext ctx) {
        String tableName= MySQLParseTool.parseIdentifier(ctx.table_name());
        table=new Table(tableName);
        super.visitCreateTableStmt(ctx);
        model.addTable(table);
        return null;
    }

    @Override
    public Void visitColumnDef(MySQLParser.ColumnDefContext ctx) {
        String columnName=MySQLParseTool.parseIdentifier(ctx.column_name());
        Column column=new Column(columnName);
        MySQLParser.Column_definitionContext definitionCtx=ctx.column_definition();
        column.setType(ParseTool.getFullText(tokenStream,definitionCtx.data_type()));
        for (MySQLParser.Column_attributeContext attrCtx: definitionCtx.column_attribute()) {
            if (attrCtx.K_NOT()!=null && attrCtx.K_NULL()!=null) {
                column.setNotNull(true);
            } else if (attrCtx.K_AUTO_INCREMENT()!=null) {
                column.setAutoIncrement(true);
            } else if (attrCtx.K_UNIQUE()!=null) {
                column.setUnique(true);
            } else if (attrCtx.K_PRIMARY()!=null ||
                    (attrCtx.K_UNIQUE()==null && attrCtx.K_KEY()!=null)) {
                column.setPrimaryKey(true);
            } else if (attrCtx.K_DEFAULT()!=null) {
                column.setDefaultValue(ParseTool.getFullText(tokenStream,attrCtx.literal_value()));
            } else if (attrCtx.K_COLLATE()!=null) {
                column.setCollate(MySQLParseTool.parseIdentifier(attrCtx.collation_name()));
            } else if (attrCtx.K_REFERENCES()!=null) {
                ColumnReference columnReference=new ColumnReference();
                columnReference.setTable(MySQLParseTool.parseIdentifier(attrCtx.table_name()));
                columnReference.setColumn(MySQLParseTool.parseIdentifier(attrCtx.index_col_name().column_name()));
                for (MySQLParser.Reference_optionContext optCtx: attrCtx.reference_option()) {
                    if (optCtx.K_FULL()!=null) {
                        columnReference.setMatchType(ColumnReference.MatchType.MATCH_FULL);
                    } else if (optCtx.K_PARTIAL()!=null) {
                        columnReference.setMatchType(ColumnReference.MatchType.MATCH_PARTIAL);
                    } else if (optCtx.K_SIMPLE()!=null) {
                        columnReference.setMatchType(ColumnReference.MatchType.MATCH_SIMPLE);
                    }
                    if (optCtx.on_delete_action()!=null) {
                        columnReference.setOnDelete(MySQLParseTool.parseAction(optCtx.on_delete_action().action()));
                    }
                    if (optCtx.on_update_action()!=null) {
                        columnReference.setOnUpdate(MySQLParseTool.parseAction(optCtx.on_update_action().action()));
                    }
                }
                column.setReference(columnReference);
            }
        }
        table.addColumn(column);
        return null;
    }

    @Override
    public Void visitPrimaryKeyDef(MySQLParser.PrimaryKeyDefContext ctx) {
        String constraintName=null;
        if (ctx.symbol()!=null) {
            constraintName=MySQLParseTool.parseIdentifier(ctx.symbol());
        }
        MySQLParseTool.parseIdentifier(ctx.symbol());
        Index index=new Index(Index.Type.PrimaryKey);
        index.setName(constraintName);
        for (MySQLParser.Index_col_nameContext columnName: ctx.index_col_name()) {
            index.addColumn(MySQLParseTool.parseIdentifier(columnName.column_name()));
        }
        if (index.getColumns().size()<1) {
            Token startToken=ctx.getStart();
            throw new RuntimeException(String.format("Empty Primary Key Column List in table %s at %d:%d",
                    table.getName(),startToken.getLine(),startToken.getCharPositionInLine()));
        }
        if (index.getColumns().size()==1) {
            Column column=table.getColumn(index.getColumns().get(0));
            if (column==null) {
                Token startToken=ctx.getStart();
                throw new RuntimeException(String.format("No this Column %s in table %s at %d:%d",
                        index.getColumns().get(0),table.getName(),startToken.getLine(),startToken.getCharPositionInLine()));
            }
            column.setPrimaryKey(true);
        } else {
            table.addIndex(index);
        }
        return null;
    }

    @Override
    public Void visitIndexDef(MySQLParser.IndexDefContext ctx) {
        String indexName=null;
        if (ctx.index_name()!=null) {
            indexName=MySQLParseTool.parseIdentifier(ctx.index_name());
        }
        Index index=new Index(Index.Type.Index);
        index.setName(indexName);
        for (MySQLParser.Index_col_nameContext colNameCtx: ctx.index_col_name()) {
            index.addColumn(MySQLParseTool.parseIdentifier(colNameCtx.column_name()));
        }
        table.addIndex(index);
        return null;
    }

    @Override
    public Void visitFullTextIndexDef(MySQLParser.FullTextIndexDefContext ctx) {
        String indexName=null;
        if (ctx.index_name()!=null) {
            indexName=MySQLParseTool.parseIdentifier(ctx.index_name());
        }
        Index index=new Index(Index.Type.FullText);
        index.setName(indexName);
        for (MySQLParser.Index_col_nameContext colNameCtx: ctx.index_col_name()) {
            index.addColumn(MySQLParseTool.parseIdentifier(colNameCtx.column_name()));
        }
        table.addIndex(index);
        return null;
    }

    @Override
    public Void visitSpacialIndexDef(MySQLParser.SpacialIndexDefContext ctx) {
        String indexName=null;
        if (ctx.index_name()!=null) {
            indexName=MySQLParseTool.parseIdentifier(ctx.index_name());
        }
        Index index=new Index(Index.Type.Spatial);
        index.setName(indexName);
        for (MySQLParser.Index_col_nameContext colNameCtx: ctx.index_col_name()) {
            index.addColumn(MySQLParseTool.parseIdentifier(colNameCtx.column_name()));
        }
        table.addIndex(index);
        return null;
    }

    @Override
    public Void visitUniqueDef(MySQLParser.UniqueDefContext ctx) {
        String uniqName=null;
        if (ctx.symbol()!=null) {
            uniqName=MySQLParseTool.parseIdentifier(ctx.symbol());
        } else if (ctx.index_name()!=null) {
            uniqName=MySQLParseTool.parseIdentifier(ctx.index_name());
        }
        Index index=new Index(Index.Type.Unique);
        index.setName(uniqName);
        for (MySQLParser.Index_col_nameContext columnName: ctx.index_col_name()) {
            index.addColumn(MySQLParseTool.parseIdentifier(columnName.column_name()));
        }
        if (index.getColumns().size()<1) {
            Token startToken=ctx.getStart();
            throw new RuntimeException(String.format("Empty Unique Column List in table %s at %d:%d",
                    table.getName(),startToken.getLine(),startToken.getCharPositionInLine()));
        }
        if (index.getColumns().size()==1) {
            Column column=table.getColumn(index.getColumns().get(0));
            if (column==null) {
                Token startToken=ctx.getStart();
                throw new RuntimeException(String.format("No this Column %s in table %s at %d:%d",
                        index.getColumns().get(0),table.getName(),startToken.getLine(),startToken.getCharPositionInLine()));
            }
            column.setUnique(true);
        } else {
            table.addIndex(index);
        }
        return null;
    }

    @Override
    public Void visitForeignKeyDef(MySQLParser.ForeignKeyDefContext ctx) {
        String foreignKeyName=null;
        if (ctx.symbol()!=null) {
            foreignKeyName=MySQLParseTool.parseIdentifier(ctx.symbol());
        } else if (ctx.index_name()!=null) {
            foreignKeyName=MySQLParseTool.parseIdentifier(ctx.index_name());
        }
        ForeignKey foreignKey=new ForeignKey();
        foreignKey.setName(foreignKeyName);
        foreignKey.setRefTable(MySQLParseTool.parseIdentifier(ctx.reference_definition().table_name()));
        for (MySQLParser.Index_col_nameContext columnName: ctx.index_col_name()) {
            foreignKey.addColumn(MySQLParseTool.parseIdentifier(columnName.column_name()));
        }
        for (MySQLParser.Index_col_nameContext refColumn : ctx.reference_definition().index_col_name()) {
            foreignKey.addRefColumn(MySQLParseTool.parseIdentifier(refColumn.column_name()));
        }
        if (foreignKey.getColumns().size()<1) {
            Token startToken=ctx.getStart();
            throw new RuntimeException(String.format("Empty ForeignKey Column List in table %s at %d:%d",
                    table.getName(),startToken.getLine(),startToken.getCharPositionInLine()));
        }
        if (foreignKey.getColumns().size()!=foreignKey.getRefColumns().size()) {
            Token startToken=ctx.getStart();
            throw new RuntimeException(String.format("ForeignKey  Column List and RefColumn List is not comparable in table %s at %d:%d",
                    table.getName(),startToken.getLine(),startToken.getCharPositionInLine()));
        }
        table.addForeignKey(foreignKey);
        return null;
    }
}
