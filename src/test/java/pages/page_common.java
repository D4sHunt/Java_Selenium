package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import locators.locators_main;

public class page_common
{
	locators_main locators_main = new locators_main();
	protected static page_main page_main;
	private static WebDriver driver;
	
	private static void setDriverProperties()
	{
		String projectPath = System.getProperty("user.dir");
		System.getProperty("webdriver.geckodriver.driver", projectPath + "src/test/resources/browsers_dependencies/geckodriver.exe");
	}
	
	public void browserSetUp()
	{
		setDriverProperties();	
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		page_main = new page_main();
		page_main.setWebDriver(driver);
	}
	
	public void urlMainNavigation()
	{
		driver.navigate().to(locators_main.url);
	}
	
	public void tearDown()
	{
		driver.quit();
	}
}
