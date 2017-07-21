<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="${"$"}{baseDir}/"/>
    <title>抚育申请开工表编辑</title>

    <c:choose>
        <c:when test="${"$"}{isSeperateMode}" >
            <!--分离模式必须start -->
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/jquery.js"></script>
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/language/cn.js"></script>
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/framework.js"></script>
            <link href="${"$"}{baseDir}/qui/libs/css/import_basic.css" rel="stylesheet" type="text/css" id="theme" themeColor="blue"/>
            <link rel="stylesheet" type="text/css" id="skin" prePath="${"$"}{baseDir}/qui/" splitMode="true" href="${"$"}{baseDir}/qui/libs/skins/blue/style.css"/>
            <link rel="stylesheet" type="text/css" id="customSkin" href="${"$"}{baseDir}/qui/system/layout/skin/style.css"/>
            <!--分离模式必须end -->

            <!--弹窗组件start-->
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/popup/drag.js"></script>
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/popup/dialog.js"></script>
            <!--弹窗组件end-->

        </c:when>
        <c:otherwise>
            <!--框架必需start-->
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/jquery.js"></script>
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/language/cn.js"></script>
            <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/framework.js"></script>
            <link href="${"$"}{baseDir}/qui/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
            <link rel="stylesheet" type="text/css" id="skin" prePath="${"$"}{baseDir}/qui/"/>
            <link rel="stylesheet" type="text/css" id="customSkin"/>
            <!--框架必需end-->
        </c:otherwise>
    </c:choose>


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

</head>
<c:choose>
    <c:when test="${"$"}{isUpdate}" >
        <c:set var="title" value="更新开工申请表" />
    </c:when>
    <c:otherwise>
        <c:set var="title" value="新建开工申请表" />
    </c:otherwise>
</c:choose>
<div class="box2" panelTitle="${"$"}{title}" id="updatePanel">
    <form id="updateForm">
        <input type="hidden" id="id" name="id" />
        <table class="tableStyle" formMode="transparent">
            <#list entity.properties as property>
                    <#if property.name!=entity.idProperty.name>
                        <tr>
                            <td>${property.chineseAlias}：</td>
                            <#if property.isReferenceProperty() >
                                <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                                <td>
                                    <select prompt="请选择${refEntity.chineseAlias}" id="${property.name}" name="${property.name}" ></select>
                                </td>
                            <#elseif generator.isIntProperty(property) >
                                <td>
                                    <input type="text" id="${property.name}" name="${property.name}" style="width:200px;" inputMode="numberOnly"  watermark="请输入合法整数"/>
                                </td>
                            <#elseif generator.isNumberProperty(property) >
                                <td colspan="4">
                                    <input type="text" id="${property.name}" name="${property.name}" style="width:200px;" inputMode="positiveDecimal"  watermark="请输入合法数字"/>
                                </td>
                            <#elseif generator.isDateProperty(property) >
                                <td><input type="text" id="${property.name}" name="${property.name}" class="date" style="width:200px;" dateFmt="yyyy-MM-dd"/></td>
                            <#else>
                                <td>
                                    <input type="text" id="${property.name}" name="${property.name}" style="width:200px;" />
                                </td>
                            </#if>
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
</div>

<div class="basicTab" id="myTab">
    <#list entity.subEntities as subEntityInfo>
        <#assign subEntity=subEntityInfo.subEntity >
    <div name="${subEntity.chineseAlias}" style="width:98%;">
        <div id="dataGrid${subEntityInfo?counter}"></div>
    </div>
    </#list>
</div>

<script type="text/javascript">
    <!-- 对主实体对象 和 公用 -->
    var isUpdate=${"$"}{isUpdate?"true":"false"};

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
                            <#assign refEntity=entity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                            if (name == '${refEntity.name}') {
                                var ctrl=$("#${indexProperty.name}");
                                ctrl.data("data",list);
                                //刷新下拉框
                                ctrl.render();
                            }
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
        </#if>
    </#list>

    function initComplete() {
        //当提交表单刷新本页面时关闭弹窗
        top.Dialog.close();

        loadAllReferenceData(false);

        if (isUpdate) {
            retrieveEntity();
        }
    <#list entity.subEntities as subEntityInfo>
        <#assign subEntity=subEntityInfo.subEntity >
        initGrid${subEntityInfo?counter}();
    </#list>

        $("#updatePanel").bind("stateChange", function (e, state) {
            $("#myTab").resetHeight();
        });
    }

    /* 填写updateForm */
    function retrieveEntity() {
    <#list entity.properties as property>
        <#if property.name!=entity.idProperty.name>
            var ${property.name}Ctrl=$("#${property.name}");
            ${property.name}Ctrl.attr("readonly",true);
        </#if>
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/retrieve/${"$"}{id}",
                { },
                function(result){
                    if(result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:"+result.reason);
                    } else {
                        var obj=result.entity;
                        <#if property.name!=entity.idProperty.name>
                            ${property.name}Ctrl.val(obj.${property.name});
                        </#if>
                    }
                },"json").error(function() {
            top.Dialog.alert("读取数据失败")
        });
    </#list>
    }

    //获取所有选中行获取选中行的id 格式为 ids=1 & ids=2
    function getSelectId(grid) {
        var selectedRows = grid.getSelectedRows();
        var selectedRowsLength = selectedRows.length;
        var ids = "";

        for (var i = 0; i < selectedRowsLength; i++) {
            ids += selectedRows[i].userId + ",";
        }
        return {"ids": ids};
    }

    //查询
    function updateHandler() {
        /* todo  */


    }

    <!-- end of 公用  -->

    <#list entity.subEntities as subEntityInfo>
        <#assign subEntity=subEntityInfo.subEntity >
    <#assign gridName="grid"+subEntityInfo?counter >
    <!-- 子表${subEntityInfo?counter}  -->
    //grid1
    var ${gridName} = null;

    function initGrid${subEntityInfo?counter}(){
        ${gridName} = $("#dataGrid${subEntityInfo?counter}").quiGrid({
            columns: [
                { name: 'id', align: 'left', width: 120,display:'ID'},
                {display: '备注', name: 'note',align: 'left', width: "120"},
                {display: '完工日期', name: 'endDate',align: 'left', width: "120"},
                {display: '部门', name: 'departmentId',align: 'left', width: "120",render:renderDepartmentId},
                {display: '营林局审核日期', name: 'approvalDateSilvicultureBureau',align: 'left', width: "120"},
                {display: '标题', name: 'title',align: 'left', width: "120"},
                {display: '资源局审批人', name: 'approverResourceBureau',align: 'left', width: "120"},
                {display: '申请人', name: 'applicant',align: 'left', width: "120"},
                {display: '审核结果', name: 'approveResult',align: 'left', width: "120"},
                {display: '申请内容', name: 'applyContent',align: 'left', width: "120"},
                {display: '驻厂监督站审核人', name: 'approverOnSite',align: 'left', width: "120"},
                {display: '专员办审核日期', name: 'approvalDateCommissioner',align: 'left', width: "120"},
                {display: '资源局审核日期', name: 'approvalDateResourceBureau',align: 'left', width: "120"},
                {display: '营林局审批人', name: 'approverSilvicultureBureau',align: 'left', width: "120"},
                {display: '驻厂监督站审核日期', name: 'approvalDateOnSite',align: 'left', width: "120"},
                {display: '专员办审核人', name: 'commissioner',align: 'left', width: "120"},
                {display: '开工日期', name: 'startDate',align: 'left', width: "120"},
                {display: '任务id', name: 'taskid',align: 'left', width: "120"},
                {display: '申请日期', name: 'applicationDate',align: 'left', width: "120"},
                {
                    display: '操作', isAllowHide: false, align: 'left', width: 100,
                    render: function (rowdata, rowindex, value, column) {
                        return '<div class="padding_top4 padding_left5">'
                                + '<span class="img_list hand" title="查看" onclick="onView${subEntityInfo?counter}(' + rowdata.id + ')"></span>'
                                + '<span class="img_edit hand" title="修改" onclick="onEdit${subEntityInfo?counter}(' + rowdata.idd + ')"></span>'
                                + '<span class="img_delete hand" title="删除" onclick="onDelete${subEntityInfo?counter}(' + rowdata.id + ',' + rowindex + ')"></span>'
                                + '</div>';
                    }
                }
            ],
            data:[], sortName: 'pk_id', rownumbers: true, checkbox: true,
            height: '100%', width: "100%", pageSize: 50, percentWidthMode: false,sortOrder:'asc',

            toolbar: {
                items: [
                    {text: '新增', click: addUnit${subEntityInfo?counter}, iconClass: 'icon_add'},
                    {line: true},
                    {text: '批量删除', click: deleteUnit${subEntityInfo?counter}, iconClass: 'icon_delete'}
                ]
            }
        });

        if (isUpdate) {
            getData${subEntityInfo?counter}(false);
        }

    }

    function getData${subEntityInfo?counter}(refresh){
        $.post("${"$"}{baseDir}/${"$"}{ctrlUrl}/list${subEntity.classInfo.name}ForGrid",
                {
                    'pager.pageSize': grid1.options.pageSize,
                    'pager.pageNo': grid1.options.page,
                    'sort': grid1.options.sortName,
                    'direction': grid1.options.sortOrder
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

    //新增
    function addUnit${subEntityInfo?counter}() {
        top.Dialog.open({
            URL: "/qui_ssh2/sample/unit/user-management-content.jsp",
            Title: "添加", Width: 500, Height: 350
        });
    }
    //查看
    function onView${subEntityInfo?counter}(rowid) {
        top.Dialog.open({
            URL: "/qui_ssh2/getUserDetail.action?userinfor.userId=" + rowid,
            Title: "查看", Width: 500, Height: 350
        });
    }

    //修改
    function onEdit${subEntityInfo?counter}(rowid) {
        top.Dialog.open({
            URL: "/qui_ssh2/preUpdateUser.action?userinfor.userId=" + rowid,
            Title: "修改", Width: 500, Height: 350
        });
    }
    //删除
    function onDelete${subEntityInfo?counter}(rowid, rowidx) {
        top.Dialog.confirm("确定要删除该记录吗？", function () {
            //删除记录
            $.post("/qui_ssh2/deleteUser.action",
                    {"ids": rowid},
                    function (result) {
                        handleResult${subEntityInfo?counter}(result.result);
                    }, "json");
            //刷新表格
            grid1.loadData();
        });
    }


    //批量删除
    function deleteUnit${subEntityInfo?counter}() {
        var rows = ${gridName}.getSelectedRows();
        var rowsLength = rows.length;

        if (rowsLength == 0) {
            top.Dialog.alert("请选中要删除的记录!");
            return;
        }
        top.Dialog.confirm("确定要删除吗？", function () {
            $.post("/qui_ssh2/deleteUser.action",
                    //获取所有选中行
                    getSelectId(grid1),
                    function (result) {
                        handleResult${subEntityInfo?counter}(result.status);
                    },
                    "json");
        });
    }
    //删除后的提示
    function handleResult${subEntityInfo?counter}(result) {
        if (result == 1) {
            top.Dialog.alert("删除成功！", null, null, null, 1);
            grid1.loadData();
        } else {
            top.Dialog.alert("删除失败！");
        }
    }

    //刷新表格数据并重置排序和页数
    function refresh${subEntityInfo?counter}(isUpdate) {
        if (!isUpdate) {
            //重置排序
            ${gridName}.options.sortName = 'userId';
            ${gridName}.options.sortOrder = "asc";
            //页号重置为1
            ${gridName}.setNewPage(1);
        }

        getData${gridName}();
    }
    <!-- end of 子表${gridName} -->
    </#list>
</script>
</body>
</html>