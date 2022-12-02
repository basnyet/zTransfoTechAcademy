package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class AboutUSPage extends MainClass {
	
	public AboutUSPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='About Us'])[2]")
	WebElement aboutUS;
	
	public void click_AboutUS() {
		aboutUS.click();
	}
	
}
