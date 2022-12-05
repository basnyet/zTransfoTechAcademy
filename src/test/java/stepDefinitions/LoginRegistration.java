package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.LoginRegistrationPage;
import verificationPackage.TALoginVarificationPage;

public class LoginRegistration extends MainClass {

	LoginRegistrationPage lPage;
	TALoginVarificationPage verify;
	
	@Given("user is in the home Page")
	public void user_is_in_the_home_page() {
		appURL();
	}

	
	@When("user click login button")
	public void user_click_login_button() {
		lPage = new LoginRegistrationPage();
		lPage.click_Login();
	}

	@Then("user type {string} and {string}")
	public void user_type_and(String UserName, String Password) {
		lPage.type_UserName(UserName);
		lPage.type_Password(Password);
	}

	@Then("user click remember me radio button")
	public void user_click_remember_me_radio_button() {
		lPage.click_CheckBox();
	}

	@Then("user click login button to go in")
	public void user_click_login_button_to_go_in() {
		lPage.click_submit();
	}

	@Then("page should not login")
	public void page_should_not_login() {
		verify = new TALoginVarificationPage();
		verify.pageVarified();

	}

}
