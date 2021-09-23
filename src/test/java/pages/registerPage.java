package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {

	protected WebDriver driver;

	private By link_register = By.linkText("Register");
	private By btn_iAmACarrier = By.xpath("//div[contains(text(),'I am a carrier')]");
	private By dropdown_country = By.id("country");
	private By txt_country = By.id("country");
	private By txt_companyname = By.name("company");
	private By txt_firstname = By.name("firstName");
	private By txt_lastnyname = By.name("lastName");
	private By dropdown_countrycode = By.className("dZOEqV");
	private By txt_code = By.xpath("//input[@id='___prefix']");
	private By txt_phonenumber = By.name("undefined-number");
	private By txt_emailaddress = By.name("email");
	private By txt_password = By.name("password");
	private By checkbox_TC = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/div[4]/div[1]/span[1]/span[2]");
	private By btn_register = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[1]/span[1]");

	//Constructor of the class
	public registerPage(WebDriver driver) {

		this.driver = driver;

	}


	public void clickRegisterLink() {
		driver.findElement(link_register).click();

	}
	public void clickiAmACarrier() {
		driver.findElement(btn_iAmACarrier).click();

	}

	public void countryDropdown() {
		driver.findElement(dropdown_country).click();

	}

	public void enterCountryName(String countryname) {
		driver.findElement(txt_country).sendKeys(countryname);

	}


	public void enterCompanyName(String companyname) {
		driver.findElement(txt_companyname).sendKeys(companyname);

	}

	public void enterFirstName(String firstname) {

		driver.findElement(txt_firstname).sendKeys(firstname);

	}

	public void enterLastName(String Lastname) {

		driver.findElement(txt_lastnyname).sendKeys(Lastname);

	}

	public void countryCodeDropdown() {
		driver.findElement(dropdown_countrycode).click();

	}

	public void enterCountryCode(String code) {
		driver.findElement(txt_code).sendKeys(code);

	}

	public void enterPhoneNumber(String phonenumber) {

		driver.findElement(txt_phonenumber).sendKeys(phonenumber);

	}

	public void enterEmailAddress(String emailaddress) {

		driver.findElement(txt_emailaddress).sendKeys(emailaddress);

	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);

	}

	public void selectCheckBox() {
		driver.findElement(checkbox_TC).click();

	}

	public void clickRegisterButton() {
		driver.findElement(btn_register).click();

	}

}
