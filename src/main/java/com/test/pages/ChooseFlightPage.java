package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseFlightPage {
	WebDriver driver;
	public ChooseFlightPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		public void reserve() {
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input[@type='submit']")).click();
		
	 		
		}

}
