package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import pageobjects.LogInPageObjects;

public class LogInPage extends BasePage implements LogInPageObjects {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	public void isSignInPresent() {
		canYouSee(signIn);
	}

	public void isSkipSignInPresent() {
		canYouSee(skipSignIn);
	}

	public void isLogoPresent() {
		canYouSee(logo);
	}

	public void isEmailPresent() {
		canYouSee(emailID);
	}

	public void isEnterPresent() {
		canYouSee(enter);
	}
	
	public String verifyTitle() {
		return getPageTitle();
	}

	public RegisterPage logIn(String email) {
		type(email, emailID);
		clickOn(enter);
		return new RegisterPage(lBrowser);
	}

}