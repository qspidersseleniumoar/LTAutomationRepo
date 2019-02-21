package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lt.genericlib.WebDriverCommonLib;
/**
 * 
 * @author user1
 * manual test steps
 * 1. 
 * 2. 
 *
 */
public class DynamicElemnetTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		
		//wait for Dynamic Elemnet /ajax Elemnet
/*		By locator  = By.xpath("//img[@alt='Up to 25% off : helmets' or @alt='Up to 70% off : bike parts and accessories']");
	   WebDriverCommonLib lib = new WebDriverCommonLib();
	   lib.waitForElementPresent(driver,locator);*/
		
		
		
		//click on dynamic Elemnet
		driver.findElement(By.xpath("//img[@alt='Up to 25% off : helmets' or @alt='Up to 70% off : bike parts and accessories']")).click();
		
	

	}

}
