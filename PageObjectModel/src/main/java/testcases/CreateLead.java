package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;

import pages.LoginPage;

public class CreateLead extends BaseClass {

	@BeforeTest
	public void beforeTest()
	{
		fileName = "CreateLead";
	}
	
	
	@Test (dataProvider = "sendData")
	public void runCreateLead(String cName, String fName, String lName, String country) {
		
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterCompanyName(cName)
		.clickCreateLead()
		.verifyFirstName(fName);		
		
	}
}
