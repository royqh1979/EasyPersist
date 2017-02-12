package net.royqh.tools.sql2entity;

import net.royqh.parser.postgresql.PostgreSQLLexer;
import net.royqh.parser.postgresql.PostgreSQLParser;
import net.royqh.parser.postgresql.model.Model;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Roy on 2017/2/10.
 */
public class TestGenerator {
    public static void main(String[] args) throws IOException {
        InputStream is=TestGenerator.class.getResourceAsStream("/postgresql/converted.sql");
        InputStreamReader reader=new InputStreamReader(is, "UTF-8");
        ANTLRInputStream input =new ANTLRInputStream(reader);
        PostgreSQLLexer lexer=new PostgreSQLLexer(input);
        CommonTokenStream tokenStream=new CommonTokenStream(lexer);
        PostgreSQLParser parser=new PostgreSQLParser(tokenStream);
        ParseTree tree=parser.prog();
        Model model=new Model();
        Sql2ModelVisitor visitor=new Sql2ModelVisitor(tokenStream,model);
        tree.accept(visitor);

        EntitiesGenerator.generate("F:\\testout",model);
    }
}
