package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps {
    WebDriver driver;

    @Given("open the OrangeHRM website")
    public void OrangeHRMWebsite(){
        driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
    }
    @When("enter the {string} and {string}")
    public void enterTheUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("click Login button")
    public void clickLoginButton() {
        driver.findElement(By.xpath("//button[@onclick='login()']")).click();
    }

}
