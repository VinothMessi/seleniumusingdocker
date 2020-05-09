package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.RegisterPage;
import pages.WebTablePage;
import pages.LogInPage;

public class Base {

	protected RemoteWebDriver browser;
	
	protected ThreadLocal<RemoteWebDriver> webDriver = new ThreadLocal<RemoteWebDriver>();

	protected LogInPage loginPage;
	protected RegisterPage registerPage;
	protected WebTablePage webtablePage;

	@BeforeTest
	public void before_test_tag() throws MalformedURLException {

		String browserName = System.getProperty("BROWSER");

		DesiredCapabilities dc;

		String host = "http://" + System.getProperty("HUB_HOST") + ":4444/wd/hub";

		System.out.println(host);

		if (browserName.equalsIgnoreCase("Firefox")) {
			dc = DesiredCapabilities.firefox();
			browser = new RemoteWebDriver(new URL(host), dc);
		} else {
			dc = DesiredCapabilities.chrome();
			browser = new RemoteWebDriver(new URL(host), dc);
		}
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Automation_Testing_2020\\myProjects\\seleniumusingdocker\\resources\\drivers\\chromedriver.exe");
		browser = new ChromeDriver();*/
		
		webDriver.set(browser);

		webDriver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		loginPage = new LogInPage(webDriver.get());
		loginPage.maximize();
		loginPage.open("http://demo.automationtesting.in/");
	}

	@AfterTest
	public void after_test_tag() {
		webDriver.get().quit();
	}

}