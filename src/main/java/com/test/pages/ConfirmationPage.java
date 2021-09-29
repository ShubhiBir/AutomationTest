package com.test.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	WebDriver driver;
	String ConfirmationId;
	public ConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public void confirm() {
		
		try {
		 ConfirmationId=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
		 System.out.println(ConfirmationId+" is your Confirmation Id");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Confirmation Id not generated");
		}
	}
	
}
