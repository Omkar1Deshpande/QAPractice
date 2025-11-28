package com.ammroth.tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("Hello World");
		
		String file_path = "src/test/resources/testdata/LoginData.xlsx";
		FileInputStream fis = new FileInputStream(file_path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		String un = wb.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(un);
		

	}

	
}
