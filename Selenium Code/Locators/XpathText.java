package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathText {
	public static void main(String[] orgs) throws InterruptedException {

		// Configure the Browser
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
		Thread.sleep(5000);

		// Name element using xpath By Text locator
		WebElement e1 = driver.findElement(By.xpath("//label[text()='Name:']"));
		e1.click();
		Thread.sleep(5000);
		// Identify The email Element 1 xpathByTxt
		WebElement e2 = driver.findElement(By.xpath("//label[text()='Email:']"));
		e2.click();
		Thread.sleep(5000);

		// element pw using xpath  by text locator
		driver.findElement(By.xpath("//label[text()='Password:']")).click();
		Thread.sleep(5000);
		
		//find mobile
		driver.findElement(By.xpath("//label[text()='Mobile.no:']")).click();
		Thread.sleep(5000);
		
		//feedback
		driver.findElement(By.xpath("//label[text()='Feedback:']")).click();
		Thread.sleep(5000);
		

	}
}