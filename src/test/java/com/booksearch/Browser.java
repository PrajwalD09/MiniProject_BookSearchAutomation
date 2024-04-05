package com.booksearch;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;

public class Browser extends DriverSetup {

	// WebDriver Setup Selection Method
	public static WebDriver setDriver() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your Browser \n 1. Google Chrome \n 2. Firefox \n 3. Edge Browser");
		int browserChoice = scan.nextInt();
		scan.close();
	 
		if(browserChoice == 1) {
			driver = setChromeDriver();
		}
		else if(browserChoice == 2) {
			driver = setFirefoxDriver();
		} 
		else if(browserChoice == 3){
			driver = setEdgeDriver();
		}
		else{
			System.out.println("Invalid Input...Please select from the above browsers");
		}
		
		return driver;
	}
	
	// Driver Close Method
	public static void closeBrowser() {
		driver.quit();
	}
}