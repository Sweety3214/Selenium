package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * This Class Will Describes that How GetpageSource method Will Work
 *  Its also a Abstract Method Its used to Fetch the Web Page Source Code(HTML) 
 * ItsReturntype String
 */
public class GetPageSources {
	public static void main(String[] args) {
		// Configure the Browser/Setup
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch/open The Browser-Chrome
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To the Application Via URL
		driver.get("https://www.flipkart.com/");

		// Step3:Fetch The Page Source Code
		String pagesourece = driver.getPageSource();

		// Step4:Print On Console
		System.out.println(pagesourece);

		// Step5:Close the Browser
		driver.quit();
	}

}
