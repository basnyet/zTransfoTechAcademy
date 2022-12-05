package verificationPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTAOurEventPageVarification extends MainClass{

	public TTAOurEventPageVarification() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Our Events'])[2]")
	WebElement liveTrainingEvent;
	
	public boolean displayEvents() {
		return liveTrainingEvent.isDisplayed();
	}
}
