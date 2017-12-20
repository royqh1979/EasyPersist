package net.royqh.easypersist.entity.parser;

import net.royqh.easypersist.entity.model.Entity;

/**
 * Created by Roy on 2016/2/11.
 */
public class ParseError extends RuntimeException {
    public ParseError(String message) {
        super(message);
    }

    public ParseError(Entity entity, String message) {
        this(String.format("实体类 %s: %s",entity.getClassInfo().getQualifiedName(),message));
    }
}
