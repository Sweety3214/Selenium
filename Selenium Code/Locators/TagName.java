package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TagName {
	public static void main (String[] orgs) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");

		// Step3: Identify the WebElement Using TagName
	driver.findElement(By.tagName("textarea")).sendKeys("If you want to create robust, browser-based regression automation suites and tests, scale and distribute scripts across many environments, then you want to use Selenium WebDriver, a collection of language specific bindings to drive a browser - the way it is meant to be driven.");

		// Execution Completed
		System.out.println("Execution Completed");	
	}

}
