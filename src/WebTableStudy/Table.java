package WebTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> NOofRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("no of rows in table are"+NOofRows.size());
	 WebElement RowData = driver.findElement(By.xpath("//table[@class='dataTable']//tr[2]"));
		System.out.println(RowData.getText());
		
		
		
		
	}

}
