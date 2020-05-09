package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver lBrowser;
	protected WebDriverWait lWait;
	protected JavascriptExecutor lJS;
	protected Actions lActions;

	public BasePage(WebDriver driver) {
		this.lBrowser = driver;
		this.lWait = new WebDriverWait(lBrowser, 30);
		this.lJS = (JavascriptExecutor) lBrowser;
		this.lActions = new Actions(lBrowser);
	}

	public void maximize() {
		lBrowser.manage().window().maximize();
	}

	public String getPageTitle() {
		return lBrowser.getTitle();
	}

	public void open(String url) {
		lBrowser.get(url);
	}

	public WebElement find(By locator) {
		return lBrowser.findElement(locator);
	}

	public List<WebElement> findAll(By locator) {
		return lBrowser.findElements(locator);
	}

	public boolean isElementPresent(By locator) {
		if (findAll(locator).size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOn(By locator) {
		find(locator).click();
	}

	public void type(String text, By locator) {
		find(locator).sendKeys(text);
		;
	}

	public boolean canYouSee(By locator) {
		if (find(locator).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean canYouClickOn(By locator) {
		if (find(locator).isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public void check(By locator) {
		if (find(locator).isSelected() == false) {
			clickOn(locator);
		}
	}

	public void unCheck(By locator) {
		if (find(locator).isSelected() == true) {
			clickOn(locator);
		}
	}

	public void selectTheText(String text, By locator) {
		Select dropDown = new Select(find(locator));
		dropDown.selectByVisibleText(text);
	}

}