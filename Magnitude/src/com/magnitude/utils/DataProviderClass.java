package com.magnitude.utils;

import org.testng.annotations.DataProvider;

import com.magnitude.scripts.BaseClass;

public class DataProviderClass extends BaseClass{
	
	@DataProvider(name="LoginData")
	public Object[][] getLoginData() {
		
		ExcelReader reader = new ExcelReader(ExcelFilePath);
		
		int rowCount = reader.RowCount("Login");
		
		Object[][] data = new Object[rowCount][];
		
		for(int i=0; i<rowCount; i++) {
			
			
			
		}
		return data;
	}

}
