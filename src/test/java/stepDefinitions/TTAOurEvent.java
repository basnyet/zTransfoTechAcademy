package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.TTAOuurEventsPage;
import verificationPackage.TTAOurEventPageVarification;

public class TTAOurEvent extends MainClass {

	TTAOuurEventsPage eventP; 
	TTAOurEventPageVarification eventPvr;
	
	@When("user click our event button")
	public void user_click_our_event_button() {
	    eventP =new TTAOuurEventsPage();
	    eventP.click_Events();
	}

	@Then("user can see display new page")
	public void user_can_see_display_new_page() {
	   eventPvr =new TTAOurEventPageVarification();
	   eventPvr.displayEvents();
	}

}
