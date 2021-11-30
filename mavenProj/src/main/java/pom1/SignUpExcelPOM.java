package pom1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClass.SelectBox;

public class SignUpExcelPOM {
	// Declaration
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement fName;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement lName;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement num;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath = "//select[@title='Day']")
	private WebElement day;
	@FindBy(xpath = "//select[@title='Month']")
	private WebElement month;
	@FindBy(xpath = "//select[@title='Year']")
	private WebElement year;
	@FindBy(xpath = "(//label[@class='_58mt'])[1]")
	private WebElement gender;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement SignUp;

	// Initialization
	public SignUpExcelPOM(WebDriver w) {
		PageFactory.initElements(w, this);
	}

	SignUpExcel s = new SignUpExcel();

	public void Firstname() throws EncryptedDocumentException, IOException {
		fName.sendKeys(s.excel(0, 0));
	}

	public void Lastname() throws EncryptedDocumentException, IOException {
		lName.sendKeys(s.excel(0, 1));
	}

	public void Num() throws EncryptedDocumentException, IOException {
		num.sendKeys(s.excel(1, 0));
	}

	public void Password() throws EncryptedDocumentException, IOException {
		pass.sendKeys(s.excel(1, 1));
	}

	public void a() {
		SelectBox sb = new SelectBox();
		sb.selectBoxHandler(day, "3");
		sb.selectBoxHandler(month, "Jan");
		sb.selectBoxHandler(year, "1998");
	}

	public void clickButton() {
		gender.click();
	}

	public void clickSignUp() {
		SignUp.click();
	}

}
