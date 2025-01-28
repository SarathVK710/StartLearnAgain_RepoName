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
import pageobject.HomePage;
import utility.BrowserBase;
import utility.TextContext;

import javax.swing.*;

public class AmazonDropdown {
    TextContext context;
    public AmazonDropdown(TextContext context){
        this.context = context;
    }


    @When("get the all dropdown values")
    public void getTheAllDropdownValues() {
        context.pageObjectManager.getHomePage().getDropdownValeus();

    }
    @And("select {string} option")
    public void selectOption(String productName) {
        context.pageObjectManager.getHomePage().selectDropdownvalue(productName);
    }
    @Then("click signin button")
    public void clickSigninButton() {
        context.pageObjectManager.getHomePage().homePageSigninButton();
    }
}