package com.lt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMEnutest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		//step 1 : Identify the DropDown menu in GUI
		WebElement wb = driver.findElement(By.xpath("//span[text()='Departments']"));
		//step 2 : create an object to ACTIONS class
		Actions act = new Actions(driver);
		//take mouse cursor on the Elemnet
		act.moveToElement(wb);
		//execute Actions class controls on the Element
		act.perform();
		
		
		driver.findElement(By.xpath("//span[text()='Automotive']")).click();

		
		
	}

}
