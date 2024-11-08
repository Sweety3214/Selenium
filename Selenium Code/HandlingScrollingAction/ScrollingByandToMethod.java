package HandlingScrollingAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByandToMethod {

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
		driver.get("https://www.meesho.com/");

		// 1:Typecast from Webdriver Type To Jvscript Type
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// To perform Scroll Action ---> 3 ways of Jscode
		// ScrollAction Using 1.ScrollBy
		// ScrollAction Using 2.ScrollTo
		// ScrollAction Using 3.ScrollIntoview

		// Call the Exceute script Method-ScrollTO(To method will start from orgin each time)
		// ScrollAction Using 1.ScrollBy
		js.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,6000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,8000)");
		Thread.sleep(3000);


		// Call the Exceute script Method-ScrollBy(To method will start from end of previous  each time)
		// ScrollAction Using 2.ScrollTo

		// Perform Scroll Action using ScrollBy
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);

		// Fixed typo: "screollBy" should be "scrollBy"
		js.executeScript("window.scrollBy(0,2000)");	
		Thread.sleep(3000);

		System.out.println("Scrolling Completed");

		// Close the browser
		driver.quit();
		

	
	}

}
