package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest2 {
	
	public static void main(String[] args) {
		//navigate to Gmail APp
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		
		int count = driver.findElements(By.tagName("a")).size();
		//int count = driver.findElements(By.xpath("//a")).size();

System.out.println(count);
	}

}
