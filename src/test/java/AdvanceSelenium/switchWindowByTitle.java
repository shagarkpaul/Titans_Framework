package AdvanceSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindowByTitle {

	public static void main(String[] args) {
		
		WebDriver driver; 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement clickHereButton = driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")); 
		
		clickHereButton.click(); 
		
		
		windowByTitle(driver, "new Window"); 
		

	}
	 /// amazon prime
	public static void windowByTitle(WebDriver driver, String title) {
		
		String currentWindow = driver.getWindowHandle(); //
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String winName: allWindows ) {
			
			//Window
			// 1. 1237623542764526745274
			// 2. 3r87367842563765233186
			// 3. 2176147651324678213476
			// 4. 4614671534671546713476
			
			// title: 
			// 1 amazon.com , spend less, smile mnore 
			// 2 Amazon.com, best seller item 
			// 3 amazon.com, amazon basic 
			// 4 amazon.com, amazon sing
			
			if(!driver.switchTo().window(winName).getTitle().equals(title)) {
				
				driver.switchTo().window(currentWindow);
				System.out.println("sorry, can not find your window");
			}
		}
	}
	

}
