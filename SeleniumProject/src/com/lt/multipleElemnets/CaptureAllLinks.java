package com.lt.multipleElemnets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllLinks {
	/**
	 * program to capture all the LINKS & display in Console
	 * @param args
	 */

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		//IDentify all the LINKS in GUI
		List<WebElement> lst = driver.findElements(By.xpath("//a"));
		
		//get the Link Count
		System.out.println(lst.size());
		
		//display all the LINK NAme
		for(WebElement wb : lst) {
			System.out.println(wb.getText());
		}

	}

}
