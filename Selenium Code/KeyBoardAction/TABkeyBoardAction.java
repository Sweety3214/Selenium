package KeyBoardAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TABkeyBoardAction {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		//configure the the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//waiting statements
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

				
				//naviagting the URL
				driver.get("https://demowebshop.tricentis.com/");
				
				//create an object for  action class
				Actions action=new Actions(driver);
				
		
				//Using keysClass
				action.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform(); 
				
				//enter the data by using send keys
				driver.findElement(By.id("Email")).sendKeys("sweetybabu@gmail.com",Keys.TAB);
				

	}

}
