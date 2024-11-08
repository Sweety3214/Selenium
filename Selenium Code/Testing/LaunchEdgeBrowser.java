//Almost out of storage … If you run out, you can't create, edit and upload files.
package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		// Its is Access Key for the Executable File
		String key = "webdriver.edge.driver";

		// Its a path of the DriverExecutable File
		String value = "./driver/msedgedriver.exe";

		// Configure the Browser/Setup-Why?--->To Set the Property of Exe File
		System.setProperty(key, value);

		// Step1:launch/open The Browser-Edge
		WebDriver driver = new EdgeDriver();

		// Step2:Navigate To the Application Via URL
		driver.get("https://www.swiggy.com/");
		
		//Execution Completed Message
		 System.out.println("Execution Completed Message");
	}

}