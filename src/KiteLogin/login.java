package KiteLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.id("userid")).sendKeys("ELR321");
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//span[text()='ELR321']"));
		

		
		
		
		

	}

}
