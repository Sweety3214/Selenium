package TestNgAssertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_HardAssert {
@Test
public void DemoTest() {
	String  expectedcondion="Sweety";
	String  actualcondition="Sweety1";
	
	
	if(expectedcondion.equals(actualcondition)) {
		Reporter.log("Demo test Pass" , true);
	}else {
		
		Reporter.log("Demo test fail" , true);
	}
	
	Reporter.log("Demo test Completed" , true);
}
}
