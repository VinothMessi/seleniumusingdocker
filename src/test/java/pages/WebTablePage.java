package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import pageobjects.WebTablePageObjects;

public class WebTablePage extends BasePage implements WebTablePageObjects {

	public WebTablePage(WebDriver driver) {
		super(driver);
	}

	public void isTablePresent() {
		canYouSee(table);
	}

	public void isEmailColumnPresent() {
		canYouSee(emailColumn);
	}

	public void isFirstNameColumnPresent() {
		canYouSee(firstNameColumn);
	}

	public void isGenderColumnPresent() {
		canYouSee(genderColumn);
	}

	public void isLastNameColumnPresent() {
		canYouSee(lastNameColumn);
	}

	public void isPhoneColumnPresent() {
		canYouSee(phoneColumn);
	}

	public void isActionColumnPresent() {
		canYouSee(actionColumn);
	}

	public void isEditOptionPresent() {
		canYouSee(editOption);
	}

	public void isDeleteOptionPresent() {
		canYouSee(deleteOption);
	}

	public String verifyTitle() {
		return getPageTitle();
	}

}