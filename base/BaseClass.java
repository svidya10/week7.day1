package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utils.ExcelFamily;

public class BaseClass {
	public String fileName;
	
	public RemoteWebDriver driver;
	
	@Parameters ({"browser","url", "userName", "password"})
	@BeforeMethod()
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
		
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	
	@DataProvider(name = "sendData" , indices=1)
	public String[][] sendData() throws IOException {
		System.out.println("@DataProvider Method");
		String[][] data = ExcelFamily.readExcel(fileName);
		return data;
	}
}
