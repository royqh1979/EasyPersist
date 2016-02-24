package net.royqh.easypersist;

import net.royqh.easypersist.model.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roy on 2016/2/10.
 */
public class MappingRepository {
    private Map<String,Entity> entityNameMap=new HashMap<>();
    private Map<String,Entity> entityClassMap=new HashMap<>();

    public void addEntity(Entity entity) {
        entityNameMap.put(entity.getName(),entity);
        entityClassMap.put(entity.getClassInfo().getQualifiedName(),entity);
        entity.setMappingRepository(this);
    }

    public Entity findEntityByName(String name) {
        return entityNameMap.get(name);
    }

    public Entity findEntityByClass(String className) {
        return entityClassMap.get(className);
    }


    public void clear() {
        entityClassMap.clear();
        entityNameMap.clear();
    }

    public Collection<Entity> getAllEntities() {
        return entityNameMap.values();
    }
}
