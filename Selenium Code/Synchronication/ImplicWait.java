package Synchronication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicWait {
	public static void main(String[] args) throws InterruptedException {
		// Configure the browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();


		// Waiting Statement 1-Implicitly Wait(Global Wait)
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step2:Navigate To Application via URL
			driver.get("https://www.shoppersstack.com/");

		// finding element using ID locator
		driver.findElement(By.id("loginBtn")).click();

		System.out.println("COMPLETED");
		
	}
}
