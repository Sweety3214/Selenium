package HandlingDropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDOptionCount {
    public static void main(String[] args) {
        // Set the WebDriver system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("file:///C:/Users/Joseph/Downloads/webpage.html");

        // Locate the dropdown element by name
        WebElement sd1 = driver.findElement(By.name("country1"));
        
        // Instantiate the Select object with the located WebElement
        Select select = new Select(sd1);
        
        
        //optional method
        // Get all options from the dropdown
        List<WebElement> allOptions = select.getOptions();
        
        // Count the number of options using .size()
        int count = allOptions.size();
        
        // Print the count of options
        System.out.println("Count of options is: " + count);
        
        // Print all options using a for loop
        for (int i = 0; i < count; i++) {
            String text = allOptions.get(i).getText();
            System.out.println(text);
        }
        
        //Alternative method

        // Closing the browser
        driver.quit();
    }
}
