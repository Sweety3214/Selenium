//Almost out of storage … If you run out, you can't create, edit and upload files.
package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	/**
	 * This Class will Describes that How Get Current URL Method Will work 
	 * It isAbstractMethod-in Webdriver Interface 
	 * Its Used to Fetch the Current URL of Webpage where driver Control is present 
	 * its Return type is String
	 */
	public static void main(String[] args) {
		// Configure the Browser/Setup
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch/open The Browser-Chrome
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To the Application Via URL
		driver.get("https://www.swiggy.com/");

		// Verify that Home Page of Swiggy is opened or not
		// Step3:Fetch the Current Url of Web page
		String c_url = driver.getCurrentUrl();

		// Step4 Print on Console
		System.out.println("Current URL is  :" + c_url);

		// Step5:Close the Browser
		driver.quit();

		// Exceution Completed Message
		System.out.println("Exceution Completed Message");

	}

}