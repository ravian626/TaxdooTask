package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Globals;
import pages.profilePage;

public class ProfileSteps {


	profilePage profile;


	@Given("user is on the profile page")
	public void user_is_on_the_profile_page() throws InterruptedException {

		profile = new profilePage(Globals.driver);
		Thread.sleep(2000);
		System.out.println("Inside Step - user is on the profile page.");

	}
	
	
	@And("user enters the (.*)$")
	public void user_enters_the_company_name(String companyname) {
		profile.enterCompanyName(companyname);

	}
	
	@And("user selects the company type")
	public void user_selects_the_company_type() {
		profile.selectCompanyType();

	}
	
	@And("user selects the salutation")
	public void user_selects_the_salutation() {
		profile.selectSalutation();

	}
	
	@And("user entered (.*)$")
	public void user_entered_the_first_name(String firstname) {
		profile.clickFirstNameField(firstname);

	}
	
	@And("provided (.*)$")
	public void user_provided_the_last_name(String lastname) {
		profile.clickLastNameField(lastname);

	}

	
//	@And("user inputs the (.*)$")
//	public void user_inputs_the_address(String address) {
//		profile.enterAddress(address);
//
//	}
	
	@And("user clicks on the EnterAddressManually button")
	public void user_clicks_on_the_EnterAddressManually_button() {
		profile.enterManualAddress();

	}
	
	@And("enter your (.*)$")
	public void please_enters_the_street(String street) {
		profile.enterStreet(street);

	}
	
	@And("provide the (.*)$")
	public void what_is_your_house_Number(String houseNumber) {
		profile.enterHouseNumber(houseNumber);

	}
	
	@And("added the (.*)$")
	public void which_city_do_you_belong(String city) {
		profile.enterCity(city);

	}
	
	@And("input your (.*)$")
	public void user_enters_the_zip(String zip) {
		profile.enterZIP(zip);

	}
	
	@And("user gives the (.*)$")
	public void user_enters_the_Fedral_State(String state) {
		profile.enterFedralState(state);

	}
	
	@And("country (.*)$")
	public void country_of_residence(String country) {
		profile.enterCountry(country);

	}
	
	@And("your (.*)$")
	public void user_gives_the_VATID(String VATID) {
		profile.enterVATID(VATID);

	}
		
	@And("user email address (.*)$")
	public void user_provides_the_email_address(String emailaddress) {
		profile.enterEmail(emailaddress);

	}
	
	@And("user tells the (.*)$")
	public void user_puts_the_phone_number(String phonenumber) {
		profile.enterPhoneNumber(phonenumber);

	}
	
	@When("user clicks the next button")
	public void user_clicks_the_next_button() throws InterruptedException {
		Thread.sleep(3000);
		profile.clickBtnNext();

	}	

	@Then("user is navigated to the summary page")
	public void user_is_navigated_to_the_summary_page() {
		System.out.println("You are on the Symmary page");

	}
}
