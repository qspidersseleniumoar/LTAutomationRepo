package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {
	
	public static void main(String[] args) {
  
		
		String result = "Showing 1 – 40 of 75,487 results for \"iphone xr\"";
		
		String[] strArr = result.split(" ");
		String strCount = strArr[5].replaceAll(",", "");
		
		int count = Integer.parseInt(strCount);
       System.out.println(count-5);
	}

}
