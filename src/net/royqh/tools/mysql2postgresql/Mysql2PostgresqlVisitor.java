package net.royqh.tools.mysql2postgresql;

import net.royqh.parser.ParseTool;
import net.royqh.parser.mysql.MySQLBaseVisitor;
import net.royqh.parser.mysql.MySQLParser;
import net.royqh.parser.model.Table;
import net.royqh.parser.mysql.utils.MySQLParseTool;
import org.antlr.v4.runtime.BufferedTokenStream;

/**
 * Created by Roy on 2017/1/21.
 */
public class Mysql2PostgresqlVisitor extends MySQLBaseVisitor<Void> {
    private StringBuilder convertedSQL = null;
    private BufferedTokenStream tokenStream = null;

    public Mysql2PostgresqlVisitor(BufferedTokenStream tokenStream) {
        this.convertedSQL = new StringBuilder();
        this.tokenStream = tokenStream;
    }

    @Override
    public Void visitSql_stmt_list(MySQLParser.Sql_stmt_listContext ctx) {
        for (MySQLParser.Sql_stmtContext sqlStmtContext : ctx.sql_stmt()) {
            ParseTool.getHiddenTextBeforeThisNode(tokenStream, sqlStmtContext, convertedSQL);
            sqlStmtContext.accept(this);
            //convertedSQL.append(";");
        }
        return null;
    }

    @Override
    public Void visitSet_stmt(MySQLParser.Set_stmtContext ctx) {
        //set is not supported in postgresql
        return null;
    }

    @Override
    public Void visitUse_stmt(MySQLParser.Use_stmtContext ctx) {
        throw new RuntimeException("'use xxx;' clause is not supported!");
        //use is not supported in postgresql
    }

    @Override
    public Void visitCreate_index_stmt(MySQLParser.Create_index_stmtContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitDrop_index_stmt(MySQLParser.Drop_index_stmtContext ctx) {
        convertedSQL.append("DROP INDEX IF EXISTS \"");
        MySQLParser.Index_nameContext indexNameContext = ctx.index_name();
        convertedSQL.append(MySQLParseTool.parseIdentifier(indexNameContext));
        convertedSQL.append("\" CASCADE");
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitDrop_table_stmt(MySQLParser.Drop_table_stmtContext ctx) {
        convertedSQL.append("DROP TABLE IF EXISTS \"");
        MySQLParser.Table_nameContext tableNameContext = ctx.table_name(0);
        convertedSQL.append(MySQLParseTool.parseIdentifier(tableNameContext));
        convertedSQL.append("\" CASCADE");
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitDrop_view_stmt(MySQLParser.Drop_view_stmtContext ctx) {
        convertedSQL.append("DROP VIEW IF EXISTS \"");
        for (int i = 0; i < ctx.view_name().size(); i++) {
            if (i != 0) {
                convertedSQL.append("\",\"");
            }
            MySQLParser.View_nameContext viewNameContext = ctx.view_name(i);
            convertedSQL.append(MySQLParseTool.parseIdentifier(viewNameContext));
        }
        convertedSQL.append("\" CASCADE");
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitCreateTableStmt(MySQLParser.CreateTableStmtContext ctx) {
        convertedSQL.append("CREATE ");
        if (ctx.K_TEMPORARY() != null) {
            convertedSQL.append("TEMPORARY ");
        }
        convertedSQL.append("TABLE ");
        if (ctx.K_EXISTS() != null) {
            convertedSQL.append("IF NOT EXISTS \"");
        } else {
            convertedSQL.append("\"");
        }
        String tableName= MySQLParseTool.parseIdentifier(ctx.table_name());
        convertedSQL.append(tableName);
        //Use TableDefinitionVisistor object to get model definition
        TableDefinitionVisitor visitor = new TableDefinitionVisitor(tableName, tokenStream);
        for (MySQLParser.Create_definitionContext createDefinitionContext : ctx.create_definition()) {
            createDefinitionContext.accept(visitor);
        }
        Table table = visitor.getTable();
        //TODO: generate  model definition sql
        convertedSQL.append("\" (\n");

        SQLTool.generateTableColumnDefinitions(table,convertedSQL);
        SQLTool.generateTableConstrains(table,convertedSQL);
        SQLTool.generateTableForeignKeys(table,convertedSQL);
        SQLTool.generateTableChecks(table,convertedSQL);
        convertedSQL.append("\n);");
        SQLTool.generateTableIndexes(table,convertedSQL);
        return null;
    }

    @Override
    public Void visitCreateTableSelectStmt(MySQLParser.CreateTableSelectStmtContext ctx) {
        throw new RuntimeException("Create model select statement is not supported!");
    }

    @Override
    public Void visitCreateTableLikeStmt(MySQLParser.CreateTableLikeStmtContext ctx) {
        throw new RuntimeException("Create model like statement is not supported!");
    }

    @Override
    public Void visitCreate_view_stmt(MySQLParser.Create_view_stmtContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitDelete_stmt(MySQLParser.Delete_stmtContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitInsert_stmt(MySQLParser.Insert_stmtContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitUpdate_stmt(MySQLParser.Update_stmtContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitSelect_stmt(MySQLParser.Select_stmtContext ctx) {
        super.visitSelect_stmt(ctx);
        convertedSQL.append(";");
        return null;
    }

    @Override
    public Void visitSelect(MySQLParser.SelectContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        return null;
    }

    @Override
    public Void visitSelectUnion(MySQLParser.SelectUnionContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        return null;
    }

    @Override
    public Void visitEnclosedSelect(MySQLParser.EnclosedSelectContext ctx) {
        MySQLParseTool.getConvertedText(tokenStream, ctx,
                convertedSQL);
        return null;
    }

    public StringBuilder getConvertedSQL() {
        return convertedSQL;
    }
}
