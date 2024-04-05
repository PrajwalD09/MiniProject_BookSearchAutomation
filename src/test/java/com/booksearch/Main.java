package com.booksearch;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		BookSearch obj = new BookSearch();
		WebDriver driver = Browser.setDriver();
		
		//MAXIMIZE WINDOW
		driver.manage().window().maximize();
		
		//LISTING CATEGORIES AND COUNT OF BOOKS
		obj.details();
		
		//BROWSING THE BOOKS WITH RESPECT TO SUBJECT
		obj.clickBrowse();
		
		//SEE MORE
		obj.clickSeeMore();
		
		//CHECK FOR TAMIL BOOKS
		obj.checkTamilBooks();

		//CLOSE DRIVER
		Browser.closeBrowser();
	}

}
