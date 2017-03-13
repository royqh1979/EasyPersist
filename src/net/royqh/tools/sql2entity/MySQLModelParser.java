package net.royqh.tools.sql2entity;

import net.royqh.parser.model.Model;
import net.royqh.parser.mysql.MySQLLexer;
import net.royqh.parser.mysql.MySQLParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Created by Roy on 2017/3/13.
 */
public class MySQLModelParser extends ModelParser {
    @Override
    public Model parse(InputStream inputStream, Charset charset) {
        try {
            InputStreamReader reader = new InputStreamReader(inputStream, charset);
            ANTLRInputStream input = new ANTLRInputStream(reader);
            MySQLLexer lexer = new MySQLLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            MySQLParser parser = new MySQLParser(tokenStream);
            ParseTree tree = parser.prog();
            Model model = new Model();
            MySQL2ModelVisitor visitor = new MySQL2ModelVisitor(tokenStream, model);
            tree.accept(visitor);
            return model;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
