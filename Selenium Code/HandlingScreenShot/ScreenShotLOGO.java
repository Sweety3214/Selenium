package HandlingScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotLOGO {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//	Congigure the browser
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			//Launch the BROWSER
			ChromeDriver driver=new ChromeDriver();
			
			//Implicitly waiting statement
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			//Naviagting the URL
			driver.get("https://www.meesho.com/");
			
			WebElement e1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/a/img"));
			
			//Perform TYPECASTING
			//TakesScreenshot ss=(TakesScreenshot)driver;
			
			//call the screenshot methog
			File temp=e1.getScreenshotAs(OutputType.FILE);
			
			//create permanent path for screeshot
			File permanent=new File("./screenshot/Webelementhot2.png");
			
			
			//copy the screenshot from temp to permanent
			FileHandler.copy(temp, permanent);
			
			Thread.sleep(2000);
					//close the Brower
					driver.quit();
					
					//Confirm Message
					System.out.println("Execution Completed");
		}
}
