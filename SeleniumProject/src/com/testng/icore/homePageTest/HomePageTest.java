package com.testng.icore.homePageTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lt.genericlib.BaseClass;

public class HomePageTest extends BaseClass{
	
	
	@Test
	public void verifyHomePage() {
		String expectedHomePage = "actiTIME - Task";
		
		String actPAge = driver.getTitle();
		
		Assert.assertEquals(actPAge, expectedHomePage , "Home page is not verified==Fail");
		
		
	}
	
	@Test
	public void verifyLogo() {
		
		boolean status = driver.findElement(By.xpath("//img[contains(@src,'default-logo.png?')]")).isDisplayed();

		Assert.assertTrue(status,"Home Logo page is not verified==Fail");

	}
	

}
