package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.RemoteWebDriver;


import base.BaseClassSN;

public class CreateIncidentPageSN extends BaseClassSN{
	public CreateIncidentPageSN(RemoteWebDriver driver) {
		this.driver = driver;	
	}
	
	public SelectCallerPageSN clickCaller() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).click();
		Thread.sleep(3000);
		return new SelectCallerPageSN (this.driver);
	}
	public CreateIncidentPageSN enterShortDescription (String description) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys(description);
		return this;
	}
	public String clickSubmit () {
		String incidentNo = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(incidentNo);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		return incidentNo;
		
	}
	
}
