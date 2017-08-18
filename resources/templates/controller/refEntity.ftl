<#if generator.isDepartmentInfoType(refEntity)>
    @RequestMapping(value="/listDepartmentInfoTree",method = RequestMethod.GET,
    produces = "application/json")
    @ResponseBody
    public Map<String,List> listDepartmentInfoTree(HttpServletRequest request){
        Map<String, List> result = ${refEntity.name}Service.getDepartmentTreeMap();
        return result;
    }
</#if>

    @RequestMapping(value = "/list${refEntity.classInfo.name}", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object list${refEntity.classInfo.name}(@RequestParam("refresh") String strRefresh) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            boolean refresh=("y".equals(strRefresh));
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