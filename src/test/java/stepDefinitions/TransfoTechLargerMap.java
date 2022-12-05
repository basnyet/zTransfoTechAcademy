package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.MapPage;

public class TransfoTechLargerMap extends MainClass {

	MapPage map;

	@Given("user is in Home Page")
	public void user_is_in_home_page() {
		appURL();
	}

	@When("user scroll down to the buttom of the page")
	public void user_scroll_down_to_the_buttom_of_the_page() throws InterruptedException {
//		Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();

	}

	@Then("user click view larger Map on top of the map")
	public void user_click_view_larger_map_on_top_of_the_map() throws InterruptedException {
//		Thread.sleep(3000);
		map = new MapPage();
		map.click_ViewLarger();

	}

	@Then("user can see displayed large map")
	public void user_can_see_displayed_large_map() {

	}

}
