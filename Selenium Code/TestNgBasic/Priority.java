package TestNgBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	//making prioritity while execution which ones want execute 1st negative value give hih and positive value give low priority
    @Test(priority=-1)
    
    public void aligator(){
    	Reporter.log("Aligator is comming",true);
    }
    @Test(priority=2)
    public void bear() {
    	Reporter.log("Bear is comming",true);
    }
    @Test(priority=-3)
   public void cat() {
    	Reporter.log("Cat is comming",true);
    }
   @Test(priority=4)
   public void elephant() {
		Reporter.log("Elephant is comming",true);
   }

   @Test(priority=-5)
   public void dog() {
		Reporter.log("Dog is comming",true);
   }
}
