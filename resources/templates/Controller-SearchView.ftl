<#compress>
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
<#if exportEnabled>
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
</#if>
import javax.servlet.http.HttpServletRequest;
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
    <#list serviceEntities as servEntity>
        <#if templateUtils.isDepartmentInfoType(servEntity)>
    @Autowired
    private DepartmentService ${servEntity.name}Service;
        <#else >
    @Autowired
    private ${servEntity.classInfo.name}Service ${servEntity.name}Service;
        </#if>
    </#list>
    private Logger logger = LoggerFactory.getLogger(${entity.classInfo.name}ViewController.class);
    public static final String jspPrefix= "";
    public static final String CONTROLLER_URL = "codes/${entity.name}-view";
    private static final String[] VALID_ROLES={"ROLE_UNKNOWN1"};
<#if exportEnabled>
    private static final int EXCEL_START_ROW=0;
    private static final int EXCEL_START_COL=0;
</#if>



    @RequestMapping(value = "/view-list", method = RequestMethod.GET)
    public String viewList(Model model) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model, "无权访问");
        }
        try {
            Pager pager = new Pager();
            pager.setTotalRows(${entity.name}Service.countAll(<#list indexedProperties as indexProperty>
    <#if templateUtils.isDateProperty(indexProperty) >
                null,null
    <#else >null</#if><#sep>,</#sep></#list>));
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
    <#else >model.addAttribute("${indexProperty.name}", "");</#if></#list>
            model.addAttribute("${entity.name}List", ${entity.name}List);
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
            model.addAttribute("start${indexProperty.name?cap_first}", start${indexProperty.name?cap_first}Var);
            model.addAttribute("end${indexProperty.name?cap_first}", end${indexProperty.name?cap_first}Var);
    <#else >model.addAttribute("${indexProperty.name}", ${indexProperty.name}Var);</#if></#list>
            model.addAttribute("${entity.name}List", ${entity.name}List);
            model.addAttribute("ctrlUrl", CONTROLLER_URL);
            return jspPrefix + "${entity.name}-view";
        } catch (RuntimeException e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            return TaskRedirector.errorExit(model,"访问失败:"+e.getMessage());
        }
    }

<#if exportEnabled >
    @RequestMapping(value = "/exportList", method = RequestMethod.POST)
    public void exportList(<#list indexedProperties as indexProperty>
        <#if templateUtils.isDateProperty(indexProperty) >@RequestParam("start${indexProperty.name?cap_first}") String start${indexProperty.name?cap_first}Val,
        @RequestParam("end${indexProperty.name?cap_first}") String end${indexProperty.name?cap_first}Val,
        <#else>@RequestParam("${indexProperty.name}")String ${indexProperty.name}Val,</#if></#list>
    HttpServletResponse response) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            response.setStatus(401);
            return;
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
            String codedFileName = java.net.URLEncoder.encode("${entity.chineseAlias}", "UTF-8");
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
        ${entity.name}Service.exportToExcel(<#list indexedProperties as indexProperty>
        <#if templateUtils.isDateProperty(indexProperty) >
            start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
        <#else >${indexProperty.name}Var</#if>,</#list>
        <#list entity.properties as property>
            <#if property.isReferenceProperty()>
                <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                ${refEntity.name}Service.listAll(false),
            </#if>
        </#list>
            sheet,EXCEL_START_ROW,EXCEL_START_COL);
            workbook.write(response.getOutputStream());
        } catch (Exception e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/exportDetail", method = RequestMethod.POST)
    public void exportDetail(@RequestParam("id") int idVal, HttpServletResponse response) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            response.setStatus(401);
            return;
        }
        try {
            Map<String,Object> resultSet=new HashMap<>();
            Map<String,Object> ${entity.name} = ${entity.name}Service.retrieveForView(idVal);
            resultSet.put("${entity.name}",${entity.name});
    <#list entity.subEntities as subEntityInfo>
        <#assign subEntity=subEntityInfo.subEntity >
        <#assign subRefProperty= subEntityInfo.subEntityReferenceProperty >
            List<Map<String,Object>> ${subEntity.name}List = ${subEntity.name}Service.findBy${subRefProperty.name?cap_first}ForView(idVal);
            resultSet.put("${subEntity.name}List",${subEntity.name}List);
    </#list>
            String codedFileName = java.net.URLEncoder.encode("${entity.chineseAlias}详情", "UTF-8");
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            fyApplyworkService.exportDetailToExcel(sheet,resultSet);
            workbook.write(response.getOutputStream());
        } catch (Exception e) {
            logger.error("获取FyApplywork对象列表失败:", e);
            e.printStackTrace();
        }
    }
</#if>

    @RequestMapping(value = "/view-detail/{id}", method = RequestMethod.GET)
    public String retrieve(@PathVariable("id") int idVal,Model model) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        try {
            Map<String,Object> ${entity.name} = ${entity.name}Service.retrieveForView(idVal);
            model.addAttribute("${entity.name}",${entity.name});
    <#list entity.subEntities as subEntityInfo>
        <#assign subEntity=subEntityInfo.subEntity >
        <#assign subRefProperty= subEntityInfo.subEntityReferenceProperty >
            List<Map<String,Object>> ${subEntity.name}List = ${subEntity.name}Service.findBy${subRefProperty.name?cap_first}ForView(idVal);
            model.addAttribute("${subEntity.name}List",${subEntity.name}List);
    </#list>
            model.addAttribute("ctrlUrl", CONTROLLER_URL);
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
</#compress>