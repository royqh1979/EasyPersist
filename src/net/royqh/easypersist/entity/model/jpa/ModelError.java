package net.royqh.easypersist.entity.model.jpa;

/**
 * Created by Roy on 2016/2/11.
 */
public class ModelError extends RuntimeException {
    public ModelError(String msg) {
        super(msg);
    }
}
