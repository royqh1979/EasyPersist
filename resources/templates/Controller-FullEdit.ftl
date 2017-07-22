import ${entity.classInfo.qualifiedName};
import cn.edu.bjfu.smartforestry.view.ProcessingResultType;
import cn.edu.bjfu.smartforestry.view.utils.Result;
import cn.edu.bjfu.smartforestry.view.utils.ResultWithEntity;
import com.qui.base.Grid;
import com.qui.base.ListForSelect;
import com.qui.base.Pager;
import com.qui.base.SortType;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import net.royqh.lang.DateTools;

import java.util.List;
import java.util.Date;

<#list typeList as type>
import ${type};
</#list>

@Controller
@RequestMapping("codes/${entity.name}")
public class ${entity.classInfo.name}Controller {
    @Autowired
    private ${entity.classInfo.name}Service ${entity.name}Service;
    <#list refEntities as refEntity>
    @Autowired
    private ${refEntity.classInfo.name}Service ${refEntity.name}Service;
    </#list>
    <#list entity.subEntities as subEntityInfo>
        <#assign subEntity=subEntityInfo.subEntity >
    @Autowired
    private ${subEntity.classInfo.name}Service ${subEntity.name}Service;
    </#list>
    private Logger logger = LoggerFactory.getLogger(${entity.classInfo.name}Controller.class);
    private static final String jspPrefix= "";
    private static final String pathPrefix = "codes/";

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
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

    <#list entity.subEntities as subEntityInfo>
    <#assign subEntity=subEntityInfo.subEntity >
    <#assign subRefProperty= subEntityInfo.subEntityReferenceProperty >
    @RequestMapping(value = "/list${subEntity.classInfo.name}ForGrid", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object list${subEntity.classInfo.name}ForGrid(
        @RequestParam("${subRefProperty.name}") String ${subRefProperty.name}Val,
        @RequestParam("pager.pageNo") int pageNo,
        @RequestParam("pager.pageSize") int pageSize,
        @RequestParam("sort") String orderBy,
        @RequestParam("direction") SortType sortType) {
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
    </#list>

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

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public String createUI(Model model) {
        ${entity.classInfo.name} ${entity.name}=new ${entity.classInfo.name}();
        ${entity.name}.${entity.idProperty.setter}(0);
        model.addAttribute("${entity.name}",${entity.name});
        model.addAttribute("isUpdate",false);
        model.addAttribute("isSeperateMode",true);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return  jspPrefix+"${entity.name}-update";
    }

    @RequestMapping(value="/update/$id", method = RequestMethod.GET)
    public String updateUI(Model model, @PathVariable("id")int id) {
        ${entity.classInfo.name} ${entity.name}=${entity.name}Service.retrieve(id);
        if (${entity.name}==null) {
            throw new RuntimeException("找不到id为"+id+"的对象");
        }
        model.addAttribute("${entity.name}",${entity.name});
        model.addAttribute("isUpdate",true);
        model.addAttribute("id",id);
        model.addAttribute("isSeperateMode",true);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return  jspPrefix+"${entity.name}-update";
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
        try {
            ${entity.classInfo.name} ${entity.name} = new ${entity.classInfo.name}();
            ${entityPropertySettings}
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
        try {
            ${entity.classInfo.name} ${entity.name} = ${entity.name}Service.retrieve(${entity.idProperty.name}Val);
            if (${entity.name} == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("找不到${entity.idProperty.name}为" + ${entity.idProperty.name}Val + "的${entity.classInfo.name}对象");
                }
                return new Result(ProcessingResultType.Fail, "找不到${entity.idProperty.name}为" + ${entity.idProperty.name}Val + "的${entity.classInfo.name}对象");
            }
            ${entityPropertySettings}
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
    public Object create(@PathVariable("id")  ${entity.idProperty.type} ${entity.idProperty.name}Val) {
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