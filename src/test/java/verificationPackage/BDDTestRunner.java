package verificationPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"Features"}, 
	                  
	glue  = {"stepDefinitions"},
	plugin = {"pretty","html:target/Cucumber_Report.html"}, 
	dryRun = false,
	monochrome = true

	)



public class BDDTestRunner {
	
	
	

}
