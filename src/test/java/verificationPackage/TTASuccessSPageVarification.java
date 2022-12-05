package verificationPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTASuccessSPageVarification extends MainClass {

	public TTASuccessSPageVarification () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='SUCCESS STORIES']")
	WebElement successSP;
	
	public boolean verifiedPage() {
		return successSP.isDisplayed();
	}
}
