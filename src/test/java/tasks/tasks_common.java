package tasks;

import pages.page_common;

public class tasks_common
{
	page_common page_common = new page_common();
	
	public void browserSetUp()
	{
		page_common.browserSetUp();
		page_common.urlMainNavigation();
	}
	
	public void tearDown()
	{
		page_common.tearDown();
	}
}
