package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");


        WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		KiteTestLogin KTL=new KiteTestLogin(driver);
		PinPage PP= new PinPage(driver);
		HomePage HP= new HomePage(driver);
		
		KTL.sendUserId();
		KTL.sendPassword();
		KTL.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		PP.sendPin();
		PP.clickcontinue();
		
		Thread.sleep(1000);


		HP.GetID();
		HP.LogoutButton();
		
		
	}

}
