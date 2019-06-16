package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class ReservationPage2 {
	
	WebDriver driver;
	
	
	
	public ReservationPage2() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

}
