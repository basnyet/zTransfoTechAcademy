package pageObjects;

import org.openqa.selenium.By;
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
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "phone")
	WebElement phoneNumber;
	
	@FindBy(id = "state")
	WebElement state;
	
	@FindBy(id = "Business Analyst_DV6VNzE2nVchvRncPic8_1_584x3ac9abn")
	WebElement busenessAnalyst;
	
	@FindBy(id = "Master Ethical Hacking_DV6VNzE2nVchvRncPic8_2_584x3ac9abn")
	WebElement masterEH;
	
	@FindBy(id = "Salesforce Admin and Development_DV6VNzE2nVchvRncPic8_3_584x3ac9abn")
	WebElement salesForceAD;
	
	@FindBy(id = "BJOvZQK6Tz4YgfzXTZZe")
	WebElement massageBox;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submit;
	
	public void click_Submit() {
		try {
		submit.click();
		driver.switchTo().defaultContent();
		}catch(Exception e) {
			System.out.println("submit button not visible");
		}
		}
	public void type_MassageBox() {
		try {
		massageBox.sendKeys("hello, I am intrested for QA Automation");
		}catch(Exception e) {
			System.out.println("Massage Box is not visible");
		}
	}
	public void click_salesForce() {
		try {
		salesForceAD.click();
		}catch(Exception e) {
			System.out.println("Salesforce Admin and Department not visible ");
		}
		}
	public void click_MasterEH() {
		try {
		masterEH.click();
		}catch(Exception e) {
			System.out.println("Master Ethical Hacking not visible");
		}
	}
	public void click_busenessAnlst() {
	try {	
		busenessAnalyst.click();
	}catch(Exception e) {
		System.out.println("Buseness Analyst not visible");
	}
		}
	public void type_State() {
		
		state.sendKeys("Texas");

	}
	public void typePhoneNumber() {
		
	}
	
	public void type_Email() {
		
	}
	public void type_LastName() {
		
		lastName.sendKeys("Tester");

	}
	public void click_qAEngineering() {
		try {
		qAEngineering.click();
		}catch(Exception e) {
			System.out.println("****QA Engineering is not clicking");
		}
	}

	public void click_ContactUS() {
		ContactUS.click();
	}

	public void type_FirstName() throws InterruptedException {

		driver.switchTo().frame(driver.findElement(By.id("xuTWKRgptnL4d4kHBm5l")));
		
		firstName.sendKeys("Automation");
		
		
		
		
		

	}
}
