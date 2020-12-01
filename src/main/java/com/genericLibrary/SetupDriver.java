package com.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	
public void setupURL() {
	System.setProperty("webdriver.chrome.driver", "/Users/iftekharchowdhoury/Documents/driver/chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	System.out.println(driver.getCurrentUrl());
}
}
 