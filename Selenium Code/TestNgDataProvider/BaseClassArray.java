package TestNgDataProvider;

import org.testng.annotations.DataProvider;

public class BaseClassArray {
    @DataProvider
    public Object[][] registerData() {
        // 2D Array
        Object[][] data = new Object[3][3];
        
        data[0][0] = "Tanmoy";
        data[0][1] = 101;
        data[0][2] = "Testing";
        
        data[1][0] = "Banu";
        data[1][1] = 102;
        data[1][2] = "Developer";
        
        data[2][0] = "Sweety";
        data[2][1] = 103;
        data[2][2] = "Devops";
        
        return data;
    }
}
