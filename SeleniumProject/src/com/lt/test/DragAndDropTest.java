package com.lt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		
		WebElement swb = driver.findElement(By.id("draggable"));
		WebElement dwb = driver.findElement(By.id("droptarget"));

		
		Actions act = new Actions(driver);
		
	/*	act.clickAndHold(swb)
		   .moveToElement(dwb)
		   .release()
		   .build().perform();*/
		
		act.dragAndDrop(swb, dwb).perform();
		
	}

}
