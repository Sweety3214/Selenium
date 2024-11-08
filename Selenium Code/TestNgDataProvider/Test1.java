package TestNgDataProvider;

import org.testng.annotations.Test;

public class Test1 extends BaseClassArray {
	@Test(dataProvider="registerData")
	public void demoTest(String name,int id,String dept) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(dept);
	}
}
