<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="${"$"}{baseDir}/"/>
    <title>${entity.chineseAlias}编辑</title>
    <!--框架必需start-->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/jquery.js"></script>
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/language/cn.js"></script>
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/framework.js"></script>
    <link href="${"$"}{baseDir}/qui/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" id="skin" prePath="${"$"}{baseDir}/qui/"/>
    <link rel="stylesheet" type="text/css" id="customSkin"/>
    <!--框架必需end-->

    <!--数据表格start-->
    <script src="${"$"}{baseDir}/qui/libs/js/table/quiGrid.js" type="text/javascript"></script>
    <!--数据表格end-->

    <!-- 日期选择框start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/datePicker/WdatePicker.js"></script>
    <!-- 日期选择框end -->

    <!-- 数字步进器start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/stepper.js"></script>
    <!-- 数字步进器end -->

    <!-- 树组件start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/tree/ztree/ztree.js"></script>
    <link type="text/css" rel="stylesheet" href="${"$"}{baseDir}/qui/libs/js/tree/ztree/ztree.css"></link>
    <!-- 树组件end -->

    <!-- 树形下拉框start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/selectTree.js"></script>
    <!-- 树形下拉框end -->

    <!-- 表单验证start -->
    <script src="${"$"}{baseDir}/qui/libs/js/form/validationRule.js" type="text/javascript"></script>
    <script src="${"$"}{baseDir}/qui/libs/js/form/validation.js" type="text/javascript"></script>
    <!-- 表单验证end -->

    <!--自动提示框start-->
    <script type='text/javascript' src='${"$"}{baseDir}/qui/libs/js/form/suggestion.js'></script>
    <!--自动提示框end-->

    <!-- 日期选择框start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/datePicker/WdatePicker.js"></script>
    <!-- 日期选择框end -->

    <!-- form js -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/form.js"></script>
    <!-- form js -->

</head>
<c:choose>
    <c:when test="${"$"}{isUpdate}" >
        <c:set var="title" value="更新${entity.chineseAlias}" />
    </c:when>
    <c:otherwise>
        <c:set var="title" value="新建${entity.chineseAlias}" />
    </c:otherwise>
</c:choose>
<body>
    <form id="updateForm">
        <input type="hidden" id="${entity.idProperty.name}" name="${entity.idProperty.name}" />
        <table class="tableStyle" formMode="transparent">
        <#list entity.properties as property>
            <#if property.name!=entity.idProperty.name>
                <tr>
                    <td>${property.chineseAlias}：</td>
                    <td>
                    <#if property.isReferenceProperty() >
                        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                        <#if templateUtils.isDepartmentInfoType(refEntity) >
                            <div class="selectTree" url="${"$"}{baseDir}/${"$"}{ctrlUrl}/listDepartmentInfoTree"  id="${property.name}" name="${property.name}"></div>
                        <#else>
                            <select prompt="请选择${refEntity.chineseAlias}" id="${property.name}" name="${property.name}" relValue=""></select>
                        </#if>
                    <#elseif templateUtils.isBooleanProperty(property) >
                        <select prompt="${property.chineseAlias}" id="${property.name}" name="${property.name}" ></select>
                    <#elseif templateUtils.isIntProperty(property) >
                        <input type="text" id="${property.name}" name="${property.name}" style="width:200px;" inputMode="numberOnly"  watermark="请输入合法整数"/>
                    <#elseif templateUtils.isNumberProperty(property) >
                        <input type="text" id="${property.name}" name="${property.name}" style="width:200px;" inputMode="positiveDecimal"  watermark="请输入合法数字"/>
                    <#elseif templateUtils.isDateProperty(property) >
                        <input type="text" id="${property.name}" name="${property.name}" class="date" style="width:200px;" dateFmt="yyyy-MM-dd"/>
                    <#else>
                        <input type="text" id="${property.name}" name="${property.name}" style="width:200px;" />
                    </#if>
                    </td>
                </tr>
            </#if>
        </#list>
            <tr>
                <td colspan="2">
                    <button id="update" type="button" onclick="updateHandler()"><span class="icon_find">保存</span></button>
                </td>
            </tr>
        </table>
    </form>

<script type="text/javascript">
    var isUpdate=${"$"}{isUpdate?"true":"false"};

    var id;
    <c:if test="${"$"}{isUpdate}">
    id=${"$"}{id};
    </c:if>
    var booleanData={list:[{key:"是",value:true},{key:"否",value:false}]};
    <#list refEntities as refEntity>
    var ${refEntity.name}Data={
        list:[]
    };
    </#list>

    <#list entity.properties as property>
    var ${property.name}FormCtrl;
    </#list>

    function loadReferenceData(url, list, name, refresh) {
        $.post(url,
                {refresh:refresh?"y":null},
                function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                    } else {
                        list.list=result.list;
                        if (list.list.length <= 0) {
                            top.Dialog.alert("辅助数据"+name+"列表为空!<br />");
                        }
                    <#list indexedProperties as indexProperty>
                        <#if indexProperty.isReferenceProperty() >
                            <#assign refEntity=entity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                            <#if !templateUtils.isDepartmentInfoType(refEntity)>
                            if (name == '${refEntity.name}') {
                                var ctrl=$("#${indexProperty.name}");
                                ctrl.data("data",list);
                                //刷新下拉框
                                ctrl.render();
                            }
                            </#if>
                        </#if>
                    </#list>
                    }
                },"json").error(function() {
            top.Dialog.alert("读取数据失败")
        });
    }

    function loadAllReferenceData(refresh){
    <#list refEntities as refEntity>
        loadReferenceData("${"$"}{baseDir}/${"$"}{ctrlUrl}/list${refEntity.classInfo.name}",${refEntity.name}Data,"${refEntity.name}" ,refresh);
    </#list>
    }

    <#list entity.properties as property>
        <#if property.isReferenceProperty() >
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>

    function render${property.name?cap_first}(item) {
        if (item==null) {
            return "未选择";
        }
        for (var i = 0; i < ${refEntity.name}Data.list.length; i++) {
            if (${refEntity.name}Data.list[i].value == item.${property.name})
                return ${refEntity.name}Data.list[i].key;
        }
        return "未选择";
    }
        <#elseif templateUtils.isBooleanProperty(property)>
    function render${property.name?cap_first}(item) {
        if (item==null) {
            return "未选择";
        }
        if (item.${property.name}.toString()=="true") {
            return "是";
        }
        return "否";
    }
        </#if>
    </#list>

    function initBooleans() {
        <#list entity.properties as property>
            <#if templateUtils.isBooleanProperty(property) >
                ${property.name}FormCtrl[0].data=booleanData;
            </#if>
        </#list>
    }

    function initComplete() {

    <#list entity.properties as property>
        ${property.name}FormCtrl=$("#updateForm #${property.name}");
    </#list>

        loadAllReferenceData(false);
        initBooleans();

        if (isUpdate) {
            retrieveEntity(${"$"}{id});
        }

    }

    /* 填写updateForm */
    function retrieveEntity(id) {
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/retrieve/"+id,
                { },
                function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                    } else {
                        var obj=result.entity;
                        entityToForm(obj);
                    }
                },"json").error(function() {
            top.Dialog.alert("读取数据失败")
        });
    }

    function validateEntity(e){
    <#list entity.properties as property>
        <#if property!=entity.idProperty>
            <#if property.isReferenceProperty()>
                if (render${property.name?cap_first}(e)=="未选择"){
                    top.Dialog.alert("${property.chineseAlias}必须选择！",null,null,null,2);
                    return false;
                }
            <#else>
                <#if !(property.column.nullable) >
                    if(e.${property.name}==""){
                        top.Dialog.alert("${property.chineseAlias}不能为空！",null,null,null,2);
                        return false;
                    }
                </#if>
            </#if>
        </#if>
    </#list>
        return true;
    }

    //查询
    function updateHandler() {
        var entity=formToEntity(entity);
        var updateUrl;
        if (!validateEntity(entity)){
             return;
        }
        if (isUpdate) {
            updateUrl="${"$"}{baseDir}/${"$"}{ctrlUrl}/update"
        } else {
            updateUrl="${"$"}{baseDir}/${"$"}{ctrlUrl}/create";
        }
        $.post(updateUrl,
            entity,
            function(result){
                if(result && result.reason) {
                    top.Dialog.alert("数据创建/更新失败, 原因:"+result.reason);
                } else {
                    var obj=result.entity;
                    entityToForm(obj);
                    if (parent && parent.opener) {
                        parent.opener.location.reload();
                    }
                    top.Dialog.alert("创建/更新成功",null,null,null,2)
                    if (!isUpdate) {
                        top.location.href="${"$"}{baseDir}/${"$"}{ctrlUrl}/update/"+id;
                    }
                }
            },"json").error(function() {
                top.Dialog.alert("数据创建/更新失败");
            });
    }

    function formToEntity() {
        return {
    <#list entity.properties as property>
        <#if templateUtils.isBooleanProperty(property)>
        ${property.name}:${property.name}FormCtrl.val().toString()=="true" ? "y": "n"
        <#elseif property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
            <#if templateUtils.isDepartmentInfoType(refEntity)>
        ${property.name}:${property.name}FormCtrl.attr('relValue')
            <#else>
        ${property.name}: ${property.name}FormCtrl.val()
            </#if>
        <#else>
        ${property.name}: ${property.name}FormCtrl.val()
        </#if>
        <#sep>,</#sep>
    </#list>
        };
    }

    function entityToForm(entity) {
        id=entity.${entity.idProperty.name};
        <#list entity.properties as property>
            <#if templateUtils.isBooleanProperty(property) || property.isReferenceProperty() >
                ${property.name}FormCtrl.setValue(entity.${property.name});
            <#else>
                ${property.name}FormCtrl.val(entity.${property.name});
            </#if>
        </#list>
    }

</script>
</body>
</html>