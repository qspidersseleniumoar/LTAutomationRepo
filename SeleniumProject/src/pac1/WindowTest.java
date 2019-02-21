package pac1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		//maximize the Browser Window
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		//change the Size of Browser Window
		Dimension dem = new Dimension(100, 200);
		driver.manage().window().setSize(dem);
	   //capture the current BRowser-Window-SessionID
		String browserSissioniD = driver.getWindowHandle();
		System.out.println(browserSissioniD);
		
		//close only one current active Window
		driver.close();
		//close multiple Window
		driver.quit();
	}

}
