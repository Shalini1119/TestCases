package TestScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Objects.Facebookpage;
import Objects.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch{
    
WebDriver driver;
    
    @BeforeTest
    public void beforetest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com");
    }
    
    @Test(priority=1)
    public void SearchOperation()
    {
        GoogleSearch page = new GoogleSearch(driver);
        page.searchgoogle("facebook");    
    }
    
    @Test(priority=2)
    public void accessFacebookLink(String searchInput)
    {
        GoogleSearch access = new GoogleSearch(driver);
        access.accessfacebookLink();
    }
    
    @Test(priority=3)
    public void verifyFbLogin()
    {
        Facebookpage page = new Facebookpage(driver);
        page.username();
        page.password();
        page.verifyLoginbtn();
    }
    
    @AfterTest
    public void aftertest()
    {
        driver.quit();
    }
    
}
