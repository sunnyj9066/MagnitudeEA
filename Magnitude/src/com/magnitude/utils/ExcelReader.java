package com.magnitude.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.magnitude.scripts.BaseClass;

public class ExcelReader extends BaseClass{
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static String data;
	
	public ExcelReader(String ExcelFilePath) {
		
		File file = new File(ExcelFilePath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String ReadExcelData(String sheetName, int rownum, int cellnum) {
		sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
	}
	
	public int RowCount(String sheetName) {
		int row = wb.getSheet(sheetName).getLastRowNum();
		row = row+1;
		return row;
	}
	
}
