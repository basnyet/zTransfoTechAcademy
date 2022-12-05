package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TAContactUsPage;

public class TAContactUs extends MainClass {

	TAContactUsPage contact;

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

	@Then("user type invalid {string}")
	public void user_type_invalid(String string) {

	}

	@And("user type state name")
	public void user_type_state_name() throws InterruptedException {
//		Thread.sleep(3000);
		contact.type_State();
	}

	@Then("user click full stack QA Engineeing radio button")
	public void user_click_full_stack_qa_engineeing_radio_button() throws InterruptedException {
//		Thread.sleep(3000);
		try {
//	 contact.click_qAEngineering();
		}catch(Exception e) {
			System.out.println("QA Engineering button not visible");
		}
	}

	@And("user un-click full stack QA Engineeing radio button")
	public void user_un_click_full_stack_qa_engineeing_radio_button() throws InterruptedException {
//		Thread.sleep(3000);
		try {
//		contact.click_qAEngineering();
		}catch(Exception e) {
			System.out.println("QA Engeering2 button not visible");
		}
	}

	@Then("user click Business Analyst radio button")
	public void user_click_business_analyst_radio_button() throws InterruptedException {
//		Thread.sleep(3000);
		try {
//		contact.click_busenessAnlst();
		}catch(Exception e) {
			System.out.println("Buseness Analysit button not visible");
		}
	}

	@And("user un-click Business Analyst radio button")
	public void user_un_click_business_analyst_radio_button() {
		try {
//		contact.click_busenessAnlst();
		}catch(Exception e) {
			System.out.println("Business Anaiysist2 button not visible");
		}
	}

	@Then("user click Master Ethical radio button")
	public void user_click_master_ethical_radio_button() throws InterruptedException {
//		Thread.sleep(3000);
		try {
//		contact.click_MasterEH();
		}catch(Exception e) {
			System.out.println("MasterEH button not visible");
		}
	}

	@And("user un-click Master Ethical radio button")
	public void user_un_click_master_ethical_radio_button() {
		try {
//		contact.click_MasterEH();
		}catch(Exception e) {
			System.out.println("MasterEH2 button not visible");
		}
	}

	@Then("user click Salesforce Admin and Development radio button")
	public void user_click_salesforce_admin_and_development_radio_button() throws InterruptedException {
//		Thread.sleep(3000);
		try {
//		contact.click_salesForce();
		}catch(Exception e) {
			System.out.println("Saleforce button not visible");
		}
	}

	@And("user un-click Salesforce Admin and Development radio button")
	public void user_un_click_salesforce_admin_and_development_radio_button() {
		try {
//		contact.click_salesForce();
		}catch(Exception e) {
			System.out.println("Saleforce button not visible");
		}
	}

	@Then("user click full stack QA Engineeing radio button at last")
	public void user_click_full_stack_qa_engineeing_radio_button_at_last() {
		try {
//		contact.click_qAEngineering();
		}catch(Exception e) {
			System.out.println("Qa Engeering3 button not visible");
		}

	}

	@And("user type some Massage in massage box")
	public void user_type_some_massage_in_massage_box() {
		try {
//		contact.type_MassageBox();
		}catch(Exception e) {
			System.out.println("Massage Box button not visible");
		}
	}

	@Then("user click submit button to submit information")
	public void user_click_submit_button_to_submit_information() throws InterruptedException {
//		Thread.sleep(3000);
		try {
//		contact.click_Submit();
		}catch(Exception e) {
			System.out.println("submit button not visible");
		}
	}

	@And("user can see massage Email is invalid!")
	public void user_can_see_massage_email_is_invalid() {

	}

	@Then("user can see massage invalid phone number")
	public void user_can_see_massage_invalid_phone_number() {

	}

}
