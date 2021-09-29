package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {
	WebDriver driver;
	public PurchasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
public void enterDetails() {
driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Max Test");
driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Flat 1");
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("London");
driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Edinburgh");
driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("CV1 3LD");
WebElement card=driver.findElement(By.name("cardType"));
Select cardType= new Select(card);
cardType.selectByValue("visa");
driver.findElement(By.name("creditCardNumber")).sendKeys("12010312345678");
driver.findElement(By.id("creditCardMonth")).sendKeys("11");
driver.findElement(By.id("creditCardYear")).sendKeys("2024");
driver.findElement(By.id("nameOnCard")).sendKeys("Max Test");
}
public void purchaseFlight() {
driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

}	
	
}
