package pageobjects;

import org.openqa.selenium.By;

public interface RegisterPageObjects {
	
	By webTable = By.xpath("//a[text()='WebTable']");

	By firstName = By.xpath("//input[@placeholder='First Name']");

	By lastName = By.xpath("//input[@placeholder='Last Name']");

	By email = By.xpath("//input[@type='email']");

	By phoneNumber = By.xpath("//input[@type='tel']");

	By male = By.xpath("//input[@value='Male']");

	By female = By.xpath("//input[@value='FeMale']");

	By countries = By.id("countries");

	By yearBox = By.id("yearbox");

	By monthBox = By.xpath("//select[@placeholder='Month']");

	By dayBox = By.id("daybox");

	By submit = By.id("submitbtn");

	By refresh = By.id("Button1");

}