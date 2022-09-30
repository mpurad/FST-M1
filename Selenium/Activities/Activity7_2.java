package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        System.out.println("The page title : " + driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("Username");

        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("Password");

        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input")).sendKeys("Password");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@test.com");

        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@id='action-confirmation']"));

        wait.until(ExpectedConditions.visibilityOf(confirmationMessage));

        System.out.println("Confrimation message : " + confirmationMessage.getText());

        driver.close();
    }
}
