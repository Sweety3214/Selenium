package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByPartialText {
	public static void main(String[] orgs) throws InterruptedException {
		

		// Configure the Browser
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");

		
		
		//name using xpath by partial text locator
		WebElement e1 = driver.findElement(By.xpath("//label[contains(text(), 'Name')]"));
		e1.click();
		Thread.sleep(2000);
		
		//email  using xpath by partial text locator
		WebElement e2 = driver.findElement(By.xpath("//label[contains(text(), 'Em')]"));
		e2.click();
		Thread.sleep(2000);
		

		//pw using xpath by partial text locator
		WebElement e3 = driver.findElement(By.xpath("//label[contains(text(), 'P')]"));
		e3.click();
	
		Thread.sleep(2000);
		
		//mobile using xpath by partial text locator
		WebElement e4 = driver.findElement(By.xpath("//label[contains(text(), 'Mo')]"));
		e4.click();
		Thread.sleep(2000);
		
		//feedbackusing xpath by partial text locator
		WebElement e5 = driver.findElement(By.xpath("//label[contains(text(), 'Feed')]"));
		e5.click();
		Thread.sleep(2000);
		
		
		
		driver.close();
	}

}
