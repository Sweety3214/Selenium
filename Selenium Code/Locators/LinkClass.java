package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkClass {
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.edge.driver";
		String values = "./driver/msedgedriver.exe";

		// Congure the browse
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// maximise the browser
		driver.manage().window().maximize();

		// Navigate the url
		driver.get("file:///C:/Users/Joseph/Downloads/webpage.html");
		
		
		//driver.findElement(By.cssSelector("[input(id='mobile')]")).sendKeys("dchn");
		
		//identify the Link Element using linkText locator
	
		
		driver.findElement(By.linkText("Contact Us")).click();;
		//cssvalu
		
		
		
		//wait for 3sec
		Thread.sleep(3000);
		
		
		
		//close window
		driver.close();
		// Execution completed
		System.out.println("Execution completed");

	}
}
