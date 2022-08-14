package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowseropup {

	public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
			driver.get("https://vctcpune.com/#");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Start Selenium Practice")).click();
			Set<String> IdofAll = driver.getWindowHandles();
			System.out.println(IdofAll);
			ArrayList<String> al= new ArrayList<String>(IdofAll);
			System.out.println(al.get(0));
			System.out.println(al.get(1));
			
			String MainPageId = al.get(0);
			String ChildPageId= al.get(1);
			
			driver.switchTo().window(ChildPageId);
			driver.findElement(By.linkText("About Us")).click();

	}

}
