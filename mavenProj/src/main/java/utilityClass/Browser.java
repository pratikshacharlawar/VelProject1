package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Shortcuts;

public class Browser {
	public WebDriver initDriver() {

		System.setProperty("webdriver.chrome.driver", Shortcuts.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Shortcuts.fbSignup);

		return driver;

	}

}
