package com.lt.testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataFromSheet2 {

	public static void main(String[] args) throws Throwable {
	
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet4");
		 
		int rowIndex = sh.getLastRowNum(); 
		for(int i=0 ; i<rowIndex; i++) {
			//step 3 : get the control of the Row-1
			Row row =  sh.getRow(i);
			
			//step 4 : read the data from cell-2 
			String  user = row.getCell(0).getStringCellValue();
			String  password = row.getCell(1).getStringCellValue();
			
			System.out.println(user + "==>"+password);
			
		}

		 
		//step 5 : close workBook
		 wb.close();
		
		
		

	}

}
