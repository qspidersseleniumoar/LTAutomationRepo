package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HAndleALertWindowTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://irctc.com/Emp_Login.jsp");
		
		//Click on Button which Opens ALert Window
		driver.findElement(By.name("Login")).click();
		
		//pass a driver control to Alert Window
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		

	}

}
