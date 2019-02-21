package com.lt.icore.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lt.icore.genericLib.BaseClass;
import com.lt.icore.genericLib.WebDriverCommonLib;

import bsh.commands.dir;

public class AddUSer  extends BaseClass{
	

	@FindBy(name="firstName")
	private WebElement firstNAmeEdt;

	@FindBy(name="lastName")
	private WebElement lastNAmeEdt;
	
	@FindBy(name="email")
	private WebElement emailEdt;
	
	@FindBy(name="username")
	private WebElement usernameEdt;
	
	@FindBy(name="password")
	private WebElement pAsswordEdt;
	
	@FindBy(name="passwordCopy")
	private WebElement reTypePAsswordEdt;
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUSerBtn;
	
	@FindBy(xpath="//div[@title='New York Office']")
	private WebElement timeZoneBtn;
	
	public void createUSer(String fNAme , String lNAme ,String user, String email, String password) {
		firstNAmeEdt.sendKeys(fNAme);
		lastNAmeEdt.sendKeys(lNAme);
		emailEdt.sendKeys(email);
		usernameEdt.sendKeys(user);
		pAsswordEdt.sendKeys(password);
		reTypePAsswordEdt.sendKeys(password);
		createUSerBtn.click();
	}
	
	public void createUSer(String fNAme , String lNAme ,String user, String email, String password, String timeZone) throws InterruptedException {
		firstNAmeEdt.sendKeys(fNAme);
		lastNAmeEdt.sendKeys(lNAme);
		emailEdt.sendKeys(email);
		usernameEdt.sendKeys(user);
		pAsswordEdt.sendKeys(password);
		reTypePAsswordEdt.sendKeys(password);
		
		timeZoneBtn.click();
		String x = "//div[text()='"+timeZone+"']";
		WebDriverCommonLib wLib = new WebDriverCommonLib();
		wLib.clickAndWaitForElementToBePresentINGUI(driver, driver.findElement(By.xpath(x)));
		
		createUSerBtn.click();
	}
	
}
