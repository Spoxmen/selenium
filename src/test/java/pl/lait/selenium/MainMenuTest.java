package pl.lait.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ReservationPage;

public class MainMenuTest {

	WebDriver driver;

	@Before
	public void start() {
		System.out.println("przy starcie metody");
		driver = Init.getDriver();
	}

	@Ignore
	public void mainMenu() {
		MainPage mp = new MainPage();
		
		String title = driver.getTitle();
		System.out.println(title);
				
		mp.contactLinkClick();
		mp.registerLinkClick();
		mp.supportLinkClick();
		mp.signonLinkClick();
		
		title = driver.getTitle();
		System.out.println(title);
		
		Init.sleep(2);
	}

	@Ignore
	public void login() {
		String title = driver.getTitle();
		System.out.println(title);
		
		LoginPage log = new LoginPage();
		MainPage mp = new MainPage();
		mp.signonLinkClick();
		
		title = driver.getTitle();
		System.out.println(title);
		
		log.loginAs("ZenekNiszczyciel","Zenek123");
		
		title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue("Page title is wrong", title.contentEquals("Find a Flight: Mercury Tours:"));
		
		Init.sleep(2);
	}
	
	@Test
	public void reservation() {
		LoginPage log = new LoginPage();
		MainPage mp = new MainPage();
		ReservationPage rp = new ReservationPage();
		String title = driver.getTitle();
		title = driver.getTitle();
		
		System.out.println(title);
		mp.signonLinkClick();
		
		log.loginAs("ZenekNiszczyciel","Zenek123");
		
		title = driver.getTitle();
		System.out.println(title);
		
		rp.oneWayClicker();
		Init.sleep(1);
		rp.passCountClicker("2");
		rp.fromPortClicker("London");
		rp.fromMonthClicker("1");
		rp.fromDayClicker("1");
		rp.toPortClicker("Frankfurt");
		rp.toMonthClicker("2");
		rp.toDayClicker("2");
		rp.airlineClicker("Unified Airlines");
		rp.continueClicker();
		Init.sleep(10);
		
		title = driver.getTitle();
		System.out.println(title);
		
	}
	@Ignore
	public void reservationall() {
		LoginPage log = new LoginPage();
		MainPage mp = new MainPage();
		ReservationPage rp = new ReservationPage();
		
		mp.signonLinkClick();
		log.loginAs("ZenekNiszczyciel","Zenek123");
		rp.allClicker("2", "London", "2", "2", "Frankfurt", "3", "2", "Unified Airlines");
		Init.sleep(10);
	}

	@After
	public void quit() {
		Init.close();
	}

}
