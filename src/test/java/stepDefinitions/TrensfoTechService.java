package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.TransfoTechServicePage;
import verificationPackage.TTAserviceVerificationPage;

public class TrensfoTechService extends MainClass{

	TransfoTechServicePage service;
	TTAserviceVerificationPage verification;
	
	@Given("user is in the Home page")
	public void user_is_in_the_home_page() {
		appURL();
	}

	@When("user mouse hover on the service feature")
	public void user_mouse_hover_on_the_service_feature() {

		service = new TransfoTechServicePage();
		service.service();
	}

	@When("user move to Job placement button and click it")
	public void user_move_to_job_placement_button_and_click_it() {
	  
		service.jobPlacement();
	}

	@Then("user can see displayed job placement page")
	public void user_can_see_displayed_job_placement_page() {
		
	  verification = new TTAserviceVerificationPage();
	  verification.jobPage();
	  
	}

	@When("user move to IT Training button and click it")
	public void user_move_to_it_training_button_and_click_it() {
	   
		service.itTraining();
	}

	@Then("user can see displayed IT Training page")
	public void user_can_see_displayed_it_training_page() {
	   
		verification = new TTAserviceVerificationPage();
		 verification.itPageVerified();
	}

}
