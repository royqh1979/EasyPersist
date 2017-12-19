import ${entity.classInfo.qualifiedName};
import cn.edu.bjfu.smartforestry.view.ProcessingResultType;
import cn.edu.bjfu.smartforestry.view.utils.Result;
import cn.edu.bjfu.smartforestry.view.utils.SpringSecurityHelper;
import cn.edu.bjfu.smartforestry.view.utils.TaskRedirector;
import com.qui.base.ListForSelect;
import com.qui.base.Pager;
import com.qui.base.SortType;
import net.royqh.lang.DateTools;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Date;
import java.util.Map;

<#list typeList as type>
import ${type};
</#list>

@Controller
@RequestMapping(${entity.classInfo.name}ViewController.CONTROLLER_URL)
public class ${entity.classInfo.name}ViewController {
    @Autowired
    private ${entity.classInfo.name}Service ${entity.name}Service;
    <#list refEntities as refEntity>
        <#if templateUtils.isDepartmentInfoType(refEntity)>
    @Autowired
    private DepartmentService ${refEntity.name}Service;
        <#else >
    @Autowired
    private ${refEntity.classInfo.name}Service ${refEntity.name}Service;
        </#if>
    </#list>
    private Logger logger = LoggerFactory.getLogger(${entity.classInfo.name}ViewController.class);
    public static final String jspPrefix= "";
    public static final String CONTROLLER_URL = "codes/${entity.name}";
    private static final String[] VALID_ROLES={"ROLE_UNKNOWN1"};

    @RequestMapping(value = "/view-list", method = RequestMethod.GET)
    public String viewList(Model model) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model, "无权访问");
        }
        try {
            Pager pager = new Pager();
            pager.setTotalRows(productService.countAll(null, null, null, null));
            List<Map<String, Object>> ${entity.name}List = ${entity.name}Service.findAllForView(
            <#list indexedProperties as indexProperty>
                <#if templateUtils.isDateProperty(indexProperty) >
                null,null
                <#else >null</#if>,</#list>
            "${entity.idProperty.name}", SortType.asc, pager);
            model.addAttribute("pager", pager);
            model.addAttribute("sort", "${entity.idProperty.name}");
            model.addAttribute("direction", "asc");
<#list indexedProperties as indexProperty>
    <#if templateUtils.isDateProperty(indexProperty) >
            model.addAttribute("start${indexProperty.name?cap_first}", "");
            model.addAttribute("end${indexProperty.name?cap_first}", "");
    <#else >model.addAttribute("${indexProperty.name?cap_first}", "");</#if></#list>
            model.addAttribute("${entity.name}List", productList);
            model.addAttribute("ctrlUrl", CONTROLLER_URL);
            return jspPrefix + "${entity.name}-view";
        }  catch (RuntimeException e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            return TaskRedirector.errorExit(model,"访问失败:"+e.getMessage());
        }
    }

    @RequestMapping(value = "/view-list", method = RequestMethod.POST)
    public String doViewList(<#list indexedProperties as indexProperty>
    <#if templateUtils.isDateProperty(indexProperty) >@RequestParam("start${indexProperty.name?cap_first}") String start${indexProperty.name?cap_first}Val,
    @RequestParam("end${indexProperty.name?cap_first}") String end${indexProperty.name?cap_first}Val,
    <#else>@RequestParam("${indexProperty.name}")String ${indexProperty.name}Val,</#if></#list>
            @RequestParam("pager.pageNo") int pageNo,
            @RequestParam("pager.pageSize") int pageSize,
            @RequestParam("sort") String orderBy,
            @RequestParam("direction") SortType sortType, Model model) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问!");
        }
        try {<#list indexedProperties as indexProperty>
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
            Pager pager = new Pager(pageSize, pageNo);
            pager.setTotalRows(${entity.name}Service.countAll(<#list indexedProperties as indexProperty>
    <#if templateUtils.isDateProperty(indexProperty) >
                    start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
    <#else >${indexProperty.name}Var</#if><#sep>,</#sep></#list>));
            List<Map<String,Object>> ${entity.name}List = ${entity.name}Service.findAllForView(<#list indexedProperties as indexProperty>
    <#if templateUtils.isDateProperty(indexProperty) >
    start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
    <#else >${indexProperty.name}Var</#if>,</#list>orderBy, sortType, pager);
            model.addAttribute("pager",pager);
            model.addAttribute("sort",orderBy);
            model.addAttribute("direction",sortType);
<#list indexedProperties as indexProperty>
    <#if templateUtils.isDateProperty(indexProperty) >
            model.addAttribute("start${indexProperty.name?cap_first}", "");
            model.addAttribute("end${indexProperty.name?cap_first}", "");
    <#else >model.addAttribute("${indexProperty.name?cap_first}", "");</#if></#list>
            model.addAttribute("${entity.name}List", productList);
            model.addAttribute("ctrlUrl", CONTROLLER_URL);
            return jspPrefix + "${entity.name}-view";
        } catch (RuntimeException e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            return TaskRedirector.errorExit(model,"访问失败:"+e.getMessage());
        }
    }

    @RequestMapping(value = "/view-detail/{id}", method = RequestMethod.GET)
    public String retrieve(@PathVariable("id") int idVal,Model model) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        try {
            Map<String,Object> ${entity.name} = ${entity.name}Service.retrieveForView(idVal);
            if (${entity.name} == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("找不到id为" + idVal + "的${entity.classInfo.name}对象");
                }
                return TaskRedirector.errorExit(model, "找不到id为" + idVal + "的${entity.classInfo.name}对象");
            }
            model.addAttribute("${entity.name}",${entity.name});
            return jspPrefix + "${entity.name}-view-detail";
        } catch (Exception e) {
            logger.error("获取${entity.classInfo.name}对象失败:", e);
            return TaskRedirector.errorExit(model,"获取记录失败:"+e.getMessage());
        }
    }

<#list refEntities as refEntity>
    <#include "controller/refEntity.ftl" >
</#list>
}