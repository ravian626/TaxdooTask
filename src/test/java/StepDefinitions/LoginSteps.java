package StepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Globals;
import pages.loginPage;

public class LoginSteps {


	loginPage login;


	@Given("user is on login page")
	public void user_is_on_login_page() {

		Globals.driver.get("https://demo.saloodo.com/");
		login = new loginPage(Globals.driver);
		login.clickLoginLink();
		System.out.println("Inside Step - user is on login page.");

	}


	@When("^user puts valid (.*) and (.*)$")
	public void user_puts_valid_username_and_password(String username, String password) throws InterruptedException {

		System.out.println("Inside Step - user enters username and password.");
		login.enterUserName(username);
		login.enterPassword(password);		
		Thread.sleep(2000);

	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Inside Step - clicks on login button.");
		login.clickLogin();		

		//	========================================= Form Validation of the Login Page ====================================		

		//Email Address Field
		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'Email is not valid')]")).size()>0) {
			System.out.println("Email is not valid. Please enter email in valid format");			
		}

		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'Field is required')]")).size()>0) {
			System.out.println("Field is required. Please enter email in valid format");			
		}	
		
		//Password Field
		if(Globals.driver.findElements(By.xpath("//*[contains(text(),'The email address or password that you entered is not valid.')]")).size()>0) {
			System.out.println("Please enter correct username or password");			
		}

		if(Globals.driver.findElements(By.xpath("//*[contains(text(),'Field is required')]")).size()>0) {
			System.out.println("Please enter password");			
		}
	}

	@Then("user is navigated to the dashboard page")
	public void user_is_navigated_to_the_dashboard_page() throws InterruptedException {		

		Thread.sleep(2000);
		
		if(Globals.driver.getCurrentUrl().equals("https://demo-carrier.saloodo.com/requests")) {
			System.out.println("Inside Step - user is navigated to the dashboard page.");
		}

		if(!Globals.driver.getCurrentUrl().equals("https://demo-carrier.saloodo.com/requests")) {
			System.out.println("Login failed."+Globals.driver.getCurrentUrl());
		}	
		
		System.out.println("You are on the Dasboard now");

	}

}
