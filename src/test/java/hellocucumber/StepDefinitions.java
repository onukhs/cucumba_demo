package hellocucumber;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static hellocucumber.Hooks.getDriver;

public class StepDefinitions {
    private final WebDriver driver = getDriver();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://www.saucedemo.com/");

        System.out.println("STEP-1 - I am on the login page");
    }
    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {

        WebElement userNameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        userNameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");

        System.out.println("STEP-2 - Username and password were set");
    }
    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("login-button")).click();

        System.out.println("STEP-3- Login button is clicked");
    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() throws InterruptedException {

        driver.findElement(By.id("shopping_cart_container")).click();

        System.out.println("STEP -4- I am logged IN");

        Thread.sleep(4000);
    }
}
