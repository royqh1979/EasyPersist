package net.royqh.easypersist.sql.parser.syntax.postgresql.utils;

import net.royqh.easypersist.sql.parser.syntax.postgresql.PostgreSQLParser;
import net.royqh.easypersist.sql.model.ColumnReference;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by Roy on 2017/2/9.
 */
public class PostgreSQLParseTool {
    public static String parseIdentifier(ParseTree treeNode) {
        if (treeNode==null){
            return null;
        }
        if (treeNode instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) treeNode;
            Token token=terminalNode.getSymbol();
            String s=token.getText();
            switch (token.getType()) {
                case PostgreSQLParser.QUOTED_IDENTIFIER:
                    s = s.substring(1, s.length() - 1);
            }
            return s;
        } else {
            return parseIdentifier(treeNode.getChild(0));
        }
    }

    public static ColumnReference.Action parseAction(PostgreSQLParser.ActionContext actCtx) {
        if (actCtx.K_RESTRICT() != null) {
            return ColumnReference.Action.RESTRICT;
        }
        if (actCtx.K_ACTION() != null) {
            return ColumnReference.Action.NO_ACTION;
        }
        if (actCtx.K_NULL() != null) {
            return ColumnReference.Action.SET_NULL;
        }
        if (actCtx.K_CASCADE() != null) {
            return ColumnReference.Action.CASCADE;
        }
        throw new RuntimeException("Wrong On Delete/Update Action:" + actCtx.getText());
    }
}
