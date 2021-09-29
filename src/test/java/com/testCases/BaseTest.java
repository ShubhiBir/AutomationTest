package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
public WebDriver driver;
	

@BeforeMethod(alwaysRun = true)

public void preCondition( ) {
	driver=new ChromeDriver();
	driver.get("https://blazedemo.com/index.php");
    
}

@AfterMethod(alwaysRun = true)
public void postCondition() {
	driver.quit();
}
}
