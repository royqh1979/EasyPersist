import ${entity.classInfo.qualifiedName};
import cn.edu.bjfu.smartforestry.view.ProcessingResultType;
import cn.edu.bjfu.smartforestry.view.utils.Result;
import cn.edu.bjfu.smartforestry.view.utils.ResultWithEntity;
import cn.edu.bjfu.smartforestry.view.utils.SpringSecurityHelper;
import cn.edu.bjfu.smartforestry.view.utils.TaskRedirector;
import com.qui.base.Grid;
import com.qui.base.ListForSelect;
import com.qui.base.Pager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import net.royqh.lang.DateTools;

import java.util.List;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<#list typeList as type>
import ${type};
</#list>

@Controller
@RequestMapping("codes/${entity.name}")
public class ${entity.classInfo.name}Controller {
    @Autowired
    private ${entity.classInfo.name}Service ${entity.name}Service;
    <#list refEntities as refEntity>
        <#if generator.isDepartmentInfoType(refEntity)>
    @Autowired
    private DepartmentService ${refEntity.name}Service;
        <#else >
    @Autowired
    private ${refEntity.classInfo.name}Service ${refEntity.name}Service;
        </#if>
    </#list>
    private Logger logger = LoggerFactory.getLogger(${entity.classInfo.name}Controller.class);
    private static final String jspPrefix= "";
    private static final String pathPrefix = "codes/";
    private static final String[] VALID_ROLES={"ROLE_UNKNOWN1"};

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return jspPrefix+"${entity.name}";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object list(@RequestParam("refresh") String strRefresh) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            boolean refresh=("y".equals(strRefresh));
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

    @RequestMapping(value = "/exportList", method = RequestMethod.POST)
    public void exportList(HttpServletResponse response) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            response.setStatus(401);
            return;
        }
        try {
            String codedFileName = java.net.URLEncoder.encode("${entity.chineseAlias}", "UTF-8");
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
            ${entity.name}Service.exportToExcel(
        <#list entity.properties as property>
            <#if property.isReferenceProperty()>
                <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                ${refEntity.name}Service.listAll(false),
            </#if>
        </#list>
            response.getOutputStream());
        } catch (Exception e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            e.printStackTrace();
        }
    }

<#list refEntities as refEntity>
    <#if generator.isDepartmentInfoType(refEntity)>
    @RequestMapping(value="/listDepartmentInfoTree",method = RequestMethod.GET,
    produces = "application/json")
    @ResponseBody
    public Map<String,List> listDepartmentInfoTree(HttpServletRequest request){
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
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
</#list>

    @RequestMapping(value = "/create", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object create(
<#assign firstItem=true />
<#list entity.properties as property>
    <#if entity.idProperty.name != property.name || !entity.isAutoGenerateId() >
        <#if !firstItem>,<#else><#assign firstItem=false/></#if>
    @RequestParam("${property.name}") String ${property.name}Val
    </#if>
</#list>) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${entity.classInfo.name} ${entity.name} = new ${entity.classInfo.name}();
            <#list entity.properties as property>
                <#if property!=entity.idProperty || !entity.isAutoGenerateId() >
                ${generator.generateEntityPropertySetting(entity,property)}
                </#if>
            </#list>
            ${entity.name}Service.create(${entity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${entity.name});
        } catch (Exception e) {
            logger.error("创建${entity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {<#list entity.properties as property> <#if entity.idProperty.name != property.name || !entity.isAutoGenerateId()>
                logger.debug("${entity.classInfo.name}.${property.name}:" + ${property.name}Val);
            </#if></#list>
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object update(<#list entity.properties as property><#if entity.idProperty.name != property.name>
        @RequestParam("${property.name}") String ${property.name}Val,</#if></#list>
        <#if !entity.isAutoGenerateId() >  @RequestParam("${entity.idProperty.name}ForUpdate") ${entity.idProperty.type} ${entity.idProperty.name}ValForUpdate  ,</#if>
        @RequestParam("${entity.idProperty.name}") ${entity.idProperty.type} ${entity.idProperty.name}Val) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
<#if entity.isAutoGenerateId() >
            ${entity.classInfo.name} ${entity.name} = ${entity.name}Service.retrieve(${entity.idProperty.name}Val);
<#else>
            ${entity.classInfo.name} ${entity.name} = ${entity.name}Service.retrieve(${entity.idProperty.name}ValForUpdate);
</#if>
            if (${entity.name} == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("找不到${entity.idProperty.name}为" + ${entity.idProperty.name}Val + "的${entity.classInfo.name}对象");
                }
                return new Result(ProcessingResultType.Fail, "找不到${entity.idProperty.name}为" + ${entity.idProperty.name}Val + "的${entity.classInfo.name}对象");
            }
        <#list entity.properties as property>
            <#if property!=entity.idProperty>
            ${generator.generateEntityPropertySetting(entity,property)}
            </#if>
        </#list>
<#if entity.isAutoGenerateId() >
            ${entity.name}Service.update(${entity.name});
<#else>
            ${entity.name}.${entity.idProperty.setter}(${entity.idProperty.name}Val);
            ${entity.name}Service.update(${entity.name},${entity.idProperty.name}ValForUpdate);
</#if>
            return new ResultWithEntity<>(ProcessingResultType.Success, ${entity.name});
        } catch (Exception e){
            logger.error("更新${entity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {<#list entity.properties as property>
                    logger.debug("${entity.classInfo.name}.${property.name}:" + ${property.name}Val);
                </#list>
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object delete(@RequestParam("${entity.idProperty.name}") ${entity.idProperty.type} ${entity.idProperty.name}) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
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
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
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