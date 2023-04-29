package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.InmakesLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class InmakesLogin extends BaseClass{
	InmakesLoginPojo f;
	@Given("user has to launch the browser and maximise the window")
	public void user_has_to_launch_the_browser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();
	  
	}

	@When("user has hit the inmakes learning Url")
	public void user_has_hit_the_inmakes_learning_Url() {
		launchUrl("https://inmakeslh.in/login.php");
	   
	}

	@When("user has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String EMAIL) {
		f = new InmakesLoginPojo();
		passText(EMAIL, f.getEmail());
	}

	@When("user has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String PASSWORD) {
		f = new InmakesLoginPojo();
		passText(PASSWORD, f.getPassWord());
	   
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		clickButton(f.getLogin());
	  
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowser();
	}

}
