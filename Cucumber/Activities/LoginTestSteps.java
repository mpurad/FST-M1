package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {

    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @When("User enters {string} and {string}")
    public void user_enters_username_and_password_parameter(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(username);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @Then("Read the page title and confirmation message")
    public void read_the_page_title_and_confirmation_message() {
        System.out.println("The page title : " + driver.getTitle());

        System.out.println("Confirmation message : " + driver.findElement(By.id("action-confirmation")).getText());
    }
    @Then("Close the Browser")
    public void close_the_browser() {
        driver.close();
    }
}
