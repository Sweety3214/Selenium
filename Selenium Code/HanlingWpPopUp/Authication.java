package HanlingWpPopUp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authication {

    public static void main(String[] args) {
        // Configure the browser
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        
        // Launch the browser
        ChromeDriver driver = new ChromeDriver();
        
        // Implicitly waiting statement
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Handle the AUTHENTICATION POP UP
        String username = "admin";
        String pw = "admin@";
        
        // Pass the customized URL
        // Syntax: Protocol + username + pw + DomainName
        String url = "https://" + username + ":" + pw + "@the-internet.herokuapp.com/basic_auth";
        
        // Navigate to the app via URL
        driver.get(url);
        
        // Print the title of the page
        System.out.println("Title is: " + driver.getTitle());
        
        // Extract the text of the element with tag <p>
        String message = driver.findElement(By.tagName("p")).getText();
        System.out.println(message);
        
        // Close the browser
        driver.quit();
    }
}
