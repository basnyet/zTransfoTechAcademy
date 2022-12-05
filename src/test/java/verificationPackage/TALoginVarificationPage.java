package verificationPackage;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.MainClass;

public class TALoginVarificationPage extends MainClass {

	public TALoginVarificationPage() {
		
		PageFactory.initElements(driver, this);
	}
	public void pageVarified() {
		String actualURL = "https://transfotechacademy.com/lp-profile/";
		String curentURL = driver.getCurrentUrl();
		Assert.assertEquals(curentURL, actualURL);
	}
	
}
