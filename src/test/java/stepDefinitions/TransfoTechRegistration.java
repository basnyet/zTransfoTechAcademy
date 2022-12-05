package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.TTRegistrationPage;
import verificationPackage.Login_RegistrationVerification;

public class TransfoTechRegistration extends MainClass {

	TTRegistrationPage registrationP;
	Login_RegistrationVerification verify;

	@Given("user is in the home page")
	public void user_is_in_the_home_page() {

		appURL();
	}

	@When("user click Login\\/Register button")
	public void user_click_login_register_button() {

		registrationP = new TTRegistrationPage();
		registrationP.click_LoginRegister();

	}

	@Then("user can see Login Reistration page is displayed")
	public void user_can_see_login_reistration_page_is_displayed() {

		verify = new Login_RegistrationVerification();
		verify.lgPageVerification();
	}

	@Then("user scroll down to go registration field to fillup")
	public void user_scroll_down_to_go_registration_field_to_fillup() {

		System.out.println("***It is scroll down to go registration field***");

	}

	@Then("user type legal {string}")
	public void user_type_legal(String EmailAddress) throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_Email(EmailAddress);
	}

	@Then("user type {string} which user want to put")
	public void user_type_which_user_want_to_put(String UserName) throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_userName(UserName);
	}

	@Then("user type {string}  user want to")
	public void user_type_user_want_to(String Password) {

		registrationP.type_Password(Password);
	}

	@Then("user type {string}")
	public void user_type(String ConfirmPassword) throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_ConfirmPassword(ConfirmPassword);
	}

	@Then("user enter first name")
	public void user_enter_first_name() throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_FirstName();
	}

	@Then("user enter last name name")
	public void user_enter_last_name_name() throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_LastName();
	}

	@Then("user enter Display name")
	public void user_enter_display_name() throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_DisplayName();
	}

	@Then("user click to check radio button before click register")
	public void user_click_to_check_radio_button_before_click_register() throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.click_Radio_Button();
	}

	@Then("user click to uncheck radio button")
	public void user_click_to_uncheck_radio_button() throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.click_Radio_Button();
	}

	@Then("user click Register button to Register")
	public void user_click_register_button_to_register() {

		registrationP.click_register();
	}

	@Then("user enter illegal {string}")
	public void user_enter_illegal(String EmailAddress) throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_Email(EmailAddress);
	}

	@Then("user enter {string} not mantion mandtory required")
	public void user_enter_not_mantion_mandtory_required(String UserName) throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_userName(UserName);
	}

	@Then("user enter {string} not mantion mandtory charactor")
	public void user_enter_not_mantion_mandtory_charactor(String Password) throws InterruptedException {
//		Thread.sleep(3000);
		registrationP.type_Password(Password);
	}

	@Then("user enter {string}")
	public void user_enter(String ConfirmPassword) throws InterruptedException {
		Thread.sleep(3000);
		registrationP.type_ConfirmPassword(ConfirmPassword);
	}

	@Then("page should stay same page")
	public void page_should_stay_same_page() {
		verify = new Login_RegistrationVerification();
		verify.pagelink_verify();
	}

}
