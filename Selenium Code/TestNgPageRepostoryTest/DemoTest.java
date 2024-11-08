package TestNgPageRepostoryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoTest extends BaseClass {
	@Test
	public void Test1() {

		// Identify The Element
		WebElement element = driver.findElement(By.xpath("GOOGLE456"));
		
		//Using @Findby Annotaion.
		//@FindBy(id = "")
		//WebElement element;
		
		// Perform Action--Clear
		element.clear();

		//Incase If The Webpage Got Reloaded/Refreshed
		
		// Perform Action--Enter Data
		element.sendKeys("Harry");
		//We Will Get Exception-StaleElementReffrenceException.

		// Perform Action--Clear
		element.clear();

		// Perform Action--Enter Data
		element.sendKeys("Porter");

	}


}
