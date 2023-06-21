package com.viji;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
//		Invoking Browser
//		Chrome-ChromeDriver
//		Firefox-geckodriver
//		safari-safaridriver
//		webdriver
//		webdriver methods+class methods
		
		
//		 Chromedriver.exe -> Chrome browser 
//		 Chrome driver is not recommend to be used because it has its own class methods which are not accessed in other
//		 browser. Hence the interface webdriver is used
		
		
//		Firefox Launch
//		Geckodriver
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32_113\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
