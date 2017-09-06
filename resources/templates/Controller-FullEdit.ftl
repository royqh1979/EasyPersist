import ${entity.classInfo.qualifiedName};
import cn.edu.bjfu.smartforestry.view.ProcessingResultType;
import cn.edu.bjfu.smartforestry.view.utils.Result;
import cn.edu.bjfu.smartforestry.view.utils.ResultWithEntity;
import cn.edu.bjfu.smartforestry.view.utils.SpringSecurityHelper;
import cn.edu.bjfu.smartforestry.view.utils.TaskRedirector;
import com.qui.base.Grid;
import com.qui.base.ListForSelect;
import com.qui.base.Pager;
import com.qui.base.SortType;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import net.royqh.lang.DateTools;

import java.util.List;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

<#list typeList as type>
import ${type};
</#list>

@Controller
@RequestMapping(${entity.classInfo.name}Controller.CONTROLLER_URL)
public class ${entity.classInfo.name}Controller {
    @Autowired
    private ${entity.classInfo.name}Service ${entity.name}Service;
    <#list serviceEntities as servEntity>
    <#if generator.isDepartmentInfoType(servEntity)>
    @Autowired
    private DepartmentService ${servEntity.name}Service;
    <#else >
    @Autowired
    private ${servEntity.classInfo.name}Service ${servEntity.name}Service;
    </#if>
    </#list>
    private Logger logger = LoggerFactory.getLogger(${entity.classInfo.name}Controller.class);
    private static final String jspPrefix= "";
    public static final String CONTROLLER_URL = "codes/${entity.name}";

    private static final String[] VALID_ROLES={"ROLE_UNKNOWN1"};

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return jspPrefix+"${entity.name}";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object list(<#list indexedProperties as indexProperty>
    <#if generator.isDateProperty(indexProperty) >@RequestParam("start${indexProperty.name?cap_first}") String start${indexProperty.name?cap_first}Val,
    @RequestParam("end${indexProperty.name?cap_first}") String end${indexProperty.name?cap_first}Val,
    <#else>@RequestParam("${indexProperty.name}")String ${indexProperty.name}Val,</#if></#list>
            @RequestParam("pager.pageNo") int pageNo,
            @RequestParam("pager.pageSize") int pageSize,
            @RequestParam("sort") String orderBy,
            @RequestParam("direction") SortType sortType) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {<#list indexedProperties as indexProperty>
                <#if generator.isDateProperty(indexProperty) >
                Date start${indexProperty.name?cap_first}Var=null;
                if (!StringUtils.isEmpty(start${indexProperty.name?cap_first}Val)){
                    start${indexProperty.name?cap_first}Var = DateTools.parseDate(start${indexProperty.name?cap_first}Val);
                }
                Date end${indexProperty.name?cap_first}Var=null;
                if (!StringUtils.isEmpty(end${indexProperty.name?cap_first}Val)){
                    end${indexProperty.name?cap_first}Var = DateTools.parseDate(end${indexProperty.name?cap_first}Val);
                }
                <#else >
            ${generator.getObjectType(indexProperty.type)} ${indexProperty.name}Var=null;
            if (!StringUtils.isEmpty(${indexProperty.name}Val)){
                ${indexProperty.name}Var = ${generator.getConvertParameterStatement(indexProperty)};
            }
                </#if>
            </#list>
            Pager pager = new Pager(pageSize, pageNo);
            pager.setTotalRows(${entity.name}Service.countAll(<#list indexedProperties as indexProperty>
                <#if generator.isDateProperty(indexProperty) >
                    start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
                <#else >${indexProperty.name}Var</#if><#sep>,</#sep></#list>));
            List<${entity.classInfo.name}> ${entity.name}List = ${entity.name}Service.findAll(<#list indexedProperties as indexProperty>
    <#if generator.isDateProperty(indexProperty) >
    start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
    <#else >${indexProperty.name}Var</#if>,</#list>orderBy, sortType, pager);
            Grid<${entity.classInfo.name}> result = new Grid<>(pager, ${entity.name}List, orderBy, sortType);
            return result;
        } catch (RuntimeException e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/exportList", method = RequestMethod.POST)
    public void exportList(<#list indexedProperties as indexProperty>
        <#if generator.isDateProperty(indexProperty) >@RequestParam("start${indexProperty.name?cap_first}") String start${indexProperty.name?cap_first}Val,
        @RequestParam("end${indexProperty.name?cap_first}") String end${indexProperty.name?cap_first}Val,
        <#else>@RequestParam("${indexProperty.name}")String ${indexProperty.name}Val,</#if></#list>
    @RequestParam("sort") String orderBy,
    @RequestParam("direction") SortType sortType,
    HttpServletResponse response) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            response.setStatus(401);
            return;
        }
        try {<#list indexedProperties as indexProperty>
            <#if generator.isDateProperty(indexProperty) >
            Date start${indexProperty.name?cap_first}Var=null;
            if (!StringUtils.isEmpty(start${indexProperty.name?cap_first}Val)){
            start${indexProperty.name?cap_first}Var = DateTools.parseDate(start${indexProperty.name?cap_first}Val);
            }
            Date end${indexProperty.name?cap_first}Var=null;
            if (!StringUtils.isEmpty(end${indexProperty.name?cap_first}Val)){
            end${indexProperty.name?cap_first}Var = DateTools.parseDate(end${indexProperty.name?cap_first}Val);
            }
            <#else >
            ${generator.getObjectType(indexProperty.type)} ${indexProperty.name}Var=null;
            if (!StringUtils.isEmpty(${indexProperty.name}Val)){
            ${indexProperty.name}Var = ${generator.getConvertParameterStatement(indexProperty)};
            }
            </#if>
        </#list>
            Pager pager = new Pager(100000000, 1);
            String codedFileName = java.net.URLEncoder.encode("${entity.chineseAlias}", "UTF-8");
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            ${entity.name}Service.exportToExcel(<#list indexedProperties as indexProperty>
            <#if generator.isDateProperty(indexProperty) >
            start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
            <#else >${indexProperty.name}Var</#if>,</#list>
            <#list entity.properties as property>
                <#if property.isReferenceProperty()>
                <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
            ${refEntity.name}Service.listAll(false),
                </#if>
            </#list>
            orderBy, sortType, pager, sheet,0,0);
            workbook.write(response.getOutputStream());
        } catch (Exception e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            e.printStackTrace();
        }
    }

<#list refEntities as refEntity>
    <#include "controller/refEntity.ftl" >
</#list>

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public String createUI(Model model) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("isUpdate",false);
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return  jspPrefix+"${entity.name}-edit";
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.GET)
    public String updateUI(Model model, @PathVariable("id")int id) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("isUpdate",true);
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return  jspPrefix+"${entity.name}-edit";
    }

    @RequestMapping(value="/editUI-create", method = RequestMethod.GET)
    public String subEditUIForCreate(Model model) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("isUpdate",false);
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return  jspPrefix+"${entity.name}-edit-entity";
    }

    @RequestMapping(value="/editUI-update/{id}", method = RequestMethod.GET)
    public String subEditUIForUpdate(Model model, @PathVariable("id")int id) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        model.addAttribute("isUpdate",true);
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return  jspPrefix+"${entity.name}-edit-entity";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object create(
<#assign firstItem=true />
<#list entity.properties as property>
        <#if entity.idProperty.name != property.name >
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
                <#if property!=entity.idProperty>
            ${generator.generateEntityPropertySetting(entity,property)}
                </#if>
            </#list>
            ${entity.name}Service.create(${entity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${entity.name});
        } catch (Exception e) {
            logger.error("创建${entity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {<#list entity.properties as property> <#if entity.idProperty.name != property.name>
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
@RequestParam("${entity.idProperty.name}") ${entity.idProperty.type} ${entity.idProperty.name}Val) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${entity.classInfo.name} ${entity.name} = ${entity.name}Service.retrieve(${entity.idProperty.name}Val);
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
            ${entity.name}Service.update(${entity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${entity.name});
        } catch (Exception e){
            logger.error("更新${entity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {
            <#list entity.properties as property>
                logger.debug("${entity.classInfo.name}.${property.name}:" + ${property.name}Val);
            </#list>
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

    @RequestMapping(value = "/retrieve/{id}", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object retrieve(@PathVariable("id")  ${entity.idProperty.type} ${entity.idProperty.name}Val) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${entity.classInfo.name} ${entity.name} = ${entity.name}Service.retrieve(${entity.idProperty.name}Val);
            if (${entity.name} == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("找不到${entity.idProperty.name}为" + ${entity.idProperty.name}Val + "的${entity.classInfo.name}对象");
                }
                return new Result(ProcessingResultType.Fail, "找不到${entity.idProperty.name}为" + ${entity.idProperty.name}Val + "的${entity.classInfo.name}对象");
            }
            return new ResultWithEntity<>(ProcessingResultType.Success, ${entity.name});
        } catch (Exception e) {
            logger.error("获取${entity.classInfo.name}对象失败:", e);
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


<#list entity.subEntities as subEntityInfo>
    <#include "controller/fulledit-subEntity.ftl" >
</#list>

<#list entity.mapRelationInfos as relationInfo>
    <#include "controller/fulledit-mapEntity.ftl" >
</#list>
}