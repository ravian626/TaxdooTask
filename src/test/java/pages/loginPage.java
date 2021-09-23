package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	protected WebDriver driver;

	private By link_login = By.linkText("Login");
	private By txt_username = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]");
	private By txt_password = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/input[1]");
	private By btn_login = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/span[1]");
//	private By login_successfull = By.xpath("//span[contains(text(),'Marketplace')]");	


	//Constructor of the class
	public loginPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickLoginLink() {
		driver.findElement(link_login).click();
	}

	public void enterUserName(String username) {

		driver.findElement(txt_username).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(btn_login).click();

	}

//	public void loginSuccessfull() {
//
//		driver.findElement(login_successfull);		
//
//	}
}
