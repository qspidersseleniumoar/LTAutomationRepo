package com.lt.icore.usertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lt.icore.genericLib.BaseClass;
import com.lt.icore.genericLib.FileLib;
import com.lt.icore.objectrepositorylib.AddUSer;
import com.lt.icore.objectrepositorylib.Home;
import com.lt.icore.objectrepositorylib.UserList;

@Listeners(com.lt.icore.genericLib.ListnerImplmentation.class)
public class USerTest  extends BaseClass{
	   
	@Test
	public void createUSerTest() throws Throwable {
		//get test Data from eXcel
		FileLib fLib = new FileLib();
		String fNAme = fLib.getExcelData("Sheet1", 1, 2);
		String lNAme = fLib.getExcelData("Sheet1", 1, 3);
		String user = fLib.getExcelData("Sheet1", 1, 4);
		String email = fLib.getExcelData("Sheet1", 1, 5);
		String password = fLib.getExcelData("Sheet1", 1, 6);
		//step 1 : navigate to USer PAge
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.navigateToUSerPAge();
       //step 2 : click on Add user button
		UserList ulp = PageFactory.initElements(driver, UserList.class);
		ulp.naviagateAddUSerPAge();
		//step 3 : create user 
		AddUSer up = PageFactory.initElements(driver, AddUSer.class);
		up.createUSer(fNAme, lNAme, user, email, password);
	}
	
	@Test
	public void createUSerWithTimeZoneTest() throws Throwable {
		//get test Data from eXcel
		FileLib fLib = new FileLib();
		String fNAme = fLib.getExcelData("Sheet1", 4, 2);
		String lNAme = fLib.getExcelData("Sheet1", 4, 3);
		String user = fLib.getExcelData("Sheet1", 4, 4);
		String email = fLib.getExcelData("Sheet1", 4, 5);
		String password = fLib.getExcelData("Sheet1", 4, 6);
		String timeZone = fLib.getExcelData("Sheet1", 4, 7);
		
		//step 1 : navigate to USer PAge
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.navigateToUSerPAge();
       //step 2 : click on Add user button
		UserList ulp = PageFactory.initElements(driver, UserList.class);
		ulp.naviagateAddUSerPAge();
		//step 3 : create user 
		AddUSer up = PageFactory.initElements(driver, AddUSer.class);
		up.createUSer(fNAme, lNAme, user, email, password,timeZone);
	}
	
}
