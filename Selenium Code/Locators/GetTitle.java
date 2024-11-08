package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		// Initialize the ChromeDriver (opens a Chrome browser window)
		WebDriver driver = new ChromeDriver();

		// Navigate to a website
		driver.get("https://www.amazon.com/");

		// Get the title of the web page
		String pageTitle = driver.getTitle();

		// Print the title to the console
		System.out.println("The page title is: " + pageTitle);

		// Close the browser
		driver.quit();
	}
}
