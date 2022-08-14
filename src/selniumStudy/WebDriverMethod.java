package selniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
      
      WebDriver driver= new ChromeDriver();
      
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      Thread.sleep(5000);
     driver.navigate().to("https://www.flipkart.com/");
      //driver.close();
      
      String URL=driver.getCurrentUrl();
      System.out.println(URL);
	}

}