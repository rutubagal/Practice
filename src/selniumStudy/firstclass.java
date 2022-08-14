package selniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2FFastrack-Forms-Analog-Womens-Watch-NK6088SL01%2Fdp%2FB00H9BMPJM%2Fref%3Dsr_1_1%2F%3F_encoding%3DUTF8%26crid%3D12ANM6ZJ1E57%26dchild%3D1%26keywords%3Dgirls%2520watches%2520for%25208%2520years%2520old%26qid%3D1624686882%26refinements%3Dp_89%253AFastrack%26rnid%3D3837712031%26s%3Dwatches%26sprefix%3Dgirls%2520watches%2520for%252Caps%252C285%26sr%3D1-1%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_32");
		
		driver.findElement(By.id("ap_email")).sendKeys("rutubagal22@gmail.com");
		
		driver.findElement(By.id("continue")).click();
	 

	}

}
