package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassSN;

import pages.LoginPageSN;


public class UpdateIncidentSN extends BaseClassSN {

	@BeforeTest
	public void beforeTest()
	{
		fileName = "UpdateIncident";
	}
	
	
	@Test (dataProvider = "sendData")
	public void runCreateLead(String incNo, String urg, String state) {
		
		try
		{
					new LoginPageSN(driver)
					.enterUserName()
					.enterPassword()
					.clickLogin()
					.searchIncidents()
					.clickIncidents()
					.clickAll()
					.searchIncident(incNo)
					.clickIncident(incNo)
					.Update(urg, state)
					.clickUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
