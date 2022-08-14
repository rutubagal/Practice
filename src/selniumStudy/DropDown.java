package selniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	 WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
	 
	 Select s= new Select(listbox);
	 
	 //s.selectByIndex(1);
	// s.selectByValue("option1");
	 s.selectByVisibleText("Option2");
	 
	
		
		
		

		
		
		
		
		
		
	}

}
