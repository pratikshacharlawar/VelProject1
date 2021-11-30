package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	// Declaration
	@FindBy(xpath = "//input[@id='email']")
	private WebElement user;
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pass;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginButton;

	// Initialization
	public Login(WebDriver w) {
		PageFactory.initElements(w, this);
	}

	// Usage
	public void setUser() {
		user.sendKeys("Test@gmail.com");
	}

	public void setPass() {
		pass.sendKeys("Pass@123");
	}

	public void clicklogin() {
		loginButton.click();
	}

//	public void verifyPage(WebDriver pp) {
//		String title = pp.getTitle();
//		System.out.println(title);
//
//		if (title.equals("Facebook- log in or sign up")) {
//			System.out.println("Login Unsuccessful");
//		} else if (title.equals("Log in to Facebook")) {
//			System.out.println("Login Unsuccessful");
//		} else {
//			System.out.println("Login Successful");
//		}
//	}

}
