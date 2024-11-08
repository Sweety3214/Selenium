package TestNgListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.ListenerImplementation.class)
public class Test1 {

	
	@Test
	public void DemoTest() {
		Assert.fail();
		Reporter.log("Demo test Executed",true);
	}
}
