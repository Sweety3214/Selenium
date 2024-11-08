//Almost out of storage … If you run out, you can't create, edit and upload files.
package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) 
	{
		// Its is Access Key for the Executable File
		String key = "webdriver.gecko.driver";
		
		// Its a path of the DriverExecutable File
		String value = "./driver/geckodriver.exe";
		
		//Configure the Browser
		System.setProperty(key, value);
		
		//Step1:Launch the Browser-Firefox
		 WebDriver driver= new FirefoxDriver();
		 
		//Step2:Navigate to the Application via URL
		 driver.get("https://www.selenium.dev/");
		 
		 //Execution Completed Message
		 System.out.println("Execution Completed Message");

	}

}