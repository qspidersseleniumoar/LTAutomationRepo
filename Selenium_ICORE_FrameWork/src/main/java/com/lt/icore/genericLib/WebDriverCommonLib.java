package com.lt.icore.genericLib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Deepak
 *
 */
public class WebDriverCommonLib {
	
	public void select(WebElement selWb, String value) {
		Select sel = new Select(selWb);
		sel.selectByVisibleText(value);
	}
	public void select(WebElement selWb, int index) {
		Select sel = new Select(selWb);
		sel.selectByIndex(index);
	}
	public boolean selectifElemnetisAvailable(WebElement selWb, String expData) {
		boolean flag = false;
		Select sel = new Select(selWb);
				List<WebElement> lst = sel.getOptions();
				for(WebElement wb : lst ) {
					if(wb.getText().equals(expData)) {
						sel.selectByVisibleText(expData);
						flag=true;
						break;
					}
				}
				return flag;
	}
	
	/**
	 * waitForPageToLoad it always wait for Entire HTMLDocumnet to be Load in GUI
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * waitForPageToLoad it always wait for expected elemnet to be visible in GUI
	 * @param driver
	 */
	public void waitForElementPresent(WebDriver driver, WebElement expWb) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(expWb));
		
	}
	
	
	/**
	 * waitForPageToLoad it always wait for expected elemnet to be Disvisible in GUI
	 * @param driver , locator
	 */
	public void waitForElementPresent(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	
	/**
	 * waitForPageToLoad it always wait for expected elemnet to be appear in GUI
	 * @param driver
	 */
	public void waitForElementToBePresentINGUI(WebDriver driver, WebElement expWb) throws InterruptedException {
		int count = 0 ;
	   while(count<=20) {
		   try {
			   expWb.isDisplayed();
			   break;
		   }catch (Throwable t) {
			 Thread.sleep(1000);
			 count++;
		}
	   }
		
	}
	
	public void clickAndWaitForElementToBePresentINGUI(WebDriver driver, WebElement expWb) throws InterruptedException {
		int count = 0 ;
	   while(count<=20) {
		   try {
			   expWb.click();
			   break;
		   }catch (Throwable t) {
			 Thread.sleep(1000);
			 count++;
		}
	   }
		
	}
	
	public void mouseMovemnet(WebElement expWb , WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(expWb).perform();
	}
	
	public void doubleclick(WebElement expWb , WebDriver driver) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	
	public void rightclick(WebElement expWb , WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick(expWb).perform();
	}
	

}
;