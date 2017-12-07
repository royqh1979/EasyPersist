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
                startRow+1,col,${entityToImport.idProperty.chineseAlias}));
    }
    if (!"${entityToImport.idProperty.chineseAlias}".equals(cell.getStringCellValue())) {
        throw new RuntimeException(String.format("格式错误:第%d行第%d列应该是%s",
                startRow+1,col,"${entityToImport.idProperty.chineseAlias}"));
    }
        cell.setCellValue(${entityToImport.name}.${entityToImport.idProperty.getter}());
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
${entityToImport.name}.setId((int)row.getCell(startCol+0).getNumericCellValue());
${entityToImport.name}.setType(row.getCell(startCol+1).getStringCellValue());
${entityToImport.name}List.add(${entityToImport.name});
    }
    persistor.batchCreate(${entityToImport.name}List);
    dirty=true;
} catch (IOException e) {
    throw new RuntimeException(e);
}