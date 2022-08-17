package com.facebook.step;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.facebook.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignUpStepDefination {

	public WebDriver driver;
	 SignUpPage sp = new SignUpPage(driver);
	  
	 @Given("Launch Chrome Browser")
	 public void launch_chrome_browser() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

	 @When("User enter Url {string}")
	 public void user_enter_url(String url) {
		driver.get(url);
		 
}
	
	@When("User Click on Create New Account")
	public void user_click_on_create_new_account() {
	  sp.createNewAccount();
	}

	@When("User enter first name as {string}")
	public void user_enter_first_name_as(String fname) {
	    sp.firstName(fname);
	}

	@When("User enter last name as {string}")
	public void user_enter_last_name_as_gaikwad(String lname) {
	  sp.lastName(lname);
	}

	@When("User enter Mobile Number as {string}")
	public void user_enter_mobile_number_as(String mobNum) {
	    sp.mobNum(mobNum);
	}

	@When("User enter new password as {string}")
	public void user_enter_new_password_as(String newPass) {
	    sp.newPassword(newPass);
	}


	
}
