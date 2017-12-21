<#compress >
<#assign mapEntity=entity.getMappingRepository().findEntityByClass(relationInfo.mappingEntityFullClassName) >
    @RequestMapping(value="/editUI-mapping-${mapEntity.name}/{id}", method = RequestMethod.GET)
    public String mappingEditUIFor${mapEntity.classInfo.name}(Model model, @PathVariable("id")int id) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return  jspPrefix+"${entity.name}-mapping-${mapEntity.name}";
    }

    @RequestMapping(value="/editUI-mapping-add-${mapEntity.name}/{id}", method = RequestMethod.GET)
    public String mappingAddEditUIFor${mapEntity.classInfo.name}(Model model, @PathVariable("id")int id) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return  jspPrefix+"${entity.name}-mapping-add-${mapEntity.name}";
    }

    @RequestMapping(value = "/list${mapEntity.classInfo.name}ForGrid", method = RequestMethod.POST,
        produces = "application/json")
    @ResponseBody
    public Object list${mapEntity.classInfo.name}ForGrid(
        @RequestParam("id") String idVal,
        @RequestParam("pager.pageNo") int pageNo,
        @RequestParam("pager.pageSize") int pageSize,
        @RequestParam("sort") String orderBy,
        @RequestParam("direction") SortType sortType) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            int id;
            if (StringUtils.isEmpty(idVal)){
                throw new RuntimeException("id为空!");
            } else {
                id=Integer.parseInt(idVal);
            }
            Pager pager = new Pager(pageSize, pageNo);
            pager.setTotalRows(${entity.name}Service.count${mapEntity.classInfo.name}(id));
            List<${mapEntity.classInfo.name}> ${mapEntity.name}List = ${entity.name}Service.find${mapEntity.classInfo.name}(id,orderBy, sortType, pager);
            Grid<${mapEntity.classInfo.name}> result = new Grid<>(pager, ${mapEntity.name}List, orderBy, sortType);
            return result;
        } catch (RuntimeException e) {
            logger.error("获取${mapEntity.classInfo.name}对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }


    @RequestMapping(value = "/add${mapEntity.classInfo.name}", method = RequestMethod.POST,
        produces = "application/json")
    @ResponseBody
    public Object add${mapEntity.classInfo.name}(
        @RequestParam("id") int id,
        @RequestParam("${mapEntity.name}Ids[]") List<Integer> ${mapEntity.name}Ids ) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${entity.name}Service.add${mapEntity.classInfo.name}sTo${entity.classInfo.name}(id,${mapEntity.name}Ids);
            return new Result(ProcessingResultType.Success, "添加成功");
        } catch (Exception e) {
            logger.error("添加${mapEntity.classInfo.name}对象到${entity.classInfo.name}失败:", e);
            if (logger.isDebugEnabled()) {
                for (Integer ${mapEntity.name}Id:${mapEntity.name}Ids) {
                    logger.debug("add ${mapEntity.classInfo.name}.${mapEntity.idProperty.name}:" + ${mapEntity.name}Id+" to ${entity.classInfo.name}.${entity.idProperty.name}:"+id);
                }
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }



    @RequestMapping(value = "/delete${mapEntity.classInfo.name}", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object delete${mapEntity.classInfo.name}(@RequestParam("id") int id,
        @RequestParam("${mapEntity.name}Ids[]") List<Integer> ${mapEntity.name}Ids) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${entity.name}Service.delete${mapEntity.classInfo.name}sFrom${entity.classInfo.name}(id,${mapEntity.name}Ids);
            return new Result(ProcessingResultType.Success, "删除成功");
        } catch (Exception e) {
            logger.error("从${entity.classInfo.name}中删除${mapEntity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {
                for (Integer ${mapEntity.name}Id:${mapEntity.name}Ids) {
                logger.debug("delete ${mapEntity.classInfo.name}.${mapEntity.idProperty.name}:" + ${mapEntity.name}Id+" from ${entity.classInfo.name}.${entity.idProperty.name}:"+id);
            }
        }
        return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    <#assign mapIndexedProperties=templateUtils.getIndexedProperties(mapEntity) >
    @RequestMapping(value = "/list${mapEntity.classInfo.name}ForAdd", method = RequestMethod.POST,
        produces = "application/json")
    @ResponseBody
    public Object list${mapEntity.classInfo.name}ForAdd(<#list mapIndexedProperties as indexProperty>
        <#if templateUtils.isDateProperty(indexProperty) >@RequestParam("start${indexProperty.name?cap_first}") String start${indexProperty.name?cap_first}Val,
        @RequestParam("end${indexProperty.name?cap_first}") String end${indexProperty.name?cap_first}Val,
        <#else>@RequestParam("${indexProperty.name}")String ${indexProperty.name}Val,</#if></#list>
        @RequestParam("mapping-id") int mappingId) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {<#list mapIndexedProperties as indexProperty>
        <#if templateUtils.isDateProperty(indexProperty) >
            Date start${indexProperty.name?cap_first}Var=null;
            if (!StringUtils.isEmpty(start${indexProperty.name?cap_first}Val)){
                start${indexProperty.name?cap_first}Var = DateTools.parseDate(start${indexProperty.name?cap_first}Val);
            }
            Date end${indexProperty.name?cap_first}Var=null;
            if (!StringUtils.isEmpty(end${indexProperty.name?cap_first}Val)){
                end${indexProperty.name?cap_first}Var = DateTools.parseDate(end${indexProperty.name?cap_first}Val);
            }
        <#else >
            ${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name}Var=null;
            if (!StringUtils.isEmpty(${indexProperty.name}Val)){
                ${indexProperty.name}Var = ${templateUtils.getConvertParameterStatement(indexProperty)};
            }
        </#if>
    </#list>
            List<${mapEntity.classInfo.name}> ${mapEntity.name}List = ${entity.name}Service.find${mapEntity.classInfo.name}ForAdd(<#list mapIndexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >
                start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
            <#else >${indexProperty.name}Var</#if>,</#list>mappingId);
            Pager pager=new Pager(50000,1);
            Grid<${mapEntity.classInfo.name}> result = new Grid<>(pager, ${mapEntity.name}List, null, null);
            return result;
        } catch (RuntimeException e) {
            logger.error("获取${mapEntity.classInfo.name}对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }
</#compress>