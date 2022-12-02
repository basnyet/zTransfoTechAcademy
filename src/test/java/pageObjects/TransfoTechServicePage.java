package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TransfoTechServicePage extends MainClass {

	public TransfoTechServicePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Service'])[2]")
	WebElement service;
	
	@FindBy(xpath = "(//a[text()='Job Placement'])[2]")
	WebElement jobPlacement;
	
	@FindBy(xpath = "(//a[text()='IT Training'])[2]")
	WebElement itTraining;
	
	public void itTraining() {
		itTraining.click();
	}
	
	
	public void service() {
		service.click();
	}
	public void jobPlacement() {
		jobPlacement.click();
	}
}
