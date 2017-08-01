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
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

<#list typeList as type>
import ${type};
</#list>

@Controller
@RequestMapping("codes/${entity.name}")
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

<#list refEntities as refEntity>
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
        model.addAttribute("isUpdate",false);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return  jspPrefix+"${entity.name}-edit";
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.GET)
    public String updateUI(Model model, @PathVariable("id")int id) {
        model.addAttribute("isUpdate",true);
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return  jspPrefix+"${entity.name}-edit";
    }

    @RequestMapping(value="/editUI-create", method = RequestMethod.GET)
    public String subEditUIForCreate(Model model) {
        model.addAttribute("isUpdate",false);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return  jspPrefix+"${entity.name}-edit-entity";
    }

    @RequestMapping(value="/editUI-update/{id}", method = RequestMethod.GET)
    public String subEditUIForUpdate(Model model, @PathVariable("id")int id) {
        model.addAttribute("isUpdate",true);
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
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


<#list entity.subEntities as subEntityInfo>
    <#assign subEntity=subEntityInfo.subEntity >
    <#assign subRefProperty= subEntityInfo.subEntityReferenceProperty >
    @RequestMapping(value="/editUI-sub-${subEntity.name}/{id}", method = RequestMethod.GET)
    public String subEditUIFor${subEntity.classInfo.name}(Model model, @PathVariable("id")int id) {
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
</#list>

<#list entity.mapRelationInfos as relationInfo>
    <#assign mapEntity=entity.getMappingRepository().findEntityByClass(relationInfo.mappingEntityFullClassName) >
    @RequestMapping(value="/editUI-mapping-${mapEntity.name}/{id}", method = RequestMethod.GET)
    public String mappingEditUIFor${mapEntity.classInfo.name}(Model model, @PathVariable("id")int id) {
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
        return  jspPrefix+"${entity.name}-mapping-${mapEntity.name}";
    }

    @RequestMapping(value="/editUI-mapping-add-${mapEntity.name}/{id}", method = RequestMethod.GET)
    public String mappingAddEditUIFor${mapEntity.classInfo.name}(Model model, @PathVariable("id")int id) {
        model.addAttribute("id",id);
        model.addAttribute("ctrlUrl",pathPrefix+"${entity.name}");
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
        @RequestParam("${mapEntity.name}Ids[]") List<Integer> ${mapEntity.name}Ids
    ) {
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

    <#assign mapIndexedProperties=generator.getIndexedProperties(mapEntity)>
    @RequestMapping(value = "/list${mapEntity.classInfo.name}ForAdd", method = RequestMethod.POST,
    produces = "application/json")
    @ResponseBody
    public Object list${mapEntity.classInfo.name}ForAdd(<#list mapIndexedProperties as indexProperty>
    <#if generator.isDateProperty(indexProperty) >@RequestParam("start${indexProperty.name?cap_first}") String start${indexProperty.name?cap_first}Val,
        @RequestParam("end${indexProperty.name?cap_first}") String end${indexProperty.name?cap_first}Val,
    <#else>@RequestParam("${indexProperty.name}")String ${indexProperty.name}Val,</#if></#list>
        @RequestParam("mapping-id") int mappingId) {
        try {<#list mapIndexedProperties as indexProperty>
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
            List<${mapEntity.classInfo.name}> ${mapEntity.name}List = ${entity.name}Service.find${mapEntity.classInfo.name}ForAdd(<#list mapIndexedProperties as indexProperty>
    <#if generator.isDateProperty(indexProperty) >
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
</#list>
}