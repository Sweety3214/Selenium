package TestNgBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesTng {
	@Test
	public void demoTest1() {
		// Print Statement In the TestNG
		Reporter.log("Executed DemoTest 1  Method---->Pass", true);
	
	}

	@Test
	public void demoTest2() {
		// Print Statement In the TestNG
		Reporter.log("Executed DemoTest  2 Method---->Pass", true);

	}

	@Test
	public void demoTest3() {
		// Print Statement In the TestNG
		Reporter.log("Executed DemoTest 3 Method---->Pass", true);

	}
 
 
}
