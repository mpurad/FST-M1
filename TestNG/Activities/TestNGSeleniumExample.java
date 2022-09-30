package examples;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestNGSeleniumExample {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/");
    }

    @Test
    public void homePageTest(){
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Training Support");
    }

    @Test
    public void aboutUsNavTest(){
        driver.findElement(By.id("about-link")).click();

        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
