package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {


           public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			Actions act= new Actions(driver);

			WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
			WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
			
			act.dragAndDrop(source, dest).perform();
			
			
	}

}
