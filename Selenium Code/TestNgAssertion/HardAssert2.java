package TestNgAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert2 {
	@Test
	public void DemoTest() {
		String expcondition1 = "harry";
		String actualcondition1 = "harry0";

		int expcondition2 = 0;
		int actualcondition2 = 0;

		boolean expcondition3 = true;
		boolean actualcondition3 = true;

		// Validate Using Assertion

		// Condition Should Match
		// Assert.assertEquals(expcondition, actualcondition);

		// Condition Should Not Match
		 Assert.assertNotEquals(expcondition1, actualcondition1);

		// Explicitly Make TestFail
		Assert.fail();

		Reporter.log("Demo Test Executed", true);

	}
}
