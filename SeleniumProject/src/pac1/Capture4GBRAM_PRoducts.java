package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture4GBRAM_PRoducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");

   //search for Iphone XR 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone xr",Keys.ENTER);

		
		driver.findElement(By.xpath("//span[text()='iOS']/../preceding-sibling::input")).click();

	}

}
