//Almost out of storage … If you run out, you can't create, edit and upload files.
package WebdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// To analyze the test Script Execution -->Sleep /Wait Statement
		Thread.sleep(2000);

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To the Application Via URL--Using Navigate --get(String)
		driver.get("https://www.selenium.dev/");

		// Step2:Navigate To the Application Via URL--Using Navigate --to(String)
		driver.navigate().to("https://www.swiggy.com/");

		// Step2:Navigate To the Application Via URL--Using Navigate --to(URL)Java
		driver.navigate().to(new URL("https://www.dell.com/"));

		// Navigate ToWard Backward
		driver.navigate().back();

		// Navigate toward Forward
		driver.navigate().forward();

		// To analyze the test Script Execution -->Sleep /Wait Statement
		Thread.sleep(2000);
		
		// Navigation of Refresh
		driver.navigate().refresh();

		// Close the Browser
	     driver.quit();

		// Execution Completed
		System.out.println("Execution Completed ");

	}

}