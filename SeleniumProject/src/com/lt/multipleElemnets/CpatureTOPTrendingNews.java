package com.lt.multipleElemnets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CpatureTOPTrendingNews {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
		
		List<WebElement> lst = driver.findElements(By.xpath("//li[@data-category='trending news']/ul/li"));
		
	/*	for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i).getText());
		}*/
		
		for(WebElement wb : lst) {
		    System.out.println(wb.getText());
		}
	}

}
