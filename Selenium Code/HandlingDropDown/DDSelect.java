package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDSelect {

	public static void main(String[] args) throws InterruptedException {
		//O Auto-generated method stub
		String key = "webdriver.edge.driver";
		String values = "./driver/msedgedriver.exe";

		// Congure the browse
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximise the browser
		driver.manage().window().maximize();

		// Navigate the url
		driver.get("file:///C:/Users/Joseph/Downloads/webpage.html");
		WebElement d1= driver.findElement(By.name("country1"));
		WebElement d2= driver.findElement(By.name("country2"));

		// 2:Create an Object For Select Class
		Select selectobj = new Select(d2);
		
		//3:Call the Non Static Method-Select Methods--3 Ways
		Thread.sleep(3000);
		//Select Option Using Index
		selectobj.selectByIndex(1);
		
		Thread.sleep(3000);
		//Select Option Using Value
		selectobj.selectByValue("usa");
		
		Thread.sleep(3000);
		//Select Option Using Visibletext
		selectobj.selectByVisibleText("CANADA");
		
		System.out.println("Execution Completed");



	}

}
