package Test;


	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.Assert;

	import org.testng.annotations.AfterMethod;

	import org.testng.annotations.BeforeMethod;

	import org.testng.annotations.Test;



	public class Program1 {

		WebDriver driver;

		

		@BeforeMethod

		public void setUp()

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();

		driver.get("https://amazon.in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}

		

		@Test

		public void verifyTitle()

		{

		String actualTitle=driver.getTitle();

		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		

		Assert.assertEquals(actualTitle, expectedTitle);

		}

		

		@Test

		public void verifyLogo()

		{

		boolean flag=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		Assert.assertTrue(flag);

		}

		

		@AfterMethod

		public void tearDown()

		{

		driver.close();

		}




	
}
