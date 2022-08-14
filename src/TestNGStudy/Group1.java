package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group1 {
	 @Test(groups= {"Sanity"})
	  public void A	() {
		  
		  Reporter.log("a is running",true);
		  
	  }
	  
	  @Test(groups= {"Regression"}                                         )
	  public void B	() {
		  
		  Reporter.log("b is running",true);
		  
	  }
	  
	  @Test(groups= {"Sanity"})
	  public void C	() {
		  
		  Reporter.log("c is running",true);
}
}
