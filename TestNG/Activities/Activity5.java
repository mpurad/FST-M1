package examples;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity5 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest(alwaysRun = true)
    public void setUp(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void getTitle(){
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

   @Test (groups = {"HeaderTests"}, dependsOnMethods = {"getTitle"})
   public void headerTest1(){
        Assert.assertEquals(driver.findElement(By.id("third-header")).getText(), "Third header");
   }

   @Test (groups = {"HeaderTests"}, dependsOnMethods = {"getTitle"})
   public void headerTest2(){
       Assert.assertEquals(driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getCssValue("color"), "rgb(33, 186, 69)");
   }

   @Test (groups = {"ButtonTests"}, dependsOnMethods = {"getTitle"})
   public void buttonTest1(){
       Assert.assertEquals(driver.findElement(By.xpath("//button[contains(@class,'olive')]")).getText(), "Olive");
   }

   @Test (groups = {"ButtonTests"}, dependsOnMethods = {"getTitle"})
   public void buttonTest2(){
        Assert.assertEquals(driver.findElement(By.xpath("//button[contains(@class,'brown')]")).getCssValue("color"), "rgb(255, 255, 255)");
   }

    @AfterTest(alwaysRun = true)
    public void tearDown(){
        driver.close();
    }
}
