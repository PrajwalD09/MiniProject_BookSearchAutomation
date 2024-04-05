package com.booksearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BookSearch extends Browser{

	public void details(){
		
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//------------------------------------ART------------------------------------------------------------
		WebElement book1 = driver.findElement(By.xpath("//p[contains(text(),'Art')]"));
		System.out.println(book1.getText());
		WebElement count1 = driver.findElement(By.cssSelector("#slick-slide100 .category-count"));
		System.out.println("Number of books in " + book1.getText() + " category is "+ count1.getText());
	 
		//---------------------------------SCIENCE FICTION---------------------------------------------------
		WebElement book2 = driver.findElement(By.xpath("//p[contains(text(),'Science Fiction')]"));
		System.out.println(book2.getText());
		WebElement count2 = driver.findElement(By.cssSelector("#slick-slide101 .category-count"));
		System.out.println("Number of books in " + book2.getText() + " category is "+ count2.getText());
	 
		//-----------------------------------FANTASY----------------------------------------------------------
		WebElement book3 =driver.findElement(By.xpath("//p[contains(text(),'Fantasy')]"));
		System.out.println(book3.getText());
		WebElement count3 = driver.findElement(By.cssSelector("#slick-slide102 .category-count"));
		System.out.println("Number of books in " + book3.getText() + " category is "+ count3.getText());
	 
		//-----------------------------------BIOGRAPHIES---------------------------------------------------
		WebElement book4 = driver.findElement(By.xpath("//p[contains(text(),'Biographies')]"));
		System.out.println(book4.getText());
		WebElement count4 = driver.findElement(By.cssSelector("#slick-slide103 .category-count"));
		System.out.println("Number of books in " + book4.getText() + " category is "+ count4.getText());
	 
		//------------------------------------RECEPIES---------------------------------------------------
		WebElement book5 = driver.findElement(By.xpath("//p[contains(text(),'Recipes')]"));
		System.out.println(book5.getText());
		WebElement count5 = driver.findElement(By.cssSelector("#slick-slide104 .category-count"));
		System.out.println("Number of books in " + book5.getText() + " category is "+ count5.getText()); 
		
		//------------------------------------ROMANCE---------------------------------------------------
		WebElement book6 = driver.findElement(By.xpath("//p[text()='Romance']")); 
		System.out.println(book6.getText());
		WebElement count6 = driver.findElement(By.cssSelector("#slick-slide105 .category-count"));
		System.out.println("Number of books in " + book6.getText() + " category is "+ count6.getText());
 
		//GOTO NEXT SLIDE
		clickNext();
		
		//------------------------------------TEXTBOOKS---------------------------------------------------
		WebElement book7 = driver.findElement(By.xpath("//p[text() = 'Textbooks']"));
		System.out.println(book7.getText());
		WebElement count7 = driver.findElement(By.cssSelector("#slick-slide106 .category-count"));
		System.out.println("Number of books in "+book7.getText()+" category is "+ count7.getText());
		
		//------------------------------------CHILDREN---------------------------------------------------
		WebElement book8 = driver.findElement(By.xpath("//p[text() = 'Children']"));
		System.out.println(book8.getText());
		WebElement count8 = driver.findElement(By.cssSelector("#slick-slide107 .category-count"));
		System.out.println("Number of books in "+book8.getText()+" category is "+ count8.getText());
	 
		//------------------------------------HISTORY---------------------------------------------------
		WebElement book9 = driver.findElement(By.xpath("//p[text() = 'History']"));
		System.out.println(book9.getText());
		WebElement count9 = driver.findElement(By.cssSelector("#slick-slide108 .category-count"));
		System.out.println("Number of books in "+book9.getText()+" category is "+ count9.getText()); 
	 
		//------------------------------------MEDICINE---------------------------------------------------
		WebElement book10 = driver.findElement(By.xpath("//p[text() = 'Medicine']"));
		System.out.println(book10.getText());
		WebElement count10 = driver.findElement(By.cssSelector("#slick-slide109 .category-count"));
		System.out.println("Number of books in "+book10.getText()+" category is "+ count10.getText());
	 
		//------------------------------------RELIGION---------------------------------------------------
		WebElement book11 = driver.findElement(By.xpath("//p[text() = 'Religion']"));
		System.out.println(book11.getText());
		WebElement count11 = driver.findElement(By.cssSelector("#slick-slide1010 .category-count"));
		System.out.println("Number of books in "+book11.getText()+" category is "+ count11.getText());
	 
		//------------------------------------MYSTERY AND DETECTIVE---------------------------------------------------
		WebElement book12 = driver.findElement(By.xpath("//p[text() = 'Mystery and Detective Stories']"));
		System.out.println(book12.getText());
		WebElement count12 = driver.findElement(By.cssSelector("#slick-slide1011 .category-count"));
		System.out.println("Number of books in "+book12.getText()+" category is "+ count12.getText());
	 
		//GOTO NEXT SLIDE
		clickNext();
		
		//------------------------------------PLAYS---------------------------------------------------
		WebElement book13 = driver.findElement(By.xpath("//p[text() = 'Medicine']"));
		System.out.println(book13.getText());
		WebElement count13 = driver.findElement(By.cssSelector("#slick-slide1012 .category-count"));
		System.out.println("Number of books in "+book13.getText()+" category is "+ count13.getText());
	 
		//------------------------------------MUSIC---------------------------------------------------
		WebElement book14 = driver.findElement(By.xpath("//p[text() = 'Music']"));
		System.out.println(book14.getText());
		WebElement count14 = driver.findElement(By.cssSelector("#slick-slide1013 .category-count"));
		System.out.println("Number of books in "+book14.getText()+" category is "+ count14.getText());
	 
		//------------------------------------SCIENCE---------------------------------------------------
		WebElement book15 = driver.findElement(By.xpath("//p[text() = 'Science']"));
		System.out.println(book15.getText());
		WebElement count15 = driver.findElement(By.cssSelector("#slick-slide1014 .category-count"));
		System.out.println("Number of books in "+book15.getText()+" category is "+ count15.getText());
		 	
	}
	 
	public void clickNext()
	{
		//GOTO NEXT SLIDE
		try {
			WebElement next = driver.findElement(By.xpath("//div[@id='contentBody']/div[11]/div[2]/div/button[2]"));
			next.click();

			TimeUnit.SECONDS.sleep(4);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void clickBrowse()
	{
		try {
			WebElement browse = driver.findElement(By.className("down-arrow"));
			browse.click();
			
			TimeUnit.SECONDS.sleep(4);
			WebElement subject = driver.findElement(By.xpath("//a[@href = '/subjects']"));
			subject.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickSeeMore()
	{
		try {
			TimeUnit.SECONDS.sleep(3);
			WebElement SeeMore = driver.findElement(By.xpath("//a[text()='See more...']"));
			SeeMore.click();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkTamilBooks() 
	{
		try {
			TimeUnit.SECONDS.sleep(2);
			
			//GET TAMIL BOOKS ELEMENT
			WebElement tamil = driver.findElement(By.xpath("//*[@id='contentBody']/ul/li[39]/span/b"));
			
			//GET TAMIL BOOKS COUNT
			String tamilCount = tamil.getText();
			int tamilBookCount = Integer.parseInt(tamilCount.replaceAll("\\D", ""));

			//SCROLL DOWN TO TAMIL BOOKS
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)"," ");
			TimeUnit.SECONDS.sleep(4);
			
			//CHECK FOR TAMIL BOOKS COUNT IS MORE THAN 1000
			if(tamilBookCount > 1000){
				System.out.println("Tamil books are available more than 1000 and total number of books are: " + tamilCount);
			}
			else{
				System.out.println("Tamil books are less than 1000");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}