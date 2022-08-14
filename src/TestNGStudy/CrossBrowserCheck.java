package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserCheck {
	 @Parameters("browserName")

  @Test
  public void f(String Bname) {
	  
	  WebDriver driver=null;
	  
	  if(Bname.equals("Firefox"))
	  {
	  
System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
	  
	   driver=new FirefoxDriver();
      driver.manage().window().maximize();
      
      
    driver.get("https://vctcpune.com/selenium/practice.html");
	  }
    
	  else if(Bname.equals("chrome"))
	  {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	  }
  }
}
