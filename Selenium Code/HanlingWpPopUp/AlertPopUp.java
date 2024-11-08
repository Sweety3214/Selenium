package HanlingWpPopUp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
    public static void main(String[] args) throws InterruptedException {
        // Configure the browser
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        
        // Launch the browser
        ChromeDriver driver = new ChromeDriver();
        
    
            // Maximize the browser window
            driver.manage().window().maximize();
            
            // Implicitly waiting statement
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            // Navigating to the URL
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            
            // Identify and click the button to generate the pop-up
            driver.findElement(By.id("promptexample")).click();
            
            // Switch the control from main page to alert pop-up
            Alert popup = driver.switchTo().alert();
            
            // Fetch the text of the alert message
            String popupMsg = popup.getText();
            System.out.println("Pop Up Message is: " + popupMsg);
            // Pause for observation (optional)
            Thread.sleep(5000);
            
            // Accepting the alert (click on OK button)
            popup.accept();
            
            //calencelling the alert(click on cancel button)
            //popup.dismiss();
            
            // Pause for observation (optional)
            Thread.sleep(5000);
      
            // Close the browser
            driver.quit();
       
    }
}
