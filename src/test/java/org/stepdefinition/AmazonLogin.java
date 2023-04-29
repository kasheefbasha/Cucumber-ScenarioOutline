package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.interactions.ClickAction;
import org.pojo.AmazonLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogin extends BaseClass {
	
	AmazonLoginPojo a;
	
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the Amazon application")
	public void to_launch_the_url_of_the_Amazon_application() {
	  launchUrl("https://www.amazon.com/log/s?k=log+in");
	}

	@When("To click the Account and list in Amazon application")
	public void to_click_the_Account_and_list_in_Amazon_application() {
		a = new AmazonLoginPojo(); 
	   clickButton(a.getAccList());
	}

	@When("To enter the valid email or phone number in email field")
	public void to_enter_the_valid_email_or_phone_number_in_email_field() {
		a = new AmazonLoginPojo();
		passText("kalilurrahman1306@gmail.com", a.getEmail());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		a = new AmazonLoginPojo();
		clickButton(a.getContineButton());
	  
	}

	@When("To enter the valid password in password field")
	public void to_enter_the_valid_password_in_password_field() {
		a = new AmazonLoginPojo();
		passText("Zaynab@2713", a.getPasssword());
	    
	}

	@When("To click the sign in button")
	public void to_click_the_sign_in_button() {
		a = new AmazonLoginPojo();
		clickButton(a.getSignIn());
		
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	  closeEntireBrowser();
	}




}
