package com.facebook.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage {

	WebDriver driver;

	public void launchFacebookUrl() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void createNewAccount() {
		driver.findElement(By.xpath("//a[text()= 'Create New Account']")).click();
	}

	public void firstName(String fname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);

	}
	public void lastName(String lname) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);

	}
}
