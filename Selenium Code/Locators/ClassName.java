package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassName {

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
		
		//identify the name field  using Class name
	WebElement e1=driver.findElement(By.className("nametxt"));

	//wait for 3sec
	Thread.sleep(2000);
		
	
	
		// clear the data
		e1.clear();
		
		//update the date
		e1.sendKeys("Sweety");
		
		//wait for 3sec
		Thread.sleep(3000);
		
		driver.findElement(By.className("emailtxt")).sendKeys("sweetybabu3214@gmail.com");
		driver.findElement(By.className("pswtxt")).sendKeys("061706Amma@");
		driver.findElement(By.className("mbltxt")).sendKeys("9789614646");
		
		
		//wait for 3sec
		Thread.sleep(3000);
		
		
		
		//close window
		driver.close();
		// Execution completed
		System.out.println("Execution completed");

	}

}
