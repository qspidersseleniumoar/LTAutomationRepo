package com.lt.multipleElemnets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//pass driver to frame-2
		driver.switchTo().frame("classFrame");
		
		//click on a link , when link present inside the Frame-2
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		//pass driver control back to main Window
		driver.switchTo().defaultContent();
		
		//pass driver to frame-3
		driver.switchTo().frame("packageFrame");
		
		//click on a link , when link present inside the Frame-3
		driver.findElement(By.linkText("Actions")).click();
		
	}

}
