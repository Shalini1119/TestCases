package com;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	public static void main(String[] args) throws InterruptedException {		
// Count of footer section-
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("http://qaclickacademy.com/practice.php");		
		System.out.println(driver.findElements(By.tagName("a")).size());	
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));	
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000L);		
		}
		Set<String> openTabs=driver.getWindowHandles();//4
		Iterator<String> it=openTabs.iterator();	
		while(it.hasNext())
		{	
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());	
		}
	driver.close();
	}
}
