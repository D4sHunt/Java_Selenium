package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.tasks_main;

public class main_page_steps
{
	tasks_main tasks_main = new tasks_main();
	
	@When("Click on Google Applications button")
	public void clickOnGoogleApplicationsButton()
	{
		tasks_main.clickOnGoogleApplicationsButton();
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("Validate Google Applications iframe is visible")
	public void validateGoogleApplicationsIFrameIsVisible()
	{
		tasks_main.validateGoogleApplicationsIFrameIsVisible();
		//throw new io.cucumber.java.PendingException();
	}
	
	@When("Click on Account button")
	public void clickAccountButton()
	{
		tasks_main.clickAccountButton();
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("Validate Google Account page is visible")
	public void validateGoogleAccountpageIsVisible() throws InterruptedException
	{
		tasks_main.validateGoogleAccountpageIsVisible();
		//throw new io.cucumber.java.PendingException();
	}
}
