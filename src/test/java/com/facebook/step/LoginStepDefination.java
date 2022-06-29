package com.facebook.step;

import com.facebook.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefination extends LoginPage {
	
	LoginStepDefination lp = new LoginStepDefination();

	@Given("^Launch Chrome Browser and open Facebook Url$")
	public void launch_Chrome_Browser_and_open_Facebook_Url() throws Throwable {
		lp.openUrl();
	    	}

	@When("^User enter Username$")
	public void user_enter_Username() throws Throwable {
		lp.userName();
		
	    	}

	@When("^User enter Password$")
	public void user_enter_Password() throws Throwable {
	    lp.passWord();
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		lp.loginButton();
	    
	}

	@Then("^User should be able to Login successfully$")
	public void user_should_be_able_to_Login_successfully() throws Throwable {
		lp.verifyLogin();
	    
	}

}
