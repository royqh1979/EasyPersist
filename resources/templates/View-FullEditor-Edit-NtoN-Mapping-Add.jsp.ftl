<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="${"$"}{baseDir}/"/>
    <title>${mapRelationEntity.chineseAlias}</title>

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

    <!--基本选项卡start-->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/nav/basicTab.js"></script>
    <!--基本选项卡end-->

    <!-- form js -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/form.js"></script>
    <!-- form js -->

</head>
<body>
<div class="box2" panelTitle="查询${mapRelationEntity.chineseAlias}" id="searchPanel">
    <form id="queryForm">
        <table class="tableStyle" formMode="transparent">
        <#list indexedProperties as indexProperty>
            <tr>
                <td>${indexProperty.chineseAlias}：</td>
                <#if indexProperty.isReferenceProperty() >
                    <#assign refEntity=mapRelationEntity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                    <#if generator.isDepartmentInfoType(refEntity)>
                        <td colspan="4">
                            <div class="selectTree" url="${"$"}{baseDir}/${"$"}{ctrlUrl}/listDepartmentInfoTree"  id="${indexProperty.name}" name="${indexProperty.name}" relValue=""></div>
                        </td>
                    <#else>
                        <td colspan="4">
                            <select prompt="请选择${refEntity.chineseAlias}" id="${indexProperty.name}" name="${indexProperty.name}"></select>
                        </td>
                    </#if>
                <#elseif generator.isIntProperty(indexProperty) >
                    <td colspan="4">
                        <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" inputMode="numberOnly"  watermark="请输入合法整数"/>
                    </td>
                <#elseif generator.isNumberProperty(indexProperty) >
                    <td colspan="4">
                        <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" inputMode="positiveDecimal"  watermark="请输入合法数字"/>
                    </td>
                <#elseif generator.isDateProperty(indexProperty) >
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
    var id=${"$"}{id};
    var booleanData={list:[{key:"是",value:true},{key:"否",value:false}]};
    <#list refEntities as refEntity>
    var ${refEntity.name}Data={
        list:[]
    };
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
                            <#assign refEntity=mapRelationEntity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                            <#if !generator.isDepartmentInfoType(refEntity)>
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

    function initComplete() {

        loadAllReferenceData(false);

        initGrid();

    }

    var grid = null;

    <#list mapRelationEntity.properties as property>
        <#if property.isReferenceProperty() >
            <#assign refEntity=mapRelationEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>

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
        <#elseif generator.isBooleanProperty(property)>
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


    function initGrid(){
        grid = $("#dataGrid").quiGrid({
            columns: [
            <#list mapRelationEntity.properties as property>
                <#if property == mapRelationEntity.idProperty  >
                <#else>
                    <#if property.isReferenceProperty()>
                        <#assign refEntity=mapRelationEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                        <#if refEntity!=mapRelationEntity>
                            <#if generator.isDepartmentInfoType(refEntity)>
                                { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,type:'string',isSort:true,render:render${property.name?cap_first}},
                            <#else>
                                { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,type:'string',isSort:true,render:render${property.name?cap_first}},
                            </#if>
                        </#if>
                    <#elseif generator.isBooleanProperty(property) >
                        { display: '${property.chineseAlias}',name: '${property.name}', align: 'left', width: 120,type:'string',isSort:true,render:render${property.name?cap_first}},
                    <#else>
                        <#if generator.isIntProperty(property) >
                            <#assign sortType="int" >
                        <#elseif generator.isNumberProperty(property) >
                            <#assign sortType="float" >
                        <#elseif property.isTemporal()>
                            <#assign sortType='date' >
                        <#else>
                            <#assign sortType="string" >
                        </#if>
                        { display: '${property.chineseAlias}', name: '${property.name}', type:'${sortType}',align: 'left', width: 120,isSort:true},
                    </#if>
                </#if>
            </#list>
                { display: '操作', isSort: false, width: 200, render: function (rowdata, rowindex, value, column) {
                    return '<div class="padding_top4 padding_left5">'
                            + '<span class="img_add hand" title="修改" onclick="onAdd(' + rowdata.${mapRelationEntity.idProperty.name} + ')"></span>'
                            + '</div>';
                }
                }
            ],
            data:[], sortName: '${mapRelationEntity.idProperty.name}', rownumbers: true, checkbox: true,
            height: '100%', width: "100%", percentWidthMode: false,sortOrder:'asc',
            enabledEdit: false,clickToEdit: false,usePager:false , isScroll: false,
            onReload: onReload, dataAction:'local',
            toolbar: {
                items: [
                    {text: '新增', click: onBatchAdd, iconClass: 'icon_add'}
                ]
            }
        });

        getData(false);
    }

    function onReload() {
        getData(false);
    }

    function getData(refresh){
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/list${mapRelationEntity.classInfo.name}ForAdd",
                {
    <#list indexedProperties as indexProperty>
        <#if indexProperty.isReferenceProperty() >
            <#assign refEntity=mapRelationEntity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
            <#if generator.isDepartmentInfoType(refEntity)>
                    ${indexProperty.name}: $('#${indexProperty.name}').attr('relValue'),
            <#else>
                    ${indexProperty.name}: $('#${indexProperty.name}').val(),
            </#if>
        <#elseif generator.isDateProperty(indexProperty) >
                    start${indexProperty.name?cap_first}: $('#start${indexProperty.name?cap_first}').val(),
                    end${indexProperty.name?cap_first}: $('#end${indexProperty.name?cap_first}').val(),
        <#else>
                    ${indexProperty.name}: $('#${indexProperty.name}').val(),
        </#if>
    </#list>
                    'mapping-id':id
                },
            function(result){
                if(result && result.reason) {
                    top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                } else {
                    var gridData = result;
                    //刷新表格
                    grid.loadData(gridData);
                }
            },"json").error(function() {
                top.Dialog.alert("读取数据失败")
        });
    }

        //新增
    function onBatchAdd() {
        var rows = grid.getSelectedRows();
        var rowsLength = rows.length;

        if (rowsLength == 0) {
            top.Dialog.alert("请选中要添加的记录!");
            return;
        }
        var ${mapRelationEntity.name}Ids=[];
        for(var index in rows){
            ${mapRelationEntity.name}Ids.push(rows[index].${mapRelationEntity.idProperty.name});
        }
        top.Dialog.confirm("确定要添加吗？", function () {
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/add${mapRelationEntity.classInfo.name}",
                    //获取所有选中行
                    {id:id, "${mapRelationEntity.name}Ids":${mapRelationEntity.name}Ids},
                    function (result) {
                        handleResult(result);
                    },
                    "json");
        });
    }

    function onAdd(objId) {
        top.Dialog.confirm("确定要该记录吗？",function(){
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/add${mapRelationEntity.classInfo.name}",
                    {   id : id,  "${mapRelationEntity.name}Ids":[objId]},
                    function(result){
                        handleResult(result);
                    },"json").error(function() {
                top.Dialog.alert("数据创建/更新失败");
            });

        });
    }

    function handleResult(result) {
        if(result && result.result && result.result=="Success"){
            top.location.reload();
            top.Dialog.close();
        } else if (result && result.reason) {
            top.Dialog.alert("添加失败，原因:"+result.reason);
        } else {
            top.Dialog.alert("失败");
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