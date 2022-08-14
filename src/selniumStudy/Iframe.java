package selniumStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame("frame1");
	    driver.findElement(By.tagName("input")).sendKeys("Iframe Practice");
	    
	    driver.switchTo().frame("frame3");
	    driver.findElement(By.id("a")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
 
	    driver.switchTo().frame("frame2");
	    
	    WebElement animal= driver.findElement(By.id("animals"));
	    Thread.sleep(2000);
	    animal.click();
	    Thread.sleep(2000);
        Select s=new Select(animal);
        s.selectByValue("avatar");
        Thread.sleep(2000);
        
        File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\MAA\\Desktop\\pushpa\\Rutu.png");
        FileHandler.copy(scr, dest);
        

        
     

	}

		
	}


