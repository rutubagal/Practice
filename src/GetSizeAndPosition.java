import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPosition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
		
		driver.get("https://kite.zerodha.com/");
		
//		System.out.println(driver.manage().window().getSize());
//		 
//		Dimension d= new Dimension(500,600);
//		driver.manage().window().setSize(d);
//		
		Point p= new Point(200,300);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
		
		
		
	}

}
