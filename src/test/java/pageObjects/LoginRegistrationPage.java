package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class LoginRegistrationPage extends MainClass{

	public LoginRegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class=\"login-register\"])[2]")
	WebElement login;
	
	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(name = "rememberme")
	WebElement checkBox;
	
	@FindBy(xpath = "(//*[@type=\"submit\"])[2]")
	WebElement submit;
	
	public void click_submit() {
		submit.click();
	}
	
	public void click_CheckBox() {
		checkBox.click();
	}
	
	public void type_Password(String Password) {
		password.sendKeys(Password);
	}
	
	public void type_UserName(String UserName) {
		userName.sendKeys(UserName);
	}
	public void click_Login() {
		login.click();
	}
}
