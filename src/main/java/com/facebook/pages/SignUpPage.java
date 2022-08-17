package com.facebook.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	 public WebDriver driver;
	 
	 public SignUpPage(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
		 
}
	@FindBy(xpath = "//*[text()='Create New Account']" )
	@CacheLookup
	WebElement btnCreateNewAccount;

	@FindBy(xpath = "//input[@name ='firstname']" )
	@CacheLookup
	WebElement textFirstName;
	

	@FindBy(xpath = "//input[@name ='lastname']")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@name ='reg_email__']")
	@CacheLookup
	WebElement txtMobNum;
	
	@FindBy(xpath = "//*[@id ='password_step_input']")
	@CacheLookup
	WebElement txtNewPassword;
	
	
	public void createNewAccount() {

		//driver.findElement(By.xpath("//a[text() ='Create New Account']")).click();
		btnCreateNewAccount.click();
}
	public void firstName(String fname) {
		textFirstName.sendKeys(fname);
		
	}

	public void lastName(String lname) {
		txtLastName.sendKeys(lname);
		
	}
	public void mobNum(String mobNum) {
		txtMobNum.sendKeys(mobNum);
	}
	
	public void newPassword(String newPass) {
		txtNewPassword.sendKeys(newPass);
		
}
}
	




