public static class ${(processorName)!"ExportRowToExcelProcessor"} implements ${entityToExport.classInfo.name}Persistor.RowProcessor{
<#list entityToExport.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entityToExport.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
    List<${refEntity.classInfo.name}> list${refEntity.classInfo.name};
    </#if>
</#list>
    private HSSFSheet sheet;
    private int startRow;
    private int startCol;
    private HSSFCellStyle dateCellStyle;
    private HSSFCellStyle numberCellStyle;

    public ExportRowToExcelProcessor(<#list entityToExport.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entityToExport.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        List<${refEntity.classInfo.name}> list${refEntity.classInfo.name},
    </#if>
</#list>HSSFSheet sheet, int startRow, int startCol) {
<#list entityToExport.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entityToExport.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        this.list${refEntity.classInfo.name}=list${refEntity.classInfo.name};
    </#if>
</#list>
        this.sheet = sheet;
        this.startRow = startRow;
        this.startCol=startCol;

        init();
        createTitleRow();
    }

    private void init() {
        HSSFWorkbook workbook=sheet.getWorkbook();
        dateCellStyle = workbook.createCellStyle();
        HSSFDataFormat format = workbook.createDataFormat();
        dateCellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
        numberCellStyle = workbook.createCellStyle();
        numberCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
    }

    private void createTitleRow() {
        HSSFRow row = sheet.createRow(startRow);
        HSSFCell cell;
        int t = startCol;
        cell=row.createCell(t++);
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue("${entityToExport.idProperty.chineseAlias}");
        <#list entityToExport.properties as property>
            <#if property == entityToExport.idProperty >
            <#else>
                <#if property.isReferenceProperty()>
                    <#assign refEntity=entityToExport.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    <#if refEntity.listHeaderProperty??>
                        <#assign listHeader=refEntity.listHeaderProperty>
                    <#else>
                        <#assign listHeader=refEntity.idProperty>
                    </#if>
                {
                String[] strings=new String[list${refEntity.classInfo.name}.size()];
                for (int j=0;j<list${refEntity.classInfo.name}.size();j++){
                ${refEntity.classInfo.name} ${refEntity.name}=list${refEntity.classInfo.name}.get(j);
                strings[j]=""+${refEntity.name}.${listHeader.getter}();
                }
                CellRangeAddressList addressList = new CellRangeAddressList(startRow+1, 65534, t, t);
                DataValidationHelper dvHelper = sheet.getDataValidationHelper();
                DataValidationConstraint dvConstraint = dvHelper.createExplicitListConstraint(strings);
                DataValidation validation = dvHelper.createValidation(dvConstraint, addressList);
                sheet.addValidationData(validation);
                }
                </#if>
            cell=row.createCell(t++);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            cell.setCellValue("${property.chineseAlias}");
            </#if>
        </#list>
    }
    @Override
    public void processRow(ResultSet rs, int i) throws SQLException {
        ${entityToExport.classInfo.name} ${entityToExport.name}=${entityToExport.classInfo.name}Persistor.SIMPLE_ROW_MAPPER.mapRow(rs,i);
        createRow(${entityToExport.name},i);
    }

    public void createRow(${entityToExport.classInfo.name} ${entityToExport.name}, int i) {
        HSSFRow row = sheet.createRow(startRow+1+i);
        int t = startCol;
        HSSFCell cell;

        cell=row.createCell(t++);
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellValue(${entityToExport.name}.${entityToExport.idProperty.getter}());
        <#list entityToExport.properties as property>
            <#if property == entityToExport.idProperty >
            <#else>
            cell=row.createCell(t++);
                <#if property.isReferenceProperty()>
                    <#assign refEntity=entityToExport.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    <#if refEntity.listHeaderProperty??>
                        <#assign listHeader=refEntity.listHeaderProperty>
                    <#else>
                        <#assign listHeader=refEntity.idProperty>
                    </#if>
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellValue("");
                for (${refEntity.classInfo.name} ${refEntity.name}:list${refEntity.classInfo.name}){
                if (${refEntity.name}.${refEntity.idProperty.getter}()==${entityToExport.name}.${property.getter}()){
                cell.setCellValue(${refEntity.name}.${listHeader.getter}());
                }
                }
                <#elseif generator.isBooleanProperty(property) >
                cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
                cell.setCellValue(${entityToExport.name}.${property.getter}()?"是":"否");
                <#elseif property.isTemporal() >
                cell.setCellStyle(dateCellStyle);
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(${entityToExport.name}.${property.getter}());
                <#else>
                    <#if generator.isIntProperty(property) >
                    cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                    cell.setCellValue(${entityToExport.name}.${property.getter}());
                    <#elseif generator.isBigDecimalProperty(property) >
                    cell.setCellStyle(numberCellStyle);
                    cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                    cell.setCellValue(${entityToExport.name}.${property.getter}().doubleValue());
                    <#elseif generator.isNumberProperty(property) >
                    cell.setCellStyle(numberCellStyle);
                    cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                    cell.setCellValue(${entityToExport.name}.${property.getter}());
                    <#else>
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cell.setCellValue(${entityToExport.name}.${property.getter}());
                    </#if>
                </#if>
            </#if>
        </#list>
    }
}