package com.lt.multipleElemnets;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAllPRoductLinkNAme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
	//close the Login Window
		driver.findElement(By.xpath("//button[text()='✕']")).click();
   //search for Iphone XR 
		driver.findElement(By.name("q")).sendKeys("iphone xr",Keys.ENTER);
		
		
		List<WebElement> lst = driver.findElements(By.xpath("//div[contains(@class,'bhgxx')]/div/div/div/a[2]"));

		for(WebElement wb : lst) {
		    System.out.println(wb.getText());
		}
		

	}

}


