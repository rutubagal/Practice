import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		//chnge by mayur

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,800)");
		
		WebElement txt = driver.findElement(By.id("name"));
		WebElement txt2 = driver.findElement(By.id("opentab"));
		
		
		js.executeScript("arguments[0].scrollIntoView();",txt);
		
		js.executeScript("arguments[0].value='Rutuja';",txt);
		
		Thread.sleep(1000);
		js.executeScript("arguments[0].click;",txt2);
		
		
		
		
	}

}
