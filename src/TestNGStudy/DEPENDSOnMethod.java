package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DEPENDSOnMethod {
  @Test
  public void A	() {
	  
	  Reporter.log("login successful");
	  
  }
  
  @Test
  public void B	() {
	  
	  Reporter.log("login successful");
	  
  }
  
  @Test
  public void C	() {
	  
	  Reporter.log("login successful");
	  
  }
  @Test
  public void D	() {
	  
	  Reporter.log("login successful");
	  
  }
  
}
