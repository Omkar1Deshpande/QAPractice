package com.ammroth.framework.utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.ammroth.framework.config.ConfigReader;

public class ExcelUtils {
	
	public static String getLoginData(int sheet, int row, int cell) {
	ConfigReader.loadConfig();
	String file_path = ConfigReader.getProp("testDataPath");
	try {
		
		FileInputStream fis = new FileInputStream(file_path);
		Workbook wb = null;
		wb = WorkbookFactory.create(fis);
		String un = wb.getSheetAt(sheet).getRow(row).getCell(cell).getStringCellValue();
		return un;
		} 
	
	catch (Exception e) {
		e.printStackTrace();
		return null;
	}
	}

}
