package KiteLogin;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingExcelLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");


        WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		File MyFile =new File("C:\\poi-bin-5.2.2\\ReadRutuja.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		String UID = MySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		userID.sendKeys(UID);
		passWord.sendKeys(PWD);
		loginButton.click();
		Thread.sleep(200);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys(PIN);
		continueButton.click();
		Thread.sleep(200);
		WebElement UiD = driver.findElement(By.xpath("//span[@class='user-id']"));
		String expectedUserID="ELR321";
		String actualUserID = UiD.getText();
		if (expectedUserID.equals(actualUserID))
		{
		System.out.println("Actual and Expected UserID are matching TC is Passed");
		}
		else {
		System.out.println("Actual and Expected UserID are not matching TC is Failed");
		}
		UiD.click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		driver.close();
		
		
	
		
		
		

	}

}
