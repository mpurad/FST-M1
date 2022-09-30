package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity2 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void getTitle(){
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test
    public void incorrectAssertion(){
        Assert.assertEquals(driver.findElement(By.xpath("//button[contains(@class,'black')]")).getText(),"Green");
    }

    @Test(enabled = false)
    public void skipThisTest(){
        System.out.println("This test will be not be executes");
    }

    @Test
    public void skipUsingException(){
        throw new SkipException("Skipping test case");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
