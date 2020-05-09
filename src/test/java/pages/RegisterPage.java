package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import pageobjects.RegisterPageObjects;

public class RegisterPage extends BasePage implements RegisterPageObjects {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	public void isFirstNamePresent() {
		canYouSee(firstName);
	}

	public void isLastNamePresent() {
		canYouSee(lastName);
	}

	public void isEmailIDPresent() {
		canYouSee(email);
	}

	public void isPhoneNumberPresent() {
		canYouSee(phoneNumber);
	}

	public void isCountriesPresent() {
		canYouSee(countries);
	}

	public WebTablePage gotToWebTablePage() {
		clickOn(webTable);
		return new WebTablePage(lBrowser);
	}

	public String verifyTitle() {
		return getPageTitle();
	}

	public WebTablePage userRegistration(String first, String last, String emailID, String phone, String gender,
			String country, String year, String month, String day) {
		type(first, firstName);
		type(last, lastName);
		type(emailID, email);
		type(phone, phoneNumber);
		if (gender.equalsIgnoreCase("male")) {
			check(male);
		} else {
			check(female);
		}
		selectTheText(country, countries);
		selectTheText(year, yearBox);
		selectTheText(month, monthBox);
		selectTheText(day, dayBox);
		clickOn(submit);
		return new WebTablePage(lBrowser);
	}

}