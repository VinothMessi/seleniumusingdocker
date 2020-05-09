package pageobjects;

import org.openqa.selenium.By;

public interface WebTablePageObjects {

	By table = By.xpath("//div[@role='grid']");

	By emailColumn = By.xpath("//span[text()='Email']");

	By firstNameColumn = By.xpath("//span[text()='First Name']");

	By genderColumn = By.xpath("//span[text()='Gender']");

	By lastNameColumn = By.xpath("//span[text()='Last Name']");

	By phoneColumn = By.xpath("//span[text()='Phone']");

	By actionColumn = By.xpath("//span[text()='Action']");

	By editOption = By.xpath("(//i[@class='fa fa-pencil'])[1]");

	By deleteOption = By.xpath("(//i[@class='fa fa-trash-o '])[1]");

}