package TestNgBatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 extends BaseClassExecutionBrowser{
	@Test
	public void addProduct() {
		Reporter.log("Test 2 method",true);
	}
}
