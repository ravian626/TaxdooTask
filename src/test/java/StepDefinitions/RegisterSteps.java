package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Globals;
import pages.registerPage;

public class RegisterSteps {


	registerPage register;	


	@Given("open the saloodo page")
	public void open_the_saloodo_page() {
		Globals.driver.get("https://demo.saloodo.com/");
		System.out.println("Inside Step - user is on the saloodo page.");
	}

	@And("user clicks the Register link")
	public void user_clicks_the_register_link() throws InterruptedException {

		register = new registerPage(Globals.driver);
		Thread.sleep(3000);
		register.clickRegisterLink();
	}

	@And("user clicks on I am a carrier option")
	public void user_clicks_on_i_am_a_carrier_option() {
		register.clickiAmACarrier();
	}

	@And("^user selects (.*)$")
	public void user_selects_country(String countryname) {
		register.countryDropdown();
		register.enterCountryName(countryname);
		Globals.driver.findElement(By.id("country")).sendKeys(Keys.DOWN); 		
		Globals.driver.findElement(By.id("country")).sendKeys(Keys.ENTER);

	}


	@And("^user enter (.*)$")
	public void user_enter_companyname(String companyname) {
		register.enterCompanyName(companyname);

	}

	@And("^user inputs (.*) and (.*)$")
	public void user_inputs_firstname_and_lastname(String firstname, String Lastname) {
		register.enterFirstName(firstname);
		register.enterLastName(Lastname);

	}

	@And("^user gives the (.*)$")
	public void user_gives_the_countrycode(String code) {
		register.countryCodeDropdown();
		register.enterCountryCode(code);

	}

	@And("^user enters (.*)$")
	public void user_enters_phonenumber(String phonenumber) {
		register.enterPhoneNumber(phonenumber);

	}


	@And("^user provides the (.*)$")
	public void user_provides_the_emailaddress(String emailaddress) {
		register.enterEmailAddress(emailaddress);

	}

	@And("^enters (.*)$")
	public void enters_password(String password) {
		register.enterPassword(password);

	}

	@And("user checks the Term & Conditions checkbox")
	public void user_checks_the_term_conditions_checkbox() {
		register.selectCheckBox();		

	}

	@When("user hits the Register button")
	public void user_hits_the_register_button() {
		register.clickRegisterButton();

		//	========================================= Form Validation of the Registration Page ====================================

		//Company Name Field

		if(Globals.driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/em[1]")).size()>0) {
			System.out.println("Company field is required. Please enter the Company Name");			
		}

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


		//Email Address Field		
		if(Globals.driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/div[1]/div[5]/em[1]")).size()>0) {
			System.out.println("Email field is required. Please enter email address");			
		}

		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'Email is not valid')]")).size()>0) {
			System.out.println("Email is not valid. Please enter email in valid format");			
		}
		
		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'Email is already in use')]")).size()>0) {
			System.out.println("Email is already in use. Please enter different email address and try again to register");			
		}


		//Password Field		
		if(Globals.driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/em[1]")).size()>0) {
			System.out.println("Password field is required. Please enter the Password");			
		}

		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'Password is too short')]")).size()>0) {
			System.out.println("The Password is too short. The password must contain at least 8 characters");			
		}

		if(Globals.driver.findElements(By.xpath("//em[contains(text(),'Password is not secure enough')]")).size()>0) {
			System.out.println("Password is not secure enough. Use combination of Numbers, Special characters and lower and upper case letters");			
		}


		//Terms & Conditions and Privacy Notice Check box 		
		if(Globals.driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/div[4]/em[1]")).size()>0) {
			System.out.println("Terms & Condition Check box selection is required. Please mark the Terms & Conditions and Privacy Notice check box");			
		}		

	}


	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
		System.out.println("You have registered successfully");

	}
}
