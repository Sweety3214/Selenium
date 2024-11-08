//Almost out of storage … If you run out, you can't create, edit and upload files.
package WebdriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ManageBrowser {

	public static void main(String[] args) {
		// Configure the Browser/Setup
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		// Step1:launch/open The Browser-Chrome
		WebDriver driver = new EdgeDriver();
		
		//Step2:Maximize the Browser
		//driver.manage().window().maximize();
//--------------------------------------------------		
		//Set the Size for the Browser
		Dimension size = new Dimension(500,500);
		//driver.manage().window().setSize(size);
		//driver.manage().window().setSize(new Dimension(700, 500));
//--------------------------------------------------		
		//set the Position for Browser
		   Point position = new Point(200, 200);
		//driver.manage().window().setPosition(position);
		// driver.manage().window().setPosition(new Point(300, 300));
//--------------------------------------------------		
		 //Full Screen The Browser
		 driver.manage().window().fullscreen();
//--------------------------------------------------
		 
		// Step2:Navigate To the Application Via URL
		driver.get("https://www.swiggy.com/");
		
		

	}

}