package com.lt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickText {

	private static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("sachin tendulkar history",Keys.ENTER);
		
		//IDentify the elemnet where we need to perfrom RightClick
		WebElement wb = driver.findElement(By.xpath("//h3[text()='Sachin Tendulkar - Life, Wife & Stats - Biography']"));
		
		Actions act = new Actions(driver);
		//perfrom rightClick
		act.contextClick(wb).perform();
		
		Thread.sleep(2000);
		act.sendKeys("T").perform();
		   
		
		
		
		
		
		
		
		
		
		
		

	}

}
