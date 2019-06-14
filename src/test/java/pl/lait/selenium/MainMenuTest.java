package pl.lait.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainMenuTest {

	WebDriver driver;

	@Before
	public void start() {
		driver = Init.getDriver();

	}

	@Ignore
	public void mainMenu() {
		driver.findElement(By.linkText("CONTACT")).click();
		Init.sleep(2);
		driver.findElement(By.linkText("SUPPORT")).click();
		Init.sleep(2);
		driver.findElement(By.linkText("REGISTER")).click();
		Init.sleep(2);
		driver.findElement(By.linkText("SIGN-ON")).click();
		Init.sleep(3);

	}
	
	@Test
	public void login() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("ZenekNiszczyciel");
		driver.findElement(By.name("password")).sendKeys("Zenek123");
		Init.sleep(1);
		driver.findElement(By.name("login")).click();
		Init.sleep(1);
		
		String oneWayXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		
		driver.findElement(By.xpath(oneWayXpath)).click();
		Init.sleep(1);
		WebElement passSelect = driver.findElement(By.name("passCount"));
		Select pass = new Select(passSelect);
		pass.selectByVisibleText("2");
		Init.sleep(1);
		
		WebElement fromSelect = driver.findElement(By.name("fromPort"));
		Select from = new Select(fromSelect);
		from.selectByValue("Frankfurt");
		Init.sleep(1);
		
		WebElement fromMonthSelect = driver.findElement(By.name("fromMonth"));
		Select fromMonth = new Select(fromMonthSelect);
		fromMonth.selectByValue("1");
		Init.sleep(1);
		
		WebElement fromDaySelect = driver.findElement(By.name("fromDay"));
		Select fromDay = new Select(fromDaySelect);
		fromDay.selectByValue("1");
		Init.sleep(1);
		
		WebElement toSelect = driver.findElement(By.name("toPort"));
		Select to = new Select(toSelect);
		to.selectByValue("London");
		Init.sleep(1);
		
		WebElement toMonthSelect = driver.findElement(By.name("toMonth"));
		Select toMonth = new Select(toMonthSelect);
		toMonth.selectByValue("1");
		Init.sleep(1);
		
		WebElement toDaySelect = driver.findElement(By.name("toDay"));
		Select toDay = new Select(toDaySelect);
		toDay.selectByValue("2");
		Init.sleep(1);
		
		String servClassXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
		driver.findElement(By.xpath(servClassXpath)).click();
		Init.sleep(1);
		
		WebElement airlineSelect = driver.findElement(By.name("airline"));
		Select airline = new Select(airlineSelect);
		airline.selectByVisibleText("Blue Skies Airlines");
		Init.sleep(1);
		
		driver.findElement(By.name("findFlights")).click();
		Init.sleep(1);
		
		String outFlightXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input";
		driver.findElement(By.name(outFlightXpath)).click();
		Init.sleep(10);
		
		driver.findElement(By.name("reserveFlights")).click();
		
	}

	@After
	public void quit() {
		Init.close();
	}

}
