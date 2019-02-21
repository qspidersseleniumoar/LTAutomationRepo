package pac1;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitStatementtest {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://gmail.com");

	
	//logout
	driver.findElement(By.id("identifierId")).sendKeys("seleniumoar1234");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.name("password")).sendKeys("Selenium1-2");
	driver.findElement(By.xpath("//span[text()='Next']")).click();

   //logout
	driver.findElement(By.xpath("//span[@class='gb_cb gbii']")).click();
	driver.findElement(By.id("gb_71")).click();
	
	
}
}





























