package verificationPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTAserviceVerificationPage extends MainClass {

	public TTAserviceVerificationPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Job Placement']")
	WebElement jobPlacementPage;
	
	@FindBy(xpath = "//h2[text()='IT Traning']")
	WebElement itTraining;
	
	public boolean itPageVerified() {
		return itTraining.isDisplayed();
	}
	
	public boolean jobPage() {
		return jobPlacementPage.isDisplayed();
	}
}
