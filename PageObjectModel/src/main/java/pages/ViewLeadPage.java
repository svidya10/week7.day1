package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	public ViewLeadPage (RemoteWebDriver driver) {
		this.driver = driver;
	}
	public ViewLeadPage verifyFirstName(String fName) {
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(firstName, fName);
		return this;
				
	}

	public EditLeadPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(this.driver);
		}
	
	public ViewLeadPage confimCompanyedit() {
		
		if (driver.findElement(By.id("viewLead_companyName_sp")).getText().contains("Selenium"))
			System.out.println("Changed company name appears");
		else
			System.out.println("Changed company name does not appear");
		return this;
		}
}
