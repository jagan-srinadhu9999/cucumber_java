package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="src/test/resources/Features/FindNewCars2.feature",
	glue="CarWaleSteps",
	tags="@Smoke",
	plugin= {"pretty","html:target/cucumber_htmlreports/index.html",
			"json:target/cucumber_jsonreports/index.json",
			"junit:target/cucumber_xml/index.xml",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	monochrome=true

		)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
