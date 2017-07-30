<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="${"$"}{baseDir}/"/>
    <title>${entity.chineseAlias}编辑</title>

    <!--分离模式必须start -->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/jquery.js"></script>
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/language/cn.js"></script>
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/framework.js"></script>
    <link href="${"$"}{baseDir}/qui/libs/css/import_basic.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" id="skin" prePath="${"$"}{baseDir}/qui/" splitMode="true" href="${"$"}{baseDir}/qui/libs/skins/blue/style.css"/>
    <link rel="stylesheet" type="text/css" id="customSkin" href="${"$"}{baseDir}/qui/system/layout/skin/style.css"/>
    <!--分离模式必须end -->

    <!--弹窗组件start-->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/popup/drag.js"></script>
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/popup/dialog.js"></script>
    <!--弹窗组件end-->

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

    <script type="text/javascript" src="${"$"}{baseDir}/js/json2.js"></script>
</head>
<div class="box1" panelTitle="${entity.chineseAlias}编辑">
    <div class="basicTab" iframeMode="true" id="myTab">
        <div style="width:100%;" id="tabContent">
            <IFRAME scrolling="no" width="100%" height="100%" frameBorder=0 id=frmrightChild name=frmrightChild allowTransparency="true"></IFRAME>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" >
    function initComplete() {
        //当提交表单刷新本页面时关闭弹窗
        top.Dialog.close();
        var myTab=$("#myTab");
        var data={
            list:[
        <c:choose>
        <c:when test="${"$"}{isUpdate}" >
                { name:"${entity.chineseAlias}",
                    url:"${"$"}{baseDir}/${"$"}{ctrlUrl}/editUI-update/${"$"}{id}"}
        <#list entity.subEntities as subEntityInfo>
            <#assign subEntity=subEntityInfo.subEntity >
                ,{ name:"${subEntity.chineseAlias}",
                   url:"${"$"}{baseDir}/${"$"}{ctrlUrl}/editUI-sub-${subEntity.name}/${"$"}{id}"}
        </#list>
        <#list entity.mapRelationInfos as mapRelationInfo>
            <#assign relationEntity=entity.mappingRepository.findEntityByClass(mapRelationInfo.mappingEntityFullClassName) >
                ,{ name:"${relationEntity.chineseAlias}",
            url:"${"$"}{baseDir}/${"$"}{ctrlUrl}/editUI-mapping-${relationEntity.name}/${"$"}{id}"}
        </#list>
        </c:when>
        <c:otherwise>
                { name:"新建${entity.chineseAlias}",
                    url:"${"$"}{baseDir}/${"$"}{ctrlUrl}/editUI-create"}
        </c:otherwise>
        </c:choose>
            ]
        }
        if (myTab.data) {
            myTab.data('data',data)
        } else {
            myTab.attr('data',JSON.stringify(data));
        }
        myTab.render();
    }
    function customHeightSet(contentHeight) {
        $("#tabContent").height(contentHeight - 130)
    }
</script>
</html>