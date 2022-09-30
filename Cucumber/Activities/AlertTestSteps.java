package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTestSteps {

    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    Alert alert;

    @Given("User is on the page")
    public void user_is_on_the_page() {
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("User clicks the Simple Alert button")
    public void user_clicks_the_simple_alert_button() {
        driver.findElement(By.id("simple")).click();
    }
    @Then("Alert opens")
    public void alert_opens() {
        alert = driver.switchTo().alert();
    }
    @Then("Read the text from it and print it")
    public void read_the_text_from_it_and_print_it() {
        System.out.println("Alert text : " + alert.getText());
    }
    @Then("Close the alert")
    public void close_the_alert() {
        alert.accept();
    }

    @Then("Close Browser")
    public void close_browser() {
        driver.close();
    }

    @When("User clicks the Confirm Alert button")
    public void user_clicks_the_confirm_alert_button() {
        driver.findElement(By.id("confirm")).click();
    }

    @Then("Close the alert with Cancel")
    public void close_the_alert_with_cancel() {
        alert.dismiss();
    }

    @When("User clicks the Prompt Alert button")
    public void user_clicks_the_prompt_alert_button() {
        driver.findElement(By.id("prompt")).click();
    }

    @Then("Write a custom message in it")
    public void write_a_custom_message_in_it() {
        alert.sendKeys("Sample message");
    }

}
