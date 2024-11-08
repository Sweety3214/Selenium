package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {

		// Congire the Browser

		String key = "webdriver.edge.driver";
		String values = "./driver/msedgedriver.exe";

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Launch browser
		WebDriver driver = new EdgeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// Navigate the browser
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");

		// Identify the web element for name field by id
		WebElement e1 = driver.findElement(By.id("name"));

		// wait for 2 sec
		Thread.sleep(2000);

		// clear the name
		e1.clear();

		// update the name
		e1.sendKeys("SWEETY");

		// wait for 2 sec
		Thread.sleep(2000);

		// Identify the web element for gender by id
		WebElement e2 = driver.findElement(By.id("email"));

// wait for 2 sec
		Thread.sleep(2000);

//Update the mail 
		e2.sendKeys("sweetybabu3214@gmail.com");

		// wait for 2 sec
		Thread.sleep(2000);

		// Identify WebElement for password by ID
		WebElement e4 = driver.findElement(By.id("password"));

		// Update password
		e4.sendKeys("061706Amma@");

		// wait for 2 sec
		Thread.sleep(2000);

		// mobile num
		WebElement e3 = driver.findElement(By.id("mobile"));

		e3.sendKeys("9789614646");
		// wait for 2 sec
		Thread.sleep(2000);
		
		
		/*//dob by name
		driver.findElement(By.id("manali")).sendKeys("31/10/1997");
		// wait for 2 sec
		Thread.sleep(2000); */

		// Identify the gender using id LOCATORS
		driver.findElement(By.id("female")).click();
		// wait for 2 sec
		Thread.sleep(2000);
		
		//place
		driver.findElement(By.id("manali")).click();
		// wait for 2 sec
		Thread.sleep(2000);
		
		
		
		// close the window
		driver.close();

		// Execution Completion
		System.out.println("Execution Completion");

	}

}
