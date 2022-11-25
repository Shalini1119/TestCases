package com;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;



public class Locators2 {
	

public void fun() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");

	String text="Shalini";
	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	driver.findElement(By.id("name")).sendKeys(text);

	driver.findElement(By.cssSelector("[id='alertbtn']")).click();

	System.out.println(driver.switchTo().alert().getText());

	driver.switchTo().alert().accept();

	driver.findElement(By.id("confirmbtn")).click();

	System.out.println(driver.switchTo().alert().getText());

	driver.switchTo().alert().dismiss();

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

