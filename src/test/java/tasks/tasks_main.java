package tasks;

import pages.page_main;

public class tasks_main
{
	page_main page_main = new page_main();
	
	public void clickOnGoogleApplicationsButton()
	{
		page_main.clickOnGoogleApplicationsButton();
	}
	
	public void validateGoogleApplicationsIFrameIsVisible()
	{
		page_main.validateGoogleApplicationsIFrameIsVisible();
	}
	
	public void clickAccountButton()
	{
		page_main.clickAccountButton();
	}
	
	public void validateGoogleAccountpageIsVisible() throws InterruptedException
	{
		page_main.validateGoogleAccountpageIsVisible();
	}
}
