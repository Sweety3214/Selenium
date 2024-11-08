package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathOperator {

	public static void main(String[] args) throws InterruptedException {
		
		// Configure the browser
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
		Thread.sleep(1000);

		// name att and att
		WebElement e1=driver.findElement(By.xpath("//input[@id='name' and @name='name']"));
		e1.clear();
		e1.sendKeys("Sweety");
		
		Thread.sleep(2000);

		// email att and partial att
		driver.findElement(By.xpath("//input[@id='email' and contains(@name,'emai')]")).sendKeys("sweety@gmail.com");

		Thread.sleep(2000);

		// pw text and partial text
		//driver.findElement(By.xpath("//label[text()='password:' and contains(text(),'pass')]")).sendKeys("061706");
		WebElement e2=driver.findElement(By.xpath("//label[contains(text(), 'password:') or contains(text(), 'pass')]"));
		e2.sendKeys("061706");

		// Thread.sleep(2000);

		// mobile num text and text
		driver.findElement(By.xpath("//label[(text()='Mobile.no:' and text(),'Mobile.no:')])")).sendKeys("9789614646");
		Thread.sleep(2000);

	}

}
