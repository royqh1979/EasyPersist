package net.royqh.easypersist.sql.parser.sql2entity;

import net.royqh.easypersist.sql.model.Model;
import net.royqh.easypersist.sql.parser.syntax.postgresql.PostgreSQLLexer;
import net.royqh.easypersist.sql.parser.syntax.postgresql.PostgreSQLParser;
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
public class PostgreSQLModelParser extends ModelParser {
    @Override
    public Model parse(InputStream inputStream, Charset charset) {
        try {
            InputStreamReader reader = new InputStreamReader(inputStream, charset);
            CharStream charStream=CharStreams.fromReader(reader);
            PostgreSQLLexer lexer = new PostgreSQLLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokenStream);
            ParseTree tree = parser.prog();
            Model model = new Model();
            PostgreSQL2ModelVisitor visitor = new PostgreSQL2ModelVisitor(tokenStream, model);
            tree.accept(visitor);
            return model;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
