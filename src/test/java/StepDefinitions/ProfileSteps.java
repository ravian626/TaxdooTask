package StepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Globals;
import pages.profilePage;

public class ProfileSteps {


	profilePage profile;


	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {

		profile = new profilePage(Globals.driver);
		Thread.sleep(2000);
		System.out.println("Inside Step - user is on the login page.");

	}

	@And("user clicks on the profile button")
	public void user_clicks_on_the_profile_button() throws InterruptedException {
		Thread.sleep(2000);
		profile.clickProfileButtton();

	}

	@And("user clicks on the profile option")
	public void user_clicks_on_the_profile_option() {
		profile.clickProfileLink();

	}

	@And("user clicks on the first name field")
	public void user_clicks_on_the_first_name_field() throws InterruptedException {
		Thread.sleep(2000);
		profile.clickFirstNameField();

	}

	@And("^user puts the (.*)$")
	public void user_puts_the_lastname(String profilelastname) throws InterruptedException {
		Thread.sleep(2000);
		profile.editLastName(profilelastname);

	}


	@And("user clicks on the update button")
	public void user_clicks_on_the_update_button() throws InterruptedException {
		Thread.sleep(2000);
		profile.clickUpdateButtton();
		
		
		//	========================================= Form Validation of the Registration Page ====================================

		//First Name Field
		if(Globals.driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/em[1]")).size()>0) {
			System.out.println("First Name field is required. Please enter the First Name");			
		}


		//Last Name Field
		if(Globals.driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[2]/em[1]")).size()>0) {
			System.out.println("Last Name field is required. Please enter the Last Name");			
		}


		//Phone Number Field		
		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'A phone number is required')]")).size()>0) {
			System.out.println("Phone Number field is required. Please enter the Phone Number");			
		}	

		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'Phone number is not valid')]")).size()>0) {
			System.out.println("Phone Number is not valid. Please enter a valid Phone Number");			
		}


	}

	@And("again clicks on the profile button")
	public void again_clicks_on_the_profile_button() {
		profile.clickProfileButtton();

	}

	@When("user clicks on the logout button")
	public void user_clicks_on_the_logout_button() {
		profile.clickLogoutButtton();

	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
		System.out.println("You are on the login page");
				Globals.driver.close();
				Globals.driver.quit();

	}


}
