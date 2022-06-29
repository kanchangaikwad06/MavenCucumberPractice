package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;
	
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();			
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
}