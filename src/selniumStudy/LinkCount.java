package selniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/sql/");
	      driver.manage().window().maximize();
	      
	      List<WebElement> count = driver.findElements(By.tagName("a"));
	      
	      System.out.println("Total Count is " +count.size()); 
	      
	      for (WebElement LC:count)
	      {
	    	  System.out.println(LC.getText());
	      }
	    	  
		
	}

}
