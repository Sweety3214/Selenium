package HandlingMouseActi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		//configure the the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//waiting statements
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				//naviagting the URL
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
				//create an object for  action class
				Actions action=new Actions(driver);
				
				
				//Identify the drag element
				//ROME TO ITALy
				WebElement dragelement1=driver.findElement(By.id("box6"));
				WebElement dragelement2=driver.findElement(By.id("box3"));
				
				//identify the drop element
				WebElement dropelement1=driver.findElement(By.id("box106"));
				WebElement dropelement2=driver.findElement(By.id("box103"));
				
				//perform DRAGAND DROP
				action.dragAndDrop(dragelement1, dropelement1).perform();
				
				//perform click and hold(Alternative method)
				action.clickAndHold(dragelement2).moveToElement(dropelement2).perform();
				
				
	}

}
