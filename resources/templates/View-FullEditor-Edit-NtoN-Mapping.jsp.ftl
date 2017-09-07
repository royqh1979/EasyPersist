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
<div id="dataGrid"></div>
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


    function initGrid(){
        grid = $("#dataGrid").quiGrid({
            columns: [
            <#list mapRelationEntity.properties as property>
                <#if property == mapRelationEntity.idProperty  >
                <#else>
                    <#if property.isReferenceProperty()>
                        <#assign refEntity=mapRelationEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                        <#if refEntity!=entity>
                            <#if templateUtils.isDepartmentInfoType(refEntity)>
                                { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,isSort:true,type:'string',render:render${property.name?cap_first}},
                            <#else>
                                { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,isSort:true,type:'string',render:render${property.name?cap_first}},
                            </#if>
                        </#if>
                    <#elseif templateUtils.isBooleanProperty(property) >
                        { display: '${property.chineseAlias}',name: '${property.name}', align: 'left', width: 120,isSort:true,type:'string',render:render${property.name?cap_first}},
                    <#else>
                        <#if templateUtils.isIntProperty(property) >
                            <#assign sortType="int" >
                        <#elseif templateUtils.isNumberProperty(property) >
                            <#assign sortType="float" >
                        <#elseif property.isTemporal()>
                            <#assign sortType='date' >
                        <#else>
                            <#assign sortType="string" >
                        </#if>
                        { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', type:'${sortType}', width: 120,isSort:true},
                    </#if>
                </#if>
            </#list>
                { display: '操作', isSort: false, width: 200, render: function (rowdata, rowindex, value)  {
                        var h = "";
                            h += "<a onclick='onDelete(" + rowindex + ")'><span class='icon_delete'>删除</span></a> ";
                        return h;
                    }
                }
            ],
            url:"${"$"}{baseDir}/${"$"}{ctrlUrl}/list${mapRelationEntity.classInfo.name}ForGrid", params:[
                    {name:"id", value: id}
            ], sortName: '${mapRelationEntity.idProperty.name}', rownumbers: true, checkbox: true,
            height: '100%', width: "100%", pageSize: 50, percentWidthMode: false,sortOrder:'asc',
            enabledEdit: false,clickToEdit: false, onSuccess: onSuccess, onError: onError, dataAction:'server',
            toolbar: {
                items: [
                    {text: '新增', click: add, iconClass: 'icon_add'},
                    { line: true},
                    {text: '批量删除', click: deleteAll, iconClass: 'icon_delete'}
                ]
            }
        });

        getData(false);
    }

    function onSuccess(data,grid) {
        if(data && data.reason) {
            top.Dialog.alert("读取数据失败, 原因:"+result.reason);
        }
    }

    function onError(XMLHttpRequest, textStatus, errorThrown){
        top.Dialog.alert("读取数据失败:"+result.textStatus);
    }

    function getData(refresh){
        grid.setOptions({
            params:[
                    {name:"id", value: id}
            ]
        })
        grid.setNewPage(1);
        grid.loadData();
    }

        //新增
    function add() {
        top.Dialog.open({
            URL:"${"$"}{baseDir}/${"$"}{ctrlUrl}/editUI-mapping-add-${mapRelationEntity.name}/${"$"}{id}",
            Title:"添加${mapRelationEntity.chineseAlias}",
            Width: 800,
            Height:600
        })
    }

    //删除
    function onDelete(rowidx){
        top.Dialog.confirm("确定要删除该记录吗？",function(){
            //删除记录
            var row = grid.getRow(rowidx);
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/delete${mapRelationEntity.classInfo.name}",
                    {   id : id,  "${mapRelationEntity.name}Ids":[row.${mapRelationEntity.idProperty.name}]},
                    function(result){
                        handleResult(result);
                    },"json").error(function() {
                top.Dialog.alert("数据创建/更新失败");
            });

        });
    }



    //批量删除
    function deleteAll() {
        var rows = grid.getSelectedRows();
        var rowsLength = rows.length;

        if (rowsLength == 0) {
            top.Dialog.alert("请选中要删除的记录!");
            return;
        }
        var ${mapRelationEntity.name}Ids=[];
        for(var index in rows){
            ${mapRelationEntity.name}Ids.push(rows[index].${mapRelationEntity.idProperty.name});
        }
        top.Dialog.confirm("确定要删除吗？", function () {
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/delete${mapRelationEntity.classInfo.name}",
                    //获取所有选中行
                    {id:id, "${mapRelationEntity.name}Ids":${mapRelationEntity.name}Ids},
                    function (result) {
                        handleResult(result);
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


</script>
</body>
</html>