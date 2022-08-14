package selniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	      
	      WebDriver driver= new ChromeDriver();
	      
	      driver.get("https://www.redbus.in/");
	      driver.manage().window().maximize();

	  	Thread.sleep(5000);
	  		driver.findElement(By.xpath("//div[@class='fr signin-block  ']")).click();
	  		Thread.sleep(5000);
	  		driver.findElement(By.xpath("//div[@id='hc']")).click();
	  		Thread.sleep(5000);
	  		//driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
	  		
	  		driver.switchTo().activeElement();
	  		Thread.sleep(2000);

	  		driver.findElement(By.id("mobileNoInp")).sendKeys("8856991628");
//	Thread.sleep(5000);
//	  		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("PUNE")
		 	//driver.findElement(By.xpath("//div[@class='mobileInput clearfix']")).sendKeys("8856991628");

	}

}
