package TestNgListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {
 
	public void onTestFailure(ITestResult result) {
		
		String name=result.getName();
		//we will provide the take screenshot steps
		//perform Typecasting
		
		//call the screenShot method
		//Store the Screenshot in temp path
		//create the storage for permanent path
		//copy the screen shot from temp to permanent
		Reporter.log("Taking the ScreenShot Sucess"+name,true);
	}
}
