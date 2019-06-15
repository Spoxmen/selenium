package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(name = "userName")
	WebElement userNameInput;
	
	@FindBy(name = "password")
	WebElement passwordInput;
	
	@FindBy(name = "login")
	WebElement loginInput;

	public LoginPage() {
		System.out.println("wewnątrz konstruktora lp");
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void loginAs(String login, String password) {
		userNameInput.sendKeys(login);
		passwordInput.sendKeys(password);
		loginInput.click();
		
	}
}
