package com.booksearch;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	
	public static WebDriver driver;
	static Properties prop = new Properties();

	//Load file
	public static void loadURLFile() {
		try {
			FileInputStream fileStream = new FileInputStream("C:\\Users\\2318520\\eclipse-workspace\\BookSearchAutomation\\src\\test\\java\\com\\booksearch\\Properties.properties");
			prop.load(fileStream);
			fileStream.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ChromeDriver Setup Method
	public static WebDriver setChromeDriver() {

		loadURLFile();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2318520\\OneDrive - Cognizant\\Documents\\WebDrivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//OPEN URL
		driver.get(prop.getProperty("baseURL"));
		return driver;
	}
		 
	// Firefox Driver Setup Method
	public static WebDriver setFirefoxDriver() {

		loadURLFile();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\2318520\\OneDrive - Cognizant\\Documents\\WebDrivers\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//OPEN URL
		driver.get(prop.getProperty("baseURL"));
		return driver;
	}
	
	// Edge Driver Setup Method
	public static WebDriver setEdgeDriver() {

		loadURLFile();
		System.setProperty("webdriver.edge.driver","C:\\Users\\2318520\\OneDrive - Cognizant\\Documents\\WebDrivers\\edge-driver\\msedgedriver.exe");
		driver = new EdgeDriver();

		//OPEN URL
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("baseURL"));
		return driver;
		
		
	}
}
