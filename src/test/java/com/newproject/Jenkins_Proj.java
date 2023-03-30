package com.newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jenkins_Proj {

	
	
	
	@Test
	public void launchBrowser() {
		
		ChromeOptions s = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		s.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(s);
		driver.get("https://www.facebook.com/");
		
	}
}
