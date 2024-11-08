package HandlingScrollingAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingRobotMethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//Congigure the browser
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				
				//Launch the BROWSER
				ChromeDriver driver=new ChromeDriver();
				
				//Implicitly waiting statement
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				//Naviagting the URL
				driver.get("https://www.swiggy.com/");
				
				
			
				//find any one ellement from web page to view
				WebElement e1=driver.findElement(By.xpath("//h2[contains(text(),'online food')]"));
				Thread.sleep(5000);
				
				//create an object for robot class
				Robot robot=new Robot();
				Thread.sleep(3000);
				
				// 2. Call the Non static method To Press the Key
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				// 3.Call the Non static Method To Release the Key
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(3000);
				driver.quit();
				System.out.println("Execution Completed ");

	}

}
