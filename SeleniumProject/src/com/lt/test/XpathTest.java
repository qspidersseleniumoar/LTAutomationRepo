package com.lt.test;

import java.sql.Time;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {
/**
 * To capture number product available in inventry
 * @param args
 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
	//close the Login Window
		driver.findElement(By.xpath("//button[text()='✕']")).click();
   //search for Iphone XR 
		driver.findElement(By.name("q")).sendKeys("iphone xr",Keys.ENTER);
		
	
		//clikc on a Link, which opens new TAB
		driver.findElement(By.linkText("Apple iPhone XR (Black, 128 GB)")).click();

		//get all the Window Session ID
		Set<String> set = driver.getWindowHandles();
		//capture the Window ID from the Set-Collection
		Iterator<String> it = set.iterator();
		String parentSessionID = it.next();
		String childSessionID = it.next();
		
		//pass a driver control to Child Window
		driver.switchTo().window(childSessionID);
		
		//click on "Add to cart" button , available in NEW TAB
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		
		//pass a driver control to PArent Window
		driver.switchTo().window(parentSessionID);
		
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("nokia",Keys.ENTER);
		
		//driver.quit();
	
	}

}



























