 package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathTraversing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Configure the Browser
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
		Thread.sleep(1000);

//name toe link contuct us
		WebElement e=driver.findElement(By.xpath("//input[@id='name']/../../..//a"));
		e.click();
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
		Thread.sleep(1000);	//
		// m.no to place
		//driver.findElement(By.xpath("//input[@type='tel']/../../..//label[@for='bangalore']")).click();
		// or
		 
		WebElement e1=driver.findElement(By.xpath("//input[@type='tel']/../../..//input[@value='bangalore']"));
		
		e1.click();

		Thread.sleep(1000);

		// pass to regiter
		
		driver.findElement(By.xpath("//input[@type='password']/../../..//input[@id='reg']")).click();
		
	//	or
		//driver.findElement(By.xpath("//input[@type='password']/../../..//input")).click();
		Thread.sleep(1000);
		
		
		// email to contuct as
		driver.findElement(By.xpath("//input[@id='email']/../../..//a")).click();
		Thread.sleep(1000);
		

		// name to feedback
		driver.findElement(By.xpath("//input[@type='email']/../../..//textarea")).sendKeys("Hai");
		Thread.sleep(1000);

	}

}
