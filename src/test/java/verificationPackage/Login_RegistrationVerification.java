package verificationPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.MainClass;

public class Login_RegistrationVerification extends MainClass {

	public Login_RegistrationVerification () {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[text()='Login']")
	WebElement loginPage;
	
	public boolean lgPageVerification() {
		return loginPage.isDisplayed();
	}
	public void pagelink_verify() {
		String  actualURL = "https://transfotechacademy.com/lp-profile/";
		  String curentURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL,curentURL);
		
	}
}
