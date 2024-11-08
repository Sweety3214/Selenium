package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Name {
	public static void main(String[] orgs) throws InterruptedException {
		String key = "webdriver.edge.driver";
		String values = "./driver/msedgedriver.exe";

		// Congure the browse
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// maximise the browser
		driver.manage().window().maximize();

		// Navigate the url
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");

		// identify the name field using NAME-LOCATORS
		WebElement e1 = driver.findElement(By.name("name"));

		// clear name data
		e1.clear();

		// update the name
		e1.sendKeys("BANU");

		// wait for 2 sec
		Thread.sleep(2000);

		// code line reduced
		// identify the name email using NAME-LOCATORS and update the mail
		driver.findElement(By.name("email")).sendKeys("SweetyBabu3214@gmail.com");
		;

//wait for 2 sec
		Thread.sleep(2000);
		
		
		//Identify the date of birth using NAME LOCATORS
		driver.findElement(By.name("dob")).sendKeys("31/10/1997");
		
		//wait for 2 sec
				Thread.sleep(2000);
				
				
driver.findElement(By.name("places")).click();
//close the window
		driver.close();

		// Execution completed
		System.out.println("Execution completed");

	}
};