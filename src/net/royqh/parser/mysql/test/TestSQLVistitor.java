package net.royqh.parser.mysql.test;

import net.royqh.parser.mysql.MySQLBaseVisitor;
import net.royqh.parser.mysql.MySQLParser;
import net.royqh.parser.mysql.utils.MySQLParseTool;
import org.antlr.v4.runtime.BufferedTokenStream;

/**
 * Created by Roy on 2017/1/15.
 */
public class TestSQLVistitor extends MySQLBaseVisitor<String> {
    private StringBuffer convertedSQL=null;
    private BufferedTokenStream tokenStream;

    public TestSQLVistitor(BufferedTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    @Override
    public String visitProg(MySQLParser.ProgContext ctx) {
        convertedSQL=new StringBuffer();
        for (MySQLParser.Sql_stmt_listContext sql_stmt_listContext: ctx.sql_stmt_list()) {
            sql_stmt_listContext.accept(this);
        }
        return null;
    }

    @Override
    public String visitError(MySQLParser.ErrorContext ctx) {
        throw new RuntimeException(ctx.exception);
    }

    @Override
    public String visitSql_stmt_list(MySQLParser.Sql_stmt_listContext ctx) {
        for(MySQLParser.Sql_stmtContext sql_stmtContext: ctx.sql_stmt()) {
            sql_stmtContext.accept(this);
        }
        return null;
    }

    @Override
    public String visitSql_stmt(MySQLParser.Sql_stmtContext ctx) {
        StringBuilder builder=new StringBuilder();
        System.out.println("Rule index:"+ctx.getRuleIndex());
        System.out.println("Alt Num:"+ctx.getAltNumber());

        MySQLParseTool.getConvertedText(tokenStream,ctx,builder);
        System.out.println( "statement : "+builder.toString()+";");
        ctx.getChild(0);
        return null;
    }
}
