package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        System.out.println("The page title : " + driver.getTitle());

        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");

        driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");

        driver.findElement(By.xpath("//button[@onClick='signIn()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement confirmationObject = driver.findElement(By.xpath("//div[@id='action-confirmation']"));

        wait.until(ExpectedConditions.visibilityOf(confirmationObject));

        System.out.println("The logon text : " + confirmationObject.getText());

        driver.close();
    }
}
