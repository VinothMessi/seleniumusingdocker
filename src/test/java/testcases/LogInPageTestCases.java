package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class LogInPageTestCases extends Base {

	@Test(priority = 1)
	public void verifyPageComponents() {
		loginPage.isSignInPresent();
		loginPage.isSkipSignInPresent();
		loginPage.isLogoPresent();
		loginPage.isEmailPresent();
		loginPage.isEnterPresent();
	}

	@Test(priority = 2)
	public void verifyPageTitle() {
		String pageTitle = loginPage.verifyTitle();
		System.out.println(pageTitle);
		Assert.assertTrue(pageTitle.equals("Index"));
	}

}