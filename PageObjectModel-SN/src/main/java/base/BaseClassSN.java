package base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPageSN;
import utils.ExcelFamily;

public class BaseClassSN {
	public String fileName;
	
	public RemoteWebDriver driver;	
	
	@Parameters ({"url", "userName" , "password"})
  	@BeforeMethod()
	public void preCondition() throws InterruptedException {
		// Setup
		WebDriverManager.chromedriver().setup();
		// Step1: Load ServiceNow application URL
		driver = new ChromeDriver();
		driver.get("https://dev63010.service-now.com/");
		// Maximize
		driver.manage().window().maximize();
		
		driver.switchTo().frame("gsft_main");
	}

	@AfterMethod
	public void postCondition() {
		// Close browser
		driver.close();

  }

	@DataProvider(name = "sendData" )
	public String[][] sendData() throws IOException {
		System.out.println("@DataProvider Method");
		String[][] data = ExcelFamily.readExcel(fileName);
		return data;
	}
}


