package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps {

    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @Given("User is on Google Home Page")
    public void googleHomePage() {
        driver.get("https://www.google.com/");
    }

    @When("User types in Cheese and hits ENTER")
    public void enterTextAndSearch() {
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Cheese", Keys.ENTER);
    }

    @Then("Show how many search results were shown")
    public void verifySearchResults() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='result-stats']"))));
        System.out.println("Number of results : " + driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
    }

    @Then("Close the browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
