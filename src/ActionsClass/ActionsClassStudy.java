package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions act= new Actions(driver);
		
		WebElement AboutUs = driver.findElement(By.linkText("About Us"))	;
		//AboutUs.click();
		//act.moveToElement(AboutUs).perform();
		//act.click().perform();
		act.moveToElement(AboutUs).click().build().perform();
        
		// Changes made by Vishal
		
		}

}
