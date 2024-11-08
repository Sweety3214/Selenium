//Almost out of storage … If you run out, you can't create, edit and upload files.
package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	/**
	 * This Class will Describes that How GetTitle Method Will work 
	 * It is AbstractMethod-in Webdriver Interface 
	 * Its Used to Fetch the Title of Current Webpagewhere driver Control is present
	 * Its Return type is String
	 */
	public static void main(String[] args) {
		// Configure the Browser/Setup
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch/open The Browser-Chrome
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To the Application Via URL
		driver.get("https://www.swiggy.com/");
		
		//Verify that Home Page of Swiggy is opened or not
		//Step3:Fetch the Title of Web page
		String title = driver.getTitle();
	
		//Step4: Print on Console
		System.out.println("Title is  :"+title);
		

		//Step5:Close the Browser
		driver.quit();
		
		//Exceution Completed Message
		System.out.println("Exceution Completed Message");
		

	}

}