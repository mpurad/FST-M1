package examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity9 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @BeforeMethod
    public void switchToHome(){
        driver.switchTo().defaultContent();
    }

    @Test
    public void simpleAlertTestCase(){
        driver.findElement(By.id("simple")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text : " + alert.getText());
        alert.accept();
    }

    @Test
    public void confirmAlertTestCase(){
        driver.findElement(By.id("confirm")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text : " + alert.getText());
        alert.accept();
    }

    @Test
    public void promptAlertTestCase(){
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text : " + alert.getText());
        alert.accept();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
