package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions act= new Actions(driver);
		WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(RightClick).perform();
	
		

		
		
	}

}
