package com.lt.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lt.genericlib.BaseClass;

@Listeners(com.lt.genericlib.ListnerImplmentation.class)

public class ScreenShotTest extends BaseClass{
	
	
	@Test
	public void createUSerTest() throws IOException {
		
		

		Assert.assertEquals("a", "a");
		
	}
	
	
	@Test
	public void modifyUSerTest() throws IOException {
		
		

		Assert.assertEquals("a", "b");
		
	}


}
