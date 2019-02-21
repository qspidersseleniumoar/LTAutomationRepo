package com.lt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lt.genericlib.WebDriverCommonLib;

public class FaceBookCreateAccountTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		WebDriverCommonLib lib = new WebDriverCommonLib();
		boolean s3 = lib.selectifElemnetisAvailable(driver.findElement(By.id("day")), "30");	
		boolean s1 =lib.selectifElemnetisAvailable(driver.findElement(By.id("month")), "Apr");
		boolean s2 =lib.selectifElemnetisAvailable(driver.findElement(By.id("year")), "1947");
	System.out.println(s1 + ", "+s2 +", "+s3);	
	
	
	
	}

}











