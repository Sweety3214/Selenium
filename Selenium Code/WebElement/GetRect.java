package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetRect {

	public static void main(String[] args) throws InterruptedException {
		// Configure the browser
				System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

				// Launch the browser
				WebDriver driver = new EdgeDriver();

				// Maximize the browser
				driver.manage().window().maximize();

				// Step2:Navigate To Application via URL
				driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
				Thread.sleep(1000);
				
				//feedback element
				WebElement e1=driver.findElement(By.xpath("//*[@id=\"feedback\"]"));
				
				 ///fetch the size,
				System.out.println("ELEMENT DIMENTION :" +e1. getRect().getDimension());
				System.out.println("ELEMENT LOCATION:" +e1. getRect().getPoint());
				System.out.println("ELEMENT WIDTH :" +e1. getRect().getWidth());
				System.out.println("ELEMENT HIGHT:" +e1. getRect().getHeight());
				System.out.println("ELEMENT x :" +e1. getRect().getX());
			
				
				

	}

	

}
