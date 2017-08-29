package net.royqh.easypersist.sql.parser.syntax;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by Roy on 2017/1/17.
 */
public abstract class ParseTool {
    public static boolean getHiddenTextBeforeThisNode(BufferedTokenStream tokenStream, ParseTree treeNode, StringBuilder builder){
        if (treeNode instanceof TerminalNode) {
            TerminalNode terminalNode=(TerminalNode) treeNode;
            int i=terminalNode.getSymbol().getTokenIndex();
            List<Token> hiddenTokensToLeft =
                    tokenStream.getHiddenTokensToLeft(i, Token.HIDDEN_CHANNEL);
            if (hiddenTokensToLeft!=null) {
                for (Token token : hiddenTokensToLeft) {
                    if (token != null) {
                        builder.append(token.getText());
                    }
                }
            }
            return true;
        }

        if (treeNode.getChildCount() == 0) {
            return false;
        }

        for (int i = 0; i < treeNode.getChildCount(); i++) {
            boolean result=getHiddenTextBeforeThisNode(tokenStream,treeNode.getChild(i),builder);
            if (result) {
                return true;
            }
        }
        return false;
    }

    public static String getFullText(BufferedTokenStream tokenStream,ParseTree treeNode) {
        StringBuilder builder=new StringBuilder();
        getFullText(tokenStream,treeNode,builder);
        return builder.toString();
    }

    public static void getFullText(BufferedTokenStream tokenStream, ParseTree treeNode, StringBuilder builder){
        if (treeNode instanceof TerminalNode) {
            TerminalNode terminalNode=(TerminalNode) treeNode;
            int i=terminalNode.getSymbol().getTokenIndex();
            List<Token> hiddenTokensToLeft =
                    tokenStream.getHiddenTokensToLeft(i, Token.HIDDEN_CHANNEL);
            if (hiddenTokensToLeft!=null) {
                for (Token token : hiddenTokensToLeft) {
                    if (token != null) {
                        builder.append(token.getText());
                    }
                }
            }
            builder.append(terminalNode.getText());
        } else {

            for (int i = 0; i < treeNode.getChildCount(); i++) {
                getFullText(tokenStream, treeNode.getChild(i), builder);
            }
        }
    }

}
