package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserBase;

import javax.swing.*;

public class AmazonDropdown {

    WebElement element;
    BrowserBase BrowserBase;
    WebDriver driver;

    public AmazonDropdown(){
        BrowserBase = new BrowserBase();
    }

    @When("get the all dropdown values")
    public void getTheAllDropdownValues() {
        driver = BrowserBase.getDriver();
        element = driver.findElement(By.id("searchDropdownBox"));
        int dropdownsize = element.findElements(By.tagName("option")).size();
        for (int i=0; i<dropdownsize; i++){
            String dropdownvalue = element.findElements(By.tagName("option")).get(i).getText();
            System.out.println(dropdownvalue);
        }
    }
    @And("select {string} option")
    public void selectOption(String option) {
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }
    @Then("click signin button")
    public void clickSigninButton() {
        WebElement ClickHolddriver = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.clickAndHold(ClickHolddriver).build().perform();
        driver.findElement(By.linkText("Sign in")).click();
    }
}