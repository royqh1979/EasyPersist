<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="${"$"}{baseDir}/"/>
    <title>${entity.chineseAlias}查询</title>
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
<div class="box2" panelTitle="查询开通申请" id="searchPanel">
    <form id="queryForm">
        <table class="tableStyle" formMode="transparent">
            <#list indexedProperties as indexProperty>
                <tr>
                    <td>${indexProperty.chineseAlias}：</td>
                        <#if indexProperty.isReferenceProperty() >
                            <#assign refEntity=entity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
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

    function loadReferenceData(refresh){
    <#list refEntities as refEntity>
        loadGridRenderData("${"$"}{baseDir}/${"$"}{ctrlUrl}/list${refEntity.classInfo.name}",${refEntity.name}Data,"${refEntity.name}" ,refresh);
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

    function initComplete() {
        //当提交表单刷新本页面时关闭弹窗
        top.Dialog.close();

        loadReferenceData(false);

        initGrid();

        $("#searchPanel").bind("stateChange", function (e, state) {
            grid.resetHeight();
        });
    }

    function initGrid(){
        grid = $("#dataGrid").quiGrid({
            columns: [
            <#list entity.properties as property>
                <#if ! (property.name == entity.idProperty.name) >
                    <#if property.isReferenceProperty()>
                        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                        {display: '${property.chineseAlias}', name: '${property.name}',align: 'left', width: "120",type:'string',render:render${property.name?cap_first}},
                    <#elseif templateUtils.isBooleanProperty(property) >
                        { display: '${property.chineseAlias}',name: '${property.name}', align: 'left', width: 120,type:'string',render:render${property.name?cap_first}},
                    <#else >
                        <#if templateUtils.isIntProperty(property) >
                            <#assign sortType="int" >
                        <#elseif templateUtils.isNumberProperty(property) >
                            <#assign sortType="float" >
                        <#elseif property.isTemporal()>
                            <#assign sortType='date' >
                        <#else>
                            <#assign sortType="string" >
                        </#if>
                        {display: '${property.chineseAlias}', name: '${property.name}',type:'${sortType}',align: 'left', width: "120"},
                    </#if>
                </#if>
            </#list>
                {
                    display: '操作', isAllowHide: false, align: 'left', width: 100,
                    render: function (rowdata, rowindex, value, column) {
                        return '<div class="padding_top4 padding_left5">'
                                + '<span class="img_edit hand" title="修改" onclick="onEdit(' + rowdata.${entity.idProperty.name} + ')"></span>'
                                + '<span class="img_delete hand" title="删除" onclick="onDelete(' + rowdata.${entity.idProperty.name} + ',' + rowindex + ')"></span>'
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
            ], sortName: '${entity.idProperty.name}', rownumbers: true, checkbox: true,
            height: '100%', width: "100%", pageSize: 50, percentWidthMode: false,sortOrder:'asc',
            onSuccess: onSuccess, onError: onError, dataAction:'server',
            toolbar: {
                items: [
                    {text: '新增', click: addUnit, iconClass: 'icon_add'},
                    {line: true},
                    {text: '导出excel', click: exportToExcel, iconClass: 'icon_export'},
                    {line: true},
                    {text: '批量删除', click: onBatchDelete, iconClass: 'icon_delete'}
                ]
            }
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
                    <#assign refEntity=entity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
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

    function exportToExcel() {
        var url="${"$"}{baseDir}/${"$"}{ctrlUrl}/exportList";
        var iframe = $('<iframe id="down-file-iframe" ></iframe>');
        var form = $('<form target="down-file-iframe"></form>');
        form.attr('action', url + "?rand=" + Math.random());
        form.attr('method', 'post');
        var input;
    <#list indexedProperties as indexProperty>
        <#if templateUtils.isDateProperty(indexProperty) >
        input= $('<input type="text" />');
        input.attr('name', "start${indexProperty.name?cap_first}");
        input.attr('value', $('#start${indexProperty.name?cap_first}').val());
        form.append(input);
        input= $('<input type="text" />');
        input.attr('name', "end${indexProperty.name?cap_first}");
        input.attr('value', $('#end${indexProperty.name?cap_first}').val());
        form.append(input);
        <#else>
        input= $('<input type="text" />');
        input.attr('name', "${indexProperty.name}");
            <#if indexProperty.isReferenceProperty() >
                <#assign refEntity=entity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                <#if templateUtils.isDepartmentInfoType(refEntity)>
        input.attr('value', $('#${indexProperty.name}').attr('relValue'));
                <#else>
        input.attr('value', $('#${indexProperty.name}').val());
                </#if>
            <#else>
        input.attr('value', $('#${indexProperty.name}').val());
            </#if>
        form.append(input);
        </#if>
    </#list>
        input= $('<input type="text" />');
        input.attr('name', "sort");
        input.attr('value', grid.options.sortName);
        form.append(input);
        input= $('<input type="text" />');
        input.attr('name', "direction");
        input.attr('value', grid.options.sortOrder);
        form.append(input);
        form.appendTo('body');
        iframe.appendTo('body');
        form.submit();
        iframe.remove();
        form.remove();
    }

    //新增
    function addUnit() {
        window.open("${"$"}{baseDir}/${"$"}{ctrlUrl}/create");
        /*
        top.Dialog.open({
            URL: "${"$"}{baseDir}/${"$"}{ctrlUrl}/create",
            Title: "添加", Width: 500, Height: 350
        });*/
    }

    //修改
    function onEdit(id) {
        window.open("${"$"}{baseDir}/${"$"}{ctrlUrl}/update/"+id);
        /*
        top.Dialog.open({
            URL: "${"$"}{baseDir}/${"$"}{ctrlUrl}/update/"+rowid,
            Title: "修改", Width: 500, Height: 350
        });
        */
    }
    //删除
    function onDelete(rowid, rowidx) {
        top.Dialog.confirm("确定要删除该记录吗？", function () {
            //删除记录
            var row = grid.getRow(rowidx)
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/delete",
                    {"${entity.idProperty.name}": row.${entity.idProperty.name}},
                    function (result) {
                        handleResult(result);
                    }, "json");
            //刷新表格
            grid.loadData();
        });
    }


    //批量删除
    function onBatchDelete() {
        var rows = grid.getSelectedRows();
        var rowsLength = rows.length;

        if (rowsLength == 0) {
            top.Dialog.alert("请选中要删除的记录!");
            return;
        }
        var ${entity.idProperty.name}s=[];
        for(var index in rows){
            ${entity.idProperty.name}s.push(rows[index].${entity.idProperty.name});
        }
        top.Dialog.confirm("确定要删除吗？", function () {
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/batchDelete",
                    //获取所有选中行
                    {"${entity.idProperty.name}s":${entity.idProperty.name}s},
                    function (result) {
                        handleResult(result.status);
                    },
                    "json");
        });
    }
    //删除后的提示
    function handleResult(result) {
        if(result && result.result && result.result=="Success"){
            //成功
            getData(false);
        } else if (result && result.reason) {
            top.Dialog.alert("删除失败，原因:"+result.reason);
        } else {
            top.Dialog.alert("删除失败");
        }
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

</script>
</body>
</html>