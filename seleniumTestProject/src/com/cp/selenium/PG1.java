package com.cp.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {
	
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Downloads\\devops tools\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseUrl="http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		driver.close();
		
	}

}
