package HandlingDisableElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebElement {

	public static void main(String[] args) {
		//Congigure the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		//Launch the BROWSER
		ChromeDriver driver=new ChromeDriver();
		
		//Implicitly waiting statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Naviagting the URL
		driver.get("https://demoapp.skillrary.com/");
		
		//find Element
		WebElement disable=driver.findElement(By.xpath(""));
		
		//perform action
		disable.sendKeys("Selenium ");
		
		//Typecasting from webdriver to java script
		JavascriptExecutor js=(	JavascriptExecutor) driver;
	}

}
