package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass{
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
		
	}
	
	public EditLeadPage changeCompany(String cName) {
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
	return this;
	}
	
	public ViewLeadPage clickUpdate() {
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewLeadPage(this.driver);
	}

}
