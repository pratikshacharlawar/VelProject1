package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.SignUp;

public class TC03_SignUp {
	WebDriver w;

	@BeforeClass
	public void Browser() {
		utilityClass.Browser b = new utilityClass.Browser();
		w = b.initDriver();
	}

	@BeforeMethod
	public void Login() {
		Reporter.log("Login Successfully to FB Page", true);
	}

	@Test
	public void SignUp1() throws InterruptedException {
		SignUp s = new SignUp(w);

		Thread.sleep(1000);
		s.enterFName();
		Thread.sleep(1000);
		s.enterLName();
		Thread.sleep(1000);
		s.num();
		Thread.sleep(1000);
		s.pass();
		Thread.sleep(1000);
		s.a();
		Thread.sleep(1000);
		s.clickButton();
		Thread.sleep(1000);
		s.clickSignUp();

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
