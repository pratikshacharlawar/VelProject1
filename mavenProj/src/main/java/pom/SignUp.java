package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClass.SelectBox;

public class SignUp {
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
		public SignUp(WebDriver w) {
		    	PageFactory.initElements(w, this);
		    }

		// Usage
		public void enterFName() {
			fName.sendKeys("Pratiksha");
		}

		public void enterLName() {
			lName.sendKeys("Charlawar");
		}

		public void num() {
			num.sendKeys("0323110000");
		}

		public void pass() {
			pass.sendKeys("Pratiksha12345");
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
