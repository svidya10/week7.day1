package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClassSN;

public class IncidentsPageSN extends BaseClassSN {
	public IncidentsPageSN (RemoteWebDriver driver) {
		this.driver = driver;
	}

	public IncidentsPageSN clickAll() throws InterruptedException {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[@id='incident_breadcrumb']/a[1]")).click();
		Thread.sleep(3000);
		return this;	
	}
	
	public CreateIncidentPageSN clickNew () {
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		return new CreateIncidentPageSN (this.driver);
	}

	public IncidentsPageSN searchIncident (String incNo) {
		driver.findElement(By.xpath(
				"//span[text()='Press Enter from within the input to submit the search.']/following-sibling::input"))
				.sendKeys(incNo);
		driver.findElement(By.xpath(
				"//span[text()='Press Enter from within the input to submit the search.']/following-sibling::input"))
				.sendKeys(Keys.ENTER);
		return this;
		}
	
	public IncidentsPageSN verifyIncident (String incNo) {
	String searchIncidentNo = driver.findElement(By.xpath("//table[@id='incident_table']//tr[1]/td[3]")).getText();
	System.out.println(searchIncidentNo);
	if (incNo.equals(searchIncidentNo) == true) {
		System.out.println("incident number present");
	} else {
		System.out.println("incident number not present");
	}
	return this;
	} 
	
	public ViewIncidentPageSN clickIncident(String incNo) {
	driver.findElement(By.xpath("//a[text()= '"+ incNo +"']")).click();
	return new ViewIncidentPageSN (this.driver);
}


}

