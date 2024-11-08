package KeyBoardAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotKeyBoard {

	public static void main(String[] args) throws AWTException {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		//configure the the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//waiting statements
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
				//naviagting the URL
				driver.get("https://www.google.com/");
				
				//create an object for  action class
				Actions action=new Actions(driver);
				
			//perform keyboard action--keyPress
				action.keyDown(null,null).perform();
				
				//perform keyboard action--keyrelease
				action.keyUp(null,null).perform();
				
				//Using keysClass
				action.sendKeys(Keys.TAB); 
				
				//Using robert class
			Robot robot=new Robot();

			//find search text box element
			driver.findElement(By.name("q")).click();
			
			//perform key board action --press key
			robot.keyPress(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_L);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_M);
			
			//perform keyboard action --keyRelease
		
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_M);

		
}
}
