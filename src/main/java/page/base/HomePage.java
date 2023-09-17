package page.base;

import Pages.Objects.BasePage;

public class HomePage extends BasePage {

	public void mouseOverNewCars()
	{
		mouseover("newCarMenu_XPATH");
	}
	public NewCarsPage findNewCars()
	{
		click("findNewCars_XPATH");
		
		return new NewCarsPage();
	}
	public void serchNewCars()
	{
		
	}
	public void goToLocation()
	{
		
	}
	
	public void mouseOverUsedCars()
	{
		
	}
	public void mouseOverReviews()
	{
		
	}
}
