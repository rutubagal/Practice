package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement ID;
	@FindBy(xpath="//a[@target='_self']")private WebElement Logout;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public HomePage (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }

	public void GetID()
	   {
		String expectedUserID="ELR321";
		String actualUserID = ID.getText();  
		if (expectedUserID.equals(actualUserID))
		{
		System.out.println("Actual and Expected UserID are matching TC is Passed");
		}
		else {
		System.out.println("Actual and Expected UserID are not matching TC is Failed");
		}
	   }
	
	public void LogoutButton()
	{
		ID.click();
		Logout.click();
	}
}
