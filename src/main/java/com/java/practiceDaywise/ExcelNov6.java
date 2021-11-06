package com.java.practiceDaywise;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelNov6 {
    @Test
    public void test1() throws  Exception {
        XSSFWorkbook workbook = new XSSFWorkbook("./data/excelSheet.xlsx");
        XSSFSheet sheet=workbook.getSheet("Sheet1");

        int rowcount=sheet.getPhysicalNumberOfRows();
        System.out.println(rowcount);
        DataFormatter dataFormat=new DataFormatter();
        Object value=dataFormat.formatCellValue(sheet.getRow(0).getCell(0));
        System.out.println(value);
    }


}
