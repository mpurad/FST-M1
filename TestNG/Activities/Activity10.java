package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity10 {

    WebDriver driver;

    WebDriverWait wait;

    Actions actions;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);

        driver.get("https://www.training-support.net/selenium/sliders");
    }

    @Test
    public void verifyMiddleValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        slider.click();

        Assert.assertEquals(driver.findElement(By.id("value")).getText(), "50");
    }

    @Test
    public void verifyMaxValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        actions.clickAndHold(slider).moveByOffset(75,0).release().build().perform();
        Assert.assertEquals(driver.findElement(By.id("value")).getText(), "100");
    }

    @Test
    public void verifyMinValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        actions.clickAndHold(slider).moveByOffset(-75,0).release().build().perform();
        Assert.assertEquals(driver.findElement(By.id("value")).getText(), "0");
    }

    @Test
    public void verify30PValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        actions.clickAndHold(slider).moveByOffset(-30,0).release().build().perform();
        Assert.assertEquals(driver.findElement(By.id("value")).getText(), "0");
    }

    @Test
    public void verify80PValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        actions.clickAndHold(slider).moveByOffset(45,0).release().build().perform();
        Assert.assertEquals(driver.findElement(By.id("value")).getText(), "0");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
