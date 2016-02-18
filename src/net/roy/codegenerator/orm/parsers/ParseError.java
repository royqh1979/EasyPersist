package net.roy.codegenerator.orm.parsers;

import net.roy.codegenerator.orm.model.Entity;

/**
 * Created by Roy on 2016/2/11.
 */
public class ParseError extends RuntimeException {
    public ParseError(String message) {
        super(message);
    }

    public ParseError(Entity entity, String message) {
        this(String.format("Class %s: %s",entity.getClassInfo().getQualifiedName(),message));
    }
}
