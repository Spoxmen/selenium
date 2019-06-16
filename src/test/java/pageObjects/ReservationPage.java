package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium.Init;

public class ReservationPage {

	WebDriver driver;
	
	//String oneWayXpath =  ;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayClick;
	
	//String roundTripXpath =  ;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr"
			+ "/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement roundTripClick;
	
	@FindBy(name = "passCount")
	WebElement passCountClick;

	
	@FindBy(name = "fromPort")
	WebElement fromPortClick;

	
	@FindBy(name = "fromMonth")
	WebElement fromMonthClick;
	
	@FindBy(name = "fromDay")
	WebElement fromDayClick;
	
	@FindBy(name = "toPort")
	WebElement toPortClick;
	
	@FindBy(name = "toMonth")
	WebElement toMonthClick;
	
	@FindBy(name = "toDay")
	WebElement toDayClick;
	
	@FindBy(name = "airline")
	WebElement airlineClick;
	
	@FindBy(name = "findFlights")
	WebElement continueButton;
	
	
	
	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public  void oneWayClicker() {
		oneWayClick.click();
	}
	
	public void roundTripClicker() {
		roundTripClick.click();
	}
	
	public void passCountClicker(String passNumber) {
		Select passSelect = new Select(passCountClick);
		passSelect.selectByValue(passNumber);
	}
	
	public void fromPortClicker(String fromPortNumber) {
		Select fromPortSelect = new Select(fromPortClick);
		fromPortSelect.selectByValue(fromPortNumber);
	}
	
	public void fromMonthClicker(String fromMonthNumber) {
		Select fromMonthSelect = new Select(fromMonthClick);
		fromMonthSelect.selectByValue(fromMonthNumber);
	}
	
	public void fromDayClicker(String fromDayNumber) {
		Select fromDaySelect = new Select(fromDayClick);
		fromDaySelect.selectByValue(fromDayNumber);
	}

	public void toPortClicker(String toPortNumber) {
		Select toPortSelect = new Select(toPortClick);
		toPortSelect.selectByValue(toPortNumber);
	}
	
	public void toMonthClicker(String toMonthNumber) {
		Select toMonthSelect = new Select(toMonthClick);
		toMonthSelect.selectByValue(toMonthNumber);
	}
	
	public void toDayClicker(String toDayNumber) {
		Select toDaySelect = new Select(toDayClick);
		toDaySelect.selectByValue(toDayNumber);
	}
	
	public void airlineClicker(String airlineNumber) {
		Select airlineSelect = new Select(airlineClick);
		airlineSelect.selectByVisibleText(airlineNumber);
	}
	
	public void continueClicker() {
		continueButton.click();
	}
	
	public void allClicker(String passNumber, String fromPortNumber, String fromMonthNumber, 
			String fromDayNumber, String toPortNumber, String toMonthNumber, 
			String toDayNumber, String airlineNumber) {
		
		oneWayClick.click();
		
		Select passSelect = new Select(passCountClick);
		passSelect.selectByValue(passNumber);
		
		Select fromPortSelect = new Select(fromPortClick);
		fromPortSelect.selectByValue(fromPortNumber);
		
		Select fromMonthSelect = new Select(fromMonthClick);
		fromMonthSelect.selectByValue(fromMonthNumber);
		
		Select fromDaySelect = new Select(fromDayClick);
		fromDaySelect.selectByValue(fromDayNumber);
		
		Select toPortSelect = new Select(toPortClick);
		toPortSelect.selectByValue(toPortNumber);
		
		Select toMonthSelect = new Select(toMonthClick);
		toMonthSelect.selectByValue(toMonthNumber);
		
		Select toDaySelect = new Select(toDayClick);
		toDaySelect.selectByValue(toDayNumber);
		
		Select airlineSelect = new Select(airlineClick);
		airlineSelect.selectByVisibleText(airlineNumber);
		
		continueButton.click();
		
	}
	
}
