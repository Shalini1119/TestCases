package TestScenarios;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;

	//port io.github.bonigarcia.wdm.WebDriverManager;

	public class TestMethods {
		
		WebDriver driver;

		@BeforeTest
		public void beforetest() {
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts();
			
		}
		
	}

	
	