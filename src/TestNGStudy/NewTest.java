package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Login() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
      Thread.sleep(1000);
      
		
		driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
