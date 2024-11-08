package HandlingMouseActi;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";

		// configure the the browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// waiting statements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// naviagting the URL
		driver.get("https://demowebshop.tricentis.com/");
		// create an object for ACTION CLASS
		Actions action = new Actions(driver);

		// Identify the web element
		WebElement e1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));

		WebElement e2 = driver.findElement(By.partialLinkText("Register"));

		WebElement e3 = driver.findElement(By.partialLinkText("Log in"));

		WebElement e4 = driver.findElement(By.partialLinkText("Shopping cart"));

		// Perform mouse overing for COMPUTER element
		action.moveToElement(e1).perform();
		Thread.sleep(2000);

		// click action on REGISTER button
		action.click(e2).perform();
		Thread.sleep(2000);

		// naviagting the URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		// double click WHISHLIST button in whishlist double click is not possible
		// book
		action.doubleClick(e3).perform();
		Thread.sleep(2000);
		;

		// right click
		action.contextClick(e4).perform();
		Thread.sleep(2000);

		driver.close();
		// EXECUTION COMPLETED
		System.out.println("EXECUTION COMPLETED");

	}

}
