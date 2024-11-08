package TestNgPageRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
  /*  
    WebDriver driver;

    @BeforeClass
    void setUp() {
        // Set the path to your ChromeDriver executable if necessary
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	//configure the the browser
    			System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
    			
       WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
    }

    @Test
    void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("9940799203");
        loginPage.setPw("061706Amma@A");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
    */
}
