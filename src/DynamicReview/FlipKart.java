package DynamicReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.name("q")).sendKeys("SAMSUNG Galaxy F12");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(1000);
			WebElement review =driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
			Thread.sleep(1000);
			System.out.println(review.getText());

	}

}
