package com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestDemo {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.training-support.net");
    }

    @Test
    public void exampleTestCase() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);       
        Assert.assertEquals("Training Support", title);    
        driver.findElement(By.id("about-link")).click();                    
        System.out.println("New page title is: " + driver.getTitle());     
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
    
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}