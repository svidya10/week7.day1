package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class FindLeadPage extends BaseClass{
	public FindLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
		
	}
	
	public FindLeadPage findFirstLead(String fName) throws InterruptedException {
	driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys(fName);
	driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
	Thread.sleep(1000);
	return this;
	}

	public ViewLeadPage clickResultLead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	// Verify the title of page
	System.out.println(driver.getTitle());
	return new ViewLeadPage(this.driver);
	}
	
	//public ViewLeadPage clickCreateLead() {
		//driver.findElement(By.className("smallSubmit")).click();
		

}
