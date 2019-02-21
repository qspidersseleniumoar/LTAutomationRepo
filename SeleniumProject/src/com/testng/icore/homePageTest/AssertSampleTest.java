package com.testng.icore.homePageTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.lt.genericlib.BaseClass;

@Listeners
public class AssertSampleTest  extends BaseClass{
	

	@Test
	public void verifyHomePage() {
		SoftAssert s = new SoftAssert();
          Reporter.log("step 1" ,true);
          Reporter.log("step 2",true);
          s.assertEquals("HDFC", "HDF");
          Reporter.log("step 3",true);
          s.assertEquals("9880", "");
          Reporter.log("step 4",true);
          Reporter.log("step 5",true);
          
          s.assertAll();
	}
	
	@Test
	public void verifyLogo() {
		Reporter.log("=====================================");
        Reporter.log("step 1");
        Reporter.log("step 2");
        Reporter.log("step 3");
        Reporter.log("step 4");
        Reporter.log("step 5");
	
	}
	

}
