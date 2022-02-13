package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClassSN;

public class SelectCallerPageSN extends BaseClassSN {
	public SelectCallerPageSN (RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateIncidentPageSN selectCaller() throws InterruptedException
	{
		//Switch to child frame
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//table[@id='sys_user_table']//tr[1]/td[3]/a")).click();
		// Switch to parent frame
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(0));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		return new CreateIncidentPageSN(driver);
	}
	
}

