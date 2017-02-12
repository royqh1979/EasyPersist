package net.royqh.tools.mysql2postgresql;

import net.royqh.parser.mysql.MySQLBaseVisitor;
import net.royqh.parser.mysql.MySQLParser;
import net.royqh.parser.mysql.model.*;
import org.antlr.v4.runtime.BufferedTokenStream;

/**
 * Created by Roy on 2017/1/21.
 */
class TableDefinitionVisitor extends MySQLBaseVisitor<Void> {
    private Table table;
    private BufferedTokenStream tokenStream;
    private boolean foundPrimaryKey=false;

    public TableDefinitionVisitor(String tableName,BufferedTokenStream tokenStream) {
        table=new Table(tableName);
        this.tokenStream=tokenStream;
    }

    @Override
    public Void visitColumnDef(MySQLParser.ColumnDefContext ctx) {
        Column column=new Column(MySQLParseTool.parseIdentifier(ctx.column_name()));
        column.setType(MySQLParseTool.getConvertedText(tokenStream,ctx.column_definition().data_type()));
        for (MySQLParser.Column_attributeContext columnAttributeContext: ctx.column_definition().column_attribute()) {
            if (columnAttributeContext.K_AUTO_INCREMENT()!=null) {
                column.setAutoIncrement(true);
            }
            if (columnAttributeContext.K_NOT()!=null) {
                column.setNotNull(true);
            }
            if (columnAttributeContext.K_UNIQUE()!=null) {
                column.setUnique(true);
            } else if (columnAttributeContext.K_KEY()!=null) {
                foundPrimaryKey=true;
                column.setPrimaryKey(true);
                column.setNotNull(true);
            }
            if (columnAttributeContext.K_DEFAULT()!=null) {
                column.setDefaultValue(MySQLParseTool.parseIdentifier(columnAttributeContext.literal_value()));
            }
            if (columnAttributeContext.K_COMMENT()!=null) {
                column.setComment(
                        MySQLParseTool.parseStringLiteral(columnAttributeContext.string_literal()));
            }
            if (columnAttributeContext.K_COLLATE()!=null) {
                column.setCollate(MySQLParseTool.parseIdentifier(columnAttributeContext.collation_name()));
            }
        }
        ColumnReference reference=MySQLParseTool.parseColumnReference(ctx.column_definition().column_reference_definition());
        column.setReference(reference);
        table.addColumn(column);
        return null;
    }

    @Override
    public Void visitPrimaryKeyDef(MySQLParser.PrimaryKeyDefContext ctx) {
        if (foundPrimaryKey) {
            throw new RuntimeException("Already found primary key in model "
            +table.getName()+" : "+ MySQLParseTool.getConvertedText(tokenStream,ctx));
        }
        foundPrimaryKey=true;
        Index primaryKey=new Index(Index.Type.PrimaryKey);
        for (MySQLParser.Index_col_nameContext indexColNameContext:ctx.index_col_name()) {
            primaryKey.addColumn(MySQLParseTool.parseIdentifier(indexColNameContext));
        }
        if (ctx.symbol()!=null) {
            primaryKey.setName(MySQLParseTool.parseIdentifier(ctx.symbol()));
        }
        table.addIndex(primaryKey);
        return null;
    }

    @Override
    public Void visitIndexDef(MySQLParser.IndexDefContext ctx) {
        Index index=new Index(Index.Type.Index);
        for (MySQLParser.Index_col_nameContext indexColNameContext:ctx.index_col_name()) {
            index.addColumn(MySQLParseTool.parseIdentifier(indexColNameContext));
        }
        if (ctx.index_name()!=null) {
            index.setName(MySQLParseTool.parseIdentifier(ctx.index_name()));
        }
        table.addIndex(index);
        return null;
    }

    @Override
    public Void visitUniqueDef(MySQLParser.UniqueDefContext ctx) {
        Index unique=new Index(Index.Type.Unique);
        for (MySQLParser.Index_col_nameContext indexColNameContext:ctx.index_col_name()) {
            unique.addColumn(MySQLParseTool.parseIdentifier(indexColNameContext));
        }
        if (ctx.symbol()!=null) {
            unique.setName(MySQLParseTool.parseIdentifier(ctx.symbol()));
        }else if (ctx.index_name()!=null) {
            unique.setName(MySQLParseTool.parseIdentifier(ctx.index_name()));
        }
        table.addIndex(unique);
        return null;
    }

    @Override
    public Void visitFullTextIndexDef(MySQLParser.FullTextIndexDefContext ctx) {
        Index fullText=new Index(Index.Type.FullText);
        for (MySQLParser.Index_col_nameContext indexColNameContext:ctx.index_col_name()) {
            fullText.addColumn(MySQLParseTool.parseIdentifier(indexColNameContext));
        }
        if (ctx.index_name()!=null) {
            fullText.setName(MySQLParseTool.parseIdentifier(ctx.index_name()));
        }
        table.addIndex(fullText);
        return null;
    }

    @Override
    public Void visitSpacialIndexDef(MySQLParser.SpacialIndexDefContext ctx) {
        Index spatial=new Index(Index.Type.Spatial);
        for (MySQLParser.Index_col_nameContext indexColNameContext:ctx.index_col_name()) {
            spatial.addColumn(MySQLParseTool.parseIdentifier(indexColNameContext));
        }
        if (ctx.index_name()!=null) {
            spatial.setName(MySQLParseTool.parseIdentifier(ctx.index_name()));
        }
        table.addIndex(spatial);
        return null;
    }

    @Override
    public Void visitForeignKeyDef(MySQLParser.ForeignKeyDefContext ctx) {
        ForeignKey foreignKey=new ForeignKey();
        for (MySQLParser.Index_col_nameContext indexColNameContext:ctx.index_col_name()) {
            foreignKey.addColumn(MySQLParseTool.parseIdentifier(indexColNameContext));
        }
        foreignKey.setRefTable(MySQLParseTool.parseIdentifier(ctx.reference_definition().table_name()));
        for (MySQLParser.Index_col_nameContext indexColNameContext:ctx.reference_definition().index_col_name()) {
            foreignKey.addRefColumn(MySQLParseTool.parseIdentifier(indexColNameContext));
        }
        if (ctx.symbol()!=null){
            foreignKey.setName(MySQLParseTool.parseIdentifier(ctx.symbol()));
        } else if(ctx.index_name()!=null) {
            foreignKey.setName(MySQLParseTool.parseIdentifier(ctx.index_name()));
        }
        table.addForeignKey(foreignKey);
        return null;
    }

    @Override
    public Void visitCheckDef(MySQLParser.CheckDefContext ctx) {
        Check check=new Check(MySQLParseTool.getConvertedText(tokenStream,ctx.expr()));
        table.addCheck(check);
        return null;
    }

    public Table getTable() {
        if (!foundPrimaryKey) {
            throw new RuntimeException("No Primary Key for Table:"+table.getName());
        }
        return table;
    }
}
