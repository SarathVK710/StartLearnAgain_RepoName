package utility;

import org.openqa.selenium.WebDriver;
import pageobject.HomePage;

public class PageObjectManager {
    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage(){
        HomePage homePage = new HomePage(driver);
        return homePage;
    }

}
