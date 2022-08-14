package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	//1. Data member should be declared globally with access level private using @findBy Annotation
   @FindBy(id="pin")private WebElement Pin;
   @FindBy(xpath="//button[@type='submit']")private WebElement Continue;
   
   //	//2. Initialize within a constructor with access level public using pagefactory
   
   public PinPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }

   public void sendPin()
   {
	   Pin.sendKeys("982278");
   }
   
   public void clickcontinue()
   {
	   Continue.click();
   }
}
