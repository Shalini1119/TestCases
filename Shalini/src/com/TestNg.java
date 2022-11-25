package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
//import dev.failsafe.internal.util.Assert;

public class TestNg {
	
	
		WebDriver driver ;
		
		@Test
		public void f() throws InterruptedException {
		  
		    String baseUrl = "https://www.toolsqa.com/";
		      
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		        System.out.println("Launching Google Chrome browser"); 
		        driver = new ChromeDriver();
		        driver.get(baseUrl);
		        String testTitle = "Free QA Automation Tools For Everyone";
		        String testTitle1 = "Tools QA";
		        String originalTitle = driver.getTitle();
		        Assert.assertEquals(originalTitle, testTitle1);
		        Thread.sleep(2000);
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




