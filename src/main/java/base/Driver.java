package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ReadProperties;

public class Driver extends ReadProperties {

	public static WebDriver driver;

	public void setDriver() {

		if (getProperty("browser").equalsIgnoreCase("firefox")) {

			initFirefox();
		} else if (getProperty("browser").equalsIgnoreCase("chrome")) {

			initChromedriver();
		}
		setDriverProperties();
	}

	private void initFirefox() {

		driver = new FirefoxDriver();
	}

	private void initChromedriver() {

		driver = new ChromeDriver();
	}

	private void setDriverProperties() {

		driver.manage().window().maximize();
		driver.get(getProperty("appUrl"));
	}

}
