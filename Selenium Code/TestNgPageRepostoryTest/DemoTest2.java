package TestNgPageRepostoryTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestNgPageRepository.HomePage;

public class DemoTest2 extends BaseClass{

	@Test
	public void Test1() { 

		//Create an Object For Homepage
		HomePage homepageref = new HomePage(driver);
		
		// Perform Action--Clear
		homepageref.getNametextfield().clear();

		// Incase If The Webpage Got Reloaded/Refreshed

		// Perform Action--Enter Data
		homepageref.getNametextfield().sendKeys("Harry");
		
		// We Will Not Get Exception-StaleElementReffrenceException.
        // Because WE Initialized The Address of WebElemnt 
		
		// Perform Action--Clear
		homepageref.getNametextfield().clear();

		// Perform Action--Enter Data
		homepageref.getNametextfield().sendKeys("Porter");

	}
}
