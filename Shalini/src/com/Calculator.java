package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Calculator {
	
	@Test
	public void googleCalculator(){
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("http://www.google.co.in");
		
		
		WebElement googleTextBox = driver.findElement(By.className("gLFyf"));
		googleTextBox.sendKeys("2+2");
		
		
		WebElement searchButton = driver.findElement(By.className("gNO89b"));
		searchButton.click();
		
		
		WebElement calculatorTextBox = driver.findElement(By.id("cwos"));
		String result = calculatorTextBox.getText();
		
		driver.close();
		
		
	}
	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterTest
	public void afterMethod() {
		 //driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
	
}