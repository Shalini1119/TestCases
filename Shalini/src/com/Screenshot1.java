package com;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//Take screenshot and store as a file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Copy the screenshot to desired location using copyfile method
		Files.copy(src,new File("C:\\Users\\shalini.chilupuri\\Pictures\\Screenshots/google.png"));

	}

}