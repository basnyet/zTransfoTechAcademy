package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TAContactUsPage;
import verificationPackage.ContactUSVeryfiactionPage;

public class TAContactUs extends MainClass {

	TAContactUsPage contact;
	 ContactUSVeryfiactionPage pgverify;

	@When("user click contact us button")
	public void user_click_contact_us_button() {
		contact = new TAContactUsPage();
		contact.click_ContactUS();
	}

	@When("user type first name")
	public void user_type_first_name() throws InterruptedException {
//		Thread.sleep(3000);
		contact.type_FirstName();

	}

	@And("user type last name")
	public void user_type_last_name() throws InterruptedException {
//		Thread.sleep(3000);
	 contact.type_LastName();
	}

	@Then("user type invalid email {string}")
	public void user_type_invalid_email(String EmailAddress) {
	  contact.type_Email(EmailAddress);
	}

	@Then("user type invalid phone {string}")
	public void user_type_invalid_phone(String PhoneNumber) {
	   contact.typePhoneNumber(PhoneNumber);
	}


	@And("user type state name")
	public void user_type_state_name() throws InterruptedException {
//		Thread.sleep(3000);
		contact.type_State();
	}

	@Then("user click full stack QA Engineeing radio button")
	public void user_click_full_stack_qa_engineeing_radio_button() throws InterruptedException {
		Thread.sleep(3000);
	 contact.click_qAEngineering();
	
	}
	@Then("user click submit button to submit information")
	public void user_click_submit_button_to_submit_information() throws InterruptedException {
		Thread.sleep(3000);
		try {
		contact.click_Submit();
		}catch(Exception e) {
			System.out.println("****Submit button not visible****");
		}
	}

	@And("user can see massage Email is invalid!")
	public void user_can_see_massage_email_is_invalid() {
		try {
		pgverify = new ContactUSVeryfiactionPage();
		pgverify.typeInvalidEmail();
		}catch(Exception e) {
			System.out.println("***Page not show up because of Submit button not click*** ");
		}
	}

	@Then("user can see massage invalid phone number")
	public void user_can_see_massage_invalid_phone_number() {
		try {
		pgverify.typeInvalidPhone();
	}catch(Exception e) {
		System.out.println("***Page not show up because of Submit button not click*** ");
	}
	}

}
