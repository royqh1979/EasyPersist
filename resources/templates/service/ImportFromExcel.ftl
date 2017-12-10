try {
    HSSFWorkbook wb=new HSSFWorkbook(inputStream);
    if (wb.getNumberOfSheets()<1) {
        throw new RuntimeException("工作簿中没有工作表");
    }
    if (wb.getNumberOfSheets()>1) {
        throw new RuntimeException("工作簿中多于一个工作表");
    }
    HSSFSheet sheet=wb.getSheetAt(0);
    if (sheet.getLastRowNum()<startRow) {
        throw new RuntimeException("格式错误!找不到起始行");
    };
    /* 检查column */
    HSSFRow columnRow=sheet.getRow(startRow);
    HSSFCell cell;
    int col = startCol;
    cell = columnRow.getCell(col++);
    if (cell==null) {
        throw new RuntimeException(String.format("格式错误:在第%d行第%d列找不到栏目%s的标题",
                startRow+1,col,"${entityToImport.idProperty.chineseAlias}"));
    }
    if (!"${entityToImport.idProperty.chineseAlias}".equals(cell.getStringCellValue())) {
        throw new RuntimeException(String.format("格式错误:第%d行第%d列应该是%s",
                startRow+1,col,"${entityToImport.idProperty.chineseAlias}"));
    }
 <#list entityToImport.properties as property>
    <#if property == entityToImport.idProperty >
    <#else>
    cell = columnRow.getCell(col++);
    if (cell==null) {
        throw new RuntimeException(String.format("格式错误:在第%d行第%d列找不到栏目%s的标题",
                startRow+1,col,"${property.chineseAlias}"));
    }
    if (!"${property.chineseAlias}".equals(cell.getStringCellValue())) {
        throw new RuntimeException(String.format("格式错误:第%d行第%d列应该是%s",
                startRow+1,col,"${property.chineseAlias}"));
    }
    </#if>
</#list>


    /* 导入各行 */
    List<${entityToImport.classInfo.name}> ${entityToImport.name}List=new ArrayList<>();
    for (int i=startRow+1;i<=sheet.getLastRowNum();i++){
        HSSFRow row=sheet.getRow(i);
        ${entityToImport.classInfo.name} ${entityToImport.name}=new ${entityToImport.classInfo.name}();
        ${entityToImport.name}.${entityToImport.idProperty.setter}((int)row.getCell(startCol+0).getNumericCellValue());
<#list entityToImport.properties as property>
    <#if property == entityToImport.idProperty >
    <#else>
        <#if property.isReferenceProperty()>
            <#assign refEntity=entityToImport.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
            <#if refEntity.listHeaderProperty??>
                <#assign listHeader=refEntity.listHeaderProperty>
            <#else>
                <#assign listHeader=refEntity.idProperty>
            </#if>
            <#if refEntity.propertyUniqueIndexed(refEntity.listHeaderProperty) >
            ${entityToImport.name}.${property.setter}(${refEntity.name}Persistor.retrieveBy${refEntity.listHeaderProperty.name?cap_first}(row.getCell(startCol+${property?counter}).getStringCellValue()).${refEntity.idProperty.getter}());
            <#else>
            {
                List<${refEntity.classInfo.name}> ${refEntity.name}ValueList=${refEntity.name}Persistor.findBy${refEntity.listHeaderProperty.name?cap_first}(row.getCell(startCol+${property?counter}).getStringCellValue());
                if (${refEntity.name}ValueList.size()<1) {
                    throw new RuntimeException(String.format("第%d行:第%d列 找不到%s等于%s的%s对象",
                            i+1,startCol+${property?counter}+1,"${refEntity.listHeaderProperty.chineseAlias}",row.getCell(startCol+${property?counter}).getStringCellValue(),"${refEntity.chineseAlias}"
                        ));
                } else if (${refEntity.name}ValueList.size()>1) {
                    throw new RuntimeException(String.format("第%d行:第%d列 找不到%s等于%s的%s对象数量不唯一",
                            i+1,startCol+${property?counter}+1,"${refEntity.listHeaderProperty.chineseAlias}",row.getCell(startCol+${property?counter}).getStringCellValue(),"${refEntity.chineseAlias}"                        ));
                }
                ${entityToImport.name}.${property.setter}(${refEntity.name}ValueList.get(0).${refEntity.idProperty.getter}());
            }
            </#if>
        <#elseif templateUtils.isBooleanProperty(property) >
            ${entityToImport.name}.${property.setter}(row.getCell(startCol+${property?counter}).getBooleanCellValue());
       <#elseif property.isTemporal() >
            ${entityToImport.name}.${property.setter}(row.getCell(startCol+${property?counter}).getDateCellValue());
        <#else>
            <#if templateUtils.isIntProperty(property) >
                ${entityToImport.name}.${property.setter}((int)row.getCell(startCol+${property?counter}).getNumericCellValue());
            <#elseif templateUtils.isBigDecimalProperty(property) >
                ${entityToImport.name}.${property.setter}(BigDecimal.valueOf(row.getCell(startCol+${property?counter}).getNumericCellValue()));
            <#elseif templateUtils.isNumberProperty(property) >
                ${entityToImport.name}.${property.setter}(row.getCell(startCol+${property?counter}).getNumericCellValue());
            <#else>
                ${entityToImport.name}.${property.setter}(row.getCell(startCol+${property?counter}).getStringCellValue());
            </#if>
        </#if>
    </#if>
</#list>

${entityToImport.name}List.add(${entityToImport.name});
    }
    persistor.batchCreate(${entityToImport.name}List);
    dirty=true;
} catch (IOException e) {
    throw new RuntimeException(e);
}