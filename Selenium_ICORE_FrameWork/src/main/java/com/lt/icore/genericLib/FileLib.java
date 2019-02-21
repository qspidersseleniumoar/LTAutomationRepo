package com.lt.icore.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Deeapak
 *
 */
public class FileLib {

	/**
	 * get the data from the frameWork config File
	 * @param key
	 * @return value of the key
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		//create a Java Object to PhysicalFile 
		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		//load all the Data avilable in Properties File USing PRopertiesClass
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;
		
	}
	/**
	 *  get the data from testData.xlsx based on user argument
	 *   row always start from zero
	 *   column always start from Zero
	 * @param sheetNAme
	 * @param rowNum
	 * @param celNum
	 * @return  String data
	 * @throws Throwable 
	 */
	
	public String getExcelData(String sheetNAme , int rowNum , int celNum) throws Throwable {
				FileInputStream fis = new FileInputStream("./data/testData.xlsx");			
				//step 1 : Open WorkBook in Read mode 
				Workbook wb = WorkbookFactory.create(fis);		
				//step 2 : get the control of the Sheet1 
				Sheet sh = wb.getSheet(sheetNAme);	 
				//step 3 : get the control of the Row-1 
				Row row =  sh.getRow(rowNum);	
				//step 4 : read the data from cell-2 & cel-3 , cel4 
				String  data = row.getCell(celNum).getStringCellValue();
				 wb.close();

		return data;
	}
    /**
	 * set the data in WorkBook
	 * @param sheetNAme
	 * @param rowNum
	 * @param celNum
	 * @param data
	 * @throws Throwable
	 */
	public void setExcelData(String sheetNAme , int rowNum , int celNum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");			
		//step 1 : Open WorkBook in Read mode 
		Workbook wb = WorkbookFactory.create(fis);		
		//step 2 : get the control of the Sheet1 
		Sheet sh = wb.getSheet(sheetNAme);	 
		//step 3 : get the control of the Row-1 
		Row row =  sh.getRow(rowNum);	
		//step 4 : create a cell 
		 row.createCell(celNum).setCellValue(data);
		 FileOutputStream fos = new FileOutputStream("./data/testData.xlsx");
		 wb.write(fos);
		 wb.close();
}

	/**
	 * 
	 * @param query
	 * @return
	 */
	public ResultSet executeQuery(String query) {
		
		return null;
		
	}
	
	
	
	
	
}
