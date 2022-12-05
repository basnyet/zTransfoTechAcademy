package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.AboutUSPage;
import verificationPackage.TransfoTechAboutUSPageVarification;

public class TransfoTechAboutUS extends MainClass {

	AboutUSPage aboutus;
	TransfoTechAboutUSPageVarification verify;

	@When("user mouse hover About US feature and click it")
	public void user_mouse_hover_about_us_feature_and_click_it() {
		aboutus = new AboutUSPage();
		aboutus.click_AboutUS();

	}

	@Then("user can see displayed Our Values page")
	public void user_can_see_displayed_our_values_page() {
		verify = new TransfoTechAboutUSPageVarification();
		verify.pageVarification();
	}

}
