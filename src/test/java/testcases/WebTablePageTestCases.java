package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;

public class WebTablePageTestCases extends Base {

	@BeforeTest
	public void navigateToRegisterPage() {
		registerPage = loginPage.logIn("vinothone2one@gmail.com");
		webtablePage = registerPage.gotToWebTablePage();
	}

	@Test(priority = 1)
	public void verifyPageComponents() {
		webtablePage.isTablePresent();
		webtablePage.isEmailColumnPresent();
		webtablePage.isFirstNameColumnPresent();
		webtablePage.isGenderColumnPresent();
		webtablePage.isLastNameColumnPresent();
		webtablePage.isPhoneColumnPresent();
		webtablePage.isActionColumnPresent();
		webtablePage.isEditOptionPresent();
		webtablePage.isDeleteOptionPresent();
	}

	@Test(priority = 2)
	public void verifyPageTitle() {
		String pageTitle = webtablePage.verifyTitle();
		System.out.println(pageTitle);
		Assert.assertTrue(pageTitle.equals("Web Table"));
	}

}