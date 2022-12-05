package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTRegistrationPage extends MainClass {

	public TTRegistrationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class=\"login-register\"])[2]/*")
	WebElement login_register;

	@FindBy(id = "reg_email")
	WebElement email;

	@FindBy(id = "reg_username")
	WebElement userName;

	@FindBy(id = "reg_password")
	WebElement password;

	@FindBy(id = "reg_password2")
	WebElement confirmPssword;

	@FindBy(id = "reg_first_name")
	WebElement firstName;

	@FindBy(id = "reg_last_name")
	WebElement lastName;

	@FindBy(id = "reg_display_name")
	WebElement displayNamme;

	@FindBy(id = "become_teacher")
	WebElement radioButton;

	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	WebElement registar;

	public void click_LoginRegister() {
		login_register.click();

	}

	public void type_Email(String EmailAddress) {
		email.sendKeys(EmailAddress);
	}

	public void type_userName(String UserName) {

		userName.sendKeys(UserName);
	}

	public void type_Password(String Password) {
		password.sendKeys(Password);
	}

	public void type_ConfirmPassword(String ConfirmPassword) {
		confirmPssword.sendKeys(ConfirmPassword);
	}

	public void type_FirstName() {
		firstName.sendKeys("Test123");
	}

	public void type_LastName() {
		lastName.sendKeys("Test_Tester");
	}

	public void type_DisplayName() {
		displayNamme.sendKeys("Tester4");
	}

	public void click_Radio_Button() {
		radioButton.click();
	}

	public void click_register() {
		try {
		registar.click();
		}catch(Exception e) {
			System.out.println("Negative test by **Invalid Data**");
		}
	}
}
