package com.lt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleAutosugestEditBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
      driver.findElement(By.name("q")).sendKeys("LT jobs");	
      
      Actions act = new Actions(driver);
      
      act.sendKeys(Keys.ENTER).perform();
		

	}

}
