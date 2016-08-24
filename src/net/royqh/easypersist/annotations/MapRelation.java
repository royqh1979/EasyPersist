package net.royqh.easypersist.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Roy on 2016/8/22.
 */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface MapRelation {
    String table() ;
    Class mappingEntityClass() ;
    String mappingEntityIdColumn() ;
    String idColumn() ;
}
