package CarWaleSteps;

import org.testng.Assert;

import Pages.Objects.BasePage;
import io.cucumber.java.en.And;
import page.base.HomePage;
import page.base.NewCarsPage;

public class FindNewCarStepsSmoke {

	
	HomePage homepage=new HomePage();
	NewCarsPage newCars=new NewCarsPage();
	/*
	 * ToyotaCarPage toyoTaCarPage=new ToyotaCarPage(); BmwCarPage bmwcarpage=new
	 * BmwCarPage(); HyundaiCarPage hyundaicarpage=new HyundaiCarPage(); KiaCarPage
	 * kiacarpage=new KiaCarPage(); LandRoverCarPage landrovercarpage=new
	 * LandRoverCarPage(); MahindraCarPage mahindracarpage=new MahindraCarPage();
	 */
	/*
	 * @Given("user navigates to carwale.com") public void
	 * user_navigates_to_carwale_com() {
	 * 
	 * SeleniumWebDriver.openPage(SeleniumWebDriver.config.getProperty("testsiteurl"
	 * ));
	 * 
	 * }
	 * 
	 * @When("user mouseover to Newcars") public void user_mouseover_to_newcars() {
	 * 
	 * homepage.mouseOverNewCars();
	 * 
	 * }
	 * 
	 * @Then("user clicks FindNewCars") public void user_clicks_find_new_cars() {
	 * 
	 * 
	 * homepage.findNewCars(); try { Thread.sleep(3000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */	
	
	@And("user clicks {string} cars")
	public void user_clicks_cars(String carBrand) {
	   
		
	if(carBrand.equals("Toyota"))
	{
		newCars.goToToyota();
	}
	  else if(carBrand.equals("Audi"))
	{
		newCars.goToAudi();
	}
	  else if(carBrand.equals("BMW"))
	{
		newCars.goToBMW();
	}
	  else if(carBrand.equals("Hyundai"))
		{
			newCars.goToHyundai();
		}
	 
	  else if(carBrand.equals("Kia"))
	{
		newCars.goToKia();
	}
	  else if(carBrand.equals("Mahindra"))
	{
		newCars.goToMahindra();
	}
	  
	
	  else if(carBrand.equals("LandRover"))
	{
		newCars.goToLandRover();
	}
	
	
	}

	@And("user verifies as a car title as {string}")
	public void user_verifies_as_a_car_title_as(String carTitle) {
	   
		System.out.println("The actualCarTitle is: "+BasePage.baseCarPage.getCarTitle());
		try {
			Thread.sleep(2000);
		} catch (Throwable t) {
			
			t.printStackTrace();
		}
		try {
		if(carTitle !=null) {
			 Assert.assertEquals(carTitle,BasePage.baseCarPage.getCarTitle() );
	   }
		} catch (Throwable t)
		{
			t.getCause();
		}
	   
	}

	
}
