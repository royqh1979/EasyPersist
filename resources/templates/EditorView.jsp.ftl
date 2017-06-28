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

</head>
<style>
    .img_pencel2{
        background-image: url(${"$"}{baseDir}/qui/libs/images/icons/edit.png);
        background-repeat: no-repeat;
        background-position:0% 0%;
        width: 20px;
        height: 20px;
        display:inline-block;

    }
</style>
<body>
<div class="PageTop">
    <h1>${entity.chineseAlias}编辑</h1>
</div>
<div class="padding_right5">
    <div style="height:1px;overflow:hidden;" id="tipParent"></div>
    <div style="height:1px;overflow:hidden;" id="tipParent2"></div>
    <div id="maingrid"></div>
</div>
<script type="text/javascript">

    var g;
    var menu;
    var currentRow;
    <#list refEntities as refEntity>
    var ${refEntity.name}Data={
        list:[]
    };
    </#list>

    function loadGridRenderData(url,list) {
        $.post(url,
                {},
                function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                    } else {
                        list.list=result.list;
                    }
                },"json").error(function() {
            top.Dialog.alert("读取数据失败")
        });
    }
    function initComplete(){
        menu = $.rightClickMenu({ width: 120, items:
                [
                    { text: '插入行', click: menuclick, iconClass: 'icon_btn_down2',menuId:0 },
                    { line: true },
                    { text: '删除本行', click: menuclick, iconClass: 'icon_delete',menuId:1  }
                ]
        });
        <#list refEntities as refEntity>
            loadGridRenderData("${"$"}{baseUrl}/codes/${entity.name}/list${refEntity.classInfo.name}",${refEntity.name}Data);
        </#list>
        initGrid();

        $(".PageTop").bind("click",function(e){
            g.endEdit();
        })

    }

    function genHeaderRender(columnName){
        return function(column){
            return '<span style="float:left;padding-left:20px;">'+columnName+'</span><div style="float:right;padding-right:10px;width:20px;"><span class="img_pencel2 hand headerChangeBtn"></span></div><div class="clear"></div>'
        }
    }

    <#list entity.properties as property>
         <#if property.isReferenceProperty()>
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
        </#if>
    </#list>

    function initGrid(){
        g = $("#maingrid").quiGrid({
            columns: [
            <#list entity.properties as property>
                <#if property == entity.idProperty >
                    { name: '${property.name}', align: 'left', width: 120,isSort:false,headerRender:function(column){
                        return '${property.chineseAlias}';
                    }}
                <#elseif property.isReferenceProperty()>
                    <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    { name: '${property.name}', align: 'left', width: 120,editor: { type: 'select', data: ${refEntity.name}Data,selWidth:50 },isSort:false,render:render${refEntity.classInfo.name},
                            headerRender:genHeaderRender("${property.chineseAlias}")},
                <#else>
                    { name: '${property.name}', align: 'left', width: 120,editor: { type: 'text'},isSort:false,headerRender:genHeaderRender("${property.chineseAlias}")},
                </#if>
                <#sep>,</#sep>
            </#list>
            ],
            data:[],sortName: 'id',rownumbers:true,checkbox:true,pageSize:1000,dataAction:"server",usePager: true,
            height: "100%", width:"100%",enabledEdit: true,onBeforeEdit: onBeforeEdit, onBeforeSubmitEdit: onBeforeSubmitEdit,
            onAfterEdit: onAfterEdit, whenRClickToSelect:false,excelMode:true,usePager:false,onDelete:onDelete,
            onContextmenu : function (parm,e)
            {
                currentRow = parm.data;
                menu.show({ top: e.pageY, left: e.pageX });
                return false;
            },

            toolbar:{
                items:[
                    {text: '新增', click: onAdd, iconClass: 'icon_add'},
                    { line : true },
                    {text: '批量删除', click: onBatchDelete ,iconClass: 'icon_delete'}

                ]
            }
        });

        getData();
    }

    function getData(){
        $.post("${"$"}{baseUrl}/codes/${entity.name}/list",
                {},
                function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                    } else {
                        gridData = result;
                        //刷新表格
                        g.loadData(gridData);
                    }
                },"json").error(function() {
            top.Dialog.alert("读取数据失败")
        });
    }


    //点击了右键菜单某项
    function menuclick(item, i)
    {
        if(item.menuId==0){
            onAdd();
        }
        else if(item.menuId==1){
            onDelete(currentRow.__index);
        }
    }

    function onBatchDelete() {
        var rows = g.getSelectedRows();
        var ${entity.idProperty.name}s=[];
        if (rows.length == 0) {
            return;
        }
        for(var index in rows){
            ${entity.idProperty.name}s.push(rows[index].${entity.idProperty.name});
        }
        console.log(${entity.idProperty.name}s);
        $.post("${"$"}{baseUrl}/codes/${entity.name}/batchDelete",{${entity.idProperty.name}s:${entity.idProperty.name}s},function(result){
            console.log("删除结果",result);
            if(result && result.result && result.result=="Success"){
                //成功
            } else if (result && result.reason) {
                top.Dialog.alert("删除失败，原因:"+result.reason);
            } else {
                top.Dialog.alert("删除失败");
            }
            getData();
        },"json").error(function() {
            top.Dialog.alert("删除失败")
        });
    }

    function onAdd() {
        var obj={
    <#list entity.properties as property>
        <#if property == entity.idProperty >
            '${property.name}':0
        <#elseif property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
            ${property.name}: ${refEntity.name}Data.list[0].value
        <#else>
            ${property.name}:0
        </#if>
        <#sep>,</#sep>
    </#list>
        } ;
        $.post("${"$"}{baseUrl}/codes/${entity.name}/create",obj,function(result){
            console.log("添加结果",result);
            if(result && result.result && result.result=="Success"){
                //成功
            } else if (result && result.reason) {
                top.Dialog.alert("添加失败，原因:"+result.reason);
            } else {
                top.Dialog.alert("添加失败");
            }
            getData();
        },"json").error(function() {
            top.Dialog.alert("添加失败")
        });
    }

    function onDelete(rowindex){
        var rowData=g.getRow(rowindex);
        $.post("${"$"}{baseUrl}/codes/${entity.name}/delete",{${entity.idProperty.name}:rowData.${entity.idProperty.name}},function(result){
            console.log("删除结果",result);
            if(result && result.result && result.result=="Success"){
                //成功
            } else if (result && result.reason) {
                top.Dialog.alert("删除失败，原因:"+result.reason);
            } else {
                top.Dialog.alert("删除失败");
            }
            getData();
        },"json").error(function() {
            top.Dialog.alert("删除失败")
        });
    }

    //编辑前事件,可阻止某些行或列进行编辑
    // 列名：e.column.name
    // 行号：e.rowindex
    // 编辑前的值 e.value
    function onBeforeEdit(e)
    {
        //if(e.record.id=="121"){
        //	top.Dialog.alert("此行不可编辑",null,null,null,2);
        //	 return false;
        //}
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
        var obj=e.record;
        $.post("${"$"}{baseUrl}/codes/${entity.name}/update",{
    <#list entity.properties as property>
            ${property.name}:obj.${property.name}
        <#sep>,</#sep>
    </#list>
            id: obj.id,
            name: obj.name,
            amount:obj.amount,
            productTypeId: obj.productTypeId,
            firstDate: obj.firstDate
        },function(result){
            console.log("更新结果",result);
            if(result && result.result && result.result=="Success"){
                var cell = g.getCellObj(obj, e.column);
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