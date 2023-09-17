package CarWaleSteps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.SeleniumWebDriver;

public class Hooks {
  public WebDriver driver;
  
  @Before
	public void setUp()
	{
		SeleniumWebDriver.setupDriver();
	}
  
  @After
  public void tearDown(Scenario scenario)
  {
	  if(scenario.isFailed())
	  {
	driver=	SeleniumWebDriver.getDriver();
 byte[] scrrenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	  
 scenario.attach(scrrenshot,"image/png","failedtestcaseiamge");
	  }
	  
	  SeleniumWebDriver.tearDown();
  }
	
}
