package com.test.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

	private WebDriver driver;
	public WelcomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void findDeparture() {
		WebElement DepartureCity=driver.findElement(By.name("fromPort"));
		Select dep=new Select(DepartureCity);
		dep.selectByValue("Boston");
	}
	
	public void findDestination() {
		WebElement DestinationCity=driver.findElement(By.name("toPort"));
		Select dest=new Select(DestinationCity);
		dest.selectByValue("London");
	
	}
	
	public List<WebElement> getDestinationCities() {
		WebElement DestinationCity=driver.findElement(By.name("toPort"));
		Select dest=new Select(DestinationCity);
		List<WebElement> cities = dest.getOptions(); 
		return cities;
	}
	
	public void searchFlights() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}
