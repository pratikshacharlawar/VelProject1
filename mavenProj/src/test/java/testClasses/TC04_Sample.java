package testClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screenshot.ScreenShots;
import utilityClass.Browser;


public class TC04_Sample {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		Browser b = new Browser();
		driver = b.initDriver();
	}

	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
	}

	@Test
	public void test() {
		Reporter.log("Test Case", true);
	}

	@AfterMethod
	public void logout(ITestResult res) throws IOException, InterruptedException {

		if (ITestResult.FAILURE == res.getStatus()) {
			ScreenShots.Screenshot1(driver);
		}
		System.out.println("Screenshot Captured");
		Thread.sleep(1000);
		Reporter.log("LogOut", true);
	}

	@AfterClass
	public void quit() {
		driver.quit();
	}

}
