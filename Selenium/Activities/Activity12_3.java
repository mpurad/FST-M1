package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/popups");

        System.out.println("The page title : " + driver.getTitle());

        WebElement signInButton = driver.findElement(By.xpath("//button[@onClick='openModal()']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(signInButton).pause(Duration.ofSeconds(1)).build().perform();
        System.out.println("Tooltip text: " + signInButton.getAttribute("data-tooltip"));

        signInButton.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signInModal"))));

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        System.out.println("Confirmation message : " + driver.findElement(By.id("action-confirmation")).getText());

        driver.close();
    }
}
