package com;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice {
	
	
	
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//form/h1")).getText());
		driver.findElement(By.id("inputUsername")).sendKeys("Shalini");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
//		driver.findElement(By.className("submit")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.className("logout-btn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shalini");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Shalini@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9638521470");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[contains(text(),'World class Tutorials on Selenium, Rest Assured, Protractor, SoapUI, Appium, Cypress, Jmeter, Cucumber, Jira and many more!')]")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("logout-btn")).click();
		Thread.sleep(2000);
		driver.quit();
			
		
	}

}
