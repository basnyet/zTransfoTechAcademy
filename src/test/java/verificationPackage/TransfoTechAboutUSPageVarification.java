package verificationPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TransfoTechAboutUSPageVarification extends MainClass {

	public TransfoTechAboutUSPageVarification() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Our Values']")
	WebElement ourValue;
	public boolean pageVarification() {
		return ourValue.isDisplayed();
	}
	
}
