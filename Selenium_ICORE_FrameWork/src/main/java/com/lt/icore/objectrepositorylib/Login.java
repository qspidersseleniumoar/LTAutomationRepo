package com.lt.icore.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
  

	//web-elements
	@FindBy(id="username")
	private WebElement userNAmeEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;

	//getters for read acesses
	public WebElement getUserNAmeEdt() {
		return userNAmeEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//provide business lib
	public void login(String username, String password) {
		userNAmeEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	
	public void login() {
		userNAmeEdt.sendKeys("admin");
		passwordEdt.sendKeys("manager");
		loginBtn.click();
	}
}
