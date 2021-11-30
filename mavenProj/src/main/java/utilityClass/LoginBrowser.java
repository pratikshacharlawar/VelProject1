package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Shortcuts;

public class LoginBrowser {
	public WebDriver initDriver() {

		System.setProperty("webdriver.chrome.driver", Shortcuts.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Shortcuts.fblogin);

		return driver;

	}


}
