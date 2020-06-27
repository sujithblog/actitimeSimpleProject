package com.krn.actitime.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellLibrary {

	public String getExcellData(String sheetName, int rowNum, int colNum) {
		String retValue = null;
		try {
				
			FileInputStream fis = new FileInputStream("../Data/data.xlsx");
			//../ will come cot of the project
			//FileInputStream fis = new FileInputStream("/home/skombettu/Desktop/Batch155/Batch155/Project/Data/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			org.apache.poi.ss.usermodel.Cell cell = row.getCell(colNum);
			retValue = cell.getStringCellValue();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retValue;
	}
}
