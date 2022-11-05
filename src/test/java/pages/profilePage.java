package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class profilePage {

	protected WebDriver driver;
	
	
	private By txtfld_companyname = By.name("company");
	private By rdbtn_companytype = By.xpath("//body/div[@id='booking_form']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By drpdwn_salutaion = By.xpath("//body/div[@id='booking_form']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/select[1]");
	private By txtfld_firstname = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]");
	private By txtfld_lastname = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/input[1]");
	private By btn_manualAddress = By.xpath("//span[contains(text(),'Enter address manually')]");
	private By txtfld_street = By.name("street");
	private By txtfld_houseNumber = By.name("streetNo");
	private By txtfld_city = By.name("city");
	private By txtfld_zip = By.name("zip");
	private By txtfld_fedralState = By.name("area");
	private By txtfld_country = By.xpath("//body/div[@id='booking_form']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[4]/select[1]");
	private By txtfld_vatID = By.name("vatNo");
	private By txtfld_emailaddress = By.name("email");
	private By txtfld_phonenumber = By.name("tel");
	private By btn_profilenext = By.xpath("//span[contains(text(),'Next')]");


	//Constructor of the class
	public profilePage(WebDriver driver) {

		this.driver = driver;

	}

	public void enterCompanyName(String companyname) {
		driver.findElement(txtfld_companyname).sendKeys(companyname);

	}

	public void selectCompanyType() {
		driver.findElement(rdbtn_companytype).click();

	}

	public void selectSalutation() {
		Select salutation = new Select(driver.findElement(drpdwn_salutaion));
		salutation.selectByVisibleText("Mr");
	}
	
	public void clickFirstNameField(String firstname) {
		driver.findElement(txtfld_firstname).sendKeys(firstname);

	}
	
	public void clickLastNameField(String lastname) {
		driver.findElement(txtfld_lastname).sendKeys(lastname);

	}
	
//	public void enterAddress(String address) {
//		driver.findElement(txtfld_address).sendKeys(address);
//		driver.findElement(extra_click).click();
//
//	}

	public void enterManualAddress() {
		driver.findElement(btn_manualAddress).click();

	}
	
	public void enterStreet(String street) {
		driver.findElement(txtfld_street).sendKeys(street);

	}
	
	public void enterHouseNumber(String houseNumber) {
		driver.findElement(txtfld_houseNumber).sendKeys(houseNumber);

	}
	
	public void enterCity(String city) {
		driver.findElement(txtfld_city).sendKeys(city);

	}
	
	public void enterZIP(String zip) {
		driver.findElement(txtfld_zip).sendKeys(zip);

	}
	
	public void enterFedralState(String state) {
		driver.findElement(txtfld_fedralState).sendKeys(state);

	}
	
	public void enterCountry(String country) {
		driver.findElement(txtfld_country).sendKeys(country);

	}
	
	public void enterVATID(String VATID) {
		driver.findElement(txtfld_vatID).sendKeys(VATID);

	}
	
	public void enterEmail(String emailaddress) {
		driver.findElement(txtfld_emailaddress).sendKeys(emailaddress);

	}
	
	public void enterPhoneNumber(String phonenumber) {
		driver.findElement(txtfld_phonenumber).sendKeys(phonenumber);

	}
	
	public void clickBtnNext() {
		driver.findElement(btn_profilenext).click();

	}
}
