package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Globals;

public class broswserHandler {

	String browser = null;

	@Given("the browser name")
	public void the_browser_name() {

		// You can chose browser of your choice
		browser = "Chrome";
//		browser = "Firefox"; 
//		browser = "IE";
	}

	@When("user sets the browser properties")
	public void user_sets_the_browser_properties() {
		System.out.println("Inside Step - browser is open");

		/*
		 * There is no need to download and put the webdrivers. I have used
		 * WebDriverManager it will automatically setup the webdriver of your choice and
		 * run the code.
		 */

		// if the selected browser is "Firefox" then the system will run this code
		if (browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Globals.driver = new FirefoxDriver();
		}

		// if the selected browser is "Chrome" then the system will run this code
		if (browser.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			Globals.driver = new ChromeDriver();
		}

		// if the selected browser is "IE" then the system will run this code
		if (browser.contains("IE")) {
			WebDriverManager.iedriver().setup();
			Globals.driver = new InternetExplorerDriver();
		}

	}

	@And("user maximize the browser")
	public void user_maximize_the_browser() {
		Globals.driver.manage().window().maximize();

	}

	@Then("browser is open")
	public void browser_is_open() {
		System.out.println("The browser is open");

	}

}
