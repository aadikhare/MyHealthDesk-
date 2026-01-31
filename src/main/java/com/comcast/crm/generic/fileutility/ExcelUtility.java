package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getDataFromExcel(String sheet, int rowNum, int colNum) throws Exception {
		
		FileInputStream fis = new FileInputStream("./TestScriptData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data= wb.getSheet(sheet).getRow(rowNum).getCell(colNum).getStringCellValue();
		wb.close();
		return data;
		 
	}
	
	
public int getRowCount(String sheet) throws Exception {
		
		FileInputStream fis = new FileInputStream("./TestScriptData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowNum= wb.getSheet(sheet).getLastRowNum();
		wb.close();
		return rowNum;
		 
	}


public void setDataInToExcel(String sheet, int rowNum, int colNum, String data) throws Exception {

    FileInputStream fis = new FileInputStream("./TestScriptData/TestScriptData.xlsx");
    Workbook wb = WorkbookFactory.create(fis);

    Sheet sh = wb.getSheet(sheet);

    Row row = sh.getRow(rowNum);
    if (row == null) {
        row = sh.createRow(rowNum);
    }

    Cell cell = row.getCell(colNum);
    if (cell == null) {
        cell = row.createCell(colNum);
    }

    cell.setCellType(CellType.STRING);
    cell.setCellValue(data);

    FileOutputStream fos = new FileOutputStream("./TestScriptData/TestScriptData.xlsx");
    wb.write(fos);

    wb.close();
    fis.close();
    fos.close();
}



	 
}



