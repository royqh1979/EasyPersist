<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <base href="${"$"}{baseDir}/"/>
    <title>${entity.chineseAlias}察看</title>
    <!--框架必需start-->
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/jquery.js"></script>
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/language/cn.js"></script>
    <script type="text/javascript" src="${"$"}{baseDir}/qui/libs/js/framework.js"></script>
    <link href="${"$"}{baseDir}/qui/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" id="skin" prePath="${"$"}{baseDir}/qui/"/>
    <link rel="stylesheet" type="text/css" id="customSkin"/>
    <!--框架必需end-->

</head>
<body>
<h2>${entity.chineseAlias}察看</h2>
<table width="100%">
    <#assign i=0>
    <#list entity.properties as property>
        <#if ! (property == entity.idProperty) >
            <#assign i=i+1>
            <#if i%2==1 >
    <tr>
            </#if>
        <td>${property.chineseAlias}</td>
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
            <#if i%2==0>
    </tr>
            </#if>
        </#if>
    </#list>
    <#if i%2==1 >
        <td></td>
        <td></td>
    </tr>
    </#if>
</table>
</body>
</html>