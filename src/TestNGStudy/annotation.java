package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class annotation {
  @Test
  public void Tmethod() {
	  
	  Reporter.log("Test Method is running");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  Reporter.log("Before Method is running");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method is running");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  Reporter.log("Before class is running");
  }

  @AfterClass
  public void afterClass() {
	  
	  Reporter.log("A is running");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  Reporter.log("Test Method is running");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

}
