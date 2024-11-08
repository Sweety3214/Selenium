package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		// Configure the browser
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        
        // Launch the browser
        ChromeDriver driver = new ChromeDriver();
        
    
            // Maximize the browser window
            driver.manage().window().maximize();
            
            // Implicitly waiting statement
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            
            //navigating
           driver.get("https://www.amazon.com/");
           
           //currentURL
       String url=driver.getCurrentUrl();
       String title=driver.getTitle();
       System.out.println(url    +"     "+title);
           

	}

}
