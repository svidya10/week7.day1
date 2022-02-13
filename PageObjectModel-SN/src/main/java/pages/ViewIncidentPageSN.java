package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import base.BaseClassSN;


public class ViewIncidentPageSN extends BaseClassSN {
	public ViewIncidentPageSN (RemoteWebDriver driver) {
		this.driver = driver;
	}

	public ViewIncidentPageSN Update(String urg, String state) throws InterruptedException {
	
		// Update Incident Urgency and State
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByVisibleText(urg);
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByVisibleText(state);
		return this;
	}
	public IncidentsPageSN clickUpdate() { 
		// Click Update Button
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
       return new IncidentsPageSN(this.driver);
       	}
}
