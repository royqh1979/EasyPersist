<#compress>
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

<#list importTypes as type>
import ${type};
</#list>

@Controller
@RequestMapping(${factTableEntity.classInfo.name}Controller.CONTROLLER_URL)
public class ${factTableEntity.classInfo.name}Controller {
    @Autowired
    private ${factTableEntity.classInfo.name}Service ${factTableEntity.name}Service;
    @Autowired
    private ${baseEntity.classInfo.name}Service ${baseEntity.name}Service;
    @Autowired
    private ${propertyEntity.classInfo.name}Service ${propertyEntity.name}Service;
    <#list refEntities as refEntity>
    <#if templateUtils.isDepartmentInfoType(refEntity)>
    @Autowired
    private DepartmentService ${refEntity.name}Service;
    <#elseif templateUtils.isFileInfoType(refEntity) >
    @Autowired
    private FileService ${refEntity.name}Service;
    <#else >
    @Autowired
    private ${refEntity.classInfo.name}Service ${refEntity.name}Service;
    </#if>
    </#list>
    private Logger logger = LoggerFactory.getLogger(${factTableEntity.classInfo.name}Controller.class);
    private static final String jspPrefix= "";
    public static final String CONTROLLER_URL = "codes/${factTableEntity.name}";

    private static final String[] VALID_ROLES={"ROLE_UNKNOWN1"};

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {
        /* 判断当前用户是否有权访问 */
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return TaskRedirector.errorExit(model,"无权访问");
        }
        List<${propertyEntity.classInfo.name}> lst${propertyEntity.classInfo.name} = ${propertyEntity.name}Service.listAll(false);
        model.addAttribute("lst${propertyEntity.classInfo.name}",lst${propertyEntity.classInfo.name});
        model.addAttribute("ctrlUrl",CONTROLLER_URL);
        return jspPrefix+"${factTableEntity.name}";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,
        produces = "application/json")
    @ResponseBody
    public Object update(@RequestParam("${factTableEntity.factTableInfo.entityKeyProperty.name}") ${factTableEntity.factTableInfo.entityKeyProperty.type} ${factTableEntity.factTableInfo.entityKeyProperty.name}  ,
        @RequestParam("${factTableEntity.factTableInfo.propertyKeyProperty.name}") ${factTableEntity.factTableInfo.propertyKeyProperty.type} ${factTableEntity.factTableInfo.propertyKeyProperty.name},
        @RequestParam("${factTableEntity.factTableInfo.valueProperty.name}") ${factTableEntity.factTableInfo.valueProperty.type} ${factTableEntity.factTableInfo.valueProperty.name} ) {
        if (!SpringSecurityHelper.currentUserHasAnyRoles(VALID_ROLES)) {
            return new Result(ProcessingResultType.Fail, "无权访问");
        }
        try {
            ${factTableEntity.classInfo.name} ${factTableEntity.name} = new ${factTableEntity.classInfo.name}();
            ${factTableEntity.name}.${factTableEntity.factTableInfo.entityKeyProperty.setter}(${factTableEntity.factTableInfo.entityKeyProperty.name});
            ${factTableEntity.name}.${factTableEntity.factTableInfo.propertyKeyProperty.setter}(${factTableEntity.factTableInfo.propertyKeyProperty.name});
            ${factTableEntity.name}.${factTableEntity.factTableInfo.valueProperty.setter}(${factTableEntity.factTableInfo.valueProperty.name});
            ${factTableEntity.name}Service.update(${factTableEntity.name});
            return new ResultWithEntity<>(ProcessingResultType.Success, ${factTableEntity.name});
        } catch (Exception e){
            logger.error("更新${factTableEntity.classInfo.name}对象失败:", e);
            if (logger.isDebugEnabled()) {
                logger.debug("${factTableEntity.classInfo.name}.${factTableEntity.factTableInfo.entityKeyProperty.name}:" + ${factTableEntity.factTableInfo.entityKeyProperty.name});
                logger.debug("${factTableEntity.classInfo.name}.${factTableEntity.factTableInfo.propertyKeyProperty.name}:" + ${factTableEntity.factTableInfo.propertyKeyProperty.name});
                logger.debug("${factTableEntity.classInfo.name}.${factTableEntity.factTableInfo.valueProperty.name}:" + ${factTableEntity.factTableInfo.valueProperty.name});
            }
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }


    @RequestMapping(value = "/list", method = RequestMethod.POST,
            produces = "application/json")
    @ResponseBody
    public Object list(<#list indexedProperties as indexProperty>
    <#if templateUtils.isDateProperty(indexProperty) >@RequestParam("start${indexProperty.name?cap_first}") String start${indexProperty.name?cap_first}Val,
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
            pager.setTotalRows(${baseEntity.name}Service.countAll(<#list indexedProperties as indexProperty>
                <#if templateUtils.isDateProperty(indexProperty) >
                    start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
                <#else >${indexProperty.name}Var</#if><#sep>,</#sep></#list>));
            List<${baseEntity.classInfo.name}> lst${baseEntity.classInfo.name} = ${baseEntity.name}Service.findAll(<#list indexedProperties as indexProperty>    <#if templateUtils.isDateProperty(indexProperty) >
    start${indexProperty.name?cap_first}Var,end${indexProperty.name?cap_first}Var
    <#else >${indexProperty.name}Var</#if>,</#list>orderBy, sortType, pager);
            List<Map<String,Object>> lstFactTables=${factTableEntity.name}Service.findFactTables(lst${baseEntity.classInfo.name});
            Grid<Map<String,Object>> result = new Grid<>(pager, lstFactTables, orderBy, sortType);
            return result;
        } catch (RuntimeException e) {
            logger.error("获取${factTableEntity.classInfo.name}组装的fact table对象列表失败:", e);
            return new Result(ProcessingResultType.Fail, e.getMessage());
        }
    }

<#list refEntities as refEntity>
    <#include "controller/refEntity.ftl" >
</#list>

}
</#compress>