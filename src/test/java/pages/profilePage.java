package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class profilePage {

	protected WebDriver driver;

	private By btn_profile = By.name("profile");
	private By link_profile = By.xpath("//body/div[@id='__next']/div[1]/div[4]/div[1]/span[1]");
	private By fld_firstname = By.id("firstName");
	private By txt_lastname = By.id("lastName");
	private By btn_update = By.xpath("//body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/button[2]/span[1]");
	private By btn_logout = By.xpath("//div[contains(text(),'Log out')]");




	//Constructor of the class
	public profilePage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickProfileButtton() {
		driver.findElement(btn_profile).click();

	}

	public void clickProfileLink() {
		driver.findElement(link_profile).click();

	}

	public void clickFirstNameField() {
		driver.findElement(fld_firstname).click();

	}

	public void editLastName(String profilelastname) {
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(txt_lastname).sendKeys(profilelastname);

	}


	public void clickUpdateButtton() {
		driver.findElement(btn_update).click();

	}

	public void clickLogoutButtton() {
		driver.findElement(btn_logout).click();

	}

}
