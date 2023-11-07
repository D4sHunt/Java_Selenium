package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.locators_main;
import locators.locators_account;

public class page_main
{
	locators_main locators_main = new locators_main();
	locators_account locators_account = new locators_account();
	
	protected static WebDriver driver;
	
	public void setWebDriver(WebDriver driver)
	{
		page_main.driver = driver;
	}
	
	public void clickOnGoogleApplicationsButton() 
	{
		driver.findElement(By.xpath(locators_main.googleAppsButtonXpath)).isDisplayed();
		driver.findElement(By.xpath(locators_main.googleAppsButtonXpath)).click();
	}
	
	public void validateGoogleApplicationsIFrameIsVisible()
	{
		driver.findElement(By.xpath(locators_main.googleAppsIFrameXpath)).isDisplayed();
	}
	
	public void clickAccountButton()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(locators_main.googleAppsIFrameXpath)));
		driver.findElement(By.xpath(locators_main.googleAccountButtonXpath)).click();
	}
	
	public void validateGoogleAccountpageIsVisible() throws InterruptedException
	{
		
		driver.findElement(By.xpath(locators_account.googleAccountTitleXpath)).isDisplayed();
		Assert.assertEquals("Google Cuenta", driver.getTitle());
		
	}
}