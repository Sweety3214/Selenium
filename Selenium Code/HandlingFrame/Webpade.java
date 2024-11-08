package HandlingFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpade {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Waiting Statement-Implicitly Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Joseph/Downloads/EmbededWebpage.html");
Thread.sleep(2000);
		//3.enter your email
		driver.findElement(By.id("email")).sendKeys("admin123@gmila.com");
		Thread.sleep(3000);
		//handle the frame
		//switch the control from main page to frame using frame index
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		//find the element in frame 
	driver.findElement(By.id("small-searchterms")).sendKeys("computer");
	Thread.sleep(3000);
	//switch back the controm from frame to mainpage
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//find pw element in main page
		driver.findElement(By.id("password")).sendKeys("admin123#");
		Thread.sleep(3000);
		
		System.out.println("Completed");
		driver.close();
	
	
	}

}
