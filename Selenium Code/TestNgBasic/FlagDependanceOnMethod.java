package TestNgBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Depenadance means it 1st check priority if no priority given means then check  Alphabet order its ok means then check depenace
public class FlagDependanceOnMethod {
  @Test
  public void parent() {
	Reporter.log("Parent Method ", true);  
  }
  @Test(dependsOnMethods ="parent")
  public void elderchild() {
	  Reporter.log("Elder Child Method ", true);  
  }
  @Test(dependsOnMethods="parent")
  public void youngerchild() {
	  Reporter.log("Yonger Parent Method ", true);  
  }
}
