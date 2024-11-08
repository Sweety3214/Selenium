package TestNgBatchDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClassTest2 extends BaseClass {
	@Test
	public void test1() {
		Reporter.log("Test 2 method",true);
	}
}
