package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PerformAction {

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
				
				//clear and sendKey action in name element
				WebElement e1=driver.findElement(By.id("name"));
				Thread.sleep(2000);
				e1.clear();
				Thread.sleep(2000);
				e1.sendKeys("Sweety");
				Thread.sleep(2000);
				
				
				//send keys action 
				driver.findElement(By.name("email")).sendKeys("sweety@gmail.com");
				
				//pw send keys action 
				//driver.findElement(By.xpath("//input[contains(@placeholder,'pass')]")).sendKeys("sweety");
				WebElement e5=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				e5.sendKeys("sweety");
				
				  //mobile elemnt ,sendKeys perform action
				//WebElement e4=driver.findElement(By.xpath("//label[contains(text(), 'Mo')]"));
				//e4.sendKeys("5231658");
				
				
				WebElement e4 = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
				e4.click();
				Thread.sleep(2000);
				e4.sendKeys("456554132");
				//  click action in place element
				WebElement e2 = driver.findElement(By.id("manali"));
				e2.click();
				Thread.sleep(2000);
				
				
				//submit action 
				WebElement e3=driver.findElement(By.xpath("//*[@id=\"reg\"]"));
				e3.submit();
				
				//completed
				System.out.println("Execution completed");
				
	}

}
