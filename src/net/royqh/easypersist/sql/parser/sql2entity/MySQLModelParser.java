package net.royqh.easypersist.sql.parser.sql2entity;

import net.royqh.easypersist.sql.model.Model;
import net.royqh.easypersist.sql.parser.syntax.mysql.MySQLLexer;
import net.royqh.easypersist.sql.parser.syntax.mysql.MySQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
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
            CharStream input = CharStreams.fromReader(reader);
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
