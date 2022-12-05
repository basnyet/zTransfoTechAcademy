package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TTASuuccessSPage extends MainClass {
	
	public TTASuuccessSPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='About Us'])[2]")
	WebElement aboutUS;
	
	@FindBy(xpath = "(//a[text()='Success Stories'])[2]")
	WebElement SuccessS;
	
	@FindBy(xpath = "(//div[@class=\"elementor-image-box-wrapper\"])[1]/*")
	WebElement firstImage;
	
	public void click_FirstImage() throws InterruptedException {
	
		firstImage.click();
		

	}
	
	public void click_SuccessS() {
		SuccessS.click();
	}
	
	public void move_AboutUs() {
		Actions action = new Actions(driver);
		action.moveToElement(aboutUS).build().perform();
	}

}
