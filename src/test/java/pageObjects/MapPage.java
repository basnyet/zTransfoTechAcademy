package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.MainClass;

public class MapPage extends MainClass {

	public MapPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='View larger map']")
	WebElement viewLargeMap;

	public void click_ViewLarger() {
		try {
//		viewLargeMap.click();
			driver.switchTo().frame(driver.findElement(By.id("iFrameResizer1")));
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click()",viewLargeMap);
			viewLargeMap.click();

			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("****Click it by manuel****");
		}
	}
}
