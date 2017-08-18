public class ExportRowToExcelProcessor implements ${entity.classInfo.name}Persistor.RowProcessor{
<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
    List<${refEntity.classInfo.name}> list${refEntity.classInfo.name};
    </#if>
</#list>
    private HSSFSheet sheet;
    private int startRow;
    private int startCol;
    private HSSFCellStyle dateCellStyle;
    private HSSFCellStyle numberCellStyle;

    public ExportRowToExcelProcessor(<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
        List<${refEntity.classInfo.name}> list${refEntity.classInfo.name},
    </#if>
</#list>HSSFSheet sheet, int startRow, int startCol) {
<#list entity.properties as property>
    <#if property.isReferenceProperty()>
        <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
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
        cell.setCellValue("${entity.idProperty.chineseAlias}");
        <#list entity.properties as property>
            <#if property == entity.idProperty >
            <#else>
                <#if property.isReferenceProperty()>
                    <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
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
        ${entity.classInfo.name} ${entity.name}=persistor.SIMPLE_ROW_MAPPER.mapRow(rs,i);
        createRow(${entity.name},i);
    }

    public void createRow(${entity.classInfo.name} ${entity.name}, int i) {
        HSSFRow row = sheet.createRow(startRow+1+i);
        int t = startCol;
        HSSFCell cell;

        cell=row.createCell(t++);
        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        cell.setCellValue(${entity.name}.${entity.idProperty.getter}());
        <#list entity.properties as property>
            <#if property == entity.idProperty >
            <#else>
            cell=row.createCell(t++);
                <#if property.isReferenceProperty()>
                    <#assign refEntity=entity.mappingRepository.findEntityByClass(property.refEntityFullClassName)>
                    <#if refEntity.listHeaderProperty??>
                        <#assign listHeader=refEntity.listHeaderProperty>
                    <#else>
                        <#assign listHeader=refEntity.idProperty>
                    </#if>
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellValue("");
                for (${refEntity.classInfo.name} ${refEntity.name}:list${refEntity.classInfo.name}){
                if (${refEntity.name}.${refEntity.idProperty.getter}()==${entity.name}.${property.getter}()){
                cell.setCellValue(${refEntity.name}.${listHeader.getter}());
                }
                }
                <#elseif generator.isBooleanProperty(property) >
                cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
                cell.setCellValue(${entity.name}.${property.getter}());
                <#elseif property.isTemporal() >
                cell.setCellStyle(dateCellStyle);
                cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                cell.setCellValue(${entity.name}.${property.getter}());
                <#else>
                    <#if generator.isIntProperty(property) >
                    cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                    cell.setCellValue(${entity.name}.${property.getter}());
                    <#elseif generator.isBigDecimalProperty(property) >
                    cell.setCellStyle(numberCellStyle);
                    cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                    cell.setCellValue(${entity.name}.${property.getter}().doubleValue());
                    <#elseif generator.isNumberProperty(property) >
                    cell.setCellStyle(numberCellStyle);
                    cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                    cell.setCellValue(${entity.name}.${property.getter}());
                    <#else>
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    cell.setCellValue(${entity.name}.${property.getter}());
                    </#if>
                </#if>
            </#if>
        </#list>
    }
}