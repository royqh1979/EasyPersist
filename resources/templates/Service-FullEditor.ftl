@Service
public class ${entity.classInfo.name}Service {
    @Autowired
    private ${entity.classInfo.name}Persistor persistor;

    public List<${entity.classInfo.name}> list(

    public ${idType} create(${entity.classInfo.name} ${entity.name}) {
        return persistor.create(${entity.name});
    }

    public ${entity.classInfo.name} retrieve(${idType} id) {
        return persistor.retrieve(id);
    }

    public void delete(${idType} id) {
        persistor.delete(id);
    }

    public void update(${entity.classInfo.name} ${entity.name}) {
        persistor.update(${entity.name});
    }

}