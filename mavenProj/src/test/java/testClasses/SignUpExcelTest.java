package testClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom1.SignUpExcelPOM;
import screenshot.ScreenShots;
import utilityClass.Browser;

public class SignUpExcelTest {
	WebDriver w;

	@BeforeClass
	public void a() throws InterruptedException {
		Browser b = new Browser();
		w = b.initDriver();
		Thread.sleep(1000);
	}

	@Test
	public void b() throws InterruptedException, EncryptedDocumentException, IOException {
		SignUpExcelPOM s = new SignUpExcelPOM(w);
		Thread.sleep(1000);

		s.Firstname();
		Thread.sleep(1000);
		s.Lastname();
		Thread.sleep(1000);
		s.Num();
		Thread.sleep(1000);
		s.Password();
		Thread.sleep(1000);
		s.a();
		Thread.sleep(1000);
		s.clickButton();
		Thread.sleep(1000);
		s.clickSignUp();
		Thread.sleep(1000);
	}

	@AfterClass
	public void c() throws IOException {
		ScreenShots a = new ScreenShots();
		a.Screenshot1(w);
	}

}
