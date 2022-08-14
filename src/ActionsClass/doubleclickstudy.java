package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickstudy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions act= new Actions(driver);

		//Thread.sleep(2000);
		WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(DoubleClick).perform();
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		alt.accept();


}
}