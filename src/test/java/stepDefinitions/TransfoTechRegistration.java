package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;

public class TransfoTechRegistration extends MainClass {

	
	@Given("user is in the home page")
	public void user_is_in_the_home_page() {
		appURL();
	}

	@When("user click Login\\/Register button")
	public void user_click_login_register_button() {
	  
	}

	@Then("user can see Login Reistration page is displayed")
	public void user_can_see_login_reistration_page_is_displayed() {
	  
	}

	@Then("user scroll down to go registration field to fillup")
	public void user_scroll_down_to_go_registration_field_to_fillup() {
	
	}

	@Then("user enter legal <{string}>")
	public void user_enter_legal(String string) {
	
	}

	@Then("user enter <{string}> which user want to put")
	public void user_enter_which_user_want_to_put(String string) {
	 
	}

	@Then("user enter <{string}>")
	public void user_enter(String string) {
	 
	}

	@Then("user enter first name")
	public void user_enter_first_name() {
	   
	}

	@Then("user enter last name name")
	public void user_enter_last_name_name() {
	  
	}

	@Then("user enter Display name")
	public void user_enter_display_name() {
	  
	}

	@Then("user click to check radio button before click register")
	public void user_click_to_check_radio_button_before_click_register() {
	 
	}

	@Then("user click to uncheck radio button")
	public void user_click_to_uncheck_radio_button() {
	   
	}

	@Then("user click Register button to Register")
	public void user_click_register_button_to_register() {
	  
	}

	@Then("user enter illegal <{string}>")
	public void user_enter_illegal(String string) {
	  
	}

	@Then("user enter <{string}> which is not requird")
	public void user_enter_which_is_not_requird(String string) {
	    
	}

}
