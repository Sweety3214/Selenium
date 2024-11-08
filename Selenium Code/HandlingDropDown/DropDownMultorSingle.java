package HandlingDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownMultorSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String key = "webdriver.edge.driver";
				String values = "./driver/msedgedriver.exe";

				// Congure the browse
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

				// Launch the browser
				WebDriver driver = new ChromeDriver();

				// maximise the browser
				driver.manage().window().maximize();

				// Navigate the amazon url
				driver.get("https://www.amazon.com/");
				
				//waiting statement
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			WebElement dropdown1=driver.findElement(By.id("searchDropdownBox"));
				
			//importing select constructor
			Select select =new Select(dropdown1);
		boolean r1=	select.isMultiple();
		System.out.println(r1);
	}	

}
