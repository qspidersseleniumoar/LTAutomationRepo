package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;
/**
 *  Program to handle MULTISelect dropDown
 */
public class DropDownElemnetTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Venkatesh/Desktop/Page.html");
		
      //IDentify the multiSelect dropDown
		WebElement mwb = driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select sel = new Select(mwb);
		//check whether DropDown is Single Select or MultiSelect
		boolean status = sel.isMultiple();
		if(status) {
			//select all the Value from the DropDown
			System.out.println("dropDown is MultiSelect");
			for(int i=0 ; i<6; i++) {
			   sel.selectByIndex(i);
			}
			
		}else {
			System.out.println("dropDown is SingleSelect");
		}
		
		//deSelect all the Values from the DropDown
		sel.deselectAll();
		
		
		
	
	}

}
