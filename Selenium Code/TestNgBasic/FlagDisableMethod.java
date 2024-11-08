package TestNgBasic;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagDisableMethod {

	//Make The Test Method Disable Only For Excution
	@Test
	public void parent() {
		Reporter.log("parent Method", true);
	}

	@Test(dependsOnMethods = "parent")
	public void elderchild() {
		Reporter.log("elderchild Method", true);
	}

	@Test(enabled = false)
	public void youngerchild() {
		Reporter.log("youngerchild Method", true);
	}

}