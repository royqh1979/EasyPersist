package net.royqh.parser.postgresql.model;

/**
 * Created by Roy on 2017/2/4.
 */
public class Check {
    private String expression;
    private String name;

    public Check(String name,String expression) {
        this.name=name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public String getExpression() {
        return expression;
    }
}
