package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ParallelBaseClass {
	
	//create obj Ref of webdriver type
	public WebDriver driver=null;
	
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login Done", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("LogOut done ", true);
	}

	@BeforeClass
	public void browserSetUp() {
		
		//configure the the browser
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
				
				System.out.println("Enter the  Browser Nameb:");
				String browsername="chrome";
				
				//if user gives browsername =chrome
				if(browsername.equals("chrome")) {
					//1>launch the browser chrome 
				}
				Reporter.log("Browser Launched Successfully ", true);
	}

	@AfterClass
	public void quiteBrowser() {
		Reporter.log("Browser closed Successfully", true);
	}

	@BeforeTest
	public void preTestConnection() {
		Reporter.log("Pre test connection-Build ", true);
	}

	@AfterTest
	public void postTestConnection() {
		Reporter.log("Post test connection-Terminated ", true);
	}

	@BeforeSuite
	public void preSuiteConnection() {
		Reporter.log(" Suite Pre-Connection Build-DataBase,AdvnsReport ", true);
	}

	@AfterSuite
	public void postSuiteConnection() {
		Reporter.log("Suite Post-Connection Terminate-DataBase,AdvnsReport ", true);
	}
}
