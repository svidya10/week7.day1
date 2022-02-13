package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassSN;

import pages.LoginPageSN;
import pages.IncidentsPageSN;

public class CreateIncidentSN extends BaseClassSN {

	@BeforeTest
	public void beforeTest()
	{
		fileName = "CreateIncident";
	}
	
	
	@Test (dataProvider = "sendData")
	public void runCreateIncident(String description) {
		
		try
		{
			String incNo = new LoginPageSN(driver)
			.enterUserName()
			.enterPassword()
			.clickLogin()
			.searchIncidents()
			.clickIncidents()
			.clickAll()
			.clickNew()
			.clickCaller()
			.selectCaller()
			.enterShortDescription(description)
			.clickSubmit();			
			System.out.println(incNo);
			
			new IncidentsPageSN (driver)
			.searchIncident(incNo)
			.verifyIncident(incNo);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
