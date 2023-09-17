package Pages.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.SeleniumWebDriver;

public class BasePage {

	public static WebDriver driver;
	private WebElement mouseOvertoElement;
	public static BaseCarPage baseCarPage;

	public BasePage() {

		driver = SeleniumWebDriver.getDriver();
		baseCarPage = new BaseCarPage();
	}

	public void mouseover(String locator) {
		if (locator.endsWith("_XPATH")) {
			mouseOvertoElement = driver.findElement(By.xpath(SeleniumWebDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("CSS")) {
			mouseOvertoElement = driver.findElement(By.cssSelector(SeleniumWebDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("ID")) {
			mouseOvertoElement = driver.findElement(By.id(SeleniumWebDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("LINK")) {
			mouseOvertoElement = driver.findElement(By.linkText(SeleniumWebDriver.OR.getProperty(locator)));
		}

		new Actions(driver).moveToElement(mouseOvertoElement).perform();

	}

	public void click(String locator) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(SeleniumWebDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(SeleniumWebDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumWebDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_LINK")) {
			driver.findElement(By.linkText(SeleniumWebDriver.OR.getProperty(locator))).click();
		}

	}

	public void type(String locator, String value) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(SeleniumWebDriver.OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(SeleniumWebDriver.OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumWebDriver.OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_LINK")) {
			driver.findElement(By.linkText(SeleniumWebDriver.OR.getProperty(locator))).sendKeys(value);
		}

	}

	public boolean isElementPresent(String locator) {

		try {

			if (locator.endsWith("_XPATH")) {
				driver.findElement(By.xpath(SeleniumWebDriver.OR.getProperty(locator)));
			} else if (locator.endsWith("_CSS")) {
				driver.findElement(By.cssSelector(SeleniumWebDriver.OR.getProperty(locator)));
			} else if (locator.endsWith("_ID")) {
				driver.findElement(By.id(SeleniumWebDriver.OR.getProperty(locator)));
			} else if (locator.endsWith("_LINK")) {
				driver.findElement(By.linkText(SeleniumWebDriver.OR.getProperty(locator)));
			}
			return true;
		} catch (Throwable t) {

			return false;
		}
	}

	public static String getText(String locator) {
		if (locator.endsWith("_XPATH")) {
			locator = driver.findElement(By.xpath(SeleniumWebDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_CSS")) {
			locator = driver.findElement(By.cssSelector(SeleniumWebDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_ID")) {
			locator = driver.findElement(By.id(SeleniumWebDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_LINK")) {
			locator = driver.findElement(By.linkText(SeleniumWebDriver.OR.getProperty(locator))).getText();
		}
		return locator;

	}

}