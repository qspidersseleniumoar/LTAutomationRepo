package pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSlectDropDown {
  /**
   * Program to find & select expected value from the dropDown ,
   * expectedVsl = "java"
   */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Venkatesh/Desktop/Page.html");
      //IDentify the multiSelect dropDown
		WebElement mwb = driver.findElement(By.xpath("//select[@multiple='true']"));
		boolean flag=false;
		String expectedVal = "java";

		Select sel = new Select(mwb);
       //capture all the available Option Webelemnet dynamically		
		List<WebElement> lst = sel.getOptions();
		//get the Options count inSide the dropDown
		System.out.println(lst.size());
		
		//Iterate the Collection List & get the each Option 
	   for(int i=0; i<lst.size(); i++) {
		   String actVal =  lst.get(i).getText();
		   if(actVal.equals(expectedVal)) {
			   System.out.println("its availble");
			   flag=true;
			   sel.selectByVisibleText(actVal);
			   break;
		   }	   
	   }
	   if(flag==false) {
		   System.out.println("its not availbale");
	   }
		

	}

}






















