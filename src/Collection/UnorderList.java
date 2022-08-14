package Collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		Thread.sleep(1000);
		List<WebElement> result =driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		
		System.out.println(result.size());
		for(WebElement r:result)
		{
		System.out.println(r.getText());
		}
		for(WebElement r:result)
		{
		String expectedResult = "samsung m12";
		String actualText=r.getText();
		if(actualText.equals(expectedResult))
		{
		r.click();
		break;
		}

		}
	}

}
