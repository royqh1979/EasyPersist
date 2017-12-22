<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
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

    <!-- 日期选择框start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/datePicker/WdatePicker.js"></script>
    <!-- 日期选择框end -->

    <!-- 树组件start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/tree/ztree/ztree.js"></script>
    <link type="text/css" rel="stylesheet" href="${"$"}{baseDir}/qui/libs/js/tree/ztree/ztree.css"></link>
    <!-- 树组件end -->

    <!-- 树形下拉框start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/form/selectTree.js"></script>
    <!-- 树形下拉框end -->

    <!--数字分页start-->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/nav/pageNumber.js"></script>
    <!--数字分页end-->
</head>
<div class="box2" panelTitle="查询${entity.chineseAlias}" id="searchPanel" statusType="none" >
    <form action="${"$"}{baseDir}/${"$"}{ctrlUrl}/view-list" id="queryForm" method="post">
        <input type="hidden" value="${"$"}{direction}" name="direction" id="direction"/>
        <input type="hidden" value="${"$"}{sort}" name="sort" id="sort"/>
        <input type="hidden" value="${"$"}{pager.pageNo}" name="pager.pageNo" id="pageNo"/>
        <input type="hidden" value="${"$"}{pager.pageSize}" name="pager.pageSize" id="pageSize"/>

        <table class="tableStyle" formMode="transparent">
            <#list indexedProperties as indexProperty>
                <tr>
                    <td>${indexProperty.chineseAlias}：</td>
                        <#if indexProperty.isReferenceProperty() >
                            <#assign refEntity=entity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                            <#if templateUtils.isDepartmentInfoType(refEntity)>
                                <td class="ali01" colspan="4">
                                    <div class="selectTree" url="${"$"}{baseDir}/${"$"}{ctrlUrl}/listDepartmentInfoTree"  id="${indexProperty.name}" name="${indexProperty.name}" relValue=""></div>
                                </td>
                            <#else>
                                <td class="ali01" colspan="4">
                                    <select prompt="请选择${refEntity.chineseAlias}" id="${indexProperty.name}" name="${indexProperty.name}"></select>
                                </td>
                            </#if>
                        <#elseif templateUtils.isIntProperty(indexProperty) >
                            <td class="ali01" colspan="4">
                                <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" inputMode="numberOnly" />
                            </td>
                        <#elseif templateUtils.isNumberProperty(indexProperty) >
                            <td class="ali01" colspan="4">
                                <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" inputMode="positiveDecimal"/>
                            </td>
                        <#elseif templateUtils.isDateProperty(indexProperty) >
                            <td >开始日期</td>
                            <td class="ali01"><input type="text" id="start${indexProperty.name?cap_first}" name="start${indexProperty.name?cap_first}" class="date" style="width:200px;" dateFmt="yyyy-MM-dd"/></td>
                            <td >结束日期</td>
                            <td class="ali01"><input type="text" id="end${indexProperty.name?cap_first}" name="end${indexProperty.name?cap_first}" class="date" style="width:200px;" dateFmt="yyyy-MM-dd"/></td>
                        <#else>
                            <td class="ali01" colspan="4">
                                <input type="text" id="${indexProperty.name}" name="${indexProperty.name}" style="width:200px;" />
                            </td>
                        </#if>
                </tr>
            </#list>
            <tr>
                <td colspan="5">
                    <button id="searchButton" type="button" onclick="searchHandler()"><span class="icon_find">查询</span>
                    </button>
                    <button type="button" onclick="resetSearch()"><span class="icon_reload">重置</span></button>
                </td>
            </tr>
        </table>
    </form>
</div>

    <#if exportEnabled>
<div class="box_tool_min padding_top2 padding_bottom2 padding_right5">
    <div class="center">
        <div class="ali01">
            <div class="right">
                <div class="padding_top5 padding_left10">
                    <a href="javascript:;"  onclick="exportData()"><span class="icon_export">导出为Excel</span></a>
                </div>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
    </#if>
<div >
    <table class="tableStyle" mode="list" useCheckBox="false" sortMode="true">
        <tr>
            <#assign colCount=0>
             <#list entity.properties as property>
                 <#if ! (property.name == entity.idProperty.name) >
                     <#assign colCount=colCount+1>
            <th><span onclick="sortHandler('${property.name}')" id="span_${property.name}">${property.chineseAlias}</span></th>
                 </#if>
             </#list>
        </tr>
        <c:if test="${"$"}{${entity.name}List.size()>0}" >
            <c:forEach items="${"$"}{${entity.name}List}" var="${entity.name}" >
                <tr onclick="onView('${"$"}{${entity.name}.${entity.idProperty.name}}')" class="hand">
         <#list entity.properties as property>
             <#if ! (property.name == entity.idProperty.name) >
                 <#if property.isReferenceProperty()>
                     <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    <td>${"$"}{${entity.name}.${refEntity.name}.${refEntity.listHeaderProperty.name}}</td>
                 <#elseif templateUtils.isBooleanProperty(property) >
                    <td>${"$"}{${entity.name}.${property.name}?"是":"否"}</td>
                 <#elseif templateUtils.isDateProperty(property) >
                    <td><fmt:formatDate value="${"$"}{${entity.name}.${property.name}}" pattern="yyyy年MM月dd日" /></td>
                 <#else>
                    <td>${"$"}{${entity.name}.${property.name}}</td>
                 </#if>
             </#if>
         </#list>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${"$"}{${entity.name}List.size()<=0}">
            <tr>
                <td colspan="${colCount}">找不到相关记录</td>
            </tr>
        </c:if>
    </table>
</div>

<div style="height:35px;">
    <div class="float_left padding5">
        数据共${"$"}{pager.totalRows}条
    </div>
    <div class="float_right padding5">
        <div class="pageNumber" total="${"$"}{pager.totalRows}"
             pageSize="${"$"}{pager.pageSize}" page="${"$"}{pager.pageNo-1}"
             showSelect="true" showInput="true" id="pageContent"></div>
    </div>
    <div class="clear"></div>
</div>


<script type="text/javascript">
    var booleanData = {list: [{key: "是", value: true}, {key: "否", value: false}]}
    <#list refEntities as refEntity>
    var ${refEntity.name}Data={
        list:[]
    };
    </#list>
    var $pager;

    function loadGridRenderData(url, list, name, refresh) {
        $.post(url,
                {refresh: refresh ? "y" : null},
                function (result) {
                    if (result && result.reason) {
                        top.Dialog.alert("读取数据失败, 原因:" + result.reason);
                    } else {
                        list.list = result.list;
                        if (list.list.length <= 0) {
                            top.Dialog.alert("辅助数据" + name + "列表为空!<br />");
                        }
                <#list indexedProperties as indexProperty>
                    <#if indexProperty.isReferenceProperty() >
                        <#assign refEntity=entity.mappingRepository.findEntityByClass(indexProperty.refEntityFullClassName)>
                        <#if !templateUtils.isDepartmentInfoType(refEntity)>
                        if (name == '${refEntity.name}') {
                            var ctrl=$("#${indexProperty.name}");
                            ctrl.data("data",list);
                            //刷新下拉框
                            ctrl.setValue("${"$"}{${indexProperty.name}}");
                            ctrl.render();
                        }
                        </#if>
                    </#if>
                </#list>
                    }
                }, "json").error(function () {
            top.Dialog.alert("读取数据失败")
        });
    }

    function loadReferenceData(refresh) {
    <#list refEntities as refEntity>
        loadGridRenderData("${"$"}{baseDir}/${"$"}{ctrlUrl}/list${refEntity.classInfo.name}",${refEntity.name}Data,"${refEntity.name}" ,refresh);
    </#list>
    }

    function initComplete(){

        //当提交表单刷新本页面时关闭弹窗

        top.Dialog.close();

    <#list indexedProperties as property>
        <#if property.isReferenceProperty()>
            <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        <#elseif templateUtils.isBooleanProperty(property) >
        <#elseif templateUtils.isDateProperty(property) >
        $("#start${property.name?cap_first}").val("${"$"}{start${property.name?cap_first}}");
        $("#end${property.name?cap_first}").val("${"$"}{end${property.name?cap_first}}");
        <#else>
        $("#${property.name}").val("${"$"}{${property.name}}");
        </#if>
    </#list>
        loadReferenceData(false);
        $pager = $("#pageContent");
        $pager.bind("pageChange",function(e,index){
            var pageNo = index + 1;
            $("#pageNo").val(pageNo);
            $("#pageSize").val(Number($pager.attr("pageSize")));
            postData();
        });

        $pager.bind("sizeChange",function(e,num){
            var pageSize = num;
            $("#pageSize").val(pageSize);
            postData();
        });

        changeSortStyle();
    }

    //初始化排序样式
    function changeSortStyle(){
        var sortName = $("#sort").val();
        var direction = $("#direction").val();
        var th_span = $("#span_" + sortName);
        th_span.removeClass("sort_off");
        if("asc" == direction){
            th_span.addClass("sort_up");
        }else{
            th_span.addClass("sort_down");
        }
    }

    //排序
    function sortHandler(sortName){
        var currentSort = $("#sort").val();
        var currentDirection = $("#direction").val();
        if(sortName == currentSort){
            if(currentDirection == "asc"){
                $("#direction").val("desc");
            }else{
                $("#direction").val("asc")
            }
        }else{
            $("#sort").val(sortName);
            $("#direction").val("asc");
        }
        postData();
    }

    //查看
    function onView(id){
        top.Dialog.open({
            URL:"${"$"}{baseDir}/${"$"}{ctrlUrl}/view-detail/" + id,
            Title:"查看${entity.chineseAlias}",Width:4000,Height:3000});
    }

    //查询
    function searchHandler(){
        postData();
    }

    function resetSearch(){
        $("#queryForm")[0].reset();
        $("#sort").val("id");
        $("#direction").val("asc");
        $("#pageNo").val(1);
        $("#pageSize").val($pager.attr("pageSize"));
        postData();
    }

    //提交表单
    function postData(){
        var myform = document.getElementById("queryForm");
        myform.submit();
    }

    function customHeightSet(contentHeight){
        $("#scrollContent").height(contentHeight-fixObjHeight);
    }

    <#if exportEnabled>
    function exportData() {
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
        form.appendTo('body');
        iframe.appendTo('body');
        form.submit();
        iframe.remove();
        form.remove();
    }
    </#if>
</script>
</body>
</html>