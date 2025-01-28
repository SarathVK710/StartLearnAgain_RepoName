package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;
    WebElement element;

    public HomePage(WebDriver driver){
        this.driver= driver;
    }

    public void getDropdownValeus(){
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        int dropdownSize = element.findElements(By.tagName("option")).size();
        for (int i=0; i<dropdownSize; i++){
            element.findElements(By.tagName("option")).get(i).getText();
        }
    }
    public void selectDropdownvalue(String productName){
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        select.selectByVisibleText(productName);
    }
    public void homePageSigninButton(){
        WebElement ClickHolddriver = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.clickAndHold(ClickHolddriver).build().perform();
        driver.findElement(By.linkText("Sign in")).click();
    }
}
