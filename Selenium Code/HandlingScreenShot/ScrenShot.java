package HandlingScreenShot;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
     //	Congigure the browser
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			//Launch the BROWSER
			ChromeDriver driver=new ChromeDriver();
			
			//Implicitly waiting statement
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			//Naviagting the URL
			driver.get("https://www.bbc.com/");
			
			WebElement e1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/article/section[1]/div/div/div[1]/div/div/div[1]/a/div/div[2]/div[1]/div/h2"));
			WebElement e2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/article/section[1]/div/div/div[2]/div/div/a/div/div[2]/div[1]/div/h2"));
			WebElement e3 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/article/section[1]/div/div/div[5]/div[2]/div/a/div/div[2]/div[1]/div/h2"));
			WebElement e4 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/article/section[1]/div/div/div[5]/div[3]/div/a/div/div[2]/div[1]/div/h2"));
			WebElement e5 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/article/section[1]/div/div/div[5]/div[5]/div/a/div/div[2]/div[1]/div/h2"));
		
			
			
			
			//call the screenshot methog
			File temp1=e1.getScreenshotAs(OutputType.FILE);
			File temp2=e2.getScreenshotAs(OutputType.FILE);
			File temp3=e3.getScreenshotAs(OutputType.FILE);
			File temp4=e4.getScreenshotAs(OutputType.FILE);
			File temp5=e5.getScreenshotAs(OutputType.FILE);
			
			//create permanent path for screeshot
			File permanent1=new File("./screenshot/BBC0.png");
			
			File permanent2=new File("./screenshot/BBC2.png");
			
			File permanent3=new File("./screenshot/BBC3.png");
			
			File permanent4=new File("./screenshot/BBC4.png");
			
			File permanent5=new File("./screenshot/BBC5.png");
			
			
			//copy the screenshot from temp to permanent
			FileHandler.copy(temp1, permanent1);
			FileHandler.copy(temp2, permanent2);
			FileHandler.copy(temp3, permanent3);
			FileHandler.copy(temp4, permanent4);
			FileHandler.copy(temp5, permanent5);
			
			Thread.sleep(2000);
					//close the Brower
					driver.quit();
					
					//Confirm Message
					System.out.println("Execution Completed");
		}
}
