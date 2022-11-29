package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends MainClass {
	
	@Before
	public void openApp() {
		initilization();
	}
	
	@After
	public void closeApp() {
		tearDown();
	}

}
