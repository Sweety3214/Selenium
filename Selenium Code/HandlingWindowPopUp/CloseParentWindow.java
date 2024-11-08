package HandlingWindowPopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {

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
		
		//Handle parent window
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		//handle child window
		Set<String> allchildWindowId=driver.getWindowHandles();
		System.out.println(allchildWindowId);
		
		
		for(String pId : allchildWindowId) {
			//close only parent window
			//switch the cintrol from main page to frame
			driver.switchTo().window(pId);
			if(parentId.equals(pId)) {
				Thread.sleep(2000);
				//close 
				driver.close();
			}
				
		}
		
		// TODO Auto-generated method stub

	}

}
