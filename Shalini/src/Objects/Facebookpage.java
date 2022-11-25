package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {
    
WebDriver driver;
    
    //create constructor for storing current instances
    public Facebookpage(WebDriver driver) {
        this.driver = driver;
    }
    
    By username = By.xpath("//input[@id='email']");
    By password = By.xpath("//input[@type='password']");
    By loginbtn = By.name("login");
    
    public void username()
    {
        try {
            driver.findElement(username).sendKeys("9346438363");
        }
        catch(Exception e)
        {
            System.out.println("lnvalid username");
        }
    }
    
    public void password()
    {
        try {
            driver.findElement(password).sendKeys("Sh@lu1927");
        }
        catch(Exception e)
        {
            System.out.println("invalid password");
        }
    }
    
   public void verifyLoginbtn() {
        // TODO Auto-generated method stub
        try {
            driver.findElement(loginbtn).click();
        }
        catch(Exception e)
        {
            System.out.println("login has been failed");
        }
        
    }
    



}