package selniumStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Snapshot {

	public static void main(String[] args) throws InterruptedException, IOException {
      
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		String random=RandomString.make(3);
		
		File destination=new File("C:\\Users\\MAA\\Desktop\\pushpa\\Rutu"+random+".png");
		FileHandler.copy(source, destination);
		
  }

}
