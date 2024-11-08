package HandlingWindowPopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindow {

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
				driver.get("https://www.shoppersstack.com/products_page/26");
				
				//find element
				driver.findElement(By.id("compare")).click();
				
				//HAndels PArent window
				String parentId=driver.getWindowHandle();
				System.out.println(parentId);
				//HandleChildWindow
				Set<String> childId=driver.getWindowHandles();
				System.out.println(childId);
				
				
				for(String pId:childId) {
					driver.switchTo().window(pId);
					if(!parentId.equals(pId)) {
						Thread.sleep(2000);
						driver.close();
					}
					
				}
				
	}

}
