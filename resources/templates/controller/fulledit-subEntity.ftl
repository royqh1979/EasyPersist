<#assign subEntity=subEntityInfo.subEntity >
<#assign subRefProperty= subEntityInfo.subEntityReferenceProperty >
    @RequestMapping(value="/editUI-sub-${subEntity.name}/{id}", method = RequestMethod.GET)
    public String subEditUIFor${subEntity.classInfo.name}(Model model, @PathVariable("id")int id) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return  jspPrefix+"${entity.name}-edit-${subEntity.name}";
    }

    @RequestMapping(value = "/list${subEntity.classInfo.name}ForGrid", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object list${subEntity.classInfo.name}ForGrid(
        @RequestParam("${subRefProperty.name}") String ${subRefProperty.name}Val,
        @RequestParam("pager.pageNo") int pageNo,
        @RequestParam("pager.pageSize") int pageSize,
        @RequestParam("sort") String orderBy,
        @RequestParam("direction") SortType sortType) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${generator.getObjectType(subRefProperty.type)} ${subRefProperty.name}Var=null;
            if (!StringUtils.isEmpty(${subRefProperty.name}Val)){
                ${subRefProperty.name}Var = ${generator.getConvertParameterStatement(subRefProperty)};
            }
            Pager pager = new Pager(pageSize, pageNo);
            pager.setTotalRows(${subEntity.name}Service.countBy${subRefProperty.name?cap_first}(${subRefProperty.name}Var));
            List<${subEntity.classInfo.name}> ${subEntity.name}List = ${subEntity.name}Service.findBy${subRefProperty.name?cap_first}(${subRefProperty.name}Var,orderBy, sortType, pager);
            Grid<${subEntity.classInfo.name}> result = new Grid<>(pager, ${subEntity.name}List, orderBy, sortType);
            return result;
        } catch (RuntimeException e) {
            logger.error("获取${subEntity.classInfo.name}对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }


    @RequestMapping(value = "/create${subEntity.classInfo.name}", method = RequestMethod.POST,
        produces = "application/json")
    @ResponseBody
    public Object create${subEntity.classInfo.name}(
    <#assign firstItem=true />
    <#list subEntity.properties as property>
        <#if subEntity.idProperty.name != property.name >
            <#if !firstItem>,<#else><#assign firstItem=false/></#if>
        @RequestParam("${property.name}") String ${property.name}Val
        </#if>
    </#list>) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
        return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${subEntity.classInfo.name} ${subEntity.name} = new ${subEntity.classInfo.name}();
            <#list subEntity.properties as property>
                <#if property!=subEntity.idProperty>
                ${generator.generateEntityPropertySetting(subEntity,property)}
                </#if>
            </#list>
            ${subEntity.name}Service.create(${subEntity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${subEntity.name});
        } catch (Exception e) {
            logger.error("创建${subEntity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {<#list subEntity.properties as property> <#if subEntity.idProperty.name != property.name>
                logger.debug("${subEntity.classInfo.name}.${property.name}:" + ${property.name}Val);
            </#if></#list>
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/update${subEntity.classInfo.name}", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object update${subEntity.classInfo.name}(<#list subEntity.properties as property><#if subEntity.idProperty.name != property.name>
    @RequestParam("${property.name}") String ${property.name}Val,</#if></#list>
    @RequestParam("${subEntity.idProperty.name}") ${subEntity.idProperty.type} ${subEntity.idProperty.name}Val) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${subEntity.classInfo.name} ${subEntity.name} = ${subEntity.name}Service.retrieve(${entity.idProperty.name}Val);
            if (${subEntity.name} == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("找不到${subEntity.idProperty.name}为" + ${subEntity.idProperty.name}Val + "的${subEntity.classInfo.name}对象");
                }
                return new Result(ProcessingResultType.Fail, "找不到${subEntity.idProperty.name}为" + ${subEntity.idProperty.name}Val + "的${subEntity.classInfo.name}对象");
            }
            <#list subEntity.properties as property>
                <#if property!=subEntity.idProperty>
                ${generator.generateEntityPropertySetting(subEntity,property)}
                </#if>
            </#list>
            ${subEntity.name}Service.update(${subEntity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${subEntity.name});
        } catch (Exception e){
            logger.error("更新${subEntity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {
                <#list subEntity.properties as property>
                logger.debug("${subEntity.classInfo.name}.${subEntity.name}:" + ${property.name}Val);
                </#list>
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/delete${subEntity.classInfo.name}", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object delete${subEntity.classInfo.name}(@RequestParam("${subEntity.idProperty.name}") ${subEntity.idProperty.type} ${subEntity.idProperty.name}) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${subEntity.name}Service.delete(${subEntity.idProperty.name});
            return new Result(ProcessingResultType.Success, "删除成功");
        } catch (Exception e) {
            logger.error("删除${subEntity.idProperty.name}为"+${subEntity.idProperty.name}+"的${subEntity.classInfo.name}对象失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete${subEntity.classInfo.name}", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object batchDelete${subEntity.classInfo.name}(@RequestParam("${subEntity.idProperty.name}s[]")${subEntity.idProperty.type}[] ${subEntity.idProperty.name}s) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            for (${subEntity.idProperty.type} ${subEntity.idProperty.name}:${subEntity.idProperty.name}s) {
                ${subEntity.name}Service.delete(${subEntity.idProperty.name});
            }
            return new Result(ProcessingResultType.Success, "批量删除成功");
        } catch (Exception e) {
            logger.error("批量删除${subEntity.classInfo.name}对象失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }
