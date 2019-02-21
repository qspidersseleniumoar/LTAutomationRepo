package com.lt.testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
	
		//get the read JAva Object of the Physical File
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		
		//step 1 : Open WorkBook in Read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//step 2 : get the control of the Sheet1
		Sheet sh = wb.getSheet("Sheet1");
		 
		//step 3 : get the control of the Row-1
		Row row =  sh.getRow(1);
		
		//step 4 : read the data from cell-2 & cel-3 , cel4
		String  userFirstNAme = row.getCell(2).getStringCellValue();
		String  userLAstNAme = row.getCell(3).getStringCellValue();
		String  password = row.getCell(4).getStringCellValue();
		
		
		 System.out.println(userFirstNAme);
		 System.out.println(userLAstNAme);

		 System.out.println(password);

	
		 
		//step 5 : close workBook
		 wb.close();
		
		
		

	}

}
