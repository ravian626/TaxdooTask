package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Globals;
import pages.pricePage;

public class PriceSteps {


	pricePage price;	


	@Given("open the Taxdoo page")
	public void open_the_saloodo_page() throws InterruptedException {
		Globals.driver.get("https://booking.test.env.taxdoo.com/");
		System.out.println("Inside Step - user is on the Taxdoo page.");
		Thread.sleep(3000);
	}

	@And("user clicks the Price option")
	public void user_clicks_the_price_link() throws InterruptedException {

		//Globals.driver.manage().deleteAllCookies();
		price = new pricePage(Globals.driver);
		Thread.sleep(3000);
		price.selectPrice();
	}

	@And("user choose package")
	public void user_choose_package() {
		price.choosePackage();
	}
	
	@And("ser selects addOn")
	public void user_selects_addOn() {
		price.selectAddOn();
	}
	
	@When("user hits the Next button")
	public void user_hits_the_Next_button() {
	price.clickNextButton();
	}
	
	@Then("Proceed to next step")
	public void proceed_to_next_step() {
		System.out.println("First Step completed successfully");

	}
}
