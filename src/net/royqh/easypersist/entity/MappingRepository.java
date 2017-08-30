package net.royqh.easypersist.entity;

import com.intellij.notification.*;
import com.intellij.psi.PsiClass;
import net.royqh.easypersist.entity.model.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roy on 2016/2/10.
 */
public class MappingRepository {
    private Map<String,Entity> tableNameMap=new HashMap<>();
    private Map<String,Entity> entityNameMap=new HashMap<>();
    private Map<String,Entity> entityClassMap=new HashMap<>();

    public void addEntity(Entity entity) {

        // System.out.println(entity.getName()+":"+entity.getClassInfo().getQualifiedName()) ;
        if (tableNameMap.containsKey(entity.getTableName())) {
            Entity entity1=tableNameMap.get(entity.getTableName());
            Notification notification = new Notification("Easy Persist","Warning",
                    String.format("Entity %s and %s refrence the same table: %s!",
                            entity.getClassInfo().getQualifiedName(),
                            entity1.getClassInfo().getQualifiedName(),
                            entity.getTableName()
                    ),
                    NotificationType.WARNING
            );                                                         
            Notifications.Bus.notify(notification);
        }
        tableNameMap.put(entity.getTableName(),entity);
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

    public Entity findEntityByTable(String tableName) {
        return tableNameMap.get(tableName);
    }


    public void clear() {
        tableNameMap.clear();
        entityClassMap.clear();
        entityNameMap.clear();
    }

    public Collection<Entity> getAllEntities() {
        return entityNameMap.values();
    }

    public boolean isClassExist(PsiClass psiClass) {
        return entityClassMap.containsKey(psiClass.getQualifiedName());
    }
}
