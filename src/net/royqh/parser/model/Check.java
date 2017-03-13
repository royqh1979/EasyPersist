package net.royqh.parser.model;

/**
 * Created by Roy on 2017/2/4.
 */
public class Check {
    private String name;
    private String expression;

    public Check(String name,String expression) {
        this.name=name;
        this.expression=expression;
    }
    public Check(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public String getName() {
        return name;
    }
}
