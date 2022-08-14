package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group2 {
	@Test(groups= {"Sanity"})
	  public void D	() {
		  
		  Reporter.log("D is running",true);
		  
	  }
	  
	  @Test(groups= {"Regression"})
	  public void E	() {
		  
		  Reporter.log("E is running",true);
		  
	  }
	  
	  @Test(groups= {"Regression"})
	  public void F	() {
		  
		  Reporter.log("F is running",true);
}
}
