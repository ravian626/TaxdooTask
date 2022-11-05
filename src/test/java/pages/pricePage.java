package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pricePage {

	protected WebDriver driver;


	private By select_price = By.xpath("//body/div[@id='booking_form']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/label[1]");
	private By choose_package = By.xpath("//div[contains(text(),'FREE')]");
	private By select_addOn = By.xpath("//body/div[@id='booking_form']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/label[1]/span[1]");
	private By btn_next = By.xpath("//span[contains(text(),'Next')]");
	

	//Constructor of the class
	public pricePage(WebDriver driver) {

		this.driver = driver;

	}

	public void selectPrice() {
		driver.findElement(select_price).click();

	}
	public void choosePackage() {
		driver.findElement(choose_package).click();

	}

	public void selectAddOn() {
		driver.findElement(select_addOn).click();

	}

	public void clickNextButton() {
		driver.findElement(btn_next).click();

	}

}
