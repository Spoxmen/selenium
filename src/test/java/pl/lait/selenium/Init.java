package pl.lait.selenium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {

	static WebDriver driver;

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\chromedriver.exe");
		if (driver == null) {
			
			//driver = new ChromeDriver();
			URL url = null;
			try {
				url = new URL("http://192.168.0.105:4444/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(url, capability);
			driver.get("http://newtours.demoaut.com/");
			return driver;
		} else {
			return driver;
		}
	}

	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static void close() {
		driver.quit();
		driver = null;
	}
	
	public static void printScr(WebDriver driver, String folderName, String testName) {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Long milis = timestamp.getTime();

		WebDriver driver_tmp = new Augmenter().augment(driver);
		File srcFile = ((TakesScreenshot) driver_tmp).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile, new File("target/"+ folderName +"/"+ testName +"-" + milis + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
