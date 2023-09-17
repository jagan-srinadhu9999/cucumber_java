package CarWaleSteps;

import org.testng.Assert;

import Pages.Objects.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.base.HomePage;
import page.base.NewCarsPage;
import page.base.ToyotaCarPage;
import utils.SeleniumWebDriver;

public class FindNewCarSteps {
	
HomePage homepage=new HomePage();
NewCarsPage newCars;
ToyotaCarPage toyoTaCarPage=new ToyotaCarPage();
@Given("user navigates to carwale.com")
public void user_navigates_to_carwale_com() {
 
	SeleniumWebDriver.openPage(SeleniumWebDriver.config.getProperty("testsiteurl"));
	
}

@When("user mouseover to Newcars")
public void user_mouseover_to_newcars() {
   
	homepage.mouseOverNewCars();
	
}

@Then("user clicks FindNewCars")
public void user_clicks_find_new_cars() {
  
	
	 newCars=	homepage.findNewCars();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Then("user clicks Toyota cars")
public void user_clicks_toyota_cars() {
   
	newCars.goToToyota();
	
}

@Then("user verifies as a car title as Toyota Cars")
public void user_verifies_as_a_car_title_as_toyota_cars() {
  String  expectedTitel="Toyot Cars";
String actualTitel=	BasePage.baseCarPage.getCarTitle();
System.out.println("expectedTitle is :"+expectedTitel);
Assert.assertEquals(BasePage.baseCarPage.getCarTitle(), actualTitel);

	
}

}
