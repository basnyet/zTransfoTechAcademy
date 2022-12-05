package verificationPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class BlogPageVerify extends MainClass {
	
	public BlogPageVerify() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h2[text()='Latest posts']")
	WebElement latestPost;
	
	public boolean veryfy_Page() {
		return latestPost.isDisplayed();
	}

}
