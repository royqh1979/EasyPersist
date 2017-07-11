
@Controller
@RequestMapping("codes/${entity.name}")
public class ${entity.classInfo.name}Controller {
    @Autowired
    private ${entity.classInfo.name}Service ${entity.name}Service;
    <#list refEntities as refEntity>
    @Autowired
    private ${refEntity.classInfo.name}Service ${refEntity.name}Service;
    </#list>
    private Logger logger = LoggerFactory.getLogger(${entity.classInfo.name}Controller.class);

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
        return "${entity.name}";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object list(@RequestParam("refresh") String strRefresh) {
        try {
            boolean refresh=(strRefresh!=null);
            List<${entity.classInfo.name}> list = ${entity.name}Service.listAll(refresh);
            Pager pager = new Pager(1000, 1);
            pager.setTotalRows(list.size());
            Grid<${entity.classInfo.name}> result = new Grid<>(pager, list, null, null);
            return result;
        } catch (RuntimeException e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

<#list refEntities as refEntity>
    @RequestMapping(value = "/list${refEntity.classInfo.name}", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object list${refEntity.classInfo.name}(@RequestParam("refresh") String strRefresh) {
        try {
            boolean refresh=(strRefresh!=null);
            List<${refEntity.classInfo.name}> list = ${refEntity.name}Service.listAll(refresh);
            ListForSelect listForSelect = new ListForSelect();
            for (${refEntity.classInfo.name} ${refEntity.name} : list) {
                <#if refEntity.listHeaderProperty??>
                    <#assign listHeader=refEntity.listHeaderProperty>
                <#else>
                    <#assign listHeader=refEntity.idProperty>
                </#if>
                listForSelect.addItem(${refEntity.name}.${refEntity.idProperty.getter}() + "", ${refEntity.name}.${listHeader.getter}()+"");
            }
            return listForSelect;
        } catch (RuntimeException e) {
            logger.error("获取${refEntity.classInfo.name}对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }
</#list>

    @RequestMapping(value = "/create", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object create(<#if !entity.isAutoGenerateId() >${idParam},</#if> ${params}) {
        try {
            ${entity.classInfo.name} ${entity.name} = new ${entity.classInfo.name}();
            <#if !entity.isAutoGenerateId() >
            ${entityIdPropertySetting}
            </#if>
            ${entityPropertySettings}
            ${entity.name}Service.create(${entity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${entity.name});
        } catch (Exception e) {
            logger.error("创建${entity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {
                ${entityDumpWithoutId}
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object update(${idParam},${params}) {
        try {
            ${entity.classInfo.name} ${entity.name} = ${entity.name}Service.retrieve(${entity.idProperty.name});
            if (${entity.name} == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("找不到${entity.idProperty.name}为" + ${entity.idProperty.name} + "的${entity.classInfo.name}对象");
                }
                return new Result(ProcessingResultType.Fail, "找不到${entity.idProperty.name}为" + ${entity.idProperty.name} + "的${entity.classInfo.name}对象");
            }
            ${entityPropertySettings}
            ${entity.name}Service.update(${entity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${entity.name});
        } catch (Exception e){
            logger.error("更新${entity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {
                ${entityDumpWithId}
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object delete(${idParam}) {
        try {
            ${entity.name}Service.delete(${entity.idProperty.name});
            return new Result(ProcessingResultType.Success, "删除成功");
        } catch (Exception e) {
            logger.error("删除${entity.idProperty.name}为"+${entity.idProperty.name}+"的${entity.classInfo.name}对象失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object batchDelete(@RequestParam("${entity.idProperty.name}s[]")${entity.idProperty.type}[] ${entity.idProperty.name}s) {
        try {
            for (${entity.idProperty.type} ${entity.idProperty.name}:${entity.idProperty.name}s) {
                ${entity.name}Service.delete(${entity.idProperty.name});
            }
            return new Result(ProcessingResultType.Success, "批量删除成功");
        } catch (Exception e) {
            logger.error("批量删除${entity.classInfo.name}对象失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }
}