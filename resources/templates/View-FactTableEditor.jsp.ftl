<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="${"$"}{baseDir}/"/>
    <title>${factTableEntity.chineseAlias}管理</title>
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

</head>
<div class="box2" panelTitle="查询开通申请" id="searchPanel" statusType="none" >
    <form id="queryForm">
        <table class="tableStyle" formMode="transparent">
            <#list indexedProperties as indexProperty>
                <tr>
                    <td>${indexProperty.chineseAlias}：</td>
                        <#if indexProperty.isReferenceProperty() >
                            <#assign refEntity=factTableEntity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                            <#if templateUtils.isDepartmentInfoType(refEntity)>
                                <td colspan="4">
                                    <div class="selectTree" url="${"$"}{baseDir}/${"$"}{ctrlUrl}/listDepartmentInfoTree"  id="${indexProperty.name}" name="${indexProperty.name}" relValue=""></div>
                                </td>
                            <#else>
                                <td colspan="4">
                                <select prompt="请选择${refEntity.chineseAlias}" id="${indexProperty.name}" name="${indexProperty.name}"></select>
                                </td>
                            </#if>
                        <#elseif templateUtils.isIntProperty(indexProperty) >
                            <td colspan="4">
                                <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" inputMode="numberOnly" />
                            </td>
                        <#elseif templateUtils.isNumberProperty(indexProperty) >
                            <td colspan="4">
                                <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" inputMode="positiveDecimal"/>
                            </td>
                        <#elseif templateUtils.isDateProperty(indexProperty) >
                            <td>查询开始日期</td>
                            <td><input type="text" id="start${indexProperty.name?cap_first}" name="start${indexProperty.name?cap_first}" class="date" style="width:200px;" dateFmt="yyyy-MM-dd"/></td>
                            <td>查询结束日期</td>
                            <td><input type="text" id="end${indexProperty.name?cap_first}" name="end${indexProperty.name?cap_first}" class="date" style="width:200px;" dateFmt="yyyy-MM-dd"/></td>
                        <#else>
                            <td colspan="4">
                                <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" />
                            </td>
                        </#if>
                </tr>
            </#list>
            <tr>
                <td colspan="5">
                    <button id="searchButton" type="button" onclick="searchHandler()"><span class="icon_find">查询</span></button>
                    <button type="button" onclick="resetSearch()"><span class="icon_reload">重置</span></button>
                </td>
            </tr>
        </table>
    </form>
</div>

<div class="padding_right5">
    <div id="dataGrid"></div>
</div>

<script type="text/javascript">
    //设定不可编辑的节点id
    var noeditArray = [];
    //grid
    var grid = null;
    var booleanData={list:[{key:"是",value:true},{key:"否",value:false}]}

    <#list refEntities as refEntity>
    var ${refEntity.name}Data={
        list:[]
    };
    </#list>

    function loadGridRenderData(url,list,name,refresh) {
        $.post(url,
                {refresh:refresh?"y":null},
                function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                    } else {
                        list.list=result.list;
                        if (list.list.length<=0) {
                            top.Dialog.alert("辅助数据"+name+"列表为空!<br />");
                        }
                        <#list indexedProperties as indexProperty>
                            <#if indexProperty.isReferenceProperty() >
                                <#assign refEntity=factTableEntity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
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

    function loadReferenceData(refresh){
    <#list refEntities as refEntity>
        loadGridRenderData("${"$"}{baseDir}/${"$"}{ctrlUrl}/list${refEntity.classInfo.name}",${refEntity.name}Data,"${refEntity.name}" ,refresh);
    </#list>
    }

    function initComplete() {
        //当提交表单刷新本页面时关闭弹窗
        top.Dialog.close();

        loadReferenceData(false);

        initGrid();

        $("#searchPanel").bind("stateChange", function (e, state) {
            grid.resetHeight();
        });
        $("#searchPanel").bind("click",function(e){
            grid.endEdit();
        });
    }

    function genHeaderRender(columnName){
        return function(column){
            return '<span style="float:left;padding-left:20px;">'+columnName+'</span><div style="float:right;padding-right:10px;width:20px;"><span class="img_pencel2 hand headerChangeBtn"></span></div><div class="clear"></div>'
        }
    }

    function initGrid(){
        grid = $("#dataGrid").quiGrid({
            columns: [
                { name: '${baseEntity.idProperty.name}', align: 'left', width: 120,isSort:false,display: '${baseEntity.idProperty.chineseAlias}'},
                { name: '${baseEntity.listHeaderProperty.name}', align: 'left', width: 120,type:'string',isSort:true,headerRender:genHeaderRender("${baseEntity.listHeaderProperty.chineseAlias}")},
                    <#if templateUtils.isIntProperty(factTableEntity.factTableInfo.valueProperty)  >
                        <#assign limit=",inputMode:\"numberOnly\",tip:\"请输入合法整数数字\"" >
                        <#assign sortType="int" >
                    <#elseif templateUtils.isNumberProperty(factTableEntity.factTableInfo.valueProperty)  >
                        <#assign limit=",inputMode:\"positiveDecimal\",tip:\"请输入合法数字\"" >
                        <#assign sortType="float" >
                    <#elseif templateUtils.isIntProperty(factTableEntity.factTableInfo.valueProperty)  >
                        <#assign limit="" />
                        <#assign sortType="string" >
                    <#else>
                    </#if>
                <c:forEach items="${"$"}{lst${propertyEntity.classInfo.name}}" var="${propertyEntity.name}">
                { name: 'prop_${"$"}{${propertyEntity.name}.${propertyEntity.idProperty.name}}',editor: { type: 'text' ${limit} },type:'${sortType}', align: 'left', width: 120,type:'string',isSort:true,headerRender:genHeaderRender("${"$"}{${propertyEntity.name}.${propertyEntity.listHeaderProperty.name}}")},
                </c:forEach>
                {
                    display: '操作', isAllowHide: false, align: 'left', width: 100,
                    render: function (rowdata, rowindex, value, column) {
                        return '<div class="padding_top4 padding_left5">'
                                + '</div>';
                    }
                }
            ],
            url:"${"$"}{baseDir}/${"$"}{ctrlUrl}/list", params:[
    <#list indexedProperties as indexProperty>
        <#if templateUtils.isDateProperty(indexProperty) >
                {name:"start${indexProperty.name?cap_first}",value: ""},
                {name:"end${indexProperty.name?cap_first}",value: ""}
        <#else>
                {name:"${indexProperty.name}", value: ""}
        </#if><#sep>,</#sep>
    </#list>
            ], sortName: '${baseEntity.idProperty.name}', rownumbers: true, checkbox: false,
            height: '100%', width: "100%", pageSize: 50, percentWidthMode: false,sortOrder:'asc',
            onSuccess: onSuccess, onError: onError, dataAction:'server',enabledEdit: true,
            onBeforeEdit: onBeforeEdit, onBeforeSubmitEdit: onBeforeSubmitEdit,
            onAfterEdit: onAfterEdit, excelMode:true
        });
    }

    function onSuccess(data,grid) {
        if(data && data.reason) {
            top.Dialog.alert("读取数据失败, 原因:"+data.reason);
        }
    }

    function onError(XMLHttpRequest, textStatus, errorThrown){
        top.Dialog.alert("读取数据失败:"+result.textStatus);
    }

    function getData(refresh){
        grid.setOptions({
            params:[
            <#list indexedProperties as indexProperty>
                <#if indexProperty.isReferenceProperty() >
                    <#assign refEntity=baseEntity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                    <#if templateUtils.isDepartmentInfoType(refEntity)>
                {name:"${indexProperty.name}",value:$('#${indexProperty.name}').attr('relValue')}
                    <#else>
                {name:"${indexProperty.name}", value: $('#${indexProperty.name}').val()}
                    </#if>
                <#elseif templateUtils.isDateProperty(indexProperty) >
                {name:"start${indexProperty.name?cap_first}",value: $('#start${indexProperty.name?cap_first}').val()},
                {name:"end${indexProperty.name?cap_first}",value: $('#end${indexProperty.name?cap_first}').val()}
                <#else>
                {name:"${indexProperty.name}", value: $('#${indexProperty.name}').val()}
                </#if><#sep>,</#sep>
            </#list>
            ]
        })
        grid.setNewPage(1);
        grid.loadData();
    }


    //查询
    function searchHandler() {
        grid.setNewPage(1);
        getData(false);
    }

    //重置查询
    function resetSearch() {
        $("#queryForm")[0].reset();
        $('#searchButton').click();
    }

    //编辑前事件,可阻止某些行或列进行编辑
    // 列名：e.column.name
    // 行号：e.rowindex
    // 编辑前的值 e.value
    function onBeforeEdit(e)
    {
    }
    //编辑提交前事件
    // 列名：e.column.name
    // 行号：e.rowindex
    // 编辑前的值 e.value
    function onBeforeSubmitEdit(e){
    }

    //
    //
    // 行号：e.rowindex
    //
    /**
     *  编辑后事件，用于ajax提交处理
     *  列名：e.column.name
     *  行号：e.rowindex
     *  编辑前的值 e.value
     * @param e
     */
    function onAfterEdit(e)
    {
        var obj={
            ${factTableEntity.factTableInfo.entityKeyProperty.name}:e.record.${baseEntity.idProperty.name},
            ${factTableEntity.factTableInfo.propertyKeyProperty.name}:e.column.columnname.substr(5),
            ${factTableEntity.factTableInfo.valueProperty.name}: e.value
        };
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/update",obj,function(result){
            if(result && result.result && result.result=="Success"){
                var cell = grid.getCellObj(obj, e.column);
                $(cell).removeClass("l-grid-row-cell-edited");
            } else if (result && result.reason) {
                top.Dialog.alert("更新失败，原因:"+result.reason);
                getData();
            } else {
                top.Dialog.alert("更新失败");
                getData();
            }
        },"json").error(function() {
            top.Dialog.alert("更新失败")
        });

    }


</script>
</body>
</html>