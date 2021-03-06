package net.royqh.easypersist.sql.parser.mysql2postgresql;

import net.royqh.easypersist.sql.model.*;
import net.royqh.easypersist.sql.parser.syntax.mysql.MySQLBaseVisitor;
import net.royqh.easypersist.sql.parser.syntax.mysql.MySQLParser;
import net.royqh.easypersist.sql.parser.syntax.mysql.utils.MySQLParseTool;
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
            if (columnAttributeContext.K_REFERENCES()!=null) {
                ColumnReference columnReference = new ColumnReference();
                columnReference.setTable(MySQLParseTool.parseIdentifier(columnAttributeContext.table_name()));
                columnReference.setColumn(MySQLParseTool.parseIdentifier(columnAttributeContext.index_col_name()));
                for (MySQLParser.Reference_optionContext roCtx : columnAttributeContext.reference_option()) {
                    if (roCtx.K_FULL() != null) {
                        columnReference.setMatchType(ColumnReference.MatchType.MATCH_FULL);
                    } else if (roCtx.K_PARTIAL() != null) {
                        columnReference.setMatchType(ColumnReference.MatchType.MATCH_PARTIAL);
                    } else if (roCtx.K_SIMPLE() != null) {
                        columnReference.setMatchType(ColumnReference.MatchType.MATCH_SIMPLE);
                    } else if (roCtx.K_DELETE() != null) {
                        ColumnReference.Action action = MySQLParseTool.parseAction(
                                roCtx.on_delete_action().action()
                        );
                        columnReference.setOnDelete(action);
                    } else if (roCtx.K_UPDATE() != null) {
                        ColumnReference.Action action = MySQLParseTool.parseAction(
                                roCtx.on_update_action().action()
                        );
                        columnReference.setOnUpdate(action);
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
        if (foundPrimaryKey) {
            throw new RuntimeException(String.format("%d:%d Already found primary key in model %s:%s",
                ctx.start.getLine(),ctx.start.getCharPositionInLine(),
                table.getName(),MySQLParseTool.getConvertedText(tokenStream,ctx)));
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
    public Void visitSpatialIndexDef(MySQLParser.SpatialIndexDefContext ctx) {
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
        /*
        if (!foundPrimaryKey) {
            throw new RuntimeException("No Primary Key for Table:"+table.getName());
        }
        */
        return table;
    }
}
