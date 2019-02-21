package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VerifyErrorMSgTest {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
		WebElement wb = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
	
		//capture the tool tip
		String attValu = wb.getAttribute("title");
       System.out.println(attValu);

      //b.	Check image availability
       boolean status = wb.isDisplayed();
       System.out.println(status);
       
      // c.	Get the Size of the Image
       Dimension dem = wb.getSize();
       System.out.println("get the Height of the Elemnet==>"+dem.getHeight());
       System.out.println("get the Width of the Elemnet==>"+dem.getWidth());
      /// d.	Get the Location of the Image
       Point p = wb.getLocation();
       System.out.println("get the X coOrdinate from the Browser==>"+p.getX());
       System.out.println("get the Y coOrdinate from the Browser==>"+p.getY());

		driver.close();
	}

}
