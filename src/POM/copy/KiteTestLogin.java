package POM.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteTestLogin {
	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(id="userid") private WebElement UID;
	@FindBy(id="password")private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KiteTestLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public
	public void sendUserId()
	{
	UID.sendKeys("ELR321");
	}
	public void sendPassword()
	{
	Pass.sendKeys("Dhana1111");
	}
	public void clickOnLoginButton()
	{
	loginButton.click();
	}
	
	
}
