package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class summaryPage {
	
	protected WebDriver driver;


	private By rdbtn_howToFind = By.xpath("//input[@id='Google search']");
	private By rdbtn_termAndConditions = By.xpath("//input[@id='accept']");
	private By btn_completeBooking = By.xpath("//span[contains(text(),'Complete booking')]");
	

	//Constructor of the class
	public summaryPage(WebDriver driver) {

		this.driver = driver;

	}

	public void selectHowToFidn() {
		driver.findElement(rdbtn_howToFind).click();
	}


	public void selectTermAndConditions() {
		driver.findElement(rdbtn_termAndConditions).click();

	}

	public void clickCompleteBookingButton() {
		driver.findElement(btn_completeBooking).click();

	}
}
