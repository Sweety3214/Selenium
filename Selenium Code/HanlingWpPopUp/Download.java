package HanlingWpPopUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Waiting Statement-Implicitly Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//navigating 
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
		
		
		//identify the element
		WebElement e=driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[10]/td[2]/input"));
		
		//1.create an obje for file class
		File fileToUpload=new File("./data/Dummy_Resume.doc");
		
		//2.get the actual path
		String filePath=fileToUpload.getAbsolutePath();
		
		//3.pass the file using senKeys
		e.sendKeys(filePath);
System.out.println("Uploaded");

	}

}
