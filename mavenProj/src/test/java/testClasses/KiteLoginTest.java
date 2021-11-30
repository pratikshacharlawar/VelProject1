package testClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.Shortcuts;
import pom1.KiteLogin1Page;

public class KiteLoginTest {

	KiteLogin1Page login1;
	// KiteLogin2Page login2;
	// KiteHomePage home;
	Sheet ExcelMaven;
	WebDriver driver;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		Reporter.log("----open browser----", true);
		FileInputStream file = new FileInputStream(Shortcuts.excelPathZeroda);
		ExcelMaven = WorkbookFactory.create(file).getSheet("Sheet1");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", Shortcuts.driverpath);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(Shortcuts.kiteLogin);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		login1 = new KiteLogin1Page(driver);
	}

	@BeforeMethod
	public void beforemethod_refresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test
	public void LoginScenarion1_EnterOnly_Username() throws InterruptedException {
		Reporter.log("----open browser----", true);
		login1.inpKiteLogin1PageUsername(ExcelMaven.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		login1.clickKiteLogin1PageLoginBtn();

		String actErrorMsg = login1.getKiteLogin1PageErrorMsgPWD();
		String expErrorMsg = "Password should be minimum 6 characters.";
		Assert.assertEquals(actErrorMsg, expErrorMsg);
	}

	@Test
	public void LoginScenarion2_EnterOnly_Password() throws InterruptedException {
		Thread.sleep(2000);
		Reporter.log("----open browser----", true);
		login1.inpKiteLogin1PagePassword(ExcelMaven.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		login1.clickKiteLogin1PageLoginBtn();

		String actErrorMsg = login1.getKiteLogin1PageErrorMsgUN();
		String expErrorMsg = "User ID should be minimum 6 characters.";
		Assert.assertEquals(actErrorMsg, expErrorMsg);
	}

	@Test
	public void LoginScenarion3() throws InterruptedException {
		Thread.sleep(2000);
		Reporter.log("----open browser----", true);
		login1.clickKiteLogin1PageLoginBtn();

		String actErrorMsg = login1.getKiteLogin1PageErrorMsgUN();
		String expErrorMsg = "User ID should be minimum 6 characters.";
		Assert.assertEquals(actErrorMsg, expErrorMsg);

		String actErrorMsg1 = login1.getKiteLogin1PageErrorMsgPWD();
		String expErrorMsg1 = "Password should be minimum 6 characters.";
		Assert.assertEquals(actErrorMsg1, expErrorMsg1);

	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("----close browser----", true);
		// driver.close();
	}

}