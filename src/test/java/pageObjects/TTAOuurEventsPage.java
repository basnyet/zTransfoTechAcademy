package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTAOuurEventsPage extends MainClass {

	public TTAOuurEventsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Our Events'])[2]")
	WebElement ourEvent;
	
	public void click_Events() {
		ourEvent.click();
	}
			
}
