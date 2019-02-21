package com.lt.icore.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserList {
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUSerBtn;

	public WebElement getAddUSerBtn() {
		return addUSerBtn;
	}
	
	public void naviagateAddUSerPAge() {
		addUSerBtn.click();
	}
	
	

}
