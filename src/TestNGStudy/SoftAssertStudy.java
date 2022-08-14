package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertStudy {
  @Test
  public void f() {
	  
	  String a= "Rutuja";
	  String b= "Pratik";
	  String e= "Rutuja";
	  boolean c= true;
	  boolean d= false;
	  
	  SoftAssert soft= new SoftAssert();
	  
	  soft.assertEquals(a, b, "TC is Fail");
	  soft.assertNotEquals(a, e,"TC is Fail");
	  soft.assertTrue(c, "Tc is pass");
	  soft.assertAll();
	  
	  
	  
  }
}
