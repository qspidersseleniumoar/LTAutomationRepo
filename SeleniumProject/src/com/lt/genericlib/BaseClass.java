package com.lt.genericlib;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
/**
 * 
 * @author Deepak
 * its custom class where we have common config annotation which take care of launch browser , login , logout, close browser
 *
 */
public class BaseClass {
	FileLib fLib = new FileLib();
	public  static WebDriver driver;
	
/*	@Parameters("browsername")
	@BeforeTest
	public void beforetestRunner(String browserNAme) {
		System.out.println("=============LAunch the Browser ==============="); 
		 
		  if(browserNAme.equals("firefox")) {
		     driver = new FirefoxDriver();
		  }else if(browserNAme.equals("chrome")){
			 driver = new ChromeDriver(); 
		  }else if(browserNAme.equals("ie")){
		     driver = new InternetExplorerDriver(); 
		 }
	}*/
	
	   @BeforeClass(groups= {"smokeTest","regressionTest"})
	   public void configBC() throws Throwable {
		  System.out.println("=============LAunch the Browser ==============="); 
		  String browserNAme = fLib.getPropertyKeyValue("browser");
		  if(browserNAme.equals("firefox")) {
		     driver = new FirefoxDriver();
		  }else if(browserNAme.equals("chrome")){
			 driver = new ChromeDriver(); 
		  }else if(browserNAme.equals("ie")){
		     driver = new InternetExplorerDriver(); 
		 }
		  
	   }
	   @BeforeMethod(groups= {"smokeTest","regressionTest"})
	   public void configBM() throws Throwable {
		   System.out.println("login");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get(fLib.getPropertyKeyValue("url"));
		   driver.findElement(By.name("username")).sendKeys(fLib.getPropertyKeyValue("username"));
		   driver.findElement(By.name("pwd")).sendKeys(fLib.getPropertyKeyValue("password"));
           driver.findElement(By.id("loginButton")).click();
		   
	   }
	   @AfterMethod(groups= {"smokeTest","regressionTest"})
	   public void configAM(){
		   System.out.println("logout");
		   driver.findElement(By.id("logoutLink")).click();
	   }
	   @AfterClass(groups= {"smokeTest","regressionTest"})
	   public void configAC() {
		  System.out.println("===============logout & close the Browser================="); 
		  driver.close();
	   }
}
