package com.lt.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lt.genericlib.FileLib;

public class CreateUSer {

	
	public static void main(String[] args) throws Throwable {
		
		FileLib flib = new FileLib();
	
		//read data common data from properties File
		String URL =flib.getPropertyKeyValue("url");
		String USER =flib.getPropertyKeyValue("username");
		String PSW = flib.getPropertyKeyValue("password");
		String Browser = flib.getPropertyKeyValue("browser");
    
		System.out.println(URL);
		
	}

}
