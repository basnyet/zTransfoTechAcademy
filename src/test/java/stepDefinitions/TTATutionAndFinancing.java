package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.TTATutionAndFinancingPagge;
import verificationPackage.TTATutionFVarifiedPage;

public class TTATutionAndFinancing extends MainClass{

	TTATutionAndFinancingPagge tutf;
	TTATutionFVarifiedPage pvrf;
	
	@When("user click tution and financing page")
	public void user_click_tution_and_financing_page() {
	   tutf = new TTATutionAndFinancingPagge();
	   tutf.click_tutionF();
	}

	@Then("user can see new display page")
	public void user_can_see_new_display_page() {
	   pvrf = new TTATutionFVarifiedPage();
	   pvrf.displayPage();
	}

}
