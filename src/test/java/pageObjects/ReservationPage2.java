package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium.Init;

public class ReservationPage2 {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr"
			+ "/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input")
	WebElement depBlue360;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr"
			+ "/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement depPang362;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr"
			+ "/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input")
	WebElement retBlue630;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr"
			+ "/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")
	WebElement retPang632;
	
	@FindBy(name = "reserveFlights")
	WebElement reserveButton;
	
	@FindBy(name = "passFirst0")
	WebElement passFirst0;
	
	@FindBy(name = "passLast0")
	WebElement passLast0;
	
	@FindBy(name="pass.0.meal")
	WebElement passMeal;
	
	@FindBy(name="creditCard")
	WebElement creditCard;
	
	@FindBy(name="creditnumber")
	WebElement creditNumber;
	
	@FindBy(name="buyFlights")
	WebElement buYFlightsButton;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody"
			+ "/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")
	WebElement logoutButton;
	
	public ReservationPage2() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void depBlue360Clicker() {
		depBlue360.click();
	}
	
	public void depPang362Clicker() {
		depPang362.click();
	}
	
	public void retBlue630Clicker() {
		retBlue630.click();
	}
	
	public void retPang632Clicker() {
		retPang632.click();
	}
	
	public void bothClicker() {
		depPang362.click();
		retPang632.click();
	}
	
	public void resButtClicker() {
		reserveButton.click();
	}
	
	public void passNameFiller(String passName) {
		passFirst0.sendKeys(passName);
	}
	
	public void passLastnameFiller(String passLastname) {
		passLast0.sendKeys(passLastname);
	}
	
	public void passMealChooser(String passMealNumber) {
		Select passMealChooser =  new Select(passMeal);
		passMealChooser.selectByValue(passMealNumber);
	}
	
	public void creditCardChooser(String creditCardDeliverer) {
		Select creditCardChooser = new Select(creditCard);
		creditCardChooser.selectByValue(creditCardDeliverer);
	}
	
	public void creditNumberFiller(String creditCardNumber) {
		creditNumber.sendKeys(creditCardNumber);
	}
	
	public void buyFlightClicker() {
		buYFlightsButton.click();
	}
	
	public void logoutButtonClicker() {
		logoutButton.click();
	}
	
	public void allFiller(String passName, String passLastname, String passMealNumber, String creditCardDeliverer, 
			String creditCardNumber) {
		passFirst0.sendKeys(passName);
		passLast0.sendKeys(passLastname);
		
		Select passMealChooser =  new Select(passMeal);
		passMealChooser.selectByValue(passMealNumber);
		
		Select creditCardChooser = new Select(creditCard);
		creditCardChooser.selectByValue(creditCardDeliverer);
		
		creditNumber.sendKeys(creditCardNumber);
	}
	
}
