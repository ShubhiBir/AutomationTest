package com.testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.test.pages.WelcomePage;
import com.utility.BookingUtility;

public class AutomationTest extends BaseTest {
//	private WebDriver driver;
	
  @Test(priority=0)
  public void searchFlights() {
	  
	  WelcomePage welcomePage =new WelcomePage(driver);
	  welcomePage.findDeparture();
	  welcomePage.findDestination();
	  welcomePage.searchFlights();
	  BookingUtility.chooseFlight(driver);
	  BookingUtility.submitForm(driver);
	  BookingUtility.confirmationId(driver);
  }
  @Test(priority =1)
  public void fetchDestinationCities() {
	  WelcomePage welcomePage =new WelcomePage(driver);
	  List<WebElement> cities=welcomePage.getDestinationCities();
	  for(WebElement element:cities)
	  {
		  System.out.println(element.getText());
	  }
  }
  @Test(priority =2)
  public void fetchDepartureCities() {
	  WelcomePage welcomePage =new WelcomePage(driver);
	  List<WebElement> cities=welcomePage.getDepartureCities();
	  for(WebElement element:cities)
	  {
		  System.out.println(element.getText());
	  }
  }
  
}
