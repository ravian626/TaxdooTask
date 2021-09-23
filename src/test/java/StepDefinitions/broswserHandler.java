package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Globals;

public class broswserHandler {

	String browser = null;

	@Given("the browser name")
	public void the_browser_name() {

		
		//You can chose browser of your choice
		browser = "Chrome";
//		browser = "Firefox"; 
	}

	@When("user sets the browser properties")
	public void user_sets_the_browser_properties() {
		System.out.println("Inside Step - browser is open");

		//Instead of giving the absolute path i am going to use relative path to avoid the errors if directory changed.
		String projectLocation = System.getProperty("user.dir");
		System.out.println("Project Location is:"+projectLocation);

		// if the selected browser is "Firefox" then the system will run this code
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"/src/test/resources/Drivers/geckodriver.exe");
			Globals.driver = new FirefoxDriver();	
		}
		// if the selected browser is "Chrome" then the system will run this code
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation+"/src/test/resources/Drivers/chromedriver.exe");
			Globals.driver = new ChromeDriver();	
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
