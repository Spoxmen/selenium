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

	@Test
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

	@After
	public void quit() {
		Init.close();
	}

}
