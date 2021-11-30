package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void Screenshot1(WebDriver driver) throws IOException {
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		String date = d.toString().replace(":", "_");

		File destFile = new File("C:\\Users\\HP\\Desktop\\Automation\\screenshot" + date + "ss" + ".png");

		FileHandler.copy(SourceFile, destFile);
	}

}
