package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				String key = "webdriver.edge.driver";
				String values = "./driver/msedgedriver.exe";

				// Congure the browse
				System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

				// Launch the browser
				WebDriver driver = new EdgeDriver();

				// maximise the browser
				driver.manage().window().maximize();

				// Navigate the url
				driver.get("file:///C:/Users/Joseph/Downloads/webpage.html");
				
				
				driver.findElement(By.xpath("//tr[6]/following-sibling::tr[3]//textarea")).sendKeys("45643348523");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//tr[6]/preceding-sibling::tr[2]//input")).sendKeys("sweetybabu@gmail.com");
				Thread.sleep(2000);

	}

}
