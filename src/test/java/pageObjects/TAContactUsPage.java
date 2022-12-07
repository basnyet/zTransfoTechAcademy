package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TAContactUsPage extends MainClass {

	public TAContactUsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"first_name\"]")
	WebElement firstName;

	@FindBy(xpath = "(//a[text()='Contact Us'])[2]")
	WebElement ContactUS;

	@FindBy(xpath = "((//div[@class=\"in-r-c\"])[1]/*)[2]")
	WebElement qAEngineering;

	@FindBy(id = "last_name")
	WebElement lastName;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(id = "phone")
	WebElement phoneNumber;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submit;

	public void click_Submit() {
			submit.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()",submit);
			
			driver.switchTo().defaultContent();
	
	}

	public void type_State() {

		state.sendKeys("Texas");

	}

	public void typePhoneNumber(String PhoneNumber) {
		phoneNumber.sendKeys(PhoneNumber);
	}

	public void type_Email(String EmailAddress) {
		email.sendKeys(EmailAddress);
	}

	public void type_LastName() {

		lastName.sendKeys("Tester");

	}

	public void click_qAEngineering() {
	
			qAEngineering.click();
	
	}
	public void click_ContactUS() {

		ContactUS.click();

	}

	public void type_FirstName() throws InterruptedException {

		driver.switchTo().frame(driver.findElement(By.id("xuTWKRgptnL4d4kHBm5l")));

		firstName.sendKeys("Automation");

	}
}
