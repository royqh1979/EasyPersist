<#compress>
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
import org.springframework.web.multipart.MultipartFile;
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
    <#list refEntities as refEntity>
        <#if templateUtils.isDepartmentInfoType(refEntity)>
    @Autowired
    private DepartmentService ${refEntity.name}Service;
        <#else >
    @Autowired
    private ${refEntity.classInfo.name}Service ${refEntity.name}Service;
        </#if>
    </#list>
    private Logger logger = LoggerFactory.getLogger(${entity.classInfo.name}Controller.class);
    public static final String jspPrefix= "";
    public static final String CONTROLLER_URL = "codes/${entity.name}";
    private static final String[] VALID_ROLES={"ROLE_UNKNOWN1"};
<#if exportEnabled>
    private static final int EXCEL_START_ROW=0;
    private static final int EXCEL_START_COL=0;
</#if>

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
    public Object list(@RequestParam("refresh") String strRefresh) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            boolean refresh=("y".equals(strRefresh));
            List<${entity.classInfo.name}> list = ${entity.name}Service.listAll(refresh);
            Pager pager = new Pager(1000, 1);
            pager.setTotalRows(list.size());
            return new Grid<>(pager, list, null, null);
        } catch (RuntimeException e) {
            logger.error("获取${entity.classInfo.name}对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }


<#list refEntities as refEntity>
    <#include "controller/refEntity.ftl" >
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
                ${templateUtils.generateEntityPropertySetting(entity,property)}
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
            ${templateUtils.generateEntityPropertySetting(entity,property)}
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

<#if exportEnabled >
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
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
${entity.name}Service.exportToExcel(
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
</#if>
<#if importEnabled >
    /* 批量导入 */
    @RequestMapping(value="/importExcel",method=RequestMethod.GET)
    public String batchImport(Model model) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model, "无权访问");
        }
        model.addAttribute("ctrlUrl", CONTROLLER_URL);
        return jspPrefix + "${entity.name}-import";
    }


    @RequestMapping(value="importExcel",method = RequestMethod.POST)
    public String doBatchImport(Model model,MultipartFile file) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model, "无权访问");
        }
        try {
            ${entity.name}Service.importFromExcel(file.getInputStream(),EXCEL_START_ROW,EXCEL_START_COL);
            model.addAttribute("importOk",true);
        } catch (Exception e) {
            model.addAttribute("importOk",false);
            model.addAttribute("reason",e.getMessage());
            logger.error("批量导入${entity.classInfo.name}对象失败:", e);
        }
        return jspPrefix + "${entity.name}-import-result";
    }
</#if>
}
</#compress>