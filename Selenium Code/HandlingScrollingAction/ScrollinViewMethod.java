package HandlingScrollingAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinViewMethod {

	public static void main(String[] args) throws InterruptedException {
		//Congigure the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		//Launch the BROWSER
		ChromeDriver driver=new ChromeDriver();
		
		//Implicitly waiting statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Naviagting the URL
		driver.get("https://www.swiggy.com/");
		
		//Typecasting from webdriver to java script
		JavascriptExecutor js=(	JavascriptExecutor) driver;
	
		//find any one ellement from web page to view
		WebElement e1=driver.findElement(By.xpath("//h2[contains(text(),'online food')]"));
		Thread.sleep(5000);
		
		// Call the Exceute script Method-ScrollIntoView--TOP
		js.executeScript("arguments[0].scrollIntoView(true)",e1);
		Thread.sleep(5000);
		
		// Call the Exceute script Method-ScrollIntoView--Bottom
		js.executeScript("arguments[0].scrollIntoView(false)",e1);
		Thread.sleep(5000);
		
		System.out.println("Execution Completed");
	}

}
