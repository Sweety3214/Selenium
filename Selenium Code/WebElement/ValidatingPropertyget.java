package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//validating the text,attitribute value,tagneme ,size loaction
public class ValidatingPropertyget {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Configure the browser
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);


		//print the title
		String title=driver.getTitle();
		//Step4: Print on Console
				System.out.println("Title is  :"+title);
		
		// validating the spelling mistakes in webpage
		WebElement e1 = driver.findElement(By.xpath("/html/body/div/main/section[1]/div/div/div/h1"));
		// return string type
		String r1 = e1.getText();
		System.out.println(r1);
		System.out.println("-------------------------------------");

//validating tag name means input, hi,textarea
		WebElement e2 = driver.findElement(By.xpath("/html/body/div/main/section[1]/div/div/div/h1"));
		String r2 = e2.getTagName();
		System.out.println(r2);
		System.out.println("-------------------------------------");

//validating attribute valuemeans value of id, class
		WebElement e3 = driver.findElement(By.xpath("/html/body/div/main/section[1]/div/div/div/h1"));
		String r3 = e3.getAttribute("class");
		System.out.println(r3);
		System.out.println("-------------------------------------");

//Valiadting colours, sytle
		WebElement e4 = driver.findElement(By.xpath("/html/body/div/main/section[1]/div/div/div/h1"));
		Dimension r4 = e4.getSize();
		System.out.println(r4);
		System.out.println("-------------------------------------");
		
		
//css		
		WebElement e5 = driver.findElement(By.xpath("//*[@id=\"selenium_webdriver\"]"));
		String bClr=e5.getCssValue("background-color");
		String cursor=e5.getCssValue("cursor");
		String apperance=e5.getCssValue("apperance");
		String margin=e5.getCssValue("font-weight"); 
		
		System.out.println(bClr);
		System.out.println(cursor);
		System.out.println(bClr);
		System.out.println(apperance);
		System.out.println(margin);
		
		 ///fetch the size,
		System.out.println("ELEMENT DIMENTION :" +e5. getRect().getDimension());
		System.out.println("ELEMENT LOCATION:" +e5. getRect().getPoint());
		System.out.println("ELEMENT WIDTH :" +e5. getRect().getWidth());
		System.out.println("ELEMENT HIGHT:" +e5. getRect().getHeight());
		System.out.println("ELEMENT x :" +e5. getRect().getX());
		System.out.println("ELEMENT y :" +e5. getRect().getY());
	}

}
