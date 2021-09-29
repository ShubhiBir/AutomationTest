package com.utility;

import org.openqa.selenium.WebDriver;

import com.test.pages.ChooseFlightPage;
import com.test.pages.ConfirmationPage;
import com.test.pages.PurchasePage;

public class BookingUtility {

	
	public static void chooseFlight(WebDriver driver) {
		  ChooseFlightPage chooseFlightPage =new ChooseFlightPage(driver);
		  chooseFlightPage.reserve();
	  }
	  
	  public static void submitForm(WebDriver driver) {
		  PurchasePage purchasePage=new PurchasePage(driver);
		  purchasePage.enterDetails();
		  purchasePage.purchaseFlight();
	  }
	  
	  public static void confirmationId(WebDriver driver) {
		  ConfirmationPage confirmationPage=new ConfirmationPage(driver);
		 confirmationPage.confirm();
		  
	  }
}
