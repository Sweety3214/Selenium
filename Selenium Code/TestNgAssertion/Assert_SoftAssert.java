package TestNgAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_SoftAssert {
	@Test
	public void DemoTest() {
		String  expectedCondion="Sweety";
		String  actualCondition="Sweety";
		
		int expectedCondion1=256;
		int  actualCondition1=256;
		
		boolean expectedCondion2=true;
		boolean actualCondition2=true;
		
		//Create obj for Soft Assert and call the method to ASSERT
		SoftAssert softAssert=new SoftAssert();
		
		//condition satisfied
		softAssert.assertEquals(actualCondition2, expectedCondion2);
		
		//mandatory method(not mention means if the test script is fail it show pass so this method is mandatory)
		softAssert.assertAll();
	}
}
