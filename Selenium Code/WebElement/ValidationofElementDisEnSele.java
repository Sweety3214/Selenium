package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidationofElementDisEnSele {
/*Validating using elemnts are dispalyed--.isDisplayed(),enable---.isEnabled(),selecte 
 * */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Configure the browser
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
		Thread.sleep(1000);

		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		// validating the name field is displayed or not
		boolean r1 = e1.isDisplayed();

		if (r1 == true) {
			System.out.println("Name element is verify then the result is pass");
		} else {
			System.out.println("Name element is verify then the result is fail");
		}
		System.out.println("------------------------");

		// validating kerala is enable or not
		WebElement e2 = driver.findElement(By.id("Kerala"));

		boolean r2 = e2.isEnabled();

		if (r2 == true) {
			System.out.println("Place element is verify then the result is pass");
		} else {
			System.out.println("place element is verify then the result is fail");
		}
		System.out.println("------------------------");

		// validating kerala is enable or not
		WebElement e3 = driver.findElement(By.name("places"));

		boolean r3 = e3.isEnabled();

		if (r3 == true) {
			System.out.println("Place element is verify then the result is pass");
		} else {
			System.out.println("place element is verify then the result is fail");
		}
		System.out.println("------------------------");
		// validating goe is selected or not
		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"goa\"]"));

		boolean r4 = e4.isSelected();

		if (r4 == true) {
			System.out.println("Place element is verify then the result is pass");
		} else {
			System.out.println("place element is verify then the result is fail");
		}
		System.out.println("------------------------");
		driver.close();
		//completed 
		System.out.println("Execution is completed");

	}

}
