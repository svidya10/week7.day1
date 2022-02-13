package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.RemoteWebDriver;


import base.BaseClassSN;

public class LoginPageSN extends BaseClassSN {
	
	public LoginPageSN (RemoteWebDriver driver) {
		this.driver = driver;	
	}
	
	public LoginPageSN enterUserName() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		return this;
	}
	public LoginPageSN enterPassword() {
		driver.findElement(By.id("user_password")).sendKeys("cqo0jWDX4gXK");
		return this;
	}
	public HomePageSN clickLogin() {
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		return new HomePageSN (this.driver);
	}
	
}
