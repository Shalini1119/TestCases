package com;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Alerts {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

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



}

