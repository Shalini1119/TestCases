package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Women {
	
	
	    public static <webdriver> void main(String shalini[])
	    {
	        System.setProperty("webdriver.edge.driver","C:\\Users\\shalini.chilupuri\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	        WebDriver driver=new EdgeDriver();
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
	        driver.get("https://amazon.in");
	        driver1.get("https://amazon.in");
	        System.out.println(driver.getTitle());
	        System.out.println(driver1.getTitle());
	   
	        
	    }
	    
}

