package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ReservationPage;
import pl.lait.selenium.Init;

public class LoginPageStepsDefs {
	
	WebDriver driver = Init.getDriver();
	MainPage mp = new MainPage();
	LoginPage lp = new LoginPage();
	ReservationPage rp = new ReservationPage();
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
	}

	@When("^I click SIGN-ON link$")
	public void i_click_SIGN_ON_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mp.signonLinkClick();
	}

	@Then("^I should see login page$")
	public void i_should_see_login_page() throws Throwable {
		System.out.println(driver.getTitle());
		
		
	}
	@When("^I log in as \"([^\"]*)\"ZenekNiszczyciel\"([^\"]*)\"Zenek(\\d+)\"$")
	public void i_log_in_as_ZenekNiszczyciel_Zenek(String arg1, String arg2, int arg3) throws Throwable {
		lp.loginAs(arg1, arg1);
	}

	@When("^I fill one passenger flight$")
	public void i_fill_one_passenger_flight() throws Throwable {
		rp.passCountClicker("1");
	}

	@When("^Dates for tomorrow$")
	public void dates_for_tomorrow() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^From flight: \"([^\"]*)\" at day \"([^\"]*)\" month \"([^\"]*)\"$")
	public void from_flight_at_day_month(String arg1, String arg2, String arg3) throws Throwable {
		rp.fromPortClicker(arg1);
		rp.fromDayClicker(arg2);
		rp.fromMonthClicker(arg3);

	}

	@When("^To flight: \"([^\"]*)\" at day \"([^\"]*)\" month \"([^\"]*)\"$")
	public void to_flight_at_day_month(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
