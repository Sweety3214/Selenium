package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("sweetybabu3214@gmail.com");
		
		//identify the feedbackusing ccs selector
	
		driver.findElement(By.cssSelector("textarea")).sendKeys("Learnin g Selenium will help to Testing");
		//identify the pwvusing ccs selector
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin123#@");
		//identify the mobile num  using ccs selector
		driver.findElement(By.cssSelector("input[placeholder='Enter your Mobile No ']")).sendKeys("9876543210");
		
		//wait for 3sec
		Thread.sleep(3000);
		
		
		
		//close window
		driver.close();
		// Execution completed
		System.out.println("Execution completed");
	}

}
