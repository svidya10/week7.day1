package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyHomePage (RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public LeadPage clickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new LeadPage(this.driver);
	}
	
}
