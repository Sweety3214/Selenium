package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Relative {

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
		
		
		
		//Find the element of name using Xpath_relative Locator
		WebElement e1= driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
		// clear 
		e1.clear();
		//Update the name
		e1.sendKeys("Sweety");
		
		//wait for 2sec
		Thread.sleep(2000);
		
		//emai
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sweetybabu3214@gmail.com");
		
		//wait for 2sec
		Thread.sleep(2000);
		
		//pw
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("061706Amma@");
		
		//wait for 2sec
		Thread.sleep(2000);
		
		//Mobile number
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9789614646");
		
		//feedback element
		driver.findElement(By.xpath("//*[@id=\"feedback\"]")).sendKeys("Selenium is so far interesting");
		//wait for 2sec
				Thread.sleep(2000);
		
		
		//close window
		driver.close();
		
		
		
		

	}

}
