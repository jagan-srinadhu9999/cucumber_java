package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebDriver {

	private static SeleniumWebDriver seleniumWebDriver;	
	private static WebDriver driver;
	private static WebDriverWait webdriverWait;
	public static Properties config=new Properties();
	public static Properties OR=new Properties();
	private FileInputStream fis;
	
	private SeleniumWebDriver() 
	{
		try {
			fis=new FileInputStream("src/main/resources/Properties/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fis=new FileInputStream("src/main/resources/Properties/OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(config.getProperty("browser").equals("chrome"))
		{
			driver=new ChromeDriver();
		}else if(config.getProperty("browser").equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webdriverWait=new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
	}
	
	public static void setupDriver()
	{
		if(seleniumWebDriver==null)
		{
			seleniumWebDriver=new SeleniumWebDriver();
		}
	}
	public static WebDriver getDriver()
	{
		return driver;
		
	}
	public static void openPage(String url)
	{
		driver.get(url);
	}
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		seleniumWebDriver=null;
	}
}
