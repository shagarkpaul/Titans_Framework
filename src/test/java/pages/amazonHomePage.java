package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonHomePage {
	
	
	WebDriver driver; 
	
	public amazonHomePage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	WebElement signInButton; 
	
	@FindBy(xpath = "")
	WebElement emailAddress;
	
	
	public void clickOnSignButtonInHomePage() {
		
		signInButton.click();
	}
	
	public void enterEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}
	
	
	

}
