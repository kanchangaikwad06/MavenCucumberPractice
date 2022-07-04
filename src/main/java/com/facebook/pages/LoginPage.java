package com.facebook.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;
	
	public void launchUrl() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	public void userName() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test123@gmail.com");
	}
	
	public void passWord() {
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("456789");
	}
	
	public void loginButton() {
		driver.findElement(By.xpath("//*[@name='login']")).click();
	}
	
	public void verifyLogin() {
		System.out.println("Login sucessfully");
		
}
	public void createNewAccount() {
		driver.findElement(By.xpath("//a[text()= 'Create New Account']")).click();
	}
	public void signUp() {
		System.out.println("SignUp Successfully");
	}
	public void firstName(String fname) {
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys(fname);
		
	}
	public void lastName(String lname) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
		
	}
}