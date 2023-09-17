package page.base;

import Pages.Objects.BasePage;

public class NewCarsPage extends BasePage{

	public ToyotaCarPage goToToyota()
	{
		click("toyotaCar_XPATH");
		return new ToyotaCarPage();
	}
	
	public BmwCarPage goToBMW()
	{
		click("bmwCar_XPATH");
		
		return new BmwCarPage();
	}
	public KiaCarPage goToKia()
	{
		click("kiaCar_XPATH");
		return new KiaCarPage();
	}
	public AudiCarPage goToAudi()
	{
		click("auidiCar_XPATH");
	return	new AudiCarPage();
	}
	public MahindraCarPage goToMahindra()
	{
		click("mahindraCar_XPATH");
		return new MahindraCarPage();
		
	}
	public HyundaiCarPage goToHyundai()
	{
		click("hyundaiCar_XPATH");
		return new HyundaiCarPage();
	}
	public LandRoverCarPage goToLandRover()
	{
		click("landRoverCar_Xpath");
		return new LandRoverCarPage();
	}
}
