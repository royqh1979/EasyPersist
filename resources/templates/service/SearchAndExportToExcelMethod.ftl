<#compress >
    public void exportToExcel(
    <#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >Date start${indexProperty.name?cap_first},
        Date end${indexProperty.name?cap_first},
    <#else>${templateUtils.getObjectType(indexProperty.type)} ${indexProperty.name},</#if>
    </#list><#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    List<${refEntity.classInfo.name}> list${refEntity.classInfo.name},
    </#if>
</#list>HSSFSheet sheet, int startRow, int startCol) throws IOException {
            ExportRowToExcelProcessor processor=new ExportRowToExcelProcessor(<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                list${refEntity.classInfo.name},
    </#if>
</#list>sheet, startRow, startCol);
            persistor.findAll(<#list indexedProperties as indexProperty><#if templateUtils.isDateProperty(indexProperty) >start${indexProperty.name?cap_first},
                end${indexProperty.name?cap_first},
<#elseif templateUtils.isRangeTypeProperty(indexProperty) >
    ${indexProperty.name},${indexProperty.name} ,
<#else>
    ${indexProperty.name},
</#if></#list>processor);
        }
    public void exportDetailToExcel(HSSFSheet sheet, Map<String, Object> resultSet) {
        HSSFWorkbook workbook = sheet.getWorkbook();
        HSSFCellStyle dateCellStyle = workbook.createCellStyle();
        HSSFDataFormat format = workbook.createDataFormat();
        dateCellStyle.setDataFormat(format.getFormat("yyyy/m/d"));
        HSSFCellStyle numberCellStyle = workbook.createCellStyle();
        numberCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
        HSSFCellStyle borderNumberCellStyle = workbook.createCellStyle();
        HSSFCellStyle borderDateCellStyle = workbook.createCellStyle();
        HSSFCellStyle borderCellStyle = workbook.createCellStyle();
        borderDateCellStyle.setDataFormat(format.getFormat("yyyy/m/d"));
        borderNumberCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
        borderDateCellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        borderDateCellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        borderDateCellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        borderDateCellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
        borderNumberCellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        borderNumberCellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        borderNumberCellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        borderNumberCellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
        borderCellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        borderCellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        borderCellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        borderCellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
        HSSFRow row;
        HSSFCell cell;
        row=sheet.createRow(0);
        cell=row.createCell(0);
        cell.setCellValue("${entity.chineseAlias}详情");
        int r=0,c=0;
        Map<String,Object> ${entity.name}=(Map<String, Object>)resultSet.get("${entity.name}");
    <#assign i=0>
    <#list entity.properties as property>
        <#if ! (property == entity.idProperty) >
            <#assign i=i+1>
            <#if i%3==1 >
        r++;c=0;
        row=sheet.createRow(r);
            </#if>
        cell=row.createCell(c++);
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue("${property.chineseAlias}");
        cell=row.createCell(c++);
            <#if property.isReferenceProperty()>
                <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue(((${refEntity.classInfo.name})(${entity.name}.get("${refEntity.name}"))).${refEntity.listHeaderProperty.getter}());
            <#elseif templateUtils.isBooleanProperty(property) >
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue((boolean)(${entity.name}.get("${property.name}"))?"是":"否");
            <#elseif property.isTemporal() >
        cell.setCellStyle(dateCellStyle);
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellValue((Date)(${entity.name}.get("${property.name}")));
            <#else>
                <#if templateUtils.isIntProperty(property) >
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellValue((int)(${entity.name}.get("${property.name}")));
                <#elseif templateUtils.isBigDecimalProperty(property) >
        cell.setCellStyle(numberCellStyle);
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellValue(((BigDecimal)(${entity.name}.get("${property.name}"))).doubleValue());
                <#elseif templateUtils.isNumberProperty(property) >
        cell.setCellStyle(numberCellStyle);
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellValue((double)(${entity.name}.get("${property.name}")));
                <#else>
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue(${entity.name}.get("${property.name}")==null?"":${entity.name}.get("${property.name}").toString());
                </#if>
            </#if>
        </#if>
    </#list>
    <#list entity.subEntities as subEntityInfo>
        <#assign subEntity=subEntityInfo.subEntity >
        <#assign subRefProperty= subEntityInfo.subEntityReferenceProperty >
        r+=3;
        row=sheet.createRow(r);
        cell=row.createCell(0);
        cell.setCellValue("${subEntity.chineseAlias}");
            <#assign colCount=0>
        r++;
        row=sheet.createRow(r);
         <#list subEntity.properties as property>
             <#if ! (property.name == subEntity.idProperty.name) >
                 <#assign colCount=colCount+1>
    cell=row.createCell(${colCount-1});
    cell.setCellStyle(borderCellStyle);
    cell.setCellType(Cell.CELL_TYPE_STRING);
    cell.setCellValue("${property.chineseAlias}");
             </#if>
             </#list>
        if (((List<Map<String,Object>>)resultSet.get("${subEntity.name}List")).size()>0) {
            for (Map<String,Object> ${subEntity.name}:(List<Map<String,Object>>)resultSet.get("${subEntity.name}List")) {
        r++;c=0;
        row=sheet.createRow(r);
         <#list subEntity.properties as property>
             <#if ! (property == subEntity.idProperty) >
                cell=row.createCell(c++);
                cell.setCellStyle(borderCellStyle);
                 <#if property.isReferenceProperty()>
                     <#assign refEntity=subEntity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    <#if refEntity.listHeaderProperty?? >
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellValue(((${refEntity.classInfo.name})(${subEntity.name}.get("${refEntity.name}"))).${refEntity.listHeaderProperty.getter}());
                    <#else>
                cell.setCellValue(((${refEntity.classInfo.name})(${subEntity.name}.get("${refEntity.name}"))).${refEntity.idProperty.getter}());
                    </#if>
                 <#elseif templateUtils.isBooleanProperty(property) >
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellValue((boolean)(${subEntity.name}.get("${property.name}"))?"是":"否");
                 <#elseif property.isTemporal() >
                cell.setCellStyle(borderDateCellStyle);
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue((Date)(${subEntity.name}.get("${property.name}")));
                 <#else>
                     <#if templateUtils.isIntProperty(property) >
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue((int)(${subEntity.name}.get("${property.name}")));
                     <#elseif templateUtils.isBigDecimalProperty(property) >
                cell.setCellStyle(borderNumberCellStyle);
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(((BigDecimal)(${subEntity.name}.get("${property.name}"))).doubleValue());
                     <#elseif templateUtils.isNumberProperty(property) >
                cell.setCellStyle(borderNumberCellStyle);
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue((double)(${subEntity.name}.get("${property.name}")));
                     <#else>
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellValue(${subEntity.name}.get("${property.name}")==null?"":${subEntity.name}.get("${property.name}").toString());
                     </#if>
                 </#if>
             </#if>
         </#list>
            }
        } else {
        }
    </#list>

    }
</#compress>