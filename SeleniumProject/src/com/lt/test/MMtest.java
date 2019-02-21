package com.lt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMtest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights");
		
	     Actions act = new Actions(driver);
	     //Enter source location
      WebElement swb = driver.findElement(By.id("hp-widget__sfrom"));
      swb.clear();
      swb.sendKeys("bangl");
      driver.findElement(By.xpath("//span[text()='BLR']")).click();
      
	     //Enter Destination location
      WebElement dwb =driver.findElement(By.id("hp-widget__sTo"));
      dwb.clear();
      dwb.sendKeys("Goa");
      driver.findElement(By.xpath("(//span[text()='GOI'])[2]")).click();


	}

}
