package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.TTASuuccessSPage;
import verificationPackage.TTASuccessSPageVarification;

public class TransfoTechSuccessStory extends MainClass {

	TTASuuccessSPage ssp;
	TTASuccessSPageVarification verified;
	
	@When("user mouse hover on the About Us feature")
	public void user_mouse_hover_on_the_about_us_feature() {
	   ssp = new TTASuuccessSPage();
	   ssp.move_AboutUs();
	}

	@And("user move to Success Stories  button and click it")
	public void user_move_to_success_stories_button_and_click_it() {
	   ssp.click_SuccessS();
	}

	@Then("user can see displayed Success Stories page")
	public void user_can_see_displayed_success_stories_page() {
		verified = new TTASuccessSPageVarification();
	  verified.verifiedPage();
	}
	@Then("user click first image to link you tube video")
	public void user_click_first_image_to_link_you_tube_video() throws InterruptedException {
	    ssp.click_FirstImage();
//	    Thread.sleep(5000);
	
	}

}
