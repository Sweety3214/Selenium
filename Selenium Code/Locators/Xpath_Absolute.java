package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Absolute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Configure the browser
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		
		
		//Launch the browser
		WebDriver driver=new EdgeDriver();
		
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		
		//navigate the browser
		driver.get("file:///C:/Users/Joseph/Downloads/webpage-20240729T013516Z-001/webpage/webpage.html");
		//name
		driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[1]/td[2]/input"));
		//email
		driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[2]/td[2]/input")).sendKeys("sweetybabu3214@gmail.com");
		//pw
		driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[3]/td[2]/input")).sendKeys("sweetybabu3214");
		//ph.no
		driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys("9789614646");
		//dob
		driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[2]/td[2]/input")).sendKeys("31/10/1997");
		//gender
		driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[6]/td[2]/input[2]")).click();

		
		//wait for 2sec
		Thread.sleep(2000);

	}

}
