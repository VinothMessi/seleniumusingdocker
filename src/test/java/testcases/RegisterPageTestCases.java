package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;

public class RegisterPageTestCases extends Base {

	@BeforeTest
	public void navigateToRegisterPage() {
		registerPage = loginPage.logIn("vinothone2one@gmail.com");
	}

	@Test(priority = 1)
	public void verifyPageComponents() {
		registerPage.isFirstNamePresent();
		registerPage.isLastNamePresent();
		registerPage.isEmailIDPresent();
		registerPage.isPhoneNumberPresent();
		registerPage.isCountriesPresent();
	}

	@Test(priority = 2)
	public void verifyPageTitle() {
		String pageTitle = registerPage.verifyTitle();
		System.out.println(pageTitle);
		Assert.assertTrue(pageTitle.equals("Register"));
	}

	@Test(priority = 3)
	public void userRegistration() {
		webtablePage = registerPage.userRegistration("user1", "last1", "test@gmail.com", "9884462764", "male", "India",
				"1987", "January", "15");
	}

}