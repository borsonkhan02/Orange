package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(listener.EliteListener.class)
public class TestBase extends Saucelabs {

	@BeforeSuite
	public void setUp() {

		if (Boolean.valueOf(getProperty("saucelab"))) {

			// run on saucelabs;
			setSauceLabs();
		}
		setDriver();

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
