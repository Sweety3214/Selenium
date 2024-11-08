package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultipleHyperLink {

	public static void main(String[] args) {
		 
		// Configuring the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 
		// Launching the browser
		RemoteWebDriver driver = new ChromeDriver();
		 
		// Maximizing the browser window
		driver.manage().window().maximize();
		
		// Navigating to amazon
		driver.get("https://www.amazon.in/s?k=amazon+prime&adgrpid=1322714101714665&hvadid=82669897711050&hvbmt=bb&hvdev=c&hvlocphy=149348&hvnetw=o&hvqmt=b&hvtargid=kwd-82670518517893%3Aloc-90&hydadcr=5621_2377279&msclkid=89f9047da80b13bd36a762c8d7b5c772&tag=msndeskstdin-21&ref=pd_sl_f6wf1fn58_b");
	//	driver.get("https://www.google.co.in/");
		
		//waiting implicitly statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//List the link and  Finding all link elements on the page (all aways all the hyper link tag is "a")
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		// count the no.of link using .size();
		int count = allLinks.size();
	 
		//print the count of size
		System.out.println("Count of hyperlinks is: " + count);
	 
		//print the all link using for loop
		for (int i = 0; i < count; i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text );
		}

		// Closing the browser
		driver.quit();
	}
}
