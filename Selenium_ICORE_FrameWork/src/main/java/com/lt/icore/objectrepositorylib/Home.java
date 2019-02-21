package com.lt.icore.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.lt.icore.genericLib.BaseClass;
import com.lt.icore.genericLib.WebDriverCommonLib;

public class Home extends BaseClass{
	
	WebDriverCommonLib lib = new WebDriverCommonLib();
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement userImg;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskImg;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logoutLnk;

	public WebElement getUserImg() throws Throwable {
	
		return userImg;
	}

	public WebElement getTaskImg() {
		return taskImg;
	}
	
	public void navigateToUSerPAge() throws InterruptedException {
		lib.clickAndWaitForElementToBePresentINGUI(driver, userImg);
	
	}
	public void navigateToTaskPAge() {
		taskImg.click();
	}
	
	public void logout() throws InterruptedException {
		WebDriverCommonLib lib = new WebDriverCommonLib();
		lib.clickAndWaitForElementToBePresentINGUI(driver, logoutLnk);
		
	}

}
