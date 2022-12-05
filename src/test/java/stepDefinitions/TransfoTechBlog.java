package stepDefinitions;

import basePackage.MainClass;
import io.cucumber.java.en.*;
import pageObjects.TransfoTechBlogsPage;
import verificationPackage.BlogPageVerify;

public class TransfoTechBlog extends MainClass {

	TransfoTechBlogsPage blog;
	BlogPageVerify verify;
	
	@When("user click on the blog button")
	public void user_click_on_the_blog_button() {
		blog = new TransfoTechBlogsPage();
		blog.click_Blog();
	}

	@When("user can see open he new page")
	public void user_can_see_open_he_new_page() {
		verify = new BlogPageVerify();
		verify.veryfy_Page();
	}

	@Then("user click one of the Readmore button")
	public void user_click_one_of_the_readmore_button() {
		blog.click_ReadMore();
	}

	@Then("user type some comment in the box")
	public void user_type_some_comment_in_the_box() {
		blog.type_Comment();
	}

	@Then("user type name in the your name box")
	public void user_type_name_in_the_your_name_box() {
		blog.type_Name();
	}

	@Then("user type email in the email box")
	public void user_type_email_in_the_email_box() {
		blog.type_Email();
	}

	@Then("user give the website name in the website box")
	public void user_give_the_website_name_in_the_website_box() {
		blog.type_URL();
	}

	@Then("user check in checkbox")
	public void user_check_in_checkbox() throws InterruptedException {
		Thread.sleep(3000);
		blog.click_checkBox();
	}

	@Then("user click post comment to post the comment")
	public void user_click_post_comment_to_post_the_comment() throws InterruptedException {
		Thread.sleep(3000);
		blog.click_PostComment();
	}

}
