package selniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		
	driver.findElement(By.name("firstname")).sendKeys("Rutuja");
	Thread.sleep(2000);
    driver.findElement(By.name("lastname")).sendKeys("Bagal");
	Thread.sleep(2000);
driver.findElement(By.name("reg_email__")).sendKeys("gd@kuldeveerealtors.com");
Thread.sleep(2000);
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("gd@kuldeveerealtors.com");
Thread.sleep(2000);
driver.findElement(By.id("password_step_input")).sendKeys("Kuldevee!@#");
Thread.sleep(2000);

WebElement day = driver.findElement(By.id("day"));
Select s1= new Select(day);
s1.selectByValue("22");
Thread.sleep(2000);


WebElement month = driver.findElement(By.id("month"));
Select s2= new Select(month);
s2.selectByValue("1");
Thread.sleep(2000);


WebElement year = driver.findElement(By.id("year"));
Select s3= new Select(year);
s3.selectByValue("1995");
Thread.sleep(2000);

driver.findElement(By.className("_58mt")).click();
Thread.sleep(2000);

driver.findElement(By.name("websubmit")).click();
//Thread.sleep(2000);




	
		
		
		
		
		
		
		
		
	// WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
	}

}
