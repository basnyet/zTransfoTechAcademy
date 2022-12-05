package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class TransfoTechBlogsPage extends MainClass {
	
	public TransfoTechBlogsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Blogs'])[2]")
	WebElement blog;
	
	@FindBy(xpath = "(//a[text()='Read more '])[1]")
	WebElement readMore;
	
	@FindBy(id = "comment")
	WebElement commentBox;
	
	@FindBy(id = "author")
	WebElement yourName;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "url")
	WebElement website;
	
	@FindBy(xpath = "//input[@id=\"wp-comment-cookies-consent\"]")
	WebElement cheeckBox;
	
	@FindBy(xpath = "//input[@name=\"submit\"]")
	WebElement post_Comment;
	
	public void click_PostComment() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",post_Comment);
//		post_Comment.click();
		}catch(Exception e) {
			System.out.println("***Post comment not click****");
		}
	}
	public void click_checkBox() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",cheeckBox);
//		cheeckBox.click();
		}catch(Exception e) {
			System.out.println("****Check Box not click*****");
		}
	}
	
	public void type_URL() {
		website.sendKeys("www.transfoacademy.com");
	}
	
	public void type_Email() {
		email.sendKeys("automation_tester4@gmail.com");
	}
	
	public void type_Name() {
		yourName.sendKeys("Automation Tester4");
	}
	
	public void type_Comment() {
		commentBox.sendKeys("Hello, I would like to know about your courceses");
	}
	
	public void click_ReadMore() {
		try {
		readMore.click();
		}catch(Exception e) {
			System.out.println("This topic is update or deleted");
		}
	}
	public void click_Blog() {
		blog.click();
	}

}
