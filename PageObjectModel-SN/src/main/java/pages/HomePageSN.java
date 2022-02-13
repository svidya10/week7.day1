package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import base.BaseClassSN;

public class HomePageSN extends BaseClassSN {
	public HomePageSN (RemoteWebDriver driver) {
		this.driver = driver;		
	}
	
	public HomePageSN searchIncidents () throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incidents");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		return this;
	}
	
	public IncidentsPageSN clickIncidents () throws InterruptedException {
	driver.findElement(By.xpath("//div[@class = 'sn-widget-list-title'][text() = 'Incidents']")).click();
	Thread.sleep(1000);
	return new IncidentsPageSN (this.driver);
	}
	
}
