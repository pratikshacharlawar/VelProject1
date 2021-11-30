package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Login;

public class TC02_Login {
	WebDriver w;

	@BeforeClass
	public void Browser() {
		utilityClass.LoginBrowser b = new utilityClass.LoginBrowser();
		w = b.initDriver();
	}

	@BeforeMethod
	public void LogIn() {
		Reporter.log("Login Successfully to FB Page", true);
	}

	@Test
	public void Login1() throws InterruptedException {
		Login log = new Login(w);
		log.setUser();
		Thread.sleep(1000);
		log.setPass();
		Thread.sleep(1000);
		log.clicklogin();
		// log.verifyPage(w);

		Reporter.log("login", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("LogOut Successfully to FB Page", true);
	}

	@AfterClass
	public void close() {
		w.quit();
	}
}
