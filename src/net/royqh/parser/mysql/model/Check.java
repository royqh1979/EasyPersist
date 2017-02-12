package net.royqh.parser.mysql.model;

/**
 * Created by Roy on 2017/2/4.
 */
public class Check {
    private String expression;

    public Check(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }
}
