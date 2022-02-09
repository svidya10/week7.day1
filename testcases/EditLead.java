package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class EditLead extends BaseClass {

	@BeforeTest
	public void beforeTest()
	{
		fileName = "EditLead";
	}
	
	@Test (dataProvider = "sendData")
	public void runCreateLead(String fName, String cName) {
		
		try
		{
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.findFirstLead(fName)
		.clickResultLead()
		.clickEdit()
		.changeCompany(cName)
		.clickUpdate()
		.confimCompanyedit();
		}
		catch(InterruptedException e) {
			
		}
	}
}
