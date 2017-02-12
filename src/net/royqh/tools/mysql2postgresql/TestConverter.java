package net.royqh.tools.mysql2postgresql;

import net.royqh.parser.mysql.MySQLLexer;
import net.royqh.parser.mysql.MySQLParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

/**
 * Created by Roy on 2017/1/14.
 */
public class TestConverter {
    public static void main(String[] args) throws IOException {
        // create a CharStream that reads from standard input
        InputStream is=TestConverter.class.getResourceAsStream("/sql/forestTending.sql");
        InputStreamReader reader=new InputStreamReader(is,"UTF-8");
        ANTLRInputStream input = new ANTLRInputStream(reader);
// create a lexer that feeds off of input CharStream
        MySQLLexer lexer = new MySQLLexer(input);
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
        MySQLParser parser = new MySQLParser(tokens);
        ParseTree tree = parser.prog(); // begin parsing at init rule
        Mysql2PostgresqlVisitor visitor=new Mysql2PostgresqlVisitor(tokens);
        tree.accept(visitor);
        StringBuilder convertedSql=visitor.getConvertedSQL();

        File targetFile=new File(TestConverter.class.getResource("/").getFile()
            +File.separator+"converted.sql");
        FileWriter fileWriter=new FileWriter(targetFile);
        fileWriter.append(convertedSql);
        fileWriter.close();
    }
}
