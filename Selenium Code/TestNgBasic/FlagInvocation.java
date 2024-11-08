package TestNgBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagInvocation {
	//used to print multiple time
		  @Test(invocationCount=10)
		  public void parent() {
			  Reporter.log("Parent Method ", true);    
		  }
}
