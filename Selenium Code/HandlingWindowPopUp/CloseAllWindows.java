package HandlingWindowPopUp;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CloseAllWindows {

	    public static void main(String[] args) throws InterruptedException {
	        // Configure the Browser
	        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	        // Step 1: Launch the browser
	        WebDriver driver = new ChromeDriver();

	        // Maximize the Browser
	        driver.manage().window().maximize();

	        // Waiting Statement - Implicitly Wait
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        // Step 2: Navigate To Application via URL
	        driver.get("https://www.shoppersstack.com/products_page/26");
	        
	        // Find the element that generates the popups
	        driver.findElement(By.id("compare")).click();
	        
	        // Get all window handles
	        Set<String> allWindowIds = driver.getWindowHandles();
	        System.out.println("All Window IDs: " + allWindowIds);
	        
	        // Close all windows
	        for (String windowId : allWindowIds) {
	            // Switch the control to the current window
	            driver.switchTo().window(windowId);
	            
	            // Add a small delay to observe window closing (optional)
	            Thread.sleep(2000);
	            
	            // Close the current window
	            driver.close();
	        }
	    }
	}


