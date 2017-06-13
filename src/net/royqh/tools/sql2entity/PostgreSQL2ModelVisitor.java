package net.royqh.tools.sql2entity;

import net.royqh.parser.ParseTool;
import net.royqh.parser.postgresql.PostgreSQLBaseVisitor;
import net.royqh.parser.postgresql.PostgreSQLParser;
import net.royqh.parser.model.*;
import net.royqh.parser.postgresql.utils.PostgreSQLParseTool;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;

/**
 * Created by Roy on 2017/2/9.
 */
public class PostgreSQL2ModelVisitor extends PostgreSQLBaseVisitor<Void> {
    BufferedTokenStream tokenStream;
    Model model;

    public PostgreSQL2ModelVisitor(BufferedTokenStream tokenStream, Model model) {
        this.tokenStream = tokenStream;
        this.model=model;
    }

    @Override
    public Void visitSql_stmt(PostgreSQLParser.Sql_stmtContext ctx) {
        if (ctx.create_table_stmt()!=null) {
            ctx.create_table_stmt().accept(this);
        }
        if (ctx.create_index_stmt()!=null) {
            ctx.create_index_stmt().accept(this);
        }
        return null;
    }

    private Table table;
    @Override
    public Void visitCreateTableStatement(PostgreSQLParser.CreateTableStatementContext ctx) {
        String tableName= PostgreSQLParseTool.parseIdentifier(ctx.table_name());
        table=new Table(tableName);
        super.visitCreateTableStatement(ctx);
        model.addTable(table);
        return null;
    }

    @Override
    public Void visitCreate_index_stmt(PostgreSQLParser.Create_index_stmtContext ctx) {
        String tableName= PostgreSQLParseTool.parseIdentifier(ctx.table_name());
        Table table=model.getTable(tableName);
        if (table==null) {
            Token startToken=ctx.getStart();
            throw new RuntimeException(String.format("Table %s not found for create index statement! (at %d:%d)",
                    tableName,startToken.getLine(),startToken.getCharPositionInLine()));
        }
        Index index=new Index(Index.Type.Index);
        index.setName(PostgreSQLParseTool.parseIdentifier(ctx.index_name()));
        for (PostgreSQLParser.Index_itemContext indexItemCtx: ctx.index_item()) {
            if (indexItemCtx.column_name()==null) {
                Token startToken=ctx.getStart();
                throw new RuntimeException(String.format("We only support column index in Create index statement!(at %d %d)",
                        startToken.getLine(),startToken.getCharPositionInLine()));
            }
            index.addColumn(PostgreSQLParseTool.parseIdentifier(indexItemCtx.column_name()));
        }
        //System.out.println(table.getName()+":"+String.join(",",index.getColumns()));
        table.addIndex(index);
        return null;
    }

    @Override
    public Void visitColumnDef(PostgreSQLParser.ColumnDefContext ctx) {
        String columnName= PostgreSQLParseTool.parseIdentifier(ctx.column_name());
        Column column=new Column(columnName);
        if (ctx.K_COLLATE()!=null) {
            column.setCollate(PostgreSQLParseTool.parseIdentifier(ctx.collation_name()));
        }
        column.setType(ParseTool.getFullText(tokenStream,ctx.data_type()));
        for (PostgreSQLParser.Column_constraintContext columnConstraintCtx: ctx.column_constraint()) {
            if (columnConstraintCtx.K_NOT()!=null && columnConstraintCtx.K_NULL()!=null) {
                column.setNotNull(true);
            }
            if (columnConstraintCtx.K_CHECK()!=null ) {
                column.setCheck(ParseTool.getFullText(tokenStream,columnConstraintCtx.check_expr()));
            }
            if (columnConstraintCtx.K_DEFAULT()!=null) {
                column.setDefaultValue( ParseTool.getFullText(tokenStream,columnConstraintCtx.default_expr()));
            }
            if (columnConstraintCtx.K_UNIQUE()!=null) {
                column.setUnique(true);
            }
            if (columnConstraintCtx.K_PRIMARY()!=null && columnConstraintCtx.K_KEY()!=null) {
                column.setPrimaryKey(true);
            }
            if (columnConstraintCtx.K_REFERENCES()!=null) {
                ColumnReference columnReference=new ColumnReference();
                columnReference.setTable(PostgreSQLParseTool.parseIdentifier(columnConstraintCtx.reftable()));
                columnReference.setColumn(PostgreSQLParseTool.parseIdentifier(columnConstraintCtx.refColumn()));
                if (columnConstraintCtx.K_FULL()!=null) {
                    columnReference.setMatchType(ColumnReference.MatchType.MATCH_FULL);
                } else if (columnConstraintCtx.K_PARTIAL()!=null) {
                    columnReference.setMatchType(ColumnReference.MatchType.MATCH_PARTIAL);
                } else if (columnConstraintCtx.K_SIMPLE()!=null) {
                    columnReference.setMatchType(ColumnReference.MatchType.MATCH_SIMPLE);
                }
                if (columnConstraintCtx.on_delete_action()!=null) {
                    columnReference.setOnDelete(PostgreSQLParseTool.parseAction(columnConstraintCtx.on_delete_action().action()));
                }
                if (columnConstraintCtx.on_update_action()!=null) {
                    columnReference.setOnUpdate(PostgreSQLParseTool.parseAction(columnConstraintCtx.on_update_action().action()));
                }
                column.setReference(columnReference);
                column.setReference(columnReference);
                ForeignKey foreignKey=new ForeignKey();
                foreignKey.setRefTable(columnReference.getTable());
                foreignKey.addColumn(column.getName());
                foreignKey.addRefColumn(columnReference.getColumn());
                table.addForeignKey(foreignKey);
            }
        }
        table.addColumn(column);
        return null;
    }

    @Override
    public Void visitTableConstraintDef(PostgreSQLParser.TableConstraintDefContext ctx) {
        PostgreSQLParser.Table_contraintContext tcCtx=ctx.table_contraint();
        String constraintName=null;
        if (tcCtx.K_CONSTRAINT()!=null) {
            constraintName= PostgreSQLParseTool.parseIdentifier(tcCtx.constraint_name());
        }
        if (tcCtx.K_CHECK()!=null) {
            Check check=new Check(constraintName, ParseTool.getFullText(tokenStream,tcCtx.check_expr()));
            table.addCheck(check);
            return null;
        }
        if (tcCtx.K_UNIQUE()!=null) {
            Index index=new Index(Index.Type.Unique);
            index.setName(constraintName);
            for (PostgreSQLParser.Column_nameContext columnName: tcCtx.column_name()) {
                index.addColumn(PostgreSQLParseTool.parseIdentifier(columnName));
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
        if (tcCtx.K_PRIMARY()!=null) {
            Index index=new Index(Index.Type.PrimaryKey);
            index.setName(constraintName);
            for (PostgreSQLParser.Column_nameContext columnName: tcCtx.column_name()) {
                index.addColumn(PostgreSQLParseTool.parseIdentifier(columnName));
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
        if (tcCtx.K_EXCLUDE()!=null) {
            Index index=new Index(Index.Type.Exclude);
            index.setName(constraintName);
            for (PostgreSQLParser.Column_nameContext columnName: tcCtx.column_name()) {
                index.addColumn(PostgreSQLParseTool.parseIdentifier(columnName));
            }
            if (index.getColumns().size()<1) {
                Token startToken=ctx.getStart();
                throw new RuntimeException(String.format("Empty Exclude Column List in table %s at %d:%d",
                        table.getName(),startToken.getLine(),startToken.getCharPositionInLine()));
            }
            table.addIndex(index);
            return null;
        }
        if (tcCtx.K_FOREIGN()!=null) {
            ForeignKey foreignKey=new ForeignKey();
            foreignKey.setName(constraintName);
            foreignKey.setRefTable(PostgreSQLParseTool.parseIdentifier(tcCtx.reftable()));
            for (PostgreSQLParser.Column_nameContext columnName: tcCtx.column_name()) {
                foreignKey.addColumn(PostgreSQLParseTool.parseIdentifier(columnName));
            }
            for (PostgreSQLParser.RefColumnContext refColumn : tcCtx.refColumn()) {
                foreignKey.addRefColumn(PostgreSQLParseTool.parseIdentifier(refColumn));
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
        return null;
    }
}
