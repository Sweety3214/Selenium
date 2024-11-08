package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAttribute {

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
		
		
		//name using xpath Attribute
		WebElement e1=driver.findElement(By.xpath("//input[@id='name']"));
		e1.clear();
		e1.click();
		
		
		////email
		driver.findElement(By.xpath("//input[@type='email']")).click();
		
		////pw
		driver.findElement(By.xpath("//input[@name='password']")).click();
		
		////mobile
		driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile No ']")).click();
		
		////feedback
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'feed')]")).sendKeys("HAi");
		
		driver.close();
		
		
	}

}
