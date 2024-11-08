package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultipleSuggestion {

	public static void main(String[] args) {
		 
		// Configuring the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		 
		// Maximizing the browser window
		driver.manage().window().maximize();
		
		// Navigating to amazon
		//driver.get("https://www.amazon.in/s?k=amazon+prime&adgrpid=1322714101714665&hvadid=82669897711050&hvbmt=bb&hvdev=c&hvlocphy=149348&hvnetw=o&hvqmt=b&hvtargid=kwd-82670518517893%3Aloc-90&hydadcr=5621_2377279&msclkid=89f9047da80b13bd36a762c8d7b5c772&tag=msndeskstdin-21&ref=pd_sl_f6wf1fn58_b");
		driver.get("https://www.google.co.in/");
		
		//implicitly waiting statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement e1=driver.findElement(By.className("gLFyf"));
				e1.sendKeys("selenium");
		//lis the suggestion and find the 
				List<WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
				////*[@id="ERWdKc"]/div[1]/span  //span[@text()='sql']  //*[@id="sBQTL"]/div[1]/span
				 
				// size of no of suggestion
			int count=suggestion.size();
			//print all the name of  suggestion 
			
				for(int i=0; i<count;i++) {
					String text = suggestion.get(i).getText();
					System.out.println(i+1+" :"+text);
				}
				//close window
				driver.close();
				// Execution completed
				System.out.println("Execution completed");
	}

}
