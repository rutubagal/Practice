package selniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
	      driver.manage().window().maximize();


		Thread.sleep(2000);
		WebElement multi = driver.findElement(By.id("cars"));
		Select s=new Select(multi);
        Thread.sleep(2000);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
        s.deselectAll();
		

	}

}
