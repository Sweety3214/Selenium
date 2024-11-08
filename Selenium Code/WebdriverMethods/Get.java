//Almost out of storage … If you run out, you can't create, edit and upload files.
package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	/**
	 * This Class will Tells that How Get Method from Webdriver interface is Used 
	 * It is Abstract Method
	 * It is Used To Navigate to The Application Via URL By passing  String Argu
	 * Tts Return Type void
	 **/
	public static void main(String[] args) 
	{
		// Configure the Browser/Setup
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch/open The Browser-Chrome
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To the Application Via URL
		driver.get("https://www.swiggy.com/");
		
		//Step3:Navigate to the diffrent URL
		driver.get("https://www.zomato.com/");
		
		//Step4:Navigate to the diffrent URL
		driver.get("https://www.flipkart.com/");
		
		//Step5:Navigate to the diffrent URL
		driver.get("https://www.amazon.in/");
		
		//Close the Browser
		//driver.close();
		driver.quit();
		
		//Exceution Completed Message
		System.out.println("Exceution Completed Message");
	}

}