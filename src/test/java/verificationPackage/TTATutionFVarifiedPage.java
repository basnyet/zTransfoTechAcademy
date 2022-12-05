package verificationPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTATutionFVarifiedPage extends MainClass {

	public TTATutionFVarifiedPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Tuition & Financing']")
	WebElement tutionFPage;
	
	public boolean displayPage() {
		return tutionFPage.isDisplayed();
	}
}
