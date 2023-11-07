package step_definitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		glue = {"step_definitions"}, 
		monochrome = true,
		plugin = {"pretty", "html:target/HtmlReports/HtmlResult.html", 
				"json:target/JsonReports/JsonResult.json",
				"junit:target/JunitReports/JunitResult.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			})
	
public class testRunner
{
		
}