package HandlingScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	//	Congigure the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		//Launch the BROWSER
	WebDriver driver=new ChromeDriver();
		
		//Implicitly waiting statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Naviagting the URL
		driver.get("https://www.selenium.dev/");
		
		//Perform TYPECASTING
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		//call the screenshot methog
		File temp=ss.getScreenshotAs(OutputType.FILE);
		
		//create permanent path for screeshot
		File permanent=new File("./screenshot/SecondScreenShot.png");
		
		
		//copy the screenshot from temp to permanent
		FileHandler.copy(temp, permanent);
		
		Thread.sleep(2000);
				//close the Brower
				driver.quit();
				
				//Confirm Message
				System.out.println("Execution Completed");
	}

}
