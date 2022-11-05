package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Globals;
import pages.summaryPage;

public class SummarySteps {
	
	summaryPage summary;	


	@Given("user is on the summary page")
	public void user_is_on_the_summary_page() throws InterruptedException {

		summary = new summaryPage(Globals.driver);
		Thread.sleep(2000);
		System.out.println("Inside Step - user is on the summary page.");

	}

	@And("user selects How did you come across Taxdoo")
	public void user_selects_How_did_you_come_accross_Taxdoo() throws InterruptedException {
		Thread.sleep(2000);
		summary.selectHowToFidn();
	}
	
	@And("user accepts Term and Conditions")
	public void user_accepts_Terms_and_Conditions() {
		summary.selectTermAndConditions();
	}
		
	@When("user hits the Complet Booking button")
	public void user_hits_the_Complete_Booking_button() {
		summary.clickCompleteBookingButton();
	}
	
	@Then("successfully completed booking")
	public void successfully_completed_booking() {
		System.out.println("Booking completed successfully");
		Globals.driver.close();
		Globals.driver.quit();
	}
}
