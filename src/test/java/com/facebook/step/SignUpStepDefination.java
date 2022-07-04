package com.facebook.step;

import com.facebook.pages.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignUpStepDefination extends SignUpPage {

	SignUpPage signUp = new SignUpPage();
	
	@Given("^Launch Chrome and open Facebook Url$")
	public void launch_Chrome_and_open_Facebook_Url() throws Throwable {
		signUp.launchFacebookUrl();
		
	    	}

	@When("^User Click on Create New Account$")
	public void user_click_on_create_new_account() {
		signUp.createNewAccount();
	}
	@When("^User enter First Name(.*)$")
	public void user_enter_first_name(String firstName) {
		signUp.firstName(firstName);
	}
	@When("^User enter Last Name(.*)$")
	public void user_enter_last_name(String lastName) {
		signUp.lastName(lastName);
	}
	
	}
	

