package pac1;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
	
	//select all the checkBox , which is avilble inside the dynamic WebTable
	
public static void main(String[] args) throws InterruptedException {
	//navigate to Gmail APp
	WebDriver driver = new FirefoxDriver();
	driver.get("https://gmail.com");

	
	//IDentify Email EDitBox
	driver.findElement(By.id("identifierId")).sendKeys("seleniumoar1234");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("password")).sendKeys("Selenium1-2");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(10000);

	//select inbox msg "Your Amazon verification code" check box in dynamic webtable
driver.findElement(By.xpath("//span[text()='Your Amazon verification code']/../../../td[2]/div")).click();
	
	

	
	
}
}
