<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="${"$"}{baseDir}/"/>
    <title>${subEntity.chineseAlias}</title>

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
    <div id="dataGrid${subEntity.classInfo.name}"></div>
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
        //当提交表单刷新本页面时关闭弹窗
        top.Dialog.close();

        loadAllReferenceData(false);
        initBooleans();


        initGrid${subEntity.classInfo.name}();

    }

    <#assign gridName="grid"+subEntity.classInfo.name >
    /* 子表 ${gridName} */
    var ${gridName} = null;

        <#list subEntity.properties as property>
            <#if property.isReferenceProperty() >
                <#assign refEntity=subEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>

    function render${property.name?cap_first}ForGrid${subEntity.classInfo.name}(item) {
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
    function render${property.name?cap_first}ForGrid${subEntity.classInfo.name}(item) {
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


    function initGrid${subEntity.classInfo.name}(){
        ${gridName} = $("#dataGrid${subEntity.classInfo.name}").quiGrid({
            columns: [
                <#list subEntity.properties as property>
                    <#if property == subEntity.idProperty  >
                    <#else>
                        <#if property.isReferenceProperty()>
                            <#assign refEntity=subEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                            <#if refEntity!=entity>
                                <#if generator.isDepartmentInfoType(refEntity)>
                                    { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,editor: { type: 'selectTree', url: "${"$"}{baseDir}/${"$"}{ctrlUrl}/listDepartmentInfoTree",selWidth:145 },isSort:false,render:render${property.name?cap_first}ForGrid${subEntity.classInfo.name}},
                                <#else>
                                    { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,editor: { type: 'select', data: ${refEntity.name}Data,selWidth:50 },isSort:false,render:render${property.name?cap_first}ForGrid${subEntity.classInfo.name}},
                                </#if>
                            </#if>
                        <#elseif generator.isBooleanProperty(property) >
                            { display: '${property.chineseAlias}',name: '${property.name}', align: 'left', width: 120,editor: { type: 'select', data: booleanData,selWidth:50 },isSort:false,render:render${property.name?cap_first}ForGrid${subEntity.classInfo.name}},
                        <#elseif property.isTemporal() >
                            { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,editor: { type: 'date',dateFmt:'yyyy-MM-dd'},isSort:false},
                        <#else>
                            <#if generator.isIntProperty(property) >
                                <#assign limit=",inputMode:\"numberOnly\",tip:\"请输入合法整数数字\"" >
                            <#elseif generator.isNumberProperty(property) >
                                <#assign limit=",inputMode:\"positiveDecimal\",tip:\"请输入合法数字\"" >
                            <#else>
                                <#assign limit="" />
                            </#if>
                            { display: '${property.chineseAlias}', name: '${property.name}', align: 'left', width: 120,editor: { type: 'text' ${limit} },isSort:false},
                        </#if>
                    </#if>
                </#list>
                { display: '操作', isSort: false, width: 200, render: function (rowdata, rowindex, value)  {
                        var h = "";
                        if (!rowdata._editing)
                        {
                            h += "<a onclick='onDelete${subEntity.classInfo.name}(" + rowindex + ")'><span class='icon_delete'>删除</span></a> ";
                            h += "<a onclick='beginEdit${subEntity.classInfo.name}(" + rowindex + ")'><span class='icon_edit'>修改</span></a> ";

                        }
                        else
                        {
                            h += "<a onclick='endEdit${subEntity.classInfo.name}(" + rowindex + ")'><span class='icon_ok'>提交</span></a> ";
                            h += "<a onclick='cancelEdit${subEntity.classInfo.name}(" + rowindex + ")'><span class='icon_no'>取消</span></a> ";

                        }
                        return h;
                    }
                }
            ],
            data:[], sortName: '${subEntity.idProperty.column.name}', rownumbers: true, checkbox: true,
            height: '100%', width: "100%", pageSize: 50, percentWidthMode: false,sortOrder:'asc',
            enabledEdit: true,clickToEdit: false,onDblClickRow:function(rowdata, rowindex){
                ${gridName}.beginEdit(rowindex);
            },onBeforeEdit: onBeforeEdit${subEntity.classInfo.name}, onBeforeSubmitEdit: onBeforeSubmitEdit${subEntity.classInfo.name},onAfterSubmitEdit: onAfterSubmitEdit${subEntity.classInfo.name},
            toolbar: {
                items: [
                    {text: '新增', click: add${subEntity.classInfo.name}, iconClass: 'icon_add'},
                    {line: true},
                    { text: '全部确认修改', click: endAllEdit${subEntity.classInfo.name}, iconClass: 'icon_ok' },
                    { line: true },
                    { text: '全部取消修改', click: cancelAllEdit${subEntity.classInfo.name}, iconClass: 'icon_no' },
                    { line: true},
                    {text: '批量删除', click: deleteAll${subEntity.classInfo.name}, iconClass: 'icon_delete'}
                ]
            }
        });

        getData${subEntity.classInfo.name}(false);
    }

    function getData${subEntity.classInfo.name}(refresh){
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/list${subEntity.classInfo.name}ForGrid",
                {
                    '${subEntityInfo.subEntityReferenceProperty.name}':id,
                    'pager.pageSize': ${gridName}.options.pageSize,
                    'pager.pageNo': ${gridName}.options.page,
                    'sort': ${gridName}.options.sortName,
                    'direction': ${gridName}.options.sortOrder
                },
                function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                    } else {
                        var gridData = result;
                        //刷新表格
                        ${gridName}.loadData(gridData);
                    }
                },"json").error(function() {
            top.Dialog.alert("读取数据失败")
        });
    }

        //开始编辑
    function beginEdit${subEntity.classInfo.name}(rowid) {
        ${gridName}.beginEdit(rowid);
    }

    //取消编辑
    function cancelEdit${subEntity.classInfo.name}(rowid) {
        ${gridName}.cancelEdit(rowid);
    }

    //结束编辑
    function endEdit${subEntity.classInfo.name}(rowid)
    {
        ${gridName}.endEdit(rowid);
    }

    //全部确认修改
    function endAllEdit${subEntity.classInfo.name}(){
        ${gridName}.endEdit();
    }


    //全部取消修改
    function cancelAllEdit${subEntity.classInfo.name}()
    {
        ${gridName}.cancelEdit();
    }





        //新增
    function add${subEntity.classInfo.name}() {
        var obj={
        <#list subEntity.properties as property>
            <#if property.isReferenceProperty()>
                <#assign refEntity=subEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                <#if refEntity==entity>
            ${property.name} : id
                <#else>
            ${property.name}: ${refEntity.name}Data.list[0].value
                </#if>
            <#else>
            ${property.name}: ${generator.getDefaultValue(property.type)}
            </#if>
            <#sep>,</#sep>
        </#list>
        }

        //在这里做新增处理
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/create${subEntity.classInfo.name}",obj,function(result){
            if(result && result.result && result.result=="Success"){
                var row = ${gridName}.getRow(0);
                ${gridName}.addEditRow(result.entity, row, true);
            } else if (result && result.reason) {
                top.Dialog.alert("添加失败，原因:"+result.reason);
            } else {
                top.Dialog.alert("添加失败");
            }
        },"json").error(function() {
            top.Dialog.alert("添加失败")
        });

    }

    //编辑前事件
    function onBeforeEdit${subEntity.classInfo.name}(e)
    {
        var str="编辑前事件，可阻止某些行或列进行编辑。列名："+e.column.name+"；行号："+e.rowindex+"；编辑前的值："+e.value+"\n";
        //if(e.record.id=="121"){
        //top.Dialog.alert("此行不可编辑",null,null,null,2);
        // return false;
        //}
    }


    //编辑提交前事件
    function onBeforeSubmitEdit${subEntity.classInfo.name}(e){
        <#list subEntity.properties as property>
            <#if property!=subEntity.idProperty>
                <#if property.isReferenceProperty()>
                <#assign refEntity=subEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    <#if refEntity!=entity>
        if (render${property.name?cap_first}ForGrid${subEntity.classInfo.name}(e.newdata)=="未选择"){
            top.Dialog.alert("${property.chineseAlias}必须选择！",null,null,null,2);
            return false;
        }
                    </#if>
                <#else>
                    <#if !(property.column.nullable) >
        if(e.newdata.${property.name}==""){
            top.Dialog.alert("${property.chineseAlias}不能为空！",null,null,null,2);
            return false;
        }
                    </#if>
                </#if>
            </#if>
        </#list>
    }

    //编辑后事件
    function onAfterSubmitEdit${subEntity.classInfo.name}(e)
    {
        //在这里一律作修改处理
        var obj = e.record;
        console.log(e.newdata);

        obj.${subEntityInfo.subEntityReferenceProperty.name} = id;
        //ajax方式提交数据到数据库
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/update${subEntity.classInfo.name}",
                formToEntity${subEntity.classInfo.name}(obj),function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("数据创建/更新失败, 原因:"+result.reason);
                    }
                    getData${subEntity.classInfo.name}(false);
                },"json").error(function() {
            top.Dialog.alert("数据创建/更新失败");
        });
    }

    function formToEntity${subEntity.classInfo.name}(obj) {
        return {
        <#list subEntity.properties as property>
            <#if property.name == subEntityInfo.subEntityReferenceProperty.name>
            ${property.name}:id
            <#elseif generator.isBooleanProperty(property)>
            ${property.name}:obj.${property.name}.toString()=="true" ? "y": "n"
            <#else>
            ${property.name}:obj.${property.name}!=null ? obj.${property.name} : ""
            </#if>
            <#sep>,</#sep>
        </#list>
        };
    }

    //删除
    function onDelete${subEntity.classInfo.name}(rowidx){
        top.Dialog.confirm("确定要删除该记录吗？",function(){
            //删除记录
            var row = ${gridName}.getRow(rowidx)
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/delete${subEntity.classInfo.name}",
                    {"${subEntity.idProperty.name}":row.${subEntity.idProperty.name}},
                    function(result){
                        handleResult${subEntity.classInfo.name}(result);
                    },"json").error(function() {
                top.Dialog.alert("数据创建/更新失败");
            });

        });
    }



    //批量删除
    function deleteAll${subEntity.classInfo.name}() {
        var rows = ${gridName}.getSelectedRows();
        var rowsLength = rows.length;

        if (rowsLength == 0) {
            top.Dialog.alert("请选中要删除的记录!");
            return;
        }
        var ${subEntity.idProperty.name}s=[];
        for(var index in rows){
            ${subEntity.idProperty.name}s.push(rows[index].${subEntity.idProperty.name});
        }
        top.Dialog.confirm("确定要删除吗？", function () {
            $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/batchDelete${subEntity.classInfo.name}",
                    //获取所有选中行
                    {"${subEntity.idProperty.name}s":${subEntity.idProperty.name}s},
                    function (result) {
                        handleResult${subEntity.classInfo.name}(result);
                    },
                    "json");
        });
    }
    //删除后的提示
    function handleResult${subEntity.classInfo.name}(result) {
        if(result && result.result && result.result=="Success"){
            //成功
            getData${subEntity.classInfo.name}(false);
        } else if (result && result.reason) {
            top.Dialog.alert("删除失败，原因:"+result.reason);
        } else {
            top.Dialog.alert("删除失败");
        }
    }

    //刷新表格数据并重置排序和页数
    /*
    function refresh${subEntity.classInfo.name}(isUpdate) {
        if (!isUpdate) {
            //重置排序
            ${gridName}.options.sortName = "${subEntity.idProperty.column.name}";
            ${gridName}.options.sortOrder = "asc";
            //页号重置为1
            ${gridName}.setNewPage(1);
        }

        getData${subEntity.classInfo.name}();
    }
    */
    /* end of 子表 ${gridName} */

</script>
</body>
</html>