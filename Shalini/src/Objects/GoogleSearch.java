package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class GoogleSearch {
    
    WebDriver driver;
    
    //create constructor for storing current instances
    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.xpath("//input[@name='q'  and @class='gLFyf']");
    By searchBtn = By.xpath("//input[@name='btnK'  and @class='gNO89b' and @data-ved='0ahUKEwjqzbHo4bz7AhUrrlYBHRC9BEEQ4dUDCAo']");
    By FbookLink = By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and .='Facebook - log in or sign up']");



   public void searchgoogle1(String searchInput) {
        driver.findElement(searchBox).sendKeys(searchInput);
        
    }



   public void searchgoogle(String searchInput) {
        // TODO Auto-generated method stub
        try {
        driver.findElement(searchBox).sendKeys(searchInput);
        driver.findElement(searchBox).submit();
        }
        catch(Exception e)
        {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }



   public void accessfacebookLink()
    {
        try {
            driver.findElement(FbookLink).click();
        }
        catch(Exception e)
        {
            System.out.println("Exception found: "+e.getMessage());
        }
    }
    
}