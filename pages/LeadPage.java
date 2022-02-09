package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LeadPage extends BaseClass {

	public LeadPage (RemoteWebDriver driver) {
		this.driver = driver;
	}
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(this.driver);
	}
	
	public FindLeadPage clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(this.driver);
	}
}
