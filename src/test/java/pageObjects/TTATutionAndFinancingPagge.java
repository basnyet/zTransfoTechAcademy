package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTATutionAndFinancingPagge extends MainClass {

	public TTATutionAndFinancingPagge() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Tuition & Financing'])[2]")
	WebElement tutionF;
	
	public void click_tutionF() {
		tutionF.click();
	}
}
