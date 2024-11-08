package TestNgPageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	
	WebDriver driver;
	
	// Constructor
	public LoginPage1(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement userName;
	
	@FindBy(id="continue")
	WebElement cont;
	
	@FindBy(xpath="//input[@className='a-button-input']")
	WebElement password;
	
	// Action: Enter Username
	public void setUserName(String user) {
		userName.sendKeys(user);
	}
	public void setbutton() {
		cont.click();
	}
	public void setenterPw(String pw) {
		password.sendKeys(pw);
	}
	
	
}
