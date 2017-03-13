package net.royqh.parser.mysql.utils;

import net.royqh.parser.mysql.MySQLParser;
import net.royqh.parser.model.ColumnReference;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by Roy on 2017/2/3.
 */
public abstract class MySQLParseTool {

    public static boolean isAutoincrementColumn(MySQLParser.ColumnDefContext ctx) {
        for (MySQLParser.Column_attributeContext columnAttributeContext : ctx.column_definition().column_attribute()) {
            if (columnAttributeContext.K_AUTO_INCREMENT() != null) {
                return true;
            }
        }
        return false;
    }

    public static ColumnReference.Action parseAction(MySQLParser.ActionContext actCtx) {
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

    public static String parseStringLiteral(MySQLParser.String_literalContext strCtx) {
        if (strCtx.DOUBLE_QUOTED_STRING() != null) {
            String s = strCtx.DOUBLE_QUOTED_STRING().getText();
            return s.substring(1, s.length() - 1);
        }
        if (strCtx.SINGLE_QUOTED_STRING() != null) {
            String s = strCtx.SINGLE_QUOTED_STRING().getText();
            return s.substring(1, s.length() - 1);
        }
        return "";
    }

    public static String parseIdentifier(ParseTree ctx) {
        if (ctx==null)
            return null;
        if (ctx instanceof MySQLParser.IdentifierContext) {
            MySQLParser.IdentifierContext idCtx = (MySQLParser.IdentifierContext) ctx;
            if (idCtx.UNQUOTED_IDENTIFIER() != null) {
                return idCtx.UNQUOTED_IDENTIFIER().getText();
            }
            if (idCtx.QUOTED_IDENTIFIER() != null) {
                String s = idCtx.QUOTED_IDENTIFIER().getText();
                return s.substring(1, s.length() - 1);
            }
            if (idCtx.DOUBLE_QUOTED_STRING() != null) {
                String s = idCtx.DOUBLE_QUOTED_STRING().getText();
                return s.substring(1, s.length() - 1);
            }
            return idCtx.UNDERLINE_STARTED_IDENTIFIER().getText();
        } else if (ctx instanceof MySQLParser.String_literalContext) {
            return parseStringLiteral((MySQLParser.String_literalContext) ctx);
        } else if (ctx.getChildCount() <= 0) {
            return ctx.getText();
        } else {
            return parseIdentifier(ctx.getChild(0));
        }
    }

    public static String getUnquotedText(TerminalNode terminalNode) {
        Token token = terminalNode.getSymbol();
        String s = token.getText();
        switch (token.getType()) {
            case MySQLParser.DOUBLE_QUOTED_STRING:
            case MySQLParser.SINGLE_QUOTED_STRING:
            case MySQLParser.QUOTED_IDENTIFIER:
                s=s.substring(1, s.length() - 1);
            default:
        }
        return s;
    }

    public static String getConvertedText(TerminalNode terminalNode) {
        if (terminalNode.getParent() instanceof MySQLParser.String_literalContext) {
            return "'"+ getUnquotedText(terminalNode)+"'";
        }
        if (terminalNode.getParent() instanceof MySQLParser.IdentifierContext) {
            return "\""+ getUnquotedText(terminalNode)+"\"";
        }
        return getUnquotedText(terminalNode);
    }

    public static String getConvertedText(BufferedTokenStream tokenStream, ParseTree treeNode) {
        StringBuilder builder = new StringBuilder();
        getConvertedText(tokenStream, treeNode, builder);
        return builder.toString();
    }

    public static void getConvertedText(BufferedTokenStream tokenStream, ParseTree treeNode, StringBuilder builder) {
        if (treeNode instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) treeNode;
            int i = terminalNode.getSymbol().getTokenIndex();
            List<Token> hiddenTokensToLeft =
                    tokenStream.getHiddenTokensToLeft(i, Token.HIDDEN_CHANNEL);
            if (hiddenTokensToLeft != null) {
                for (Token token : hiddenTokensToLeft) {
                    if (token != null) {
                        builder.append(token.getText());
                    }
                }
            }
            Token t = terminalNode.getSymbol();
            builder.append(getConvertedText(terminalNode));
            return;
        }

        if (treeNode.getChildCount() == 0) {
            return;
        }

        for (int i = 0; i < treeNode.getChildCount(); i++) {
            getConvertedText(tokenStream, treeNode.getChild(i), builder);
        }
    }
}
