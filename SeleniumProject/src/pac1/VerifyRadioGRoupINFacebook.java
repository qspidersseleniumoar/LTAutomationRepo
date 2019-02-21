package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRadioGRoupINFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		//IDentify the male & FeMAle Radio Button
		WebElement fWb = driver.findElement(By.xpath("//input[@value='1']"));
		WebElement mWb = driver.findElement(By.xpath("//input[@value='2']"));
		       
		if(fWb.isEnabled()==true && mWb.isEnabled()==true) {
			System.out.println("radio group is ACTIVE==PASS");
		}else {
			System.out.println("radio group is INACTIVE==Fail");
		}
		
		//click on male radioButton
		mWb.click();
		if(fWb.isSelected()==false && mWb.isSelected()==true) {
			System.out.println("radio group is validated==PASS");
		}else {
			System.out.println("radio group is validated==Fail");
		}
		driver.close();
		
		

	}

}
