package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tasks.tasks_common;

public class common_steps
{
	tasks_common tasks_common = new tasks_common();
	
	@Given("Google url is open")
	public void browserSetUp()
	{
		tasks_common.browserSetUp();
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("Close driver and browser")
	public void tearDown()
	{
		tasks_common.tearDown();
	}
}
