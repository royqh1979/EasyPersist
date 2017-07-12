@Service
public class ${entity.classInfo.name}Service {
    @Autowired
    private ${entity.classInfo.name}Persistor persistor;
    private List<${entity.classInfo.name}> cachedList=null;
    private boolean dirty=false;

    public List<${entity.classInfo.name}> listAll(boolean refresh) {
        if (refresh) {
            dirty=true;
        }
        checkCache();
        return cachedList;
    }

    public ${idType} create(${entity.classInfo.name} ${entity.name}) {
        dirty=true;
        return persistor.create(${entity.name});
    }

    public ${entity.classInfo.name} retrieve(${idType} id) {
        return persistor.retrieve(id);
    }

    public void delete(${idType} id) {
        dirty=true;
        persistor.delete(id);
    }

    public void update(${entity.classInfo.name} ${entity.name}) {
        dirty=true;
        persistor.update(${entity.name});
    }

    private void checkCache() {
        if (cachedList==null || dirty) {
            cachedList= persistor.retrieveAll();
            dirty=false;
        }
    }

}