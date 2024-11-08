package Synchronication;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
 public static void main(String[] orgs) {
	 
	 
	 //configuring the browser
	 System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");
	 
	 //Launching the browser
	 RemoteWebDriver driver=new ChromeDriver();
	 
	 //Maximising the browser
	driver.manage().window().maximize();
	
	//Explicity wat Statement (Based on condition)
    WebDriverWait wait=new WebDriverWait(driver,20);
    
    //Navigating the SHOPSTACKER Browser
    driver.get("https://www.shoppersstack.com/");
    
    System.out.println("EXECUTION COMPLETED");
   // wait.Until(ExpectedCondition.titleContains("https://www.shoppersstack.com/"));
	
	 
 }
}
